package com.game.rpg.fight;
/**
* 
* Interface of the Fightable hierarchy of the application 
*
* @author  Sathish Pandian
*/
public interface Fightable {
	int attack();
	void defend(Fight fight) ;
	void heal();
	boolean isAlive();
}
