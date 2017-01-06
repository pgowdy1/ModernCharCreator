package character.model;

import java.util.HashMap;

public class Elf extends Race {
	
	private HashMap<String, Integer> charAttributes;

	public Elf(HashMap<String, Integer> charAttributes) {
		this.charAttributes = charAttributes; 
	}
	
	public boolean checkAttributeRequirements() {
		if (charAttributes.get("Strength") < 3 || charAttributes.get("Strength") > 18) {
			return false;
		} else if (charAttributes.get("Dexterity") < 6 || charAttributes.get("Dexterity") > 18) {
			return false;

		} else if (charAttributes.get("Constitution") < 7 || charAttributes.get("Constitution") > 18) {
			return false;

		} else if (charAttributes.get("Intelligence") < 8 || charAttributes.get("Intelligence") > 18) {
			return false;

		} else if (charAttributes.get("Wisdom") < 3 || charAttributes.get("Wisdom") > 18) {
			return false;

		} else if (charAttributes.get("Charisma") < 8 || charAttributes.get("Charisma") > 18) {
			return false; 
		}

		updateAttributes(); 
		return true;
	}
	
	public HashMap<String, Integer> updateAttributes() {
		int Dex = this.charAttributes.get("Dexterity") + 1; 
		this.charAttributes.put("Constitution", Dex);
		
		int Con = this.charAttributes.get("Constitution") - 1;
		this.charAttributes.put("Charisma", Con);
		
		return getCharAttributes();
	}
	
	public HashMap<String, Integer> getCharAttributes(){
		return this.charAttributes; 
	}
}
