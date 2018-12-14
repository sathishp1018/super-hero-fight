package com.game.rpg;

import java.io.IOException;

import com.game.rpg.game.GameConsole;
import com.game.rpg.util.GameUtil;

/**
 * 
 * App class contains the Main method to run the Game application 
 *
 * @author  Sathish Pandian
 */
public class App {

	/**
	 * Main method
     *
     * @param args Command line arguments
     * 
     * @throws IOException if there or any IO exception 
     *         this map
     */
	public static void main( String[] args ) throws IOException
    {
		//Loads the prefined characters
		GameUtil.loadcharacters();
		//Loads banner
		GameUtil.loadBanner();
		//Run the Game console
        GameConsole gameConsole = new GameConsole();
        gameConsole.run();

		
       
    }

}
