package server;

import java.util.Scanner;

public class Main {
	
	/**
	 * Main function, used to initiate game
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean[] isAI = {false, true}; // Change here to assign A to certain players
		Pazaak game = new Pazaak(isAI, scan);
		
		boolean playing = true;
		while (playing) {
			game.play();
			
			while (true) {
				System.out.print("PLAY AGAIN? (Y/N): ");
				String userInput = scan.next().toLowerCase();
				if (userInput.equals("y") || userInput.equals("yes")) {
					break;
				}
				if (userInput.equals("n") || userInput.equals("no")) {
					playing = false;
					break;
				}
				System.out.println("INVALID CHOICE");
			}
		}
		scan.close();
	}
}
