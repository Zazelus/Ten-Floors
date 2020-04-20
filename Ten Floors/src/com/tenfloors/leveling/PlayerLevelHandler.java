package com.tenfloors.leveling;

import com.tenfloors.player.*;

/**
 * Handles player leveling at different exp requirements for each level.
 *
 * Future Plans: Introduce other features such as abilities or feats instead of
 * the usual stat bonuses and increases.
 *
 * @author Zaezul
 * @version 04.20.2020
 */

public class PlayerLevelHandler {

	public static final int[] LEVEL_REQUIREMENTS = new int[] {60, 200, 400, 1000, 2000};
	public static int playerLevel = 1;

	public PlayerLevelHandler() {

	}

	public static boolean levelRequirement() {
		for (int i = 0; i < LEVEL_REQUIREMENTS.length; i++) {
			if ((Player.playerExp == LEVEL_REQUIREMENTS[i] || Player.playerExp > LEVEL_REQUIREMENTS[i]) &&
					Player.playerExp < LEVEL_REQUIREMENTS[i + 1]) {
				return true;
			}
        }

		return false;
	}

	public static void levelUp() {
		if (levelRequirement() == true) {
			System.out.println("Congratulations, you've leveled up!");
		}

		playerLevel += 1;
	}

}