package character.model;

import java.util.HashMap;

public class Dwarf extends Race {

	private HashMap<String, Integer> charAttributes;

	public Dwarf(HashMap charAttributes) {
	//	super("Dwarf");
	}

	public boolean checkAttributeRequirements() {
		if (charAttributes.get("Strength") < 3 || charAttributes.get("Strength") > 18) {
			return false;
		} else if (charAttributes.get("Dexterity") < 3 || charAttributes.get("Dexterity") > 17) {
			return false;

		} else if (charAttributes.get("Constitution") < 11 || charAttributes.get("Constitution") > 18) {
			return false;

		} else if (charAttributes.get("Intelligence") < 3 || charAttributes.get("Intelligence") > 18) {
			return false;

		} else if (charAttributes.get("Wisdom") < 3 || charAttributes.get("Wisdom") > 18) {
			return false;

		} else if (charAttributes.get("Charisma") < 3 || charAttributes.get("Charisma") > 17) {
			return false; 
		}

		updateAttributes(); 
		return true;
	}
	
	public HashMap<String, Integer> updateAttributes() {
		int Con = this.charAttributes.get("Constitution") + 1; 
		this.charAttributes.put("Constitution", Con);
		
		int Char = this.charAttributes.get("Charisma") - 1;
		this.charAttributes.put("Charisma", Char);
		
		return getCharAttributes();
	}
	
	public HashMap<String, Integer> getCharAttributes(){
		return charAttributes; 
	}
}
