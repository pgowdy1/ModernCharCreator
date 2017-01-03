package character.model;

import java.util.*;

public class Character {

	private String characterName;
	private String race;
	private HashMap<String, Integer> charAttributes = new HashMap<String, Integer>(6);

	public Character() {
		int playerAttributeMethodChoice = 0;  
		Attributes charAttributes = new Attributes();
		charAttributes.rollAttributes(playerAttributeMethodChoice); 

	}
	
	public void chooseRace(String playerRace) {
		Race chosenRace = new Race(playerRace);
		
		if(chosenRace.checkRaceRestrictions(charAttributes)) {
			this.race = playerRace; 
		}
				
	}
	
	public int getStrength() {
		return charAttributes.get("Strength");
	}
	
	public int getDexterity() {
		return charAttributes.get("Dexterity");
	}
	
	public int getConstitution() {
		return charAttributes.get("Constitution");
	}
	
	public int getIntelligence() {
		return charAttributes.get("Intelligence");
	}
	
	public int getWisdom() {
		return charAttributes.get("Wisdom");
	}
	
	public int getCharisma() {
		return charAttributes.get("Charisma");
	}

}
