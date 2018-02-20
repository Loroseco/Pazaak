package computer;

import server.Board;

public class AI extends Player {
	
	private Board board;
	
	public AI(int p, Board board) {
		super(p);
		this.board = board;
	}
	
	public String getMove() {
		return null;
	}
}
