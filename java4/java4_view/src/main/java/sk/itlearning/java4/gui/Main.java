package sk.itlearning.java4.gui;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
//        String javaVersion = System.getProperty("java.version");
//        String javafxVersion = System.getProperty("javafx.version");
//        Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
//        Scene scene = new Scene(new StackPane(l), 640, 480);
//        stage.setScene(scene);
//        stage.show();
    	
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(getClass().getResource("/sk/itlearning/java4/gui/main_view.fxml"));
        Parent root;
		try {
			root = loader.load();
	        stage.setTitle("Books");
	        stage.setScene(new Scene(root, 600, 400));
	        stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}   
    }

    public static void main(String[] args) {
        launch();
    }

}