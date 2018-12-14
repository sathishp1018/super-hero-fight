package com.game.rpg.game;

import java.io.IOException;
import java.util.Optional;

import com.game.rpg.data.PlayersRepository;
import com.game.rpg.modal.Player;
import com.game.rpg.player.PlayerStar;
import com.game.rpg.util.GameUtil;
/**
* 
* GameConsole Class act as the Game Console of the application 
*
* @author  Sathish Pandian
*/
public class GameConsole {
	
	/**
	 * Method responsible for running the Application
     * 
     * @throws IOException if there or any IO exception 
     *         this map
     *         
     */
public void run() throws IOException {
		
		System.out.println(" ********************* WELCOME TO SUPER HEROS FIGHTING**********************");
		
		boolean main = true;
		while (main) {
		System.out.println("Enter your Name : ");
		
		Player player =null; 
	    String name =GameUtil.getScanner().nextLine();
	    Optional<Player> optionalplayer = PlayersRepository.getInstance().getPlayer(name);
	    if(name.length() ==0) {
	    	System.out.println(GameUtil.INVALID_NAME);
	    	continue;
	    }
	    if(optionalplayer.isPresent()) {
	    	System.out.println("******** Existing Player ******");
	    	player = optionalplayer.get();
	    	player.printPlayerInformation();
	    	
	    }else {
	    	System.out.println("********  New Player ******");
	    	player = new Player();
	    	player.setName(name);
	    	player.setCurrentStar(PlayerStar.STARTER);
	    	
	    	player.printPlayerInformation();
	    	PlayersRepository.getInstance().updatePlayer(player);
	    }
	    
			    boolean flag = true;
			    Game game = new Game();
			    while (flag) {
			    	System.out.print("\n");
				    System.out.println("******** Options ******");
			    	System.out.println("Type 'c'    : To Create Character");
			    	System.out.println("Type 'e'    : To Explore ");
			    	System.out.println("Type 'f'    : To Fight");
			    	System.out.println("Type 'r'    : To resume a saved game");
			    	System.out.println("Type 'exit' : To Exit");
				    String option =GameUtil.getScanner().nextLine().toUpperCase();
				    
				    switch (option) { 
			        case "C": 
			        		game.createCharacter();
			        		break; 
			        case "E": 
			        		game.explore(player);
			        		break; 
			        case "F": 
			        		game.playGame(player);
			        		break; 
			        case "R": 
			        		game.resumeGame(player);
			        		break; 
			        case "EXIT": 
			        	System.out.println("*********Player EXIT**********");
			        	flag = false;
			        	game =null; // setting the game reference to null while player exit so that the game and dependent objects are garbage collected
			            break;
			         default:
			        	 System.out.println(GameUtil.INVALID_SELECTION);
			             break;
				    }
			    }
			   
			    System.out.print("\n");
			    System.out.println("Type 'c' : to continue and 'e' : to end the Game Application");
			    String exit =GameUtil.getScanner().nextLine();
			    if("e".equalsIgnoreCase(exit)) {
			    	main = false;
			    }
			    
		}
		GameUtil.sanncerClose();
		
    }

}
