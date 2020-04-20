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

	/**
	 * Creates a new FloorGenerator object.
	 *
	 * @param dungeonFile	is the name of the file to import the dungeon.
	 * @throws FileNotFoundException	is thrown if the file is not found.
	 */
    public FloorGenerator(String dungeonFile) throws FileNotFoundException {
        dungeonFloor = readDungeonFile(dungeonFile);
    }

    public String[][] getDungeon() {
        return dungeonFloor;
    }

    private String[][] readDungeonFile(String dungeonFile) throws FileNotFoundException {
        String[][] floorArray = new String[20][20];

        @SuppressWarnings("resource")
        Scanner file = new Scanner(new File(dungeonFile));

        int rowIndex = 0;
        int colIndex = 0;

        while (file.hasNextLine()) {
        	if (colIndex == 21) {
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
