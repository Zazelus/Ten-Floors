
/**
 * The Player class handles all player data and uses them to check certain
 * conditions in the game.
 *
 * @author Zaezul
 * @version 04.20.2020
 */
public class Player {

	/**
	 * The player's name. May be used in some situations, mostly for flavor.
	 */
	private String playerName;

	/**
	 * Player stat variables, certain statistics are important for specific classes.
	 */
	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;

	/**
	 * Creates a new player object.
	 *
	 * The parameters are decided during the character creation sequence, however
	 * they can change throughout the course of the game due to player conditions in
	 * and outside of combat as well as leveling up.
	 *
	 * @param playerName   is the player's name.
	 * @param strength     is the player's strength score.
	 * @param dexterity    is the player's dexterity score.
	 * @param constitution is the player's constitution score.
	 * @param intelligence is the player's intelligence score.
	 * @param wisdom       is the player's wisdom score.
	 */
	public Player(String playerName, int strength, int dexterity, int constitution, int intelligence, int wisdom) {
		this.playerName = playerName;
		this.strength = strength;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
	}

	// Getters and setters section.

	/**
	 * Get's the player's name.
	 *
	 * @return the player's name.
	 */
	public String getName() {
		return playerName;
	}

	/**
	 * Returns the player's current strength score.
	 *
	 * @return player's strength score.
	 */
	public int getStrength() {
		return strength;
	}

	/**
	 * Modifies the strength score by a specific number.
	 *
	 * @param mod is how much the score will be modified by.
	 */
	public void modifyStrength(int mod) {
		strength += mod;
	}

	/**
	 * Returns the player's current dexterity score.
	 *
	 * @return player's dexterity score.
	 */
	public int getDexterity() {
		return dexterity;
	}

	/**
	 * Modifies the dexterity score by a specific number.
	 *
	 * @param mod is how much the score will be modified by.
	 */
	public void modifyDexterity(int mod) {
		dexterity += mod;
	}

	/**
	 * Returns the player's current constitution score.
	 *
	 * @return player's constitution score.
	 */
	public int getConstitution() {
		return constitution;
	}

	/**
	 * Modifies the constitution score by a specific number.
	 *
	 * @param mod is how much the score will be modified by.
	 */
	public void modifyConstitution(int mod) {
		constitution += mod;
	}

	/**
	 * Returns the player's current intelligence score.
	 *
	 * @return player's intelligence score.
	 */
	public int getIntelligence() {
		return intelligence;
	}

	/**
	 * Modifies the intelligence score by a specific number.
	 *
	 * @param mod is how much the score will be modified by.
	 */
	public void modifyIntelligence(int mod) {
		intelligence += mod;
	}

	/**
	 * Returns the player's current wisdom score.
	 *
	 * @return player's wisdom score.
	 */
	public int getWisdom() {
		return wisdom;
	}

	/**
	 * Modifies the wisdom score by a specific number.
	 *
	 * @param mod is how much the score will be modified by.
	 */
	public void modifyWisdom(int mod) {
		wisdom += mod;
	}

}
