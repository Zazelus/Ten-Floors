package com.tenfloors.playerClasses;

import com.tenfloors.player.*;

public class Cleric extends PlayerClass {

	public Cleric(String playerName, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int hitPoints) {

		super(playerName, strength, dexterity, constitution, intelligence, wisdom, hitPoints);
	}
	
	public String toString() {
		return "Cleric";
	}

}
