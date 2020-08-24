package com.tenfloors.dungeontest;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

import org.junit.Test;

import com.tenfloors.dungeon.FloorGenerator;

public class FloorDungeonTest {

	@Test
	public void testFivebyFiveCreation() throws FileNotFoundException {
		String[][] dungeon = {{"EMPTY",      "EMPTY",      "MONSTER",        "TREASURE",   "MONSTER"},
							  {"EMPTY",      "MONSTER",    "TREASURE",       "MONSTER",    "EMPTY"},
						      {"EMPTY",      "SHOP",       "MONSTER",        "TREASURE",   "EMPTY"},
						      {"MONSTER",    "EMPTY",      "EMPTY",          "TREASURE",   "EMPTY"},
						      {"TREASURE",   "EMPTY",      "EMPTY",          "EMPTY",      "MONSTER"}};

		FloorGenerator floorGenerator = new FloorGenerator("testdungeon5x5", 5, 5);

		for (int i = 0; i < 5; i++) {
			for (int k = 0; k < 5; k++) {
				assertEquals(dungeon[i][k], floorGenerator.getDungeon()[i][k]);
			}
		}
	}

}
