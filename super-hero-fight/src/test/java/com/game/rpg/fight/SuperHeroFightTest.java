package com.game.rpg.fight;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.game.rpg.modal.GameCharacter;

public class SuperHeroFightTest {

	@Mock
	GameCharacter superman = new GameCharacter("superman","superman","sword");
	
	@InjectMocks
	private MonsterFight superHeroFight = new MonsterFight(superman,30,1);
	
	
	//Added to test the defend method
	@Mock
	GameCharacter thanos = new GameCharacter("thanos","thanos","sword");
	@InjectMocks
	private SuperHeroFight  monsterFight= new SuperHeroFight(thanos,30,1);
	

	//used to mock the getCharacter 
	@Mock
	private MonsterFight mockSuperHeroFight = new MonsterFight(superman,30,1);
	
	    
	@Before
	public void setup() {
	      MockitoAnnotations.initMocks(this);
	}

	@Test
	public final void testAttack() {
		assertTrue(superHeroFight.attack()>0);
	}

	@Test
	public final void testDefend() {
		GameCharacter thanos = new GameCharacter("thanos","thanos","sword");
		SuperHeroFight  mockMonsterFight= new SuperHeroFight(thanos,30,1);
		int testHealth =superHeroFight.getHealth();
		superHeroFight.defend(mockMonsterFight);
		
		assertTrue(testHealth>superHeroFight.getHealth());
	}

	@Test
	public final void testIsAlive() {
		assertTrue(superHeroFight.isAlive());
	}

	@Test
	public final void testGetHealth() {
		assertTrue(superHeroFight.getHealth()>0);
	}

	@Test
	public final void testGetHealLeft() {
		assertTrue(superHeroFight.getHealLeft()>0);
	}

	@Test
	public final void testGetCharacter() {
		GameCharacter mockCharacter = new GameCharacter("superman","superman","sword");
		when(mockSuperHeroFight.getCharacter()).thenReturn(mockCharacter);
		GameCharacter character = mockSuperHeroFight.getCharacter();
		assertNotNull(character);
		
        assertEquals("superman",character.getName());
        assertEquals("superman",character.getDescription());
        assertEquals("sword",character.getWeapon());

	}

}
