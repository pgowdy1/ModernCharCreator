package application;

import java.util.*;
import java.math.*;

public class Character {

	private String characterName;
	private String race;
	private HashMap<String, Integer> charAttributes = new HashMap<String, Integer>(6);

	public Character() {

	}

	public void rollAttributes(int method) {
		Random attributeRoller = new Random();
		switch (method) {

		case 1: //Roll 3d6 and assign each total to each attribute. 
			charAttributes.put("Strength", (attributeRoller.nextInt(6) + 1) + (attributeRoller.nextInt(6) + 1)
					+ (attributeRoller.nextInt(6) + 1));
			charAttributes.put("Dexterity", (attributeRoller.nextInt(6) + 1) + (attributeRoller.nextInt(6) + 1)
					+ (attributeRoller.nextInt(6) + 1));
			charAttributes.put("Constitution", (attributeRoller.nextInt(6) + 1) + (attributeRoller.nextInt(6) + 1)
					+ (attributeRoller.nextInt(6) + 1));
			charAttributes.put("Intelligence", (attributeRoller.nextInt(6) + 1) + (attributeRoller.nextInt(6) + 1)
					+ (attributeRoller.nextInt(6) + 1));
			charAttributes.put("Wisdom", (attributeRoller.nextInt(6) + 1) + (attributeRoller.nextInt(6) + 1)
					+ (attributeRoller.nextInt(6) + 1));
			charAttributes.put("Charisma", (attributeRoller.nextInt(6) + 1) + (attributeRoller.nextInt(6) + 1)
					+ (attributeRoller.nextInt(6) + 1));
			break;
		case 2:
			// TODO: 3d6 Twice using the highest for each attribute
		case 3:
			// TODO: 3d6 Six times and assign to whichever scores player chooses
		case 4:
			// TODO: 3d6 Twelves times and assign to whichever scores player
			// chooses
		case 5:
			// TODO: 4d6 Discard lowest, total remaining 3.
		case 6:
			// TODO: All attributes begin at 8, roll 7 d6 and add each of the
			// die to a specific attribute. Each die must contribute totally to
			// one attribute.

		}
	}
	
	public void chooseRace(String playerRace) {
		Race chosenRace = new Race(playerRace);
		
		if(chosenRace.checkRaceRestrictions(charAttributes)) {
			this.race = playerRace; 
		}
				
	}

}
