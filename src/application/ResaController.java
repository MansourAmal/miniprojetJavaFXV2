package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import connexion.Connexion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class ResaController {
	@FXML
    private TableView<Resa> table3;

    @FXML
    private TableColumn<Resa, Integer> idR;

    @FXML
    private TableColumn<Resa, Integer> idVoi;

    @FXML
    private TableColumn<Resa, Integer> idCli;

    @FXML
    private TableColumn<Resa, Date> DB;
    @FXML
    private TableColumn<Resa, Date> DF;

    @FXML
    private TableColumn<Resa, Float> total;

    public List<Resa> findAllresas() {
        List<Resa> resaList = new ArrayList<>();
        try {
            Connection conn = Connexion.getConn();
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM resa";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("idR");
                int idV = rs.getInt("idV");
                int idC = rs.getInt("idC");
                Date DB = rs.getDate("date_debut");
                Date DF = rs.getDate("date_fin");
                Double total = rs.getDouble("total");
                

                Resa resa = new Resa(id, idV, idC, DB, DF,total);
                resaList.add(resa);
            }
        } catch (SQLException e) {
            System.err.println("Error executing query: " + e.getMessage());
        }
        return resaList;
    }

    public void initialize() {
        idR.setCellValueFactory(new PropertyValueFactory<>("id"));
        idVoi.setCellValueFactory(new PropertyValueFactory<>("idV"));
        idCli.setCellValueFactory(new PropertyValueFactory<>("idC"));
        DB.setCellValueFactory(new PropertyValueFactory<>("date_debut"));
        DF.setCellValueFactory(new PropertyValueFactory<>("date_fin"));
        total.setCellValueFactory(new PropertyValueFactory<>("total"));

        table3.getItems().addAll(findAllresas());
    }
    @FXML
    protected void remove(ActionEvent event) {
        Resa selectedResa = table3.getSelectionModel().getSelectedItem();
        if (selectedResa != null) {
            
            try {
                Connection conn = Connexion.getConn();
                Statement stmt = conn.createStatement();
                String query = "DELETE FROM resa WHERE idV = " + selectedResa.getId();
                stmt.executeUpdate(query);
            } catch (SQLException e) {
                System.err.println("Error executing query: " + e.getMessage());
                return; 
            }

            
            table3.getItems().remove(selectedResa);
        } else {
            System.out.println("Aucune voiture sélectionnée à supprimer.");
        }
    }

}
