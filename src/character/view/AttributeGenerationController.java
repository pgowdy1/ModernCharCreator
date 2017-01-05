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
		private void handleGenerateAttributesMethod1(ActionEvent event) {
			character.rollAttributes(1);
			mainApp.updateCharacterData(character);
			this.characterOverviewController = mainApp.getCharacterOverviewController();
			characterOverviewController.updateCharacterAttributesView();
		}
		
		public void setMainApp(MainApp mainApp) {
			this.mainApp = mainApp;
			loadCharacter(); 
		}
		
		public void loadCharacter() {
			this.character = mainApp.getCharacterData(); 
		}
}
