package character.view;

import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import character.controller.MainApp;
import character.model.Character; 

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
	
	public CharacterOverviewController() { 
	}
	
	@FXML
	private void initialize() {			
		//Show character attributes in Overview
		showCharacterAttributes();
		
	}
	
	private void showCharacterAttributes() {
		if(character != null) {
			strengthLabel.setText(Integer.toString(character.getStrength()));
			dexterityLabel.setText(Integer.toString(character.getDexterity()));
			constitutionLabel.setText(Integer.toString(character.getConstitution()));
			intelligenceLabel.setText(Integer.toString(character.getIntelligence()));
			wisdomLabel.setText(Integer.toString(character.getWisdom()));
			charismaLabel.setText(Integer.toString(character.getCharisma()));
		} 
		
		else { 
		}
		
	}
	
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp; 		
		this.character = mainApp.getCharacterData();
		character.printAttributes();		 
	}	
	
}
