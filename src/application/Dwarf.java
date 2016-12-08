package application;

import java.util.HashMap;

public class Dwarf extends Race {

	private HashMap<String, Integer> charAttributes;

	public Dwarf(HashMap charAttributes) {
		super("Dwarf");
	}

	public boolean checkAttributeRequirements() {
		if ((int) charAttributes.get("Strength") < 3 || (int) charAttributes.get("Strength") > 18) {
			return false;
		} else if ((int) charAttributes.get("Dexterity") < 3 || (int) charAttributes.get("Dexterity") > 17) {
			return false;

		} else if ((int) charAttributes.get("Constitution") < 11 || (int) charAttributes.get("Constitution") > 18) {
			return false;

		} else if ((int) charAttributes.get("Intelligence") < 3 || (int) charAttributes.get("Intelligence") > 18) {
			return false;

		} else if ((int) charAttributes.get("Wisdom") < 3 || (int) charAttributes.get("Wisdom") > 18) {
			return false;

		} else if ((int) charAttributes.get("Charisma") < 3 || (int) charAttributes.get("Charisma") > 17) {
			return false; 
		}

		updateAttributes(); 
		return true;
	}
	
	public HashMap<String, Integer> updateAttributes() {
		int Con = (int) this.charAttributes.get("Constitution") + 1; 
		this.charAttributes.put("Constitution", Con);
		
		int Char = (int) this.charAttributes.get("Charisma") - 1;
		this.charAttributes.put("Charisma", Char);
		
		return getCharAttributes();
	}
	
	public HashMap<String, Integer> getCharAttributes(){
		return charAttributes; 
	}
}
