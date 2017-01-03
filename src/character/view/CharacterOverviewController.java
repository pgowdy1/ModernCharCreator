package character.view;

import javafx.fxml.*;
import javafx.scene.control.*;
import character.controller.MainApp;
import character.model.Character; 
import javafx.beans.property.*;

public class CharacterOverviewController {
	
	private MainApp mainApp; 
	
	@FXML
	private Character character; 
	
	@FXML
	private Label strengthLabel;	
	@FXML
	private Label dexterityLabel;	
	@FXML 
	private Label constitutionLabel;
	@FXML 
	private Label intelligenceLabel;	
	@FXML 
	private Label wisdomLabel;	
	@FXML
	private Label charismaLabel; 
	
	public CharacterOverviewController() {}
	
	@FXML
	private void initialize() {
		//clear character details
		showCharacterAttributes(null);
		
		
		
	}
	
	private void showCharacterAttributes(Character character) {
		if(character != null) {
			strengthLabel.setText(Integer.toString(character.getStrength()));
		} 
		
		else {
			 
		}
		
	}
	
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp; 
		
		this.character = mainApp.getCharacterData();
	}
	
	
}
