package com.tennis;

public class Game {

	private Player playerOne;
	private Player playerTwo;

	public Game() {
		initializeGame();
	}

	private void initializeGame() {
		playerOne = new Player();
		playerTwo = new Player();

		playerOne.setPlayerName("PlayerOne");
		playerTwo.setPlayerName("PlayerTwo");

		playerOne.setPlayerScore(0);
		playerTwo.setPlayerScore(0);

	}

	public void serveBallandMakePlayerOneWin() {
		playerOne.winBall();
	}
	
	public void serveBallandMakePlayerTwoWin() {
		playerTwo.winBall();
	}

	public String getScore() {

		if (gameHasWinner()) {
			return getPlayerWithHighestScore() + " won the game";
		}

		if (isAnyPlayerAtAdvantage()) {
			return getPlayerWithHighestScore() + " is on Advantage";
		}

		if (isGameOnDeuce())
			return "Deuce";

		if (playerOne.getPlayerScore() == playerTwo.getPlayerScore()) {
			return Score.translate(playerOne.getPlayerScore()) + " all";
		}

		return playerOne.getPlayerName() + ":" + Score.translate(playerOne.getPlayerScore()) + ","
				+ playerTwo.getPlayerName() + ":" + Score.translate(playerTwo.getPlayerScore());

	}

	private boolean isGameOnDeuce() {
		return playerOne.getPlayerScore() >= 3 && playerOne.getPlayerScore() == playerTwo.getPlayerScore();
	}

	private String getPlayerWithHighestScore() {
		if (playerOne.getPlayerScore() > playerTwo.getPlayerScore()) {
			return playerOne.getPlayerName();
		} else {
			return playerTwo.getPlayerName();
		}
	}

	private boolean gameHasWinner() {
		if (playerOne.getPlayerScore() >= 4 && playerOne.getPlayerScore() >= playerTwo.getPlayerScore() + 2)
			return true;
		if (playerTwo.getPlayerScore() >= 4 && playerTwo.getPlayerScore() >= playerOne.getPlayerScore() + 2)
			return true;
		return false;
	}

	private boolean isAnyPlayerAtAdvantage() {
		if (playerOne.getPlayerScore() >= 4 && playerOne.getPlayerScore() == playerTwo.getPlayerScore() + 1)
			return true;
		if (playerTwo.getPlayerScore() >= 4 && playerTwo.getPlayerScore() == playerOne.getPlayerScore() + 1)
			return true;

		return false;

	}

}
