package com.game.rpg.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.game.rpg.modal.GameCharacter;

@RunWith(MockitoJUnitRunner.class)
public class AvailableCharactersTest {
	
	@Mock
    private CharactersRepository availableCharacters;
    
    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }
	
	@Test
	public final void testGetCharacter() {
		GameCharacter mockCharacter = new GameCharacter();
		mockCharacter.setName("superman");
		when(availableCharacters.getCharacter("superman")).thenReturn(Optional.ofNullable(mockCharacter));
		
		Optional<GameCharacter> gameCharacter = availableCharacters.getCharacter("superman");
		assertTrue(gameCharacter.isPresent());
        assertEquals("superman",gameCharacter.get().getName());
		
	}

	@Test
	public final void testGetMonster() {
		GameCharacter mockCharacter = new GameCharacter();
		mockCharacter.setName("thanos");
		when(availableCharacters.getCharacter("thanos")).thenReturn(Optional.ofNullable(mockCharacter));
		
		Optional<GameCharacter> gameCharacter = availableCharacters.getCharacter("thanos");
		assertTrue(gameCharacter.isPresent());
        assertEquals("thanos",gameCharacter.get().getName());
	}

	@Test
	public final void testAddCharacter() {
		GameCharacter mockCharacter = new GameCharacter();
		mockCharacter.setName("superman");
		when(availableCharacters.addCharacter(mockCharacter)).thenReturn("superman Added successfully to Characters");
		
		String testStr = availableCharacters.addCharacter(mockCharacter);
        assertEquals("superman Added successfully to Characters", testStr);
	}

	@Test
	public final void testAddMonster() {
		GameCharacter mockCharacter = new GameCharacter();
		mockCharacter.setName("thanos");
		when(availableCharacters.addMonster(mockCharacter)).thenReturn("thanos Added successfully to Characters");
		
		String testStr = availableCharacters.addMonster(mockCharacter);
        assertEquals("thanos Added successfully to Characters", testStr);
	}

}
