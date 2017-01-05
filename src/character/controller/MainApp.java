package character.controller;

import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.collections.*;
import character.view.AttributeGenerationController;
import character.view.CharacterOverviewController; 
import character.view.MainMenuController;
import character.model.Character;

public class MainApp extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;
	private Character character;
	private CharacterOverviewController characterOverviewController; 
	
	public MainApp() {
		this.character = new Character();		
	}
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("2nd Edition AD&D Character Creator");
		
		initRootLayout();
		showCharacterOverview();
		showMainMenu();
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
	
	/* Initialize and display the main Character Overview Window. 
	   this window includes a brief overview of all the characteristics
	   of the character that is being created. It will always be available
	   for view on the left side of the application window.
	*/
	public void showCharacterOverview() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("/character/view/CharacterOverview.fxml"));
			AnchorPane characterOverview = loader.load();
			
			rootLayout.setLeft(characterOverview);
			this.characterOverviewController = loader.getController(); 
			characterOverviewController.setMainApp(this);			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	/* Initialize and display the Main Menu on the right of the
	 * application. Options that user has to click through the
	 * application are dispalyed in the form of buttons.
	 */
	public void showMainMenu() { 
		try { 
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("/character/view/MainMenu.fxml"));
			AnchorPane MainMenu = (AnchorPane) loader.load();
			
			rootLayout.setCenter(MainMenu);
			MainMenuController controller = loader.getController(); 
			controller.setMainApp(this);			
					
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	/* Loading of the attributeGeneration window on the ride side of
	 * the application when the Generate Attributes button is 
	 * pressed by the user. 
	 */
	public void showAttributeGeneration() {
		try {			
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("/character/view/AttributeGeneration.fxml"));
			AnchorPane attributeGeneration = loader.load();
			
			rootLayout.setCenter(attributeGeneration);
			AttributeGenerationController controller = loader.getController();
			controller.setMainApp(this);
		}
			catch (IOException e) {
				e.printStackTrace();
			}
	}	
	
	//Return the primaryStage
	public Stage getPrimaryStage() {
		return primaryStage; 
	}
	
	public void updateCharacterData(Character playerCharacter) {
		this.character = playerCharacter;
	}
	
	public CharacterOverviewController getCharacterOverviewController() {
		return this.characterOverviewController;
	}
	
	public Character getCharacterData() {
		return this.character; 
	}

	public static void main(String[] args) {
		launch(args);
	}
}
