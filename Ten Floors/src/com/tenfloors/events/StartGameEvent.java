package com.tenfloors.events;

import java.util.Scanner;

import com.tenfloors.art.ArtBuilder;
import com.tenfloors.art.FlavorText;
import com.tenfloors.player.Player;
import com.tenfloors.playerInterfaces.ShowPlayerInfo;
// import com.tenfloors.player.PlayerClass;

public class StartGameEvent extends Events {

	private Scanner console = new Scanner(System.in);

	private String userInput;

	public static Player player = null;

	/**
	 * As soon as the class is instantiated, the game starts by using the startGame() method.
	 *
	 * @throws InterruptedException handles exceptions related to printWithDelays.
	 */
	public StartGameEvent() throws InterruptedException {
		startGame();
	}

	/**
	 * Runs method createCharacter() which will be used for a new character sequence.
	 * printIntroduction and createCharacter will be coupled in an if/else block once
	 * methods for saving/loading the game are implemented.
	 *
	 * @throws InterruptedException handles exceptions related to printWithDelays.
	 */
	public void startGame() throws InterruptedException {
		//printIntroduction();
		createCharacter();
	}

	/**
	 * Prints the introductory flavor text for the game.
	 *
	 * @throws InterruptedException handles exceptions related to printWithDelays.
	 */
	public void printIntroduction() throws InterruptedException {
		FlavorText.printIntroductionFlavorText();
	}

	/**
	 * Uses several helper methods to create a new character.
	 * A new character will have all stats set equal to 10, which will change as the players invests points into them.
	 *
	 * @throws InterruptedException handles exceptions related to printWithDelays.
	 */
	public void createCharacter() throws InterruptedException {
		System.out.println("\nNewest adventurer of the Ten Floors, what is your name?");
		userInput = console.next();

		player = new Player(userInput, 10, 10, 10, 10, 10, 10);

		System.out.println("\n" + player.getName() + ", what is your vocation?");

		System.out.println("\n[1] The stalwart Knight: A vocation dedicated to shurgging off damage as well as dealing it, up front and personal.");
		System.out.println("[2] The holy Cleric: A vocation that is able to utilize defensive and healing magic, allowing it to stay in the fight longer.");
		System.out.println("[3] The grand Wizard: A vocation that focusses more on the destructive side of magic, utlizing the elements to decimate foes.");
		System.out.println("[4] The eagle-eyed Ranger: A vocation more suited to evading enemies and performing deadly and accurate blows.");
		userInput = console.next();

		switch (Integer.parseInt(userInput)) {
			case 1:
				player.createKnight();
				break;
			case 2:
				player.createCleric();
				break;
			case 3:
				player.createWizard();
				break;
			case 4:
				player.createRanger();
				break;
		}

		System.out.println("\nNow brave " + Player.playerClass.toString() + ", you must now allocate your skill points accordingly.");

		while (Player.statPoints != 0) {
			System.out.println("\nWhich skill would you like to invest points into?");

			FlavorText.printWithDelays("...", 300);

			System.out.println("\n[1] Strength (STR): Used in strength based saving throws as well as skill checks and determines the strength and skill of melee/ranged attacks with martial weapons.");
			System.out.println("[2] Dexterity (DEX): Used in dexterity based saving throws as well as skill checks and determines the strength and skill of melee/ranged with finesse-based weapons.");
			System.out.println("[3] Constitution (CON): Used in constitution based saving throws as well as skill checks and determines the toughness (i.e. hitpoints) of your character.");
			System.out.println("[4] Wisdom (WIS): Used in wisdom based saving throws as well as skill checks and determines how powerful your wisdom-based skills are.");
			System.out.println("[5] Intelligence (INT): Used in intelligence based saving throws as well as skill checks and determines how powerful your intelligence-based skills are.");

			FlavorText.printWithDelays("...", 200);

			userInput = console.next();

			while(!(1 <= Integer.parseInt(userInput) && Integer.parseInt(userInput) <= 5)) {

				System.out.println("\nPlease choose one of the five skills listed!");

				userInput = console.next();

			}

			switch (Integer.parseInt(userInput)) {
				case 1:
					skillModify("STR");
					break;
				case 2:
					skillModify("DEX");
					break;
				case 3:
					skillModify("CON");
					break;
				case 4:
					skillModify("INT");
					break;
				case 5:
					skillModify("WIS");
					break;
			}

		}

		FlavorText.printDotBreak500();

		ShowPlayerInfo.showPlayerStats();

		System.out.println("\nThis is the status screen, when you begin your adventure you may look at the status screen anytime while roaming the map or in combat.");
		System.out.println("\nThe dungeon is not a forgiving place, invest your stat points and skills accordingly to be as strong as possible with your chosen vocation.");
		System.out.println("\nGood luck!");

	}

	/**
	 * A helper method that makes the user put skill points in a specific stat.
	 *
	 * @return sends the userInput to skillModify() for manipulation.
	 */
	public String statDump() {
		String userInput = null;

		System.out.println("\nHow many points would you like to invest?");

		userInput = console.next();

		while(Integer.parseInt(userInput) < 0 || Integer.parseInt(userInput) > Player.statPoints) {

			if (Integer.parseInt(userInput) < 0) {
				System.out.println("\nPlease enter a positive number.");
			}

			else if (Integer.parseInt(userInput) > Player.statPoints) {
				System.out.println("\nYou don't have enough skill points for this! You have " + Player.statPoints + " remaining.");
			}

			userInput = console.next();

		}

		return userInput;
	}

	/**
	 * A helper method that modifies whichever skill the player decided to put points into.
	 *
	 * @param skill is a string which determines the skill to be modified by the switch statement.
	 */
	public void skillModify(String skill) {
		String userInput = null;

		userInput = statDump();

		switch(skill) {
			case "STR":
				player.modifyStrength(Integer.parseInt(userInput));
				break;
			case "DEX":
				player.modifyDexterity(Integer.parseInt(userInput));
				break;
			case "CON":
				player.modifyConstitution(Integer.parseInt(userInput));
				break;
			case "INT":
				player.modifyIntelligence(Integer.parseInt(userInput));
				break;
			case "WIS":
				player.modifyWisdom(Integer.parseInt(userInput));
				break;
		}

		Player.statPoints -= Integer.parseInt(userInput);

		System.out.println("You have " + Player.statPoints + " skill points remaining.");
	}

}
