package com.game.rpg.modal;

/**
* 
* GameCharacter Class act Modal for the GameCharacter of the application 
*
* @author  Sathish Pandian
*/
public class GameCharacter {
	
	 	private String name;
	    private String description;
	    private String weapon;
	    
	    public GameCharacter() {}
		
		public GameCharacter(String name, String description, String weapon) {
			this.name = name;
			this.description = description;
			this.weapon = weapon;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getWeapon() {
			return weapon;
		}

		public void setWeapon(String weapon) {
			this.weapon = weapon;
		}

		@Override
		public String toString() {
			return "Character [name=" + name + ", description=" + description + ", weapon=" + weapon + "]";
		} 
		
		/**
		 * Method to print the GameCharacter information in the console
	     *
	     *         
	     */
		public void printCharcterInformation() {
			 System.out.println("Name : "+getName());
			 System.out.println("Desscription : "+getDescription());
			 System.out.println("Weapon : "+getWeapon());
		}


}
