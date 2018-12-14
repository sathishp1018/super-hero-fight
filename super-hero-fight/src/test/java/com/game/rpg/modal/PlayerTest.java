package com.game.rpg.modal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.game.rpg.fight.MonsterFight;
import com.game.rpg.fight.SuperHeroFight;
import com.game.rpg.game.Battle;
import com.game.rpg.player.PlayerStar;

public class PlayerTest {

	@Mock
	Player player ;
	
	@Before
	public void setup() {
	      MockitoAnnotations.initMocks(this);
	}

	@Test
	public final void testGetName() {
		when(player.getName()).thenReturn("sathish");
		assertEquals("sathish", player.getName());
	}

	@Test
	public final void testGetCurrentStar() {
		when(player.getCurrentStar()).thenReturn(PlayerStar.STARTER);
		assertEquals(PlayerStar.STARTER, player.getCurrentStar());
	}

	@Test
	public final void testGetBattle() {
		MonsterFight mockMonsterFight = new MonsterFight(new GameCharacter("thanos","thanos","sword"),30,1);
		SuperHeroFight  mockSuperHeroFight= new SuperHeroFight(new GameCharacter("superman","superman","sword"),30,1);
		Battle mockBatlle = new  Battle(mockSuperHeroFight,mockMonsterFight);
		when(player.getBattle()).thenReturn(mockBatlle);
		assertNotNull(player.getBattle());
	}

	@Test
	public final void testGetTotalPoints() {
		when(player.getTotalPoints()).thenReturn(100);
		assertEquals(100, player.getTotalPoints());
	}

	@Test
	public final void testUpdateCurrentStar() {
		player.updateCurrentStar(150);
		assertNotSame(PlayerStar.STARTER, player.getCurrentStar());
		
	}

}
