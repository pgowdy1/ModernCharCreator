package character.model;

import java.util.*;

public class Race {

	private String race;

	public Race() {
		
	}

	public boolean checkRaceRestrictions(HashMap<String, Integer> charAttributes) {
		switch (race) {

		case "Human":
			return true;

		case "Dwarf":
			Dwarf playerRace = new Dwarf(charAttributes);
			if (playerRace.checkAttributeRequirements()) {
				return true;
			} else {
				return false;
			}
		}

		return false;
	}
}
