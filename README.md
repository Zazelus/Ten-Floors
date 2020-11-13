# Ten-Floors
A Java based text rpg that is inspired by Dungeons &amp; Dragons.

Ten Floors - A Java Text RPG

	In summary, Ten Floors is a text-based RPG that will be developed using mostly Java and in the eclipse compiler. Players will go through ten floors of a deep dungeon and encounter enemies, non-player characters and everything in between. When a new player is made, they will have a choice between various classes which will each have their own meaningful and distinct mechanics. They will explore a unique dungeon on each floor and attempt to conquer each floor’s ‘commander’. In typical RPG fashion, the player will get stronger as they progress by leveling up and looting or buying new and powerful equipment in order to tackle the final challenge that awaits.

How Does it Work?

	While things are subject to change over the course of development, the game will be handled by different ‘event’ classes that are used in tandem with the map parser. Creating maps will be done through text files which will be read by the aforementioned parser. As it looks at each keyword, it will map it to a specific event which will take place as the character steps into the appropriate ‘tile’. The player character can move in any of the cardinal directions, including diagonally. This will be done through a basic 2-D array that intuitively functions as the map the player navigates.

Events include and are not limited to:

Combat
Dialogue (with special interactions)
Shops
Traps
Treasure Rooms
Empty Rooms (with possible secrets attached)
Etc.

How Will Everything Be Accomplished?

	The main priority will be to have a playable prototype ready fairly soon. Players will be able to traverse the first floor of the dungeon and have many different interactions with the game world. Once the prototype and first floor are finished, the plan will go as follows:

1. Create the rest of the floors (trivial but tedious).
2. Create a save/load game system/process.
3. Polish up the code, fix bugs as each part creates more layers.
4. Give each class more depth and flavor, having more intent with creating a unique gameplay style for each.
5. Add more events and update the floors with these events where it makes sense.
6. Give each floor more attention with how encounters are spaced out, the types of encounters there are and creating a more cohesive gameplay experience. Essentially make the maps ‘less random’ and make the dungeon feel like it has proper structure to it.
7. Overhaul text and help smooth out any ‘clunkiness’. The terminal shouldn’t be filled with text that would make it hard to discern what’s happening.
8. Overhaul combat.
9. Develop a richer world lore.
10. Add sounds and music.
11. Make monster art animated (somehow).

More goals TBD.
