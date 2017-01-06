package character.model;

import java.util.*;

public class Race {

	public Race() {
		 
	}

	public boolean checkRaceRestrictions(HashMap<String, Integer> charAttributes, String race) {
		switch (race) {

		case "Human":
			return true;
			
		case "Dwarf":
			Dwarf playerRaceDwarf = new Dwarf(charAttributes);
			if(playerRaceDwarf.checkAttributeRequirements()) {
				playerRaceDwarf.updateAttributes();
				return true;
			} else {
				return false;
			}
			
		case "Elf":
			Elf playerRaceElf = new Elf(charAttributes);
			if(playerRaceElf.checkAttributeRequirements()) {
				playerRaceElf.updateAttributes();
				return true;
			} else {
				return false; 
			}
			
		case "Gnome":
			
		case "Halfling":
			
		}

		return false;
	}
}
