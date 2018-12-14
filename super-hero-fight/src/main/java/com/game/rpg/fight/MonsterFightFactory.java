package com.game.rpg.fight;

import com.game.rpg.modal.GameCharacter;
/**
* 
* Class that act as the Factory for creation of Monster Fight object
* in Fight hierarchy of the application 
*
* @author  Sathish Pandian
*/
public class MonsterFightFactory implements FightAbstractFactory{
	
	private int health;
	private int healLeft;
	private GameCharacter character;
	
	 public MonsterFightFactory(GameCharacter character,int health,int healLeft){
		 	this.character=character;
	    	this.health=health;
	    	this.healLeft=healLeft;
	    }

	@Override
	public Fight createFight() {
		return new MonsterFight(character,health,healLeft);
	}

}

