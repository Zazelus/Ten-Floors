package com.tenfloors.art;

import java.util.concurrent.TimeUnit;

public class FlavorText {

	private static ArtBuilder builder = new ArtBuilder();

	/**
	 * Default Constructor.
	 */
	public FlavorText() {

	}

	/**
	 * Separates flavor text and some other things.
	 *
	 * @param data the characters used to separate messages.
	 * @param delay how many milliseconds each character waits after printing.
	 * @throws InterruptedException handles exceptions related to printWithDelays.
	 */
	public static void printWithDelays(String data, long delay)
	        throws InterruptedException {
	    for (char ch:data.toCharArray()) {
	        System.out.print("\n" + ch + "\n");

	        TimeUnit.MILLISECONDS.sleep(delay);
	    }
	}

	public static void printIntroductionFlavorText() throws InterruptedException {
		System.out.println("!######################################################################################################################################!\n");
		builder.printDragon();

		System.out.println("# Welcome to The Ten Floors #");

		System.out.println("\nMany centuries ago the great wizard Zaezul fashioned the Ten Floors.");
		printWithDelays("...", 1500);

		System.out.println("\nNo one truly knows the true purpose of such a place, however many wondrous "
				+ "\nartifacts have been uncovered by adventures seeking their fortune, leading to great "
				+ "\ntechnological advancements across the world.");
		printWithDelays("...", 2000);

		System.out.println("\nThrough all this time, not one adventurer has made it to the tenth "
				+ "\nfloor and come out alive.");
		printWithDelays("...", 1750);

		System.out.println("\n What");
		printDotBreak500();

		System.out.println("\n Awaits");
		printDotBreak500();

		System.out.println("\n Us");
		printDotBreak500();

		System.out.println("\n At");
		printDotBreak500();

		System.out.println("\n The");
		printDotBreak500();

		System.out.println("\n End?");
		printDotBreak500();

		printFlavorTextBreak();

		printWithDelays("...", 500);
	}

	public static void printSpacerExclamation() {
		System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}

	public static void printFlavorTextBreak() {
		System.out.println("\n!######################################################################################################################################!");
	}

	public static void printDotBreak500() throws InterruptedException {
		printWithDelays("...", 500);
	}

}
