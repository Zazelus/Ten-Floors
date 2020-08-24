package com.tenfloors.events;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.tenfloors.art.ArtBuilder;
import com.tenfloors.player.Player;
import com.tenfloors.player.PlayerClass;

public class StartGameEvent extends Events {

	private Scanner console = new Scanner(System.in);

	private ArtBuilder builder = new ArtBuilder();

	private String userInput;

	private Player newPlayer = null;

	public StartGameEvent() throws InterruptedException {
		startGame();
	}

	public void startGame() throws InterruptedException {
		printIntroduction();
		createCharacter();
	}

	public void printIntroduction() throws InterruptedException {
		System.out.println("!######################################################################################################################################!\n");
		builder.printDragon();

		System.out.println("# Welcome to The Ten Floors #");

		System.out.println("\nMany centuries ago the great wizard Zaezul fashioned the Ten Floors.");
		printWithDelays("...", 1500);

		System.out.println("\nNo one truly knows the true purpose of such a place, however many wondrous "
				+ "\nartifacts have been uncovered by adventures seeking their fortune, leading to great "
				+ "\ntechnological advancements across the world.");
		printWithDelays("...", 2000);

		System.out.println("\nHowever, through all this time, not one adventurer has made it to the tenth "
				+ "\nfloor and come out alive.");
		printWithDelays("...", 1750);

		System.out.println("\n What");
		printWithDelays("...", 750);

		System.out.println("\n Awaits");
		printWithDelays("...", 750);

		System.out.println("\n Us");
		printWithDelays("...", 750);

		System.out.println("\n At");
		printWithDelays("...", 750);

		System.out.println("\n The");
		printWithDelays("...", 750);

		System.out.println("\n End?");
		printWithDelays("...", 750);

		System.out.println("\n!######################################################################################################################################!");

		printWithDelays("...", 750);
	}

	public void createCharacter() {
		System.out.println("\nNewest adventurer of the Ten Floors, what is your name?");
		userInput = console.next();

		newPlayer = new Player(userInput, 10, 10, 10, 10, 10, 10);

		System.out.println("\nWhat is your vocation?");

		System.out.println("\n[1] The stalwart Knight: A vocation dedicated to shurgging off damage as well as dealing it, up front and personal.");
		System.out.println("[2] The holy Cleric: A vocation that is able to utilize defensive and healing magic, allowing it to stay in the fight longer.");
		System.out.println("[3] The grand Wizard: A vocation that focusses more on the destructive side of magic, utlizing the elements to decimate foes.");
		System.out.println("[4] The eagle-eyed Ranger: A vocation more suited to evading enemies and performing deadly and accurate blows.");
		userInput = console.next();

		switch (userInput) {
		case "1":
			newPlayer.createKnight();
		case "2":
			newPlayer.createCleric();
		case "3":
			newPlayer.createWizard();
		case "4":
			newPlayer.createRanger();
		}

		System.out.println("\nNow brave " + newPlayer.playerClass.toString() + ", you must now allocate your skill points accordingly.");
	}

	public static void printWithDelays(String data, long delay)
	        throws InterruptedException {
	    for (char ch:data.toCharArray()) {
	        System.out.print("\n" + ch + "\n");

	        TimeUnit.MILLISECONDS.sleep(delay);
	    }
	}

}
