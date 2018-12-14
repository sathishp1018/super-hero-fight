package com.game.rpg.game;

import java.util.Optional;

import com.game.rpg.data.CharactersRepository;
import com.game.rpg.fight.Fight;
import com.game.rpg.fight.FightFactory;
import com.game.rpg.fight.MonsterFightFactory;
import com.game.rpg.fight.SuperHeroFightFactory;
import com.game.rpg.modal.GameCharacter;
import com.game.rpg.player.PlayLevel;
/**
* 
* GameSelector Class used to select the Role player character and the monster and play level to start the fighting 
*
* @author  Sathish Pandian
*/
public class GameSelector {
	
	private PlayLevel playLevel;
	private Fight rolePlayer;
	private Fight monster; 
	
	public GameSelector(){
		
	}
	public PlayLevel getPlayLevel() {
		return playLevel;
	}
	/**
	 * Method to set the play level
     *
     * @param playLevel PlayLevel 
     *
     *         
     */
	public void setPlayLevel(PlayLevel playLevel) {
		this.playLevel = playLevel;
	}
	/**
	 * Method to select the role player character
     *
     * @param name String -  character name
     * 
     * @return status of the character selected for fighting
     *         
     */
	public String selectCharacter(String name) {
		Optional<GameCharacter> character  = CharactersRepository.getInstance().getCharacter(name);
		if(character.isPresent()) {
			
			// Creating a SuperHeroFight object using the Abstract Factory design pattern. 
			// This is used to extends the functionality with different implementation later 
			// and to provide a Generic fight Game
			this.rolePlayer = FightFactory.getFight(new SuperHeroFightFactory(character.get(),30,playLevel.getLevel()));
			return "success";
		}
		return "failure";
	}
	/**
	 * Method to select the Monster character
     *
     * @param name String Monster name
     * 
     * @return name status of the Monster selected for fighting
     *         
     */
	public String selectMonster(String name) {
		Optional<GameCharacter> character = CharactersRepository.getInstance().getMonster(name);
		if(character.isPresent()) {
			
			// Creating a MonsterFight object using the Abstract Factory design patter 
			this.monster = FightFactory.getFight(new MonsterFightFactory(character.get(),30,0));
			return "success";
		}
		return "failure";
	}
	public Fight getRolePlayer() {
		return rolePlayer;
	}
	public Fight getMonster() {
		return monster;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
