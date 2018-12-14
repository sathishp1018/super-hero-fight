package com.game.rpg.modal;
/**
* 
* Player Class act Modal for the Player of the application 
*
* @author  Sathish Pandian
*/
import java.util.EnumSet;

import com.game.rpg.game.Battle;
import com.game.rpg.player.PlayerStar;

public class Player {
	private String name;
    private PlayerStar currentStar;
    private int totalPoints;
    private Battle battle;
    
    public Player(){}
    
	public Player(String name, PlayerStar currentStar, int totalPoints) {
		super();
		this.name = name;
		this.currentStar = currentStar;
		this.totalPoints = totalPoints;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public PlayerStar getCurrentStar() {
		return currentStar;
	}
	public void setCurrentStar(PlayerStar currentStar) {
		this.currentStar = currentStar;
	}
	public Battle getBattle() {
		return battle;
	}
	public void setBattle(Battle battle) {
		this.battle = battle;
	}
	public int getTotalPoints() {
		return totalPoints;
	}
	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
		updateCurrentStar(totalPoints);
	}
	
	/**
	 * Method to set the total points after the game and internally updates the Player Star level
     *
     * @param totalPoints int the total points after the game
     * 
     *         
     */
	public void updateCurrentStar(int totalPoints){
		EnumSet.allOf(PlayerStar.class)
        .forEach(playerStar->{ if(totalPoints >= playerStar.getStar()) { 
        	currentStar = playerStar;
        } } );
	}
	
	/**
	 * Method to print the Player information in the console
     *
     *         
     */
	public void printPlayerInformation() {
		 System.out.println("Name : "+getName());
		 System.out.println("Stars : "+getCurrentStar());
		 System.out.println("Total Points : "+getTotalPoints());
	}
	
	
	
    
    

}
