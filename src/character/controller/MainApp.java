package character.controller;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.layout.*;

public class MainApp extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("2nd Edition AD&D Character Creator");
		
		initRootLayout();
		showCharacterOverview(); 
	}
	
	
	//Initialize the rootLayout including Menu Bar and Title Bar
	public void initRootLayout() {
		
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("/character/view/RootLayout.fxml")); 
			rootLayout = (BorderPane) loader.load(); 
		
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void showCharacterOverview() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("/character/view/CharacterOverview.fxml"));
			AnchorPane characterOverview = (AnchorPane) loader.load();
			
			rootLayout.setCenter(characterOverview);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//Return the primaryStage
	public Stage getPrimaryStage() {
		return primaryStage; 
	}

	public static void main(String[] args) {
		launch(args);
	}
}
