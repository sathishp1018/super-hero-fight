package com.game.rpg.fight;

/**
* 
* Factory interface of the Fight hierarchy of the application 
*
* @author  Sathish Pandian
*/
public class FightFactory {
	
	public static Fight getFight(FightAbstractFactory factory){
		return factory.createFight();
	}

}
