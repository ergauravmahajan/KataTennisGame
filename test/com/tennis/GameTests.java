package com.tennis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class GameTests {

	private static Game tennisGame;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		tennisGame = new Game();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void initializeGameTest() {
		reIntializeTennisGame();
		assertEquals("Love all", tennisGame.getScore());
	}

	@Test
	public void playerOneWinsFirstBallTest() {

		reIntializeTennisGame();
		tennisGame.serveBallandMakePlayerOneWin();

		String score = tennisGame.getScore();
		assertEquals("PlayerOne:Fifteen,PlayerTwo:Love", score);
	}

	@Test
	public void playerTwoWinsFirstBallTest() {
		reIntializeTennisGame();
		tennisGame.serveBallandMakePlayerTwoWin();

		String score = tennisGame.getScore();
		assertEquals("PlayerOne:Love,PlayerTwo:Fifteen", score);
	}

	@Test
	public void testFifteenAll() {
		reIntializeTennisGame();
		tennisGame.serveBallandMakePlayerOneWin();
		tennisGame.serveBallandMakePlayerTwoWin();

		String score = tennisGame.getScore();
		assertEquals("Fifteen all", score);
	}

	@Test
	public void playerOneWinsFirstTwoBallTest() {
		reIntializeTennisGame();
		tennisGame.serveBallandMakePlayerOneWin();
		tennisGame.serveBallandMakePlayerOneWin();

		String score = tennisGame.getScore();
		assertEquals("PlayerOne:Thirty,PlayerTwo:Love", score);
	}
	
	@Test
	public void playerTwoWinsFirstTwoBallTest() {
		reIntializeTennisGame();
		tennisGame.serveBallandMakePlayerTwoWin();
		tennisGame.serveBallandMakePlayerTwoWin();

		String score = tennisGame.getScore();
		assertEquals("PlayerOne:Love,PlayerTwo:Thirty", score);
	}

	
	@Test
	public void deuceTest() {
		reIntializeTennisGame();
		tennisGame.serveBallandMakePlayerOneWin();
		tennisGame.serveBallandMakePlayerOneWin();
		tennisGame.serveBallandMakePlayerOneWin();
		tennisGame.serveBallandMakePlayerTwoWin();
		tennisGame.serveBallandMakePlayerTwoWin();
		tennisGame.serveBallandMakePlayerTwoWin();
		String score = tennisGame.getScore();
		assertEquals("Deuce", score);
	}

	@Test
	public void playerOneWinTest() {
		reIntializeTennisGame();
		tennisGame.serveBallandMakePlayerOneWin();
		tennisGame.serveBallandMakePlayerOneWin();
		tennisGame.serveBallandMakePlayerOneWin();
		tennisGame.serveBallandMakePlayerOneWin();
		tennisGame.serveBallandMakePlayerTwoWin();
		tennisGame.serveBallandMakePlayerTwoWin();
		String score = tennisGame.getScore();
		assertEquals("PlayerOne won the game", score);
	}

	@Test
	public void playerTwoWinTest() {
		reIntializeTennisGame();
		tennisGame.serveBallandMakePlayerOneWin();
		tennisGame.serveBallandMakePlayerOneWin();
		tennisGame.serveBallandMakePlayerTwoWin();
		tennisGame.serveBallandMakePlayerTwoWin();
		tennisGame.serveBallandMakePlayerTwoWin();
		tennisGame.serveBallandMakePlayerTwoWin();
		String score = tennisGame.getScore();
		assertEquals("PlayerTwo won the game", score);
	}

	@Test
	public void playerOneAtAdvantageTest() {
		reIntializeTennisGame();
		tennisGame.serveBallandMakePlayerOneWin();
		tennisGame.serveBallandMakePlayerOneWin();
		tennisGame.serveBallandMakePlayerOneWin();
		tennisGame.serveBallandMakePlayerOneWin();
		tennisGame.serveBallandMakePlayerTwoWin();
		tennisGame.serveBallandMakePlayerTwoWin();
		tennisGame.serveBallandMakePlayerTwoWin();
		String score = tennisGame.getScore();
		assertEquals("PlayerOne is on Advantage", score);
	}

	@Test
	public void playerTwoAtAdvantageTest() {
		reIntializeTennisGame();
		tennisGame.serveBallandMakePlayerOneWin();
		tennisGame.serveBallandMakePlayerOneWin();
		tennisGame.serveBallandMakePlayerOneWin();
		tennisGame.serveBallandMakePlayerTwoWin();
		tennisGame.serveBallandMakePlayerTwoWin();
		tennisGame.serveBallandMakePlayerTwoWin();
		tennisGame.serveBallandMakePlayerTwoWin();
		String score = tennisGame.getScore();
		assertEquals("PlayerTwo is on Advantage", score);
	}
	
	@Test
	public void deuceAfterAdvantageTest() {
		reIntializeTennisGame();
		tennisGame.serveBallandMakePlayerOneWin();
		tennisGame.serveBallandMakePlayerOneWin();
		tennisGame.serveBallandMakePlayerOneWin();
		tennisGame.serveBallandMakePlayerOneWin();
		tennisGame.serveBallandMakePlayerTwoWin();
		tennisGame.serveBallandMakePlayerTwoWin();
		tennisGame.serveBallandMakePlayerTwoWin();
		tennisGame.serveBallandMakePlayerTwoWin();
		String score = tennisGame.getScore();
		assertEquals("Deuce", score);
	}

	private void reIntializeTennisGame() {
		tennisGame = new Game();
	}

}
