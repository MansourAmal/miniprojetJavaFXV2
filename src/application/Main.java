package application;

import connexion.Connexion;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try {
        	
            
            FXMLLoader loader = new FXMLLoader(getClass().getResource("dash.fxml"));
            Parent root = loader.load();
            
            
            
            Scene scene = new Scene(root, 1000, 600);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            
            
            primaryStage.setScene(scene);
            primaryStage.show();
            
            Connexion.getConn();
            DashController c=new DashController();
            c.initialize();
            
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}


