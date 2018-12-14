package com.game.rpg.fight;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.game.rpg.modal.GameCharacter;
@RunWith(MockitoJUnitRunner.class)
public class MonsterFightTest {
	
	@Mock
	GameCharacter thanos = new GameCharacter("thanos","thanos","sword");
	
	@InjectMocks
	private MonsterFight monsterFight = new MonsterFight(thanos,30,1);
	
	
	//used to mock the getCharacter 
	@Mock
	private MonsterFight mockMonsterFight = new MonsterFight(thanos,30,1);
	
	    
	@Before
	public void setup() {
	      MockitoAnnotations.initMocks(this);
	}

	@Test
	public final void testAttack() {
		assertTrue(monsterFight.attack()>0);
	}

	@Test
	public final void testDefend() {
		
		GameCharacter mokSuperman = new GameCharacter("superman","superman","sword");
		SuperHeroFight  mockSuperHeroFight= new SuperHeroFight(mokSuperman,30,1);
		int testHealth =monsterFight.getHealth();
		monsterFight.defend(mockSuperHeroFight);
		
		assertTrue(testHealth>monsterFight.getHealth());
	}

	@Test
	public final void testIsAlive() {
		assertTrue(monsterFight.isAlive());
	}

	@Test
	public final void testGetHealth() {
		assertTrue(monsterFight.getHealth()>0);
	}

	@Test
	public final void testGetHealLeft() {
		assertTrue(monsterFight.getHealLeft()>0);
	}

	@Test
	public final void testGetCharacter() {
		GameCharacter mockCharacter = new GameCharacter("thanos","thanos","sword");
		when(mockMonsterFight.getCharacter()).thenReturn(mockCharacter);
		GameCharacter character = mockMonsterFight.getCharacter();
		assertNotNull(character);
		
        assertEquals("thanos",character.getName());
        assertEquals("thanos",character.getDescription());
        assertEquals("sword",character.getWeapon());

	}

}
