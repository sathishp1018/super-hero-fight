package com.game.rpg.fight;

import com.game.rpg.modal.GameCharacter;
/**
* 
* Class that act as the Factory for creation of SuperHero Fight object
* in Fight hierarchy of the application 
*
* @author  Sathish Pandian
*/
public class SuperHeroFightFactory implements FightAbstractFactory{
	
	private int health;
	private int healLeft;
	private GameCharacter character;
	
	 public SuperHeroFightFactory(GameCharacter character,int health,int healLeft){
		 	this.character=character;
	    	this.health=health;
	    	this.healLeft=healLeft;
	    }

	@Override
	public Fight createFight() {
		return new SuperHeroFight(character,health,healLeft);
	}

}
