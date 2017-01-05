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
	
	public MainMenuController() {
		
	}
	
	@FXML
	private void handleGenerateAttributesButton(ActionEvent event) {
		mainApp.showAttributeGeneration();
	}
	
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp; 
	}
	

}
