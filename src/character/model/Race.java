package character.model;

import java.util.*;

public class Race {
	
	private String charRace; 

	public Race() {
		 
	}

	public boolean checkRaceRestrictions(HashMap<String, Integer> charAttributes, String race) {
		switch (race) {

		case "Human":
			this.charRace = "Human"; 
			return true;
			
		case "Dwarf":
			Dwarf playerRaceDwarf = new Dwarf(charAttributes);
			if(playerRaceDwarf.checkAttributeRequirements()) {
				playerRaceDwarf.updateAttributes();
				this.charRace = "Dwarf"; 
				return true;
			} else {
				return false;
			}
			
		case "Elf":
			Elf playerRaceElf = new Elf(charAttributes);
			if(playerRaceElf.checkAttributeRequirements()) {
				playerRaceElf.updateAttributes();
				this.charRace = "Elf"; 
				return true;
			} else {
				return false; 
			}
			
		case "Gnome":
			
		case "Halfling":
			
		}

		return false;
	}
	
	public String getRace() {
		return this.charRace;
	}
}
