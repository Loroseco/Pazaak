package client;

import java.util.Scanner;

import computer.Player;

public class Human extends Player {
	
	private Scanner scan;
	
	public Human(int p, Scanner scan) {
		super(p);
		this.scan = scan;
	}
	
	public String getMove() {
		System.out.print(String.format("PLAYER %s - ENTER MOVE: ", p));
		return scan.next();
		
	}
}
