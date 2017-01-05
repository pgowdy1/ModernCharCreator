package character.model;

import java.util.*;
import character.model.Attributes;

public class Character {

	private String characterName;
	private String race;
	private HashMap<String, Integer> charAttributesMap = new HashMap<String, Integer>(6);

	public Character() {
		
	}
	
	public void rollAttributes(int methodSelection) {
		Attributes characterAttributes = new Attributes();
		characterAttributes.rollAttributes(methodSelection);
		this.charAttributesMap = characterAttributes.getCharAttributes();
	}
	
	public void chooseRace(String playerRace) {
		Race chosenRace = new Race(playerRace);
		
		if(chosenRace.checkRaceRestrictions(charAttributesMap)) {
			this.race = playerRace; 
		}
				
	}
	
	public int getStrength() {
		return charAttributesMap.get("Strength");
	}
	
	public int getDexterity() {
		return charAttributesMap.get("Dexterity");
	}
	
	public int getConstitution() {
		return charAttributesMap.get("Constitution");
	}
	
	public int getIntelligence() {
		return charAttributesMap.get("Intelligence");
	}
	
	public int getWisdom() {
		return charAttributesMap.get("Wisdom");
	}
	
	public int getCharisma() {
		return charAttributesMap.get("Charisma");
	}

	public void printAttributes() {
		
		for(HashMap.Entry<String, Integer> entry : charAttributesMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}	
