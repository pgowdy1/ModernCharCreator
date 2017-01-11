package character.model;

import java.util.*;
import character.model.Attributes;

public class Character {

	private String characterName;
	private String race;
	private String playerClass;
	private String alignment;  
	private Attributes characterAttributes;
	private Race characterRace; 

	public Character() {
		this.characterAttributes = new Attributes(); 
		this.characterRace = new Race(); 
	}
	
	public void rollAttributes(int methodSelection) {
		characterAttributes.rollAttributes(methodSelection);
	}
	
	public void clearAttributes() {
		characterAttributes.clearAttributes();
	}
	
	public void chooseRace(String raceSelection) {
		if(characterRace.checkRaceRestrictions(characterAttributes.getCharAttributes(), raceSelection)) {
			 if(raceSelection.equals("Human")) {
				this.characterRace = new Human(characterAttributes.getCharAttributes());
				updateCharacterRace("Human"); 
			 } 			 
			 else if(raceSelection.equals("Elf")) {
				 this.characterRace = new Elf(characterAttributes.getCharAttributes());
				 updateCharacterRace("Elf");
			 }			 
			 else if(raceSelection.equals("Dwarf")) {
				 this.characterRace = new Dwarf(characterAttributes.getCharAttributes());
				 updateCharacterRace("Dwarf");
			 }
			 else if(raceSelection.equals("Gnome")) {
				 this.characterRace = new Gnome(characterAttributes.getCharAttributes());
				 updateCharacterRace("Gnome"); 
			 }
			 else if(raceSelection.equals("Halfling")) {
				 this.characterRace = new Halfling(characterAttributes.getCharAttributes()); 
				 updateCharacterRace("Halfling");
			 }
			 
		}	
		else {
			 
		}
	}
	
	public String getRace() {
		return this.race; 
	}
	
	public void updateCharacterRace(String race) {
		this.race = race;   
	}
	
	public int getStrength() {
		return characterAttributes.getStrength();
	}
	
	public int getDexterity() {
		return characterAttributes.getDexterity();
	}
	
	public int getConstitution() {
		return characterAttributes.getConstitution();
	}
	
	public int getIntelligence() {
		return characterAttributes.getIntelligence();
	}
	
	public int getWisdom() {
		return characterAttributes.getWisdom();
	}
	
	public int getCharisma() {
		return characterAttributes.getCharisma();
	}
	
	public Attributes getAttributes() {
		return characterAttributes; 
	}

	public void printAttributes() {
			
	}
}	
