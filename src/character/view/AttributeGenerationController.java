package character.view;

import character.controller.MainApp;
import character.model.Character;
import character.model.Attributes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class AttributeGenerationController {

		private MainApp mainApp; 
		private CharacterOverviewController characterOverviewController; 
		private Character character;
		private boolean finishFlag = false; 
		
		@FXML
		private Button method1Button;
		@FXML
		private Button method2Button;
		@FXML
		private Button method3Button;
		@FXML
		private Button method4Button;
		@FXML
		private Button method5Button;
		@FXML
		private Button method6Button;
		@FXML
		private Button finishButton;
		@FXML
		private Button clearAttributesButton; 
		
		@FXML
		private void handleGenerateAttributesMethod1(ActionEvent event) {
			character.rollAttributes(1);
			mainApp.updateCharacterData(character);
			this.characterOverviewController = mainApp.getCharacterOverviewController();
			characterOverviewController.updateCharacterAttributesView();
			finishFlag = true; 
		}
		
		@FXML
		private void handleGenerateAttributesMethod2(ActionEvent event) {
			character.rollAttributes(2);
			mainApp.updateCharacterData(character);
			this.characterOverviewController = mainApp.getCharacterOverviewController();
			characterOverviewController.updateCharacterAttributesView();
			finishFlag = true; 
		}
		
		@FXML
		private void handleGenerateAttributesMethod3(ActionEvent event) {
			character.rollAttributes(3);
			mainApp.updateCharacterData(character);
			this.characterOverviewController = mainApp.getCharacterOverviewController();
			characterOverviewController.updateCharacterAttributesView();
			finishFlag = true; 
		}
		
		@FXML
		private void handleGenerateAttributesMethod4(ActionEvent event) {
			character.rollAttributes(4);
			mainApp.updateCharacterData(character);
			this.characterOverviewController = mainApp.getCharacterOverviewController();
			characterOverviewController.updateCharacterAttributesView();
			finishFlag = true; 
		}
		
		@FXML
		private void handleGenerateAttributesMethod5(ActionEvent event) {
			character.rollAttributes(5);
			mainApp.updateCharacterData(character);
			this.characterOverviewController = mainApp.getCharacterOverviewController();
			characterOverviewController.updateCharacterAttributesView();
			finishFlag = true; 
		}
		
		@FXML
		private void handleFinish(ActionEvent event) {
			mainApp.showMainMenu();
		}
		
		@FXML
		private void handleClearAttributes(ActionEvent event) {
			if(finishFlag) {
				character.clearAttributes();
				mainApp.updateCharacterData(character);
				characterOverviewController.updateCharacterAttributesView();
			}
			
		}
		
		public void setMainApp(MainApp mainApp) {
			this.mainApp = mainApp;
			loadCharacter(); 
		}
		
		public void loadCharacter() {
			this.character = mainApp.getCharacterData(); 
		}
}
