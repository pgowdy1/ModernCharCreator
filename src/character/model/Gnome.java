package character.model;

import java.util.HashMap;

public class Gnome extends Race {

	private HashMap<String, Integer> charAttributes;
	private String race = "Gnome";

	public Gnome(HashMap<String, Integer> charAttributes) {
		this.charAttributes = charAttributes; 
	}
	
	public boolean checkAttributeRequirements() {
		if (charAttributes.get("Strength") < 6 || charAttributes.get("Strength") > 18) {
			return false;
		} else if (charAttributes.get("Dexterity") < 3 || charAttributes.get("Dexterity") > 18) {
			return false;

		} else if (charAttributes.get("Constitution") < 8 || charAttributes.get("Constitution") > 18) {
			return false;

		} else if (charAttributes.get("Intelligence") < 6 || charAttributes.get("Intelligence") > 18) {
			return false;

		} else if (charAttributes.get("Wisdom") < 3 || charAttributes.get("Wisdom") > 18) {
			return false;

		} else if (charAttributes.get("Charisma") < 3 || charAttributes.get("Charisma") > 18) {
			return false; 
		}

		updateAttributes(); 
		return true;
	}
	
	public HashMap<String, Integer> updateAttributes() {
		int Int = this.charAttributes.get("Intelligence") + 1; 
		this.charAttributes.put("Intelligence", Int);
		
		int Wis = this.charAttributes.get("Wisdom") - 1;
		this.charAttributes.put("Wisdom", Wis);
		
		return getCharAttributes();
	}
	
	public HashMap<String, Integer> getCharAttributes(){
		return this.charAttributes; 
	}
}
