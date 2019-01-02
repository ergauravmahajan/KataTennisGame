package com.tennis;

public class Player {
	private String playerName;
	private int playerScore;

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerScore() {
		return playerScore;
	}

	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}

	public void winBall() {
		this.setPlayerScore(this.getPlayerScore() + 1);
	}
}
