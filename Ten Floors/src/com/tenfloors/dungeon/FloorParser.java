package com.tenfloors.dungeon;

import com.tenfloors.events.*;

/**
 * Reads the String array that was converted from the text document
 * and assigns events based at each location depending on the string
 * contained at each index of the array.
 *
 * @author Zaezul
 * @version 04.20.20
 */
public class FloorParser {

	private String[][] dungeonFloor;
	private Events[][] parsedFloor;

	private int height;
	private int width;

	/**
	 * Creates a new FloorParser object.
	 *
	 * @param dungeonFloor	is the dungeon to be parsed for events.
	 */
	public FloorParser(String[][] dungeonFloor, int floorNumber) {
		this.dungeonFloor = dungeonFloor;

		height = dungeonFloor.length;
		width = dungeonFloor[0].length;

		parsedFloor = parseFloorData(floorNumber);
	}

	/**
	 * Assigns an event to a an event array based on the string in the
	 * corresponding index in the dungeonFloor array.
	 *
	 * As the floorNumber increases beyond 1, the game becomes more
	 * challenging and rewarding.
	 *
	 * @return the parsed array with events.
	 */
	public Events[][] parseFloorData(int floorNumber) {
		Events[][] populatedFloor = new Events[height][width];

		for (int i = 0; i < height; i++) {
			for (int k = 0; k < width; k++) {
				switch (dungeonFloor[i][k]) {
					//case "START":
						//populatedFloor[i][k] = new Start();
				    case "EMPTY":
					    populatedFloor[i][k] = new EmptyRoomEvent(floorNumber);
				    case "MONSTER":
					    populatedFloor[i][k] = new CombatEvent(floorNumber);
				    case "TREASURE":
				    	populatedFloor[i][k] = new TreasureEvent(floorNumber);
				    case "BOSS":
				    	populatedFloor[i][k] = new BossEvent(floorNumber);
				    case "SHOP":
				    	populatedFloor[i][k] = new ShopEvent(floorNumber);
				    case "DIALOGUE":
				    	populatedFloor[i][k] = new DialogueEvent(floorNumber);
				}
			}
		}

		return populatedFloor;
	}

	/**
	 * Provides direct access to the parsed floor.
	 *
	 * @return the floor with events included.
	 */
	public Events[][] getParsedFloor() {
		return parsedFloor;
	}

}
