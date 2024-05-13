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
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

public class ClientController {
    @FXML
    private TableView<Client> table2;

    @FXML
    private TableColumn<Client, Integer> idC;

    @FXML
    private TableColumn<Client, String> nom;

    @FXML
    private TableColumn<Client, String> prenom;

    @FXML
    private TableColumn<Client, String> tel;

    @FXML
    private TableColumn<Client, String> adresse;

    public List<Client> findAllclients() {
        List<Client> clientList = new ArrayList<>();
        try {
            Connection conn = Connexion.getConn();
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM client";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("idC");
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");
                String tel = rs.getString("tel");
                String adresse = rs.getString("adresse");

                Client client = new Client(id, nom, prenom, tel, adresse);
                clientList.add(client);
            }
        } catch (SQLException e) {
            System.err.println("Error executing query: " + e.getMessage());
        }
        return clientList;
    }

    public void initialize() {
        idC.setCellValueFactory(new PropertyValueFactory<>("id"));
        nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        prenom.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        tel.setCellValueFactory(new PropertyValueFactory<>("tel"));
        adresse.setCellValueFactory(new PropertyValueFactory<>("adresse"));

        table2.getItems().addAll(findAllclients());
    }
    
    @FXML
    protected void remove(ActionEvent event) {
        Client selectedClient = table2.getSelectionModel().getSelectedItem();
        if (selectedClient != null) {
            
            try {
                Connection conn = Connexion.getConn();
                Statement stmt = conn.createStatement();
                String query = "DELETE FROM client WHERE idV = " + selectedClient.getId();
                stmt.executeUpdate(query);
            } catch (SQLException e) {
                System.err.println("Error executing query: " + e.getMessage());
                return; 
            }

            
            table2.getItems().remove(selectedClient);
        } else {
            System.out.println("Aucune voiture sélectionnée à supprimer.");
        }
    }
}
