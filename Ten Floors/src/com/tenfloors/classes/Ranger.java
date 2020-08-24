package com.tenfloors.classes;

import com.tenfloors.player.*;

public class Ranger extends PlayerClass {

	public Ranger(String playerName, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int hitPoints) {

		super(playerName, strength, dexterity, constitution, intelligence, wisdom, hitPoints);
	}

	public String toString() {
		return "Ranger";
	}

}
