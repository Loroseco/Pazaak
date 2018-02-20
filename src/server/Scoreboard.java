package server;

public class Scoreboard {
	
	private int[] wins;
	private int[] score;
	
	Scoreboard() {
		wins = new int[2];
		for (int i = 0; i < 2; i++) {
			score[i] = 0;
		}
	}
	
	int[] getWins() {
		return wins;
	}
	
	int getScore(int p) {
		return score[p];
	}
	
	void addScore(int p, int score) {
		this.score[p] += score;
	}
	
	boolean isOver20(int p) {
		if (score[p] > 20) {
			return true;
		} else {
			return false;
		}
	}
	
	void addWin(int p) {
		wins[p - 1] += 1;
		score = new int[2];
		for (int i = 0; i < 2; i++) {
			score[i] = 0;
		}
	}
}
