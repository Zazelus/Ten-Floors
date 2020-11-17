package com.tenfloors.player;

import com.tenfloors.playerClasses.*;

/**
 * The Player class handles all player data and uses them to check certain
 * conditions in the game.
 *
 * @author Zaezul
 * @version 04.20.2020
 */
public class Player {

	/**
	 * The player's name. May be used in some situations, mostly for flavor.
	 */
	private String playerName;

	/**
	 * Player stat variables, certain statistics are important for specific classes.
	 */
	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int hitPoints;

	public static PlayerClass playerClass = null;

	public static int statPoints = 30;
	public static int playerExp;

	/**
	 * Creates a new player object.
	 *
	 * The parameters are decided during the character creation sequence, however
	 * they can change throughout the course of the game due to player conditions in
	 * and outside of combat as well as leveling up.
	 *
	 * @param playerName   is the player's name.
	 * @param strength     is the player's strength score.
	 * @param dexterity    is the player's dexterity score.
	 * @param constitution is the player's constitution score.
	 * @param intelligence is the player's intelligence score.
	 * @param wisdom       is the player's wisdom score.
	 */
	public Player(String playerName, int strength, int dexterity, int constitution, int intelligence, int wisdom,
			int hitPoints) {
		this.playerName = playerName;
		this.strength = strength;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.hitPoints = hitPoints;
	}

	// Getters and setters section.

	/**
	 * Get's the player's name.
	 *
	 * @return the player's name.
	 */
	public String getName() {
		return playerName;
	}

	/**
	 * Returns the player's current strength score.
	 *
	 * @return player's strength score.
	 */
	public int getStrength() {
		return strength;
	}

	/**
	 * Modifies the strength score by a specific number.
	 *
	 * @param mod is how much the score will be modified by.
	 */
	public void modifyStrength(int mod) {
		strength += mod;
	}

	/**
	 * Returns the player's current dexterity score.
	 *
	 * @return player's dexterity score.
	 */
	public int getDexterity() {
		return dexterity;
	}

	/**
	 * Modifies the dexterity score by a specific number.
	 *
	 * @param mod is how much the score will be modified by.
	 */
	public void modifyDexterity(int mod) {
		dexterity += mod;
	}

	/**
	 * Returns the player's current constitution score.
	 *
	 * @return player's constitution score.
	 */
	public int getConstitution() {
		return constitution;
	}

	/**
	 * Modifies the constitution score by a specific number.
	 *
	 * @param mod is how much the score will be modified by.
	 */
	public void modifyConstitution(int mod) {
		constitution += mod;
	}

	/**
	 * Returns the player's current intelligence score.
	 *
	 * @return player's intelligence score.
	 */
	public int getIntelligence() {
		return intelligence;
	}

	/**
	 * Modifies the intelligence score by a specific number.
	 *
	 * @param mod is how much the score will be modified by.
	 */
	public void modifyIntelligence(int mod) {
		intelligence += mod;
	}

	/**
	 * Returns the player's current wisdom score.
	 *
	 * @return player's wisdom score.
	 */
	public int getWisdom() {
		return wisdom;
	}

	/**
	 * Modifies the wisdom score by a specific number.
	 *
	 * @param mod is how much the score will be modified by.
	 */
	public void modifyWisdom(int mod) {
		wisdom += mod;
	}

	/**
	 * Resets player skills to standard array.
	 */
	public void skillReset() {
		strength = 10;
		dexterity = 10;
		constitution = 10;
		wisdom = 10;
		intelligence = 10;
	}

	/**
	 * Gives the modifier for the current ability score.
	 *
	 * @param abilityScore is the ability score to calculate the modifier for.
	 * @return the modifier for the ability score.
	 */
	public static int abilityModifer(int abilityScore) {
		return (int) Math.floor((float) (abilityScore - 10) / 2);
	}

	/**
	 * Returns the player's current hit points.
	 *
	 * @return player's hit points.
	 */
	public int getHitPoints() {
		return hitPoints;
	}

	/**
	 * Sets the player's hit points to a certain value.
	 *
	 * @param hp is the hit points it will be set to.
	 */
	public void setHitPoints(int hp) {
		hitPoints = hp;
	}

	/**
	 * Modifies the hit points by a specific number.
	 *
	 * @param mod is how much the hit points will be modified by.
	 */
	public void modifyHitPoints(int mod) {
		hitPoints += mod;
	}

	/**
	 * Creates a new knight player.
	 */
	public void createKnight() {
		Knight knight = new Knight(playerName, strength, dexterity, constitution, intelligence, wisdom, hitPoints);

		playerClass = knight;
	}

	/**
	 * Creates a new cleric player.
	 */
	public void createCleric() {
		Cleric cleric = new Cleric(playerName, strength, dexterity, constitution, intelligence, wisdom, hitPoints);

		playerClass = cleric;
	}

	/**
	 * Creates a new wizard player.
	 */
	public void createWizard() {
		Wizard wizard = new Wizard(playerName, strength, dexterity, constitution, intelligence, wisdom, hitPoints);

		playerClass = wizard;
	}

	/**
	 * Creates a new ranger player.
	 */
	public void createRanger() {
		Ranger ranger = new Ranger(playerName, strength, dexterity, constitution, intelligence, wisdom, hitPoints);

		playerClass = ranger;
	}

}
