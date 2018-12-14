package com.game.rpg.data;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.game.rpg.modal.GameCharacter;
/**
* 
* Repository Class act as the repository for Characters of the application 
*
* @author  Sathish Pandian
*/
public class CharactersRepository {
	
	private static final CharactersRepository availableCharacters = new CharactersRepository();
	
	private CharactersRepository() {}
	
	/**
	 * Method to get Instance of CharactersRepository
     *
     * 
     * @return CharactersRepository Instance
     * 
     *         
     */
	public static CharactersRepository getInstance() {
		return availableCharacters;
		
	}
	
	private Map<String,GameCharacter> characters = new HashMap<String,GameCharacter>();
	private Map<String,GameCharacter> monsters = new HashMap<String,GameCharacter>();
	
	/**
	 * Method to get all the Characters in the Repository

     * @return Map containing Character name as key and Character object
     * 
     *         
     */
	public Map<String, GameCharacter> getCharacters() {
		return characters;
	}
	/**
	 * Method to get all the Monsters in the Repository

     * @return Map containing Monster name as key and Monster object
     * 
     *         
     */
	public Map<String, GameCharacter> getMonsters() {
		return monsters;
	}
	/**
	 * Method to get the Character Object in Optional of GameCharacter corresponding to the Name
	 * 
     * @param name Character Name 
     * @return Optional of GameCharacter GameCharacter object
     * 
     *         
     */
	public Optional<GameCharacter> getCharacter(String name) {
		return Optional.ofNullable(characters.get(name.toUpperCase()));
	}
	/**
	 * Method to get the Monster Object in Optional of GameCharacter corresponding to the Name
	 * 
     * @param  name Monster Name 
     * @return Optional of GameCharacter GameCharacter object
     * 
     *         
     */
	public Optional<GameCharacter> getMonster(String name) {
		return Optional.ofNullable(monsters.get(name.toUpperCase()));
	}
	
	/**
	 * Method to add the Character to the Repository
	 * 
     * @param  character GameCharacter object 
     * @return String indicating the operation status
     * 
     *         
     */
	public synchronized String addCharacter(GameCharacter character) {
		if(!characters.containsKey(character.getName().toUpperCase())) {
			characters.put(character.getName().toUpperCase(), character);
			return character.getName() + " Added successfully to Characters";
		}else {
			return character.getName() +" is already exists in Characters";
		}
	}
	/**
	 * Method to add the Monster to the Repository
	 * 
     * @param  character GameCharacter object 
     * @return String indicating the operation status
     * 
     *         
     */
	public synchronized String addMonster(GameCharacter character) {
		if(!monsters.containsKey(character.getName().toUpperCase())) {
			monsters.put(character.getName().toUpperCase(), character);
			return character.getName() + " Added successfully to monsters";
		}else {
			return character.getName() +" is already exists in monsters";
		}
	}
	
	public synchronized String removeCharacter(GameCharacter character) {
		if(characters.containsKey(character.getName().toUpperCase())) {
			characters.remove(character.getName().toUpperCase(), character);
			return character.getName() + " Removed successfully to Characters";
		}else {
			return character.getName() +" is not exists in Characters";
		}
	}
	public synchronized String removeMonster(GameCharacter character) {
		if(monsters.containsKey(character.getName().toUpperCase())) {
			monsters.remove(character.getName().toUpperCase(), character);
			return character.getName() + " Removed successfully ";
		}else {
			return character.getName() +" is not exists in monsters";
		}
	}
	

	
	
	
	

}
