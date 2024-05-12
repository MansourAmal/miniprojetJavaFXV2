package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import connexion.Connexion;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

public class VoitureController {
	
	@FXML
    private TableView<Voiture> table1;
	@FXML
	private TableColumn<Voiture, Integer> id;

    @FXML
    private TableColumn<Voiture, String> marque;
    @FXML
    private TableColumn<Voiture, String> modele;

    @FXML
    private TableColumn<Voiture, Integer> nbV;

    @FXML
    private TableColumn<Voiture,Float> tarif;
    
    @FXML
    private TableColumn<Voiture,String> image;
    
    
    public List<Voiture> findAll() {
        List<Voiture> voitureList = new ArrayList<>();
        try {
            Connection conn = Connexion.getConn();
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM voiture";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("idV");
                String marque = rs.getString("marque");
                String modele = rs.getString("modele");
                int nbV = rs.getInt("nbV");
                float tarif = rs.getFloat("tarif");
                String imgV = rs.getString("imgV"); 

                Voiture voiture = new Voiture(id, imgV, imgV, nbV, tarif, imgV);
                voitureList.add(voiture);
            }
        } catch (SQLException e) {
            System.err.println("Error executing query: " + e.getMessage());
        }
        return voitureList;
    }

	
    public void initialize() {
    	
        modele.setCellValueFactory(cellData -> new SimpleObjectProperty<String>(cellData.getValue().getModele()));
        marque.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMarque()));
        tarif.setCellValueFactory(cellData -> new SimpleObjectProperty<Float>(cellData.getValue().getTarif()));
        nbV.setCellValueFactory(cellData->new SimpleObjectProperty<Integer>(cellData.getValue().getNbV()));
        id.setCellValueFactory(cellData->new SimpleObjectProperty<Integer>(cellData.getValue().getId()));
        
        image.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getImgV()));
        

        table1.getItems().addAll(findAll());
    }

}
