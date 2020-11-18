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
	private Room[][] parsedFloor;

	private int height;
	private int width;

	/**
	 * Creates a new FloorParser object.
	 *
	 * @param dungeonFloor	is the dungeon to be parsed for events.
	 * @throws InterruptedException
	 */
	public FloorParser(String[][] dungeonFloor, int floorNumber) throws InterruptedException {
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
	 * @throws InterruptedException
	 */
	public Room[][] parseFloorData(int floorNumber) throws InterruptedException {
		Room[][] populatedFloor = new Room[height][width];

		for (int i = 0; i < height; i++) {
			for (int k = 0; k < width; k++) {
				switch (dungeonFloor[i][k]) {
					case "START":
						populatedFloor[i][k] = new StartRoom();
					case "WALL":
						populatedFloor[i][k] = new Wall();
						break;
				    case "EMPTY":
					    populatedFloor[i][k] = new EmptyRoom(floorNumber);
					    break;
				    case "MONSTER":
					    populatedFloor[i][k] = new MonsterRoom(floorNumber);
					    break;
				    case "TREASURE":
				    	populatedFloor[i][k] = new TreasureRoom(floorNumber);
				    	break;
				    case "BOSS":
				    	populatedFloor[i][k] = new BossRoom(floorNumber);
				    	break;
				    case "SHOP":
				    	populatedFloor[i][k] = new Shop(floorNumber);
				    	break;
				    case "DIALOGUE":
				    	populatedFloor[i][k] = new Dialogue(floorNumber);
				    	break;
				    case "KEY":
				    	populatedFloor[i][k] = new KeyRoom(floorNumber);
				    	break;
				    case "HEAL":
				    	populatedFloor[i][k] = new HealingRoom(floorNumber);
				    	break;
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
	public Room[][] getParsedFloor() {
		return parsedFloor;
	}

}
