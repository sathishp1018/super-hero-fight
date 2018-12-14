package com.game.rpg.game;

import java.io.IOException;
import java.util.Optional;

import com.game.rpg.data.CharactersRepository;
import com.game.rpg.data.PlayersRepository;
import com.game.rpg.modal.GameCharacter;
import com.game.rpg.modal.Player;
import com.game.rpg.player.PlayLevel;
import com.game.rpg.util.GameUtil;

/**
* 
* Game Class contains the business logic of the Application for different operations the use selects
*
* @author  Sathish Pandian
*/
public class Game {	
	
	/**
	 * Method to Play the Fighting Game
     *
     * @param player Player - role player object 
     * 
     * @throws IOException if there or any IO exception 
     *         this map
     *         
     */

	public void  playGame(Player player) throws IOException {
		
   		 GameSelector gs = new GameSelector();
		 System.out.println("Select PlayLvel : Easy (e), Medium (m), Hard (h)");
		 String level = GameUtil.getScanner().nextLine();
		  // selecting the play level
		 if((!"e".equalsIgnoreCase(level)) && (!"m".equalsIgnoreCase(level)) && (!"h".equalsIgnoreCase(level)) ) {
			 System.out.println(GameUtil.INVALID_SELECTION);
			 return;
		 }else {
			 if("e".equalsIgnoreCase(level)) {
				 gs.setPlayLevel(PlayLevel.EASY);
			 }else if("m".equalsIgnoreCase(level)) {
				 gs.setPlayLevel(PlayLevel.MEDIUM);
			 }else {
				 gs.setPlayLevel(PlayLevel.HARD);
			 }
		 }
		 
		// selecting the character to play
		 System.out.println("**********Select SuperHeros********");
		 CharactersRepository.getInstance().getCharacters().keySet().forEach(System.out::println);
		 
		 String name = GameUtil.getScanner().nextLine();
		 if(CharactersRepository.getInstance().getCharacter(name).isPresent()) {
			 gs.selectCharacter(name);
		 }else {
			 System.out.println(GameUtil.INVALID_SELECTION);
			 return;
		 }
		 
		// selecting the Monster to play
		 System.out.println("**********Select Monstor********");
		 CharactersRepository.getInstance().getMonsters().keySet().forEach(System.out::println);
		 
		 String monstorName = GameUtil.getScanner().nextLine();
		 if(CharactersRepository.getInstance().getMonster(monstorName).isPresent()) {
			 gs.selectMonster(monstorName);
		 }else {
			 System.out.println(GameUtil.INVALID_SELECTION);
			 return;
		 }
		
		// Battle object is created and the player is ready to play 
		Battle battle = new Battle(gs.getRolePlayer(), gs.getMonster());
		int points = battle.doBattle();
		//-1 indicates battle is saved to resume the game later 0 or 50 will be the game score 
		if(-1==points) {
			player.setBattle(battle);
		}else{
			player.setTotalPoints(player.getTotalPoints()+points);
			player.setBattle(null);
			PlayersRepository.getInstance().updatePlayer(player);
		}
	}
	
	/**
	 * Method to create a new character to add to the Application 
     * 
     * @throws IOException if there or any IO exception 
     *         this map
     *         
     */
	
	public void  createCharacter() throws IOException {
		 System.out.println("Type 'h' : To Create SuperHeros or 'm' : To Create Monstors");
		 String option = GameUtil.getScanner().nextLine();
		 
		// creating character and will be added to the characters
		 if("h".equalsIgnoreCase(option)) {
			 
			 System.out.println("**********Existing SuperHeros********");
			 CharactersRepository.getInstance().getCharacters().keySet().forEach(System.out::println);
			 
			 GameCharacter character = new GameCharacter();
			 System.out.println("Enter SuperHeros Name : ");
			 character.setName(GameUtil.getScanner().nextLine());
			 System.out.println("Enter SuperHeros Short Description : ");
			 character.setDescription(GameUtil.getScanner().nextLine());
			 System.out.println("Enter SuperHeros Weapon : ");
			 character.setWeapon(GameUtil.getScanner().nextLine());
			 System.out.println(CharactersRepository.getInstance().addCharacter(character));
			 
		 }else if("m".equalsIgnoreCase(option)){
			 
			// creating Monster and will be added to the Monsters
			 
			 System.out.println("**********Existing Monstor********");
			 CharactersRepository.getInstance().getMonsters().keySet().forEach(System.out::println);
			 
			 GameCharacter character = new GameCharacter();
			 System.out.println("Enter Monster Name : ");
			 character.setName(GameUtil.getScanner().nextLine());
			 System.out.println("Enter Monster Short Description : ");
			 character.setDescription(GameUtil.getScanner().nextLine());
			 System.out.println("Enter Monster Weapon : ");
			 character.setWeapon(GameUtil.getScanner().nextLine());
			 System.out.println(CharactersRepository.getInstance().addMonster(character));
		 }
		
	}
	
	/**
	 * Method to explore various information of the Game Application
     *
     * @param player Player - role player object 
     * 
     * @throws IOException if there or any IO exception 
     *         this map
     *         
     */
	
	public void  explore(Player player) throws IOException {
		 System.out.println("Type 'p' : your information or 'h' : to view the SuperHeros or 'm' : to view the Monstors");
		 System.out.println("or 'i' : to view Game information");
		 
		 String option = GameUtil.getScanner().nextLine();
		 System.out.println(option);
		// To explore the characters 
		 if("h".equalsIgnoreCase(option)) {
			 System.out.println("**********Existing SuperHeros********");
			 CharactersRepository.getInstance().getCharacters().keySet().forEach(System.out::println);
			 
			 String name = GameUtil.getScanner().nextLine();
			 Optional<GameCharacter> character= CharactersRepository.getInstance().getCharacter(name);
			 if(character.isPresent()) {
				 character.get().printCharcterInformation();
			 }else {
				 System.out.println(GameUtil.INVALID_SELECTION);
			 }
			 
		 }else if("m".equalsIgnoreCase(option)){
			 
			// To explore the Monsters 
			 System.out.println("**********Existing Monstor********");
			 CharactersRepository.getInstance().getMonsters().keySet().forEach(System.out::println);
			 System.out.println("Type the Monstor Name to view information");
			 
			 String name = GameUtil.getScanner().nextLine();
			 Optional<GameCharacter> monstor= CharactersRepository.getInstance().getMonster(name);
			 if(monstor.isPresent()) {
				 monstor.get().printCharcterInformation();
			 }else {
				 System.out.println(GameUtil.INVALID_SELECTION);
			 }
			 
		 }else if("p".equalsIgnoreCase(option)) {
			 
			// To explore the Player information 
			 
			 System.out.println("**********Player Information ********");
			 player.printPlayerInformation();
		 }else if("i".equalsIgnoreCase(option)) {
			 
			// To explore the Player information 
			 
			 System.out.println("**********Game Information ********");
			 GameUtil.gameInformation();
		 }else {
			 System.out.println(GameUtil.INVALID_SELECTION);
		 }
		
	}
	
	/**
	 * Method to resume a saved game by the player
     *
     * @param player Player - role player object 
     * 
     * @throws IOException if there or any IO exception 
     *         this map
     *         
     */
	
	public void  resumeGame(Player player) throws IOException {
		
		// To resume the saved gam of the player
		
		Battle battle = player.getBattle();

  		if(null == battle) {
  			System.out.println("^^^^^^^ No Saved Games to Resume ^^^^^^^");
  			return;
  		}
  		
		// starting the saved game from where it is left
		int points = battle.doBattle();
		if(-1==points) {
			player.setBattle(battle);
		}else{
			player.setTotalPoints(player.getTotalPoints()+points);
			player.setBattle(null);
			PlayersRepository.getInstance().updatePlayer(player);
		}
		
	}
}
