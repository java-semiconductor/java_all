package sk.itlearning.java4.book.view;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(getClass().getResource("/sk/itlearning/java4/book/view/main_view.fxml"));
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