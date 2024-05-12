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

public class ClientController {
	/*
	@FXML
    private TableView<Voiture> table2;
	@FXML
	private TableColumn<Voiture, Integer> idC;

    @FXML
    private TableColumn<Voiture, String> nom;
    @FXML
    private TableColumn<Voiture, String> prenom;

    @FXML
    private TableColumn<Voiture, Integer> tel;

    @FXML
    private TableColumn<Voiture,Float> adresse;
    
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
                int idC = rs.getInt("idC");
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");
                int tel = rs.getInt("tel");
                float adresse = rs.getFloat("adresse");
                String imgV = rs.getString("imgV"); 

                Voiture voiture = new Voiture(idC, imgV, imgV, tel, adresse, imgV);
                voitureList.add(voiture);
            }
        } catch (SQLException e) {
            System.err.println("Error executing query: " + e.getMessage());
        }
        return voitureList;
    }

	
    public voidC initialize() {
    	
        prenom.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getprenom()));
        nom.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getnom()));
        adresse.setCellValueFactory(cellData -> new SimpleObjectProperty<Float>(cellData.getValue().getadresse()));
        tel.setCellValueFactory(cellData->new SimpleObjectProperty<Integer>(cellData.getValue().gettel()));
        idC.setCellValueFactory(cellData->new SimpleObjectProperty<Integer>(cellData.getValue().getidC()));
        
        image.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getImgV()));
        

        table2.getItems().addAll(findAll());
    }*/

}