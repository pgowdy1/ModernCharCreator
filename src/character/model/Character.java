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
	
	public void chooseRace(String playerRace) {
	
		if(characterRace.checkRaceRestrictions(characterAttributes.getCharAttributes())) {
			this.race = playerRace; 
		}			
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
