package com.game.rpg.fight;

import java.util.Random;

import com.game.rpg.modal.GameCharacter;
/**
* 
* Class that provide concrete implementations for the SuperHero Fight 
* in Fight hierarchy of the application 
*
* @author  Sathish Pandian
*/
public class SuperHeroFight implements Fight{
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
	 * Method to get defend the opposite Monster
     *
     * @param  monster object which implement the Fight 
     * 
     *         
     */
	public void defend(Fight monster) {
		int attackStrength = monster.attack();
		health = (health > attackStrength) ? health - attackStrength : 0;
        System.out.printf("  " + character.getName() + " is hit for %d HP of damage ("+character.getName()+" HP: %d)\n", attackStrength,
        		getHealth());
        if (health == 0) {
            System.out.println("  " + character.getName() + " has been defeated");
        }
		
	}
	/**
	 * Method to heal the character
 
     * 
     *         
     */
	public void heal() {
        if (healLeft > 0) {
        	health = health + 5;
            System.out.printf("  %s drinks healing potion ("+character.getName()+" HP: %d), %d potions left)\n", character.getName(),
            		getHealth(), --healLeft);
        } else {
            System.out.println("  You've exhausted your potion supply!");
        }
    }
	
	/**
	 * Method to  check  character status
     * 
     * @return boolean true or false of the character status
     */
	public boolean isAlive() {
		 return health > 0;
    }
    
    public SuperHeroFight(GameCharacter character,int health,int healLeft){
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


}
