package com.tennis;

public final class Score {
	public static String translate(int score) {
		switch (score) {
		case 3:
			return "Forty";
		case 2:
			return "Thirty";
		case 1:
			return "Fifteen";
		case 0:
			return "Love";
		default:
			return "Invalid";
		}
	}

}
