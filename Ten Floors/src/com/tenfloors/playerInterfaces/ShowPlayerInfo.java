package com.tenfloors.playerInterfaces;

import com.tenfloors.art.FlavorText;
import com.tenfloors.events.StartRoom;
import com.tenfloors.leveling.PlayerLevelHandler;
import com.tenfloors.player.Player;

public class ShowPlayerInfo {

	/**
	 * Default constructor, 'nuff said.
	 */
	public ShowPlayerInfo() {
		// TO-DO
	}

	/**
	 * Shows the player's statistics:
	 *
	 * Name
	 * Level
	 * Class
	 * Statistics (HP, STR, DEX, CON, WIS, INT)
	 * Immunities
	 * Vulnerabilities
	 * Conditions
	 * etc.
	 */
	public static void showPlayerStats() {
		FlavorText.printSpacerExclamation();

		Player player = StartRoom.player;

		System.out.println("\nName: " + player.getName());

		System.out.println("\nClass: " + player.getPlayerClass());
		System.out.println("Level: " + PlayerLevelHandler.getPlayerLevel());

		System.out.println("\nSTR: " + player.getStrength());
		System.out.println("DEX: " + player.getDexterity());
		System.out.println("CON: " + player.getConstitution());
		System.out.println("WIS: " + player.getWisdom());
		System.out.println("INT: " + player.getIntelligence());

		System.out.println("\nImmunities: ");
		System.out.println("Vulnerabilities: ");

		System.out.println("\nConditions: ");

		FlavorText.printSpacerExclamation();
	}

	/**
	 * Shows the player's skills by level.
	 */
	public static void showPlayerSkills() {

	}

	/**
	 * Shows the player's inventory. Can be sorted.
	 */
	public static void showPlayerInventory() {

	}

	/**
	 * Show the player's the layout of the current dungeon floor.
	 */
	public static void showPlayerDungeonMap() {

	}

	// TO-DO

}
