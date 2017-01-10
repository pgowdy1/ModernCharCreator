package character.view;

import character.controller.*;
import character.model.*;
import character.model.Character;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class RaceSelectionController {
	
	private MainApp mainApp; 
	private Character character;
	private CharacterOverviewController characterOverviewController;
	
	@FXML
	Button humanButton;
	@FXML
	Button humanDetailsButton;
	@FXML
	Button dwarfButton;
	@FXML
	Button dwarfDetailsButton;
	@FXML
	Button elfButton;
	@FXML
	Button elfDetailsButton;
	@FXML
	Button gnomeButton;
	@FXML
	Button gnomeDetailsButton;
	@FXML
	Button halflingButton;
	@FXML
	Button halflingDetailsButton;
	@FXML
	Button halfElfButton;
	@FXML
	Button halfElfDetailsButton;
	@FXML
	Button clearRaceButton;
	@FXML
	Button finishButton;
	
	@FXML private void handleHumanButton(ActionEvent event) {
		this.character.chooseRace("Human");
		if(this.character.getRace() == "Human") {
			mainApp.updateCharacterData(this.character); 
			this.characterOverviewController.updateCharacterRaceView(); 
		}
	}
	
	@FXML private void handleDwarfButton(ActionEvent event) {
		this.character.chooseRace("Dwarf");
		if(this.character.getRace() == "Dwarf") {
			mainApp.updateCharacterData(this.character);
			this.characterOverviewController = mainApp.getCharacterOverviewController();
			this.characterOverviewController.updateCharacterRaceView();
		}
	}
	
	@FXML private void handleElfButton(ActionEvent event) {
		this.character.chooseRace("Elf"); 
		if(this.character.getRace() == "Elf") {
			mainApp.updateCharacterData(this.character);
			this.characterOverviewController = mainApp.getCharacterOverviewController();
			this.characterOverviewController.updateCharacterRaceView();
		}
	}
	
	@FXML
	private void handleFinish(ActionEvent event) {
		mainApp.showMainMenu();		 
	}
	
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp; 
		loadCharacter(); 
	}
	
	public void loadCharacter() {
		this.character = mainApp.getCharacterData(); 
	}

}
