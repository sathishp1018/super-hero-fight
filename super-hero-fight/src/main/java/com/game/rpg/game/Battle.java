package com.game.rpg.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.game.rpg.fight.Fight;
/**
* 
* Battle Class used to do the actual battle between the 2 characters of the Game 
*
* @author  Sathish Pandian
*/
public class Battle {

	private int battlePoint = 50;
	private Fight rolePlayer; 
	private Fight monster;
	public Battle(Fight rolePlayer, Fight monster) {
		this.rolePlayer =rolePlayer;
		this.monster=monster;
	}
	
	/**
	 * Method to get the Scanner
     *
     * @param rolePlayer Fight - Role Player character fight object 
     * 
     * @param monster Fight - Monster fight object 
     * 
     * @return  the total points of the player character
     * 
     * @throws IOException if there or any IO exception 
     *         this map
     *         
     */

	public int doBattle() throws IOException{
		
        System.out.println("You encounter " + monster.getCharacter().getName() + ":  Your  character " + rolePlayer.getCharacter().getName() + "\n");
        System.out.println("Battle with " + monster.getCharacter().getName() + " starts ( Player : "+ rolePlayer.getHealth() + " / monster : "
        					+ monster.getHealth() + ")");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        // Fighting will continue till the Player are monster alive or the game is saves
        while (rolePlayer.isAlive() && monster.isAlive()) {
        	System.out.print("\n");
            System.out.print("Attack (a) or heal (h) or save fight (s) ?");
            String action = in.readLine();
            
            // player heals
            if (action.equals("h")) {
            	rolePlayer.heal();
            	
            } else if(action.equals("a")){
            	
            	// player is attacking 
                monster.defend(rolePlayer);
                
            }else if(action.equals("s")){
            	
            	// saving the game of the player
            	System.out.print("\n");
            	System.out.println("You Game is saved, You can resume back the game later"); 
               return -1;
            }
            if (monster.isAlive()) {
            	rolePlayer.defend(monster);
            }  
        }
        System.out.print("\n");
        System.out.println(" ***  Battle over ::::: "+ (rolePlayer.isAlive() ? "You Won the Battle" :"You Lose the Battle") + " **** ");
        
        if(rolePlayer.isAlive()) {
        	return battlePoint;
        }else {
        	return 0;
        }
	}

	public Fight getRolePlayer() {
		return rolePlayer;
	}

	public Fight getMonster() {
		return monster;
	}

	public int getBattlePoint() {
		return battlePoint;
	}

	public void setBattlePoint(int battlePoint) {
		this.battlePoint = battlePoint;
	}

	public void setRolePlayer(Fight rolePlayer) {
		this.rolePlayer = rolePlayer;
	}

	public void setMonster(Fight monster) {
		this.monster = monster;
	}
	
	
	
	

	
	

	

	
	
	
	
	
	
	
	
	

}
