package com.game.rpg.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.game.rpg.modal.Player;
import com.game.rpg.player.PlayerStar;


@RunWith(MockitoJUnitRunner.class)
public class AvailablePlayersTest {
	
	@Mock
    private PlayersRepository availablePlayers;
    
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

	@Test
	public final void testGetPlayers() {
		Player mockPlayer = new Player();
		mockPlayer.setName("player1");
		mockPlayer.setCurrentStar(PlayerStar.STARTER);
		Map<String, Player> mockMap = new HashMap<>();
		mockMap.put(mockPlayer.getName().toUpperCase(), mockPlayer);
		
		when(availablePlayers.getPlayers()).thenReturn(mockMap);
		
		Map<String, Player> map= availablePlayers.getPlayers();		
		assertTrue(0<map.size());
		assertTrue(null != map.get("player1".toUpperCase()));
	}

	@Test
	public final void testGetPlayer() {
		Player mockPlayer = new Player();
		mockPlayer.setName("player1");
		mockPlayer.setCurrentStar(PlayerStar.STARTER);
		when(availablePlayers.getPlayer("player1")).thenReturn(Optional.ofNullable(mockPlayer));
		
		Optional<Player> player = availablePlayers.getPlayer("player1");
		assertTrue(player.isPresent());
        assertEquals("player1",player.get().getName());
        assertEquals(PlayerStar.STARTER,player.get().getCurrentStar());
	}


}
