package character.model;

import java.util.HashMap;

public class Human extends Race {

	private HashMap<String, Integer> charAttributes;
	private String race = "Human";

	public Human(HashMap<String, Integer> charAttributes) {
		this.charAttributes = charAttributes; 
	}
	
	public boolean checkAttributeRequirements() {
		if (charAttributes.get("Strength") < 0 || charAttributes.get("Strength") > 18) {
			return false;
		} else if (charAttributes.get("Dexterity") < 0 || charAttributes.get("Dexterity") > 18) {
			return false;

		} else if (charAttributes.get("Constitution") < 0 || charAttributes.get("Constitution") > 18) {
			return false;

		} else if (charAttributes.get("Intelligence") < 0 || charAttributes.get("Intelligence") > 18) {
			return false;

		} else if (charAttributes.get("Wisdom") < 0 || charAttributes.get("Wisdom") > 18) {
			return false;

		} else if (charAttributes.get("Charisma") < 0 || charAttributes.get("Charisma") > 18) {
			return false; 
		}
		 
		return true;
	}
		
	public HashMap<String, Integer> getCharAttributes(){
		return this.charAttributes; 
	}
}
