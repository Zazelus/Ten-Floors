package com.tenfloors.dungeon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Generates levels using a file with comma separated values.
 *
 * @author Zaezul
 * @version 04.20.2020
 */
public class FloorGenerator {

	private String[][] dungeonFloor;

	private int height;
	private int width;

	/**
	 * Creates a new FloorGenerator object.
	 *
	 * @param dungeonFile is the name of the file to import the dungeon.
	 * @throws FileNotFoundException is thrown if the file is not found.
	 */
	public FloorGenerator(String dungeonFile, int height, int width) throws FileNotFoundException {
		this.height = height;
		this.width = width;

		dungeonFloor = readDungeonFile(dungeonFile, this.height, this.width);
	}

	/**
	 * Returns the array representing the dungeon floor.
	 *
	 * @return dungeonFloor array.
	 */
	public String[][] getDungeon() {
		return dungeonFloor;
	}

	/**
	 * Returns the current dungeon's height.
	 *
	 * @return height as an integer.
	 */
	public int getDungeonHeight() {
		return height;
	}

	/**
	 * Returns the current dungeon's width.
	 *
	 * @return width as an integer.
	 */
	public int getDungeonWidth() {
		return width;
	}

	/**
	 * Returns the dungeon read from the file in array form.
	 *
	 * @param dungeonFile is the file to be read.
	 * @param height      is the height of the dungeon.
	 * @param width       is the width of the dungeon
	 * @return the current floor in the form of an array.
	 * @throws FileNotFoundException is thrown if the file is not found.
	 */
	private String[][] readDungeonFile(String dungeonFile, int height, int width) throws FileNotFoundException {
		String[][] floorArray = new String[height][width];

		Scanner file = new Scanner(new File(dungeonFile));

		int rowIndex = 0;
		int colIndex = 0;

		while (file.hasNextLine()) {
			if (colIndex == width + 1) {
				colIndex = 0;
				rowIndex++;
			}

			String line = file.nextLine();
			String[] lineSplit = line.split(", *");

			floorArray[rowIndex][colIndex] = lineSplit[colIndex];

			colIndex++;
		}

		file.close();

		return floorArray;
	}

}
