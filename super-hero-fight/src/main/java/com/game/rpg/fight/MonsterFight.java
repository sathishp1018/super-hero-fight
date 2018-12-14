package com.game.rpg.fight;

import java.util.Random;

import com.game.rpg.modal.GameCharacter;
/**
* 
* Class that provide concrete implementations for the Monster Fight 
* in Fight hierarchy of the application 
*
* @author  Sathish Pandian
*/
public class MonsterFight implements Fight{
	private int health;
    private int healLeft;
    private GameCharacter character;
    private final static Random random = new Random();
    
    /**
   	 * Method to attack the opponent
        * 
        * @return int to denote the attack power
        * 
        *         
        */
    public int attack() {
		//Generate Random attack between 5 to 10;
		return random.nextInt((10 - 5) + 1) + 5;
		
	}
    /**
	 * Method to get the opposite Character
     *
     * @param  player object which implement the Fight 
     * 
     *         
     */
	public void defend(Fight player) {
		int attackStrength = player.attack();
		health = (health > attackStrength) ? health - attackStrength : 0;
		
		System.out.printf("  %s hits %s for %d HP of damage ("+character.getName()+" HP: %d)\n", player.getCharacter().getName(), 
				character.getName(), attackStrength,
				getHealth());
        if (health == 0) {
        	 System.out.println("  " + character.getName() + " has been defeated");
        }
		
	}
	public void heal() {
        System.out.println("NOT Implemented");
    }
	
	/**
	 * Method to  check  character status
     * 
     * @return boolean true or false of the character status
     */
	public boolean isAlive() {
		 return health > 0;
    }
    
    public MonsterFight(GameCharacter character,int health,int healLeft){
    	this.character=character;
    	this.health=health;
    	this.healLeft=healLeft;
    }

	@Override
	public int getHealth() {
		return health;
	}

	@Override
	public int getHealLeft() {
		return healLeft;
		
	}

	@Override
	public GameCharacter getCharacter() {
		return character;
	}
	
	public String printHealth() {
	        return character.getName()+" HP: " + health;
	}

	



}
