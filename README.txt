# Knight_Fight_Game
Final project for my Java course at Colorado State University. This is a text based game involving luck of the draw (tarot card based status alterations), luck of the dice (damage based on random dice rolls),  and random encounters with various foes. Pick 1 to 4 knights and set off on your text-based ACSII art adventure! 

UML: https://www.cs.colostate.edu/~cs163/.Fall20/001/practicals/p5/01knightfight/knightfightUML.pdf

JavaDocs: https://www.cs.colostate.edu/~cs163/.Fall20/001/practicals/p5/01knightfight/javadoc/index.html

	Sample Output
	The following code is sample output from the game running, so you can get an idea of what your finished product looks like.

	Round Table Games: Knights of Legend
	loading...

	What would you like to do? help
	Unsure what to do, here are some options:
		ls or list all  - listing the knights
		list active  - list the active knights knights only
		show name or id - show the knight details card
		set active name or id - set knight as active (note: only 4 knights can be active)
		remove active name or id - remove a knight from active status (heals knight)
		explore or adventure or quest - find random monsters to fight
		save filename - save the game to the file name (default: saveData.csv)
		exit or goodbye - to leave the game

	Game rules: You can have four active knights. As long as they are active, they won't heal, but they can gain XP by going on adventures.
	When you make a knight inactive, they will heal. How many monsters can you defeat before, you have to heal?

	What would you like to do? ls
	1: Guinevere
	2: Morrigan Ravenskind
	3: Eriu
	4: Danu of Ireland
	5: Fodla
	6: Banba
	7: Igraine of the Lake
	8: Anna of the Mountains
	9: Morgan la Fay
	10: Elaine Pendragon
	11: Morgawse
	12: Arthur
	13: Lancelot
	14: Gwain
	15: Argodras the Red
	16: The Green Knight
	17: Cam the Ram

	What would you like to do? show 3
	+============================+
	| Eriu                       |
	| id: 3                      |
	|                            |
	| Health: 32      XP: 0      |
	|  Power: D4      Armor: 13  |
	|                            |
	+============================+

	What would you like to do? show Elaine
	+============================+
	| Elaine Pendragon           |
	| id: 10                     |
	|                            |
	| Health: 35      XP: 0      |
	|  Power: D8      Armor: 14  |
	|                            |
	+============================+

	What would you like to do? set active 4
	What would you like to do? set active 6
	What would you like to do? set active 13
	What would you like to do? set active 15
	What would you like to do? set active 1
	Unable to set active knight. Only four can be active at a time.

	What would you like to do? list active
	4: Danu of Ireland
	6: Banba
	13: Lancelot
	15: Argodras the Red

	What would you like to do? remove 15
	What would you like to do? set active 1
	What would you like to do? quest

	For this quest, our knights drew the following fortunes!
	Danu of Ireland drew
	+======================+
	|Wisdom                |
	|HP Bonus:           +0|
	|AC Bonus:           +1|
	|Hit Bonus:          +1|
	|Damage Adj:        D12|
	+======================+
	Banba drew
	+======================+
	|Franchise             |
	|HP Bonus:           +0|
	|AC Bonus:           +0|
	|Hit Bonus:          +1|
	|Damage Adj:          -|
	+======================+
	Lancelot drew
	+======================+
	|Integrity             |
	|HP Bonus:          +10|
	|AC Bonus:           +2|
	|Hit Bonus:          +2|
	|Damage Adj:          -|
	+======================+
	Guinevere drew
	+======================+
	|Honesty               |
	|HP Bonus:          +15|
	|AC Bonus:           +0|
	|Hit Bonus:          +0|
	|Damage Adj:          -|
	+======================+


	Our heroes come across the following monsters. Prepare for battle!
	Knights                     Foes
	Danu of Ireland             Orc
	Banba
	Lancelot
	Guinevere

	Orc was defeated!
	Would you like to continue on your quest (y/n)? y

	Our heroes come across the following monsters. Prepare for battle!
	Knights                     Foes
	Danu of Ireland             Umber Hulk
	Banba
	Lancelot
	Guinevere

	Umber Hulk was defeated!
	Would you like to continue on your quest (y/n)? y

	Our heroes come across the following monsters. Prepare for battle!
	Knights                     Foes
	Danu of Ireland             Gelatinous Cube
	Banba                       Frost Giant
	Lancelot                    Kobold
	Guinevere                   Red Dragon

	Kobold was defeated!
	Guinevere was defeated!
	Banba was defeated!
	Gelatinous Cube was defeated!
	Lancelot was defeated!
	Frost Giant was defeated!
	Danu of Ireland was defeated!
	All active knights have been defeated!

	What would you like to do? save
	What would you like to do? goodbye
	Thank you for playing!
