package character.model;

import java.util.HashMap;

public class Halfling extends Race {

	private HashMap<String, Integer> charAttributes;
	private String race = "Halfling";

	public Halfling(HashMap<String, Integer> charAttributes) {
		this.charAttributes = charAttributes; 
	}
	
	public boolean checkAttributeRequirements() {
		if (charAttributes.get("Strength") < 7 || charAttributes.get("Strength") > 18) {
			return false;
		} else if (charAttributes.get("Dexterity") < 7 || charAttributes.get("Dexterity") > 18) {
			return false;

		} else if (charAttributes.get("Constitution") < 10 || charAttributes.get("Constitution") > 18) {
			return false;

		} else if (charAttributes.get("Intelligence") < 6 || charAttributes.get("Intelligence") > 18) {
			return false;

		} else if (charAttributes.get("Wisdom") < 3 || charAttributes.get("Wisdom") > 17) {
			return false;

		} else if (charAttributes.get("Charisma") < 3 || charAttributes.get("Charisma") > 18) {
			return false; 
		}

		updateAttributes(); 
		return true;
	}
	
	public HashMap<String, Integer> updateAttributes() {
		int Dex = this.charAttributes.get("Dexterity") + 1; 
		this.charAttributes.put("Dexterity", Dex);
		
		int Str = this.charAttributes.get("Strength") - 1;
		this.charAttributes.put("Strength", Str);
		
		return getCharAttributes();
	}
	
	public HashMap<String, Integer> getCharAttributes(){
		return this.charAttributes; 
	}
	
}
