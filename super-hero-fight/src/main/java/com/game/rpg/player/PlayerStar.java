package com.game.rpg.player;

/**
* 
* enum to standardizes the Player star level of the Application 
*
* @author  Sathish Pandian
*/
public enum PlayerStar {
		   STARTER(50), ADVANCED(100), INTERMIDATE(150), EXPERT(200),SUPERSTAR(250);
	private int star;
	public int getStar() {
	       return this.star;
	}
	PlayerStar(int star) {
	     this.star = star;
	}
		
		


}
