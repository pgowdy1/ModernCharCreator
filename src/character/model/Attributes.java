package character.model;

import java.util.HashMap;
import java.util.Random;

public class Attributes {
	
	private HashMap<String, Integer> charAttributes = new HashMap<String, Integer>(6);
	private Random attributeRoller = new Random();
	
	public void rollAttributes(int method) {
		switch (method) {

		case 1: //Roll 3d6 and assign each total to each attribute. 
			charAttributes.put("Strength", method1Roll());
			charAttributes.put("Dexterity", method1Roll());
			charAttributes.put("Constitution", method1Roll());
			charAttributes.put("Intelligence", method1Roll());
			charAttributes.put("Wisdom", method1Roll());
			charAttributes.put("Charisma", method1Roll()); 
			break;
		case 2: //Roll 3d6 Twice using the highest for each attribute

			charAttributes.put("Strength", method2Roll());
			charAttributes.put("Dexterity", method2Roll());
			charAttributes.put("Constitution", method2Roll());
			charAttributes.put("Intelligence", method2Roll());
			charAttributes.put("Wisdom", method2Roll());
			charAttributes.put("Charisma", method2Roll());
			break; 
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
	
	public void clearAttributes() {
		charAttributes.put("Strength", 0);
		charAttributes.put("Dexterity", 0);
		charAttributes.put("Constitution", 0);
		charAttributes.put("Intelligence", 0);
		charAttributes.put("Wisdom", 0);
		charAttributes.put("Charisma", 0);
	}
	
	public HashMap<String, Integer> getCharAttributes() {
		return charAttributes; 
	}
	
	private int method2Roll() {
		int firstRoll, secondRoll; 
		firstRoll = (attributeRoller.nextInt(6) + 1) + (attributeRoller.nextInt(6) + 1)
				+ (attributeRoller.nextInt(6) + 1);
		
		secondRoll = (attributeRoller.nextInt(6) + 1) + (attributeRoller.nextInt(6) + 1)
				+ (attributeRoller.nextInt(6) + 1);
		
		if(firstRoll >= secondRoll) {
			return firstRoll;
		}
		
		else {
			return secondRoll;
		}
	}
	
	private int method1Roll() {
		int firstRoll = (attributeRoller.nextInt(6) + 1) + (attributeRoller.nextInt(6) + 1)
				+ (attributeRoller.nextInt(6) + 1);
		
		return firstRoll; 
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
