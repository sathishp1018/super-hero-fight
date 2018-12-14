package com.game.rpg.fight;

import com.game.rpg.modal.GameCharacter;
/**
* 
* Interface of the Fight hierarchy of the application 
*
* @author  Sathish Pandian
*/
public interface Fight extends Fightable{
	int getHealth();
	int getHealLeft();
	GameCharacter getCharacter();
}
