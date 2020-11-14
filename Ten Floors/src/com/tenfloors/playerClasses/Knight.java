package com.tenfloors.classes;

import java.util.Random;

import com.tenfloors.player.*;

/**
 * The Knight class handles all player data and uses them to check certain
 * conditions in the game.
 *
 * @author Zaezul
 * @version 04.20.2020
 */
public class Knight extends PlayerClass {

	private static final int HIT_DICE = 10;

	/**
	 * Creates a new Knight object.
	 *
	 * Uses the super variables to calculate class requirements for certain skills.
	 * Also calculates the player's hit points through hit dice.
	 *
	 * @param playerName   is the Knight's name.
	 * @param strength     is the Knight's strength score.
	 * @param dexterity    is the Knight's dexterity score.
	 * @param constitution is the Knight's constitution score.
	 * @param intelligence is the Knight's intelligence score.
	 * @param wisdom       is the Knight's wisdom score.
	 */
	public Knight(String playerName, int strength, int dexterity,
			int constitution, int intelligence, int wisdom, int hitPoints) {

		super(playerName, strength, dexterity, constitution, intelligence, wisdom, hitPoints);
	}

	public void calculateHitPoints() {
		Random diceRoller = new Random();

		int hitDice = HIT_DICE - 1;
		int hitPoints = diceRoller.nextInt(hitDice) + 1 + abilityModifer(getConstitution());

		setHitPoints(hitPoints);
	}

	@Override
	public String toString() {
		return "Knight";
	}

}
