# Super Hero Fight is Text Based Role Play Game Project

## Setup

#### Maven is used as build tool

Navigate to the source folder

#### To Build the project  use commond 
### mvn install

##### Testcase runs as part of build and application also run in test mode

### Running the application 
#### mvn exec:java -Dexec.mainClass="com.game.rpg.App" 


## Dependencies

The is project requires Junit mockito for unit testing

## JavaDoc

The Project includes a JavaDoc. Read through the Java Doc for more information of code functionality

## Extending the Project

##### The project code contains is Generic fighting role play game. 
##### Abstract Factory patter is used to provide a specific fighting implementation for Superhero and monsters
##### You can create your own Fight implementation through the factory pattern and provide custom functionality for extending the project



## Game Playing  

The Game contains functionality to Fight between Superheros and monsters
#### you can add a character 
#### explore the game
#### save and resume a game

##  Game Information 
#####  This is fighting game between Superhero’s  and monsters 
#####  You can select a superhero and a monster for fighting 
#####  You can select difficulty level from EASY (5 heals), MEDIUM (3 heals) and HARD (1 heal) for each game
#####  Initial health of characters will have 30 health points and every attack will have a power of 5 to 10 health points 
#####  You will get 50 points for every Win
#####  The Players star level are STARTER, ADVANCED, INTERMIDATE, EXPERT and SUPERSTART

## Game Playing Help 

Below functionality details:


##  Login as a Player

 ********************* WELCOME TO SUPER HEROS FIGHTING**********************
Enter your Name : 
sathish
********  New Player ******
Name : sathish
Stars : STARTER
Total Points : 0

******** Options ******
Type 'c'    : To Create Character
Type 'e'    : To Explore 
Type 'f'    : To Fight
Type 'r'    : To resume a saved game
Type 'exit' : To Exit
exit
*********Player EXIT**********

Type 'c' : to continue and 'e' : to end the Game Application

Enter your Name : 
sathish
******** Existing Player ******
Name : sathish
Stars : STARTER
Total Points : 0

******** Options ******
Type 'c'    : To Create Character
Type 'e'    : To Explore 
Type 'f'    : To Fight
Type 'r'    : To resume a saved game
Type 'exit' : To Exit


##  Explore the Game 


Type 'p' : your information or 'h' : to view the SuperHeros or 'm' : to view the Monstors
or 'i' : to view Game information
i
**********Game Information ********
 This is fighting game between Superhero’s  and monsters 
 You can select a superhero and a monster for fighting 
 You can select difficulty level from EASY (5 heals), MEDIUM (3 heals) and HARD (1 heal) for each game
 Initial health of characters will have 30 health points and every attack will have a power of 5 to 10 health points 
 You will get 50 points for every Win
 The Players star level are STARTER, ADVANCED, INTERMIDATE, EXPERT and SUPERSTART

 Type 'p' : your information or 'h' : to view the SuperHeros or 'm' : to view the Monstors
h
**********Existing SuperHeros********
THOR
IRONMAN
SPIDERMAN
SUPERMAN
BATMAN
HULK
thor
Name : Thor
Desscription : Thor
Weapon : Hammer


## FIGHTING


******** Options ******
Type 'c'    : To Create Character
Type 'e'    : To Explore 
Type 'f'    : To Fight
Type 'r'    : To resume a saved game
Type 'exit' : To Exit
f
Select PlayLvel : Easy (e), Medium (m), Hard (h)
e
**********Select SuperHeros********
THOR
IRONMAN
SPIDERMAN
SUPERMAN
BATMAN
HULK
superman
**********Select Monstor********
MAGNETO
GALACTUS
JOKER
DOCTORDOOM
LEXLUTHOR
joker
You encounter Joker:  Your  character Superman

Battle with Joker starts ( Player : 30 / monster : 30)

Attack (a) or heal (h) or save fight (s) ?a
  Superman hits Joker for 5 HP of damage (Joker HP: 25)
  Superman is hit for 5 HP of damage (Superman HP: 25)

Attack (a) or heal (h) or save fight (s) ?a
  Superman hits Joker for 5 HP of damage (Joker HP: 20)
  Superman is hit for 9 HP of damage (Superman HP: 16)

Attack (a) or heal (h) or save fight (s) ?a
  Superman hits Joker for 9 HP of damage (Joker HP: 11)
  Superman is hit for 6 HP of damage (Superman HP: 10)

Attack (a) or heal (h) or save fight (s) ?a
  Superman hits Joker for 5 HP of damage (Joker HP: 6)
  Superman is hit for 8 HP of damage (Superman HP: 2)

Attack (a) or heal (h) or save fight (s) ?a
  Superman hits Joker for 10 HP of damage (Joker HP: 0)
  Joker has been defeated

 ***  Battle over ::::: You Won the Battle **** 
 
 
 ## Save and Resume the game
 
 
 
 
 ******** Options ******
Type 'c'    : To Create Character
Type 'e'    : To Explore 
Type 'f'    : To Fight
Type 'r'    : To resume a saved game
Type 'exit' : To Exit
f
Select PlayLvel : Easy (e), Medium (m), Hard (h)
m
**********Select SuperHeros********
THOR
IRONMAN
SPIDERMAN
SUPERMAN
BATMAN
HULK
spiderman
**********Select Monstor********
MAGNETO
GALACTUS
JOKER
DOCTORDOOM
LEXLUTHOR
lexluthor
You encounter LexLuthor:  Your  character SpiderMan

Battle with LexLuthor starts ( Player : 30 / monster : 30)

Attack (a) or heal (h) or save fight (s) ?a
  SpiderMan hits LexLuthor for 9 HP of damage (LexLuthor HP: 21)
  SpiderMan is hit for 10 HP of damage (SpiderMan HP: 20)

Attack (a) or heal (h) or save fight (s) ?a
  SpiderMan hits LexLuthor for 7 HP of damage (LexLuthor HP: 14)
  SpiderMan is hit for 6 HP of damage (SpiderMan HP: 14)

Attack (a) or heal (h) or save fight (s) ?s

You Game is saved, You can resume back the game later

******** Options ******
Type 'c'    : To Create Character
Type 'e'    : To Explore 
Type 'f'    : To Fight
Type 'r'    : To resume a saved game
Type 'exit' : To Exit
r
You encounter LexLuthor:  Your  character SpiderMan

Battle with LexLuthor starts ( Player : 14 / monster : 14)

Attack (a) or heal (h) or save fight (s) ?a
  SpiderMan hits LexLuthor for 10 HP of damage (LexLuthor HP: 4)
  SpiderMan is hit for 9 HP of damage (SpiderMan HP: 5)

Attack (a) or heal (h) or save fight (s) ?h
  SpiderMan drinks healing potion (SpiderMan HP: 10), 2 potions left)
  SpiderMan is hit for 5 HP of damage (SpiderMan HP: 5)

Attack (a) or heal (h) or save fight (s) ?a
  SpiderMan hits LexLuthor for 8 HP of damage (LexLuthor HP: 0)
  LexLuthor has been defeated

 ***  Battle over ::::: You Won the Battle **** 

 

