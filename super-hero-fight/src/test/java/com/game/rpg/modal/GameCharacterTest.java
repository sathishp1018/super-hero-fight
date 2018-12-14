package com.game.rpg.modal;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GameCharacterTest {

	
	@Mock
	GameCharacter superman ;
	
	@Before
	public void setup() {
	      MockitoAnnotations.initMocks(this);
	}

	@Test
	public final void testGameCharacter() {
		//test for constructor
		superman = new GameCharacter("superman","superman","sword");
		assertEquals("superman", superman.getName());
	}
	
	@Test
	public final void testGetName() {
		when(superman.getName()).thenReturn("superman");
		assertEquals("superman", superman.getName());
	}

	@Test
	public final void testGetDescription() {
		when(superman.getDescription()).thenReturn("superman is a superstar");
		assertEquals("superman is a superstar", superman.getDescription());
	}

	@Test
	public final void testGetWeapon() {
		when(superman.getWeapon()).thenReturn("sword");
		assertEquals("sword", superman.getWeapon());
	}

}
