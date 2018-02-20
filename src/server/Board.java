package server;

import java.util.ArrayList;

public class Board {
	
	private Scoreboard score;
	private ArrayList<ArrayList<Integer>> playerHands;
	private ArrayList<ArrayList<Integer>> inPlay;
	
	
	Board(Scoreboard score) {
		this.score = score;
	}
	
	void newRound() {
		playerHands = new ArrayList<ArrayList<Integer>>();
		inPlay = new ArrayList<ArrayList<Integer>>();
	}
	
	boolean playCard(int card, int p) {
		return false;
	}
	
	boolean makeMove(String move, int p) {
		return false;
	}
	
	void print() {
		
	}

}
