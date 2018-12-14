package com.game.rpg.game;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.game.rpg.fight.Fight;
import com.game.rpg.fight.MonsterFight;
import com.game.rpg.fight.SuperHeroFight;
import com.game.rpg.modal.GameCharacter;
import com.game.rpg.player.PlayLevel;

@RunWith(MockitoJUnitRunner.class)
public class GameSelectorTest {
	
	@Mock
	GameSelector gameSelector;


	@Before
	public void setup() {
	      MockitoAnnotations.initMocks(this);
	}

	@Test
	public final void testGetPlayLevel() {
		when(gameSelector.getPlayLevel()).thenReturn(PlayLevel.EASY);
		assertEquals(PlayLevel.EASY,gameSelector.getPlayLevel());
	}

	@Test
	public final void testSelectCharacter() {
		when(gameSelector.selectCharacter("supermn")).thenReturn("success");
		assertEquals("success",gameSelector.selectCharacter("supermn"));
	}

	@Test
	public final void testSelectMonster() {
		when(gameSelector.selectCharacter("thanos")).thenReturn("success");
		assertEquals("success",gameSelector.selectCharacter("thanos"));
	}

	@Test
	public final void testGetRolePlayer() {
		SuperHeroFight  mockSuperHeroFight= new SuperHeroFight(new GameCharacter("superman","superman","sword"),30,1);
		when(gameSelector.getRolePlayer()).thenReturn(mockSuperHeroFight);
		
		Fight SuperHeroFight = gameSelector.getRolePlayer();
		assertNotNull(SuperHeroFight);
		assertEquals("superman",SuperHeroFight.getCharacter().getName());
	}

	@Test
	public final void testGetMonster() {
		MonsterFight mockMonsterFight = new MonsterFight(new GameCharacter("thanos","thanos","sword"),30,1);
		when(gameSelector.getRolePlayer()).thenReturn(mockMonsterFight);
		
		Fight monsterFight = gameSelector.getRolePlayer();
		assertNotNull(monsterFight);
		assertEquals("thanos",monsterFight.getCharacter().getName());
	}

}
