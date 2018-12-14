package com.game.rpg.util;

import java.io.IOException;
import java.util.Scanner;

import com.game.rpg.data.CharactersRepository;
import com.game.rpg.data.PlayersRepository;
import com.game.rpg.modal.GameCharacter;
/**
 * 
 * Utility Class contains the  utility method used across the application 
 *
 * @author  Sathish Pandian
 */
public class GameUtil {
	
	private static final Scanner SC = new Scanner(System.in);
	public static final String INVALID_SELECTION = "^^^^^ INVALID SELECTION ^^^^^^";
	public static final String INVALID_NAME = "^^^^^ INVALID NAME ^^^^^^";
	
	/**
	 * Method to get the Scanner
     * 
     * @return Scanner for reading the Command line inputs
     * 
     *         
     */
	public static Scanner getScanner() {
		return SC;
	}
	/**
	 * Method to Close the Scanner      
     */
	public static void sanncerClose() {
		SC.close();
	}
	
	/**
	 * Method to load the characters    
     */
	public static void loadcharacters(){
    	
		//super heros
    	CharactersRepository.getInstance().addCharacter(new GameCharacter("Superman", "Superman", "Superhuman strength") );
    	CharactersRepository.getInstance().addCharacter(new GameCharacter("Batman", "Batman", "Genius level intellect") );
    	CharactersRepository.getInstance().addCharacter(new GameCharacter("SpiderMan", "SpiderMan", "Spider web") );
    	CharactersRepository.getInstance().addCharacter(new GameCharacter("Thor", "Thor", "Hammer") );
    	CharactersRepository.getInstance().addCharacter(new GameCharacter("IronMan", "IronMan", "Iron suit") );
    	CharactersRepository.getInstance().addCharacter(new GameCharacter("Hulk", "Hulk", "Gaint") );
    	
    	//monsters
    	CharactersRepository.getInstance().addMonster(new GameCharacter("Joker", "Joker", "Magic") );
    	CharactersRepository.getInstance().addMonster(new GameCharacter("Magneto", "Magneto", "Magnetic force") );
    	CharactersRepository.getInstance().addMonster(new GameCharacter("DoctorDoom", "Doctor Doom", "Energy absorption") );
    	CharactersRepository.getInstance().addMonster(new GameCharacter("Galactus", "Galactus", "Mastery of the Power Cosmic") );
    	CharactersRepository.getInstance().addMonster(new GameCharacter("LexLuthor", "Lex Luthor", "Expert engineer") );

    }
	
	/**
	 * Method to load the characters    
     */
	public static void gameInformation(){
		
		System.out.println(" This is fighting game between Superhero’s  and monsters ");
		System.out.println(" You can select a superhero and a monster for fighting ");
		System.out.println(" You can select difficulty level from EASY (5 heals), MEDIUM (3 heals) and HARD (1 heal) for each game ");
		System.out.println(" Initial health of characters will have 30 health points and every attack will have a power of 5 to 10 health points");
		System.out.println(" You will get 50 points for every Win");
		System.out.println(" The Players star level are STARTER, ADVANCED, INTERMIDATE, EXPERT and SUPERSTART");
		
	}
	
	/**
	 * Method to load the Banner    
     */
	public static void loadBanner() {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@          @@@@@  @@@@@@@@  @@@            @@@@@         @@           @@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@ @@@@@@@@@@@@@@  @@@@@@@@  @@@  @@@@@@@@  @@@@@  @@@@@@@@@  @@@@@@@  @@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@ @@@@@@@@@@@@@@  @@@@@@@@  @@@  @@@@@@@@  @@@@@  @@@@@@@@@  @@@@@@@  @@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@          @@@@@  @@@@@@@@  @@@  @@@@@@@@  @@@@@    @@@@@@@           @@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@  @@@@  @@@@@@@@  @@@            @@@@@  @@@@@@@@@  @@  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@  @@@@  @@@@@@@@  @@@  @@@@@@@@@@@@@@@  @@@@@@@@@  @@@@ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@           @@@@            @@@  @@@@@@@@@@@@@@@         @@  @@@@@@   @@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  @@@  @@@         @@         @@@          @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  @@@  @@@  @@@@@@@@@  @@@@@ @@@@  @@@@@@  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@       @@@     @@@@@@         @@@  @@@@@@  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  @@@  @@@  @@@@@@@@@  @@@  @@@@@  @@@@@@  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  @@@  @@@        @@@  @@@@@  @@@          @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}
	
	
	

}
