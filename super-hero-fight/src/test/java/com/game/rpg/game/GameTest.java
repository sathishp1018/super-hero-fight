package com.game.rpg.game;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.game.rpg.modal.Player;

@RunWith(MockitoJUnitRunner.class)
public class GameTest {

	@Mock
	Game game;


	@Before
	public void setup() {
	      MockitoAnnotations.initMocks(this);
	}

	@Test(expected = IOException.class)
	public final void testPlayGameException() throws IOException {
		 Player mockPlayer = new Player();
		 game.playGame(mockPlayer);
		 throw new IOException();
	}
	
	@Test(expected = IOException.class)
	public final void testCreateCharacterException() throws IOException {
		 game.createCharacter();
		 throw new IOException();
	}


	@Test(expected = IOException.class)
	public final void testExploreException() throws IOException {
		Player mockPlayer = new Player();
		game.explore(mockPlayer);
		throw new IOException();
	}

	@Test(expected = IOException.class)
	public final void testResumeGameException() throws IOException {
		Player mockPlayer = new Player();
		game.resumeGame(mockPlayer);
		throw new IOException();
	}

}
