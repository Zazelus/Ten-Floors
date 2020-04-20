package com.tenfloors.dungeontest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;

import org.junit.Test;

import com.tenfloors.dungeon.FloorGenerator;
import com.tenfloors.events.BossEvent;
import com.tenfloors.events.CombatEvent;
import com.tenfloors.events.DialogueEvent;
import com.tenfloors.events.EmptyRoomEvent;
import com.tenfloors.events.ShopEvent;
import com.tenfloors.events.TreasureEvent;

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
