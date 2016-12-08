package application;

import java.util.*;

public class Race {

	private String race;

	public Race(String playerRace) {
		this.race = playerRace;
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
