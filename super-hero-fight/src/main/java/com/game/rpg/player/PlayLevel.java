package com.game.rpg.player;
/**
* 
* enum to standardizes the Play level of the current playing Game  
*
* @author  Sathish Pandian
*/
public enum PlayLevel {
	 EASY(5), MEDIUM(3), HARD(1);
		private int level;
		public int getLevel() {
		       return this.level;
		}
		PlayLevel(int level) {
		     this.level = level;
		}

}
