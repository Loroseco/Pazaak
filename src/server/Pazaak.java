package server;

import java.util.Scanner;

import client.*;
import computer.*;

public class Pazaak {
	
	private boolean[] isAI;
	private Board board;
	private Scoreboard score;
	private Player[] player;
	
	Pazaak(boolean[] isAI, Scanner scan) {
		score = new Scoreboard();
		board = new Board(score);
		player = new Player[2];
		
		for (int p = 0; p < 2; p++) {
			player[p] = isAI[p] ? new AI(p + 1, board)
								: new Human(p, scan);
		}
	}
	
	void play() {
		board.newRound();
		
		int winner = 0;
		int playerNumber = 1;
		while (winner == 0) {
			playerNumber = playerNumber == 1 ? 0 : 1;
			winner = playTurn(playerNumber);
		}
		
		if (winner < 3) {
			System.out.println(String.format("WINNER: PLAYER %s.", winner));
			score.addWin(winner);
		} else {
			System.out.println("GAME OVER: DRAW.");
		}
	}
	
	private int playTurn(int p) {
		while (true) {
			String move = player[p].getMove();
			String output = makeMove(move, p);
			if (output.substring(0, 4).equals("MOVE")) {
				if (isAI[p]) {
					board.print();
				}
				System.out.println(output);
				break;
			}
			System.out.println(output);
		}
		int winner = findWinner();
		if (winner == p && !isAI[p]) {
			board.print();
		}
		return winner;
	}

	private String makeMove(String move, int p) {
		try {
			int moveN = Integer.parseInt(move);
			if (board.playCard(moveN, p)) {
				return "MOVE MADE.";
			} else {
				return "INVALID CARD PLAYED";
			}
		} catch (NumberFormatException e) {
			if (board.makeMove(move, p)) {
				return "MOVE MADE.";
			} else {
				return "INVALID MOVE.";
			}
		}
	}
	
	private int findWinner() {
		return 122567873;
	}
}
