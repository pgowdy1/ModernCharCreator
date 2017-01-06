package character.view;

import character.controller.MainApp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;


public class MainMenuController {
	
	private MainApp mainApp;
	
	private TextArea outputTextArea;
	
	@FXML
	private Button generateAttributesButton;
	@FXML
	private Button raceSelectionButton;
	@FXML
	private Button classSelectionButton;
	@FXML
	private Button alignmentSelectionButton;
	
	public MainMenuController() {
		
	}
	
	@FXML
	private void handleGenerateAttributesButton(ActionEvent event) {
		mainApp.showAttributeGeneration();
	}
	
	@FXML 
	private void handleRaceSelectionButton(ActionEvent event) {
		mainApp.showRaceSelection();
	}
	
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp; 
	}
	

}
