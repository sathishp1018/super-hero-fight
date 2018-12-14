package com.game.rpg.data;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.game.rpg.modal.Player;
/**
* 
* Repository Class act as the repository for Players of the application 
*
* @author  Sathish Pandian
*/
public class PlayersRepository {
	

	private static final PlayersRepository availablePlayers = new PlayersRepository();
	
	private PlayersRepository() {}
	
	/**
	 * Method to get Instance of PlayersRepository
    *
    * 
    * @return PlayersRepository Instance
    * 
    *         
    */
	public static PlayersRepository getInstance() {
		return availablePlayers;
		
	}
	private Map<String,Player> players = new HashMap<String,Player>();

	/**
	 * Method to get all the Players in the Repository

     * @return Map containing Player name as key and Player object
     * 
     *         
     */
	public Map<String, Player> getPlayers() {
		return players;
	}
	
	/**
	 * Method to get the Player Object in Optional of Player corresponding to the Name
	 * 
     * @param name Player Name 
     * @return Optional of Player Player object
     * 
     *         
     */

	public Optional<Player> getPlayer(String name) {
		return Optional.ofNullable(players.get(name.toUpperCase()));
	}
	
	/**
	 * Method to update the current status of the Player
     *
     * @param player Player object
     * 
     *         
     */
	 
	public void updatePlayer(Player player) {
			players.put(player.getName().toUpperCase(), player);
		
	}
	
	

}
