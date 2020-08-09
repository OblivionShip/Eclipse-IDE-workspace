package games.board;
import games.board.Mark;
import games.board.Outcome;
import games.board.Player;
import games.board.Board;
import games.board.Cell;
import games.boards.*;
import java.util.Scanner.*;
import java.lang.*;

public class BoardGameTester {
	static Mark mark;
	static Outcome outcome;
	static Player player;
		private static final int EMPTY = 0;
	private static int[][] tttgameboard = new int[3][3];
		private static final int NOUGHT = -1;
		private static final int CROSS = 1;
	private static int[][] cfgameboard = new int[6][7];
		private static final int YELLOW = -2;
		private static final int RED = 2;
	private static int[][] mmgameboard = new int[5][8];
		private static final int GREEN = -4;
		private static final int BLUE = 4;
		private static final int MAGENTA = -5;
		private static final int ORANGE = 5;
	
	/* Set board must be empty */
		static void set(int val, int row, int col)
		throws IllegalArgumentException {
			if (tttgameboard[row][col] == EMPTY)
				tttgameboard[row][col] = val;
			else throw new IllegalArgumentException
			("Player already there!");
			if (cfgameboard[row][row] == EMPTY)
				cfgameboard[row][row] = val;
			else throw new IllegalArgumentException
			("Row is full!");
			if (mmgameboard[row][col] == EMPTY)
				mmgameboard[row][col] = val;
			else throw new IllegalArgumentException
			("Peg is taken!");
		}
		
	public static void main(String [] args) {
		tttcreateBoard(3,3);
		cfcreateBoard(6,7);
		mmcreateBoard(5,8);
		int turn = 0;
		int Player;
		int Outcome;
		java.util.Scanner scan = new java.util.Scanner(System.in);
		do {
			tttdisplayBoard( );
			cfdisplayBoard( );
			mmdisplayBoard( );
			//**TicTacToe**//
			Player = (turn% 2 == 0)? NOUGHT : CROSS;
			if (Player == NOUGHT)
				System.out.println ("\n—Player1's turn for TicTacToe—");
			else System.out.println ("\n—Player2's turn for TicTacToe—");
			System.out.print("Make a move:" );
			try {
				set(Player, scan.nextInt(), scan.nextInt());
			} catch (Exception ex)
			{System.err.println(ex); turn--;}
			//**ConnectFour**//
			Player = (turn% 2 == 0)? YELLOW : RED;
			if (Player == YELLOW)
				System.out.println ("\n—Player1's turn for ConnectFour—");
			else System.out.println ("\n—Player2's turn for ConnectFour—");
			System.out.print("Make a move:" );
			try {
				set(Player, scan.nextInt(), scan.nextInt());
			} catch (Exception ex)
			{System.err.println(ex); turn--;}
			//**Mastermind**//
			Player = (turn% 2 == 0)? BLUE : GREEN;
			if (Player == BLUE)
				System.out.println ("\n—Player1's turn for Mastermind—");
			else System.out.println ("\n—Player2's turn for Mastermind—");
			System.out.print("Make a move:" );
			try {
				set(Player, scan.nextInt(), scan.nextInt());
			} catch (Exception ex)
			{System.err.println(ex); turn--;}


			turn ++;
			Outcome = tttwinOrTie( );
			Outcome = cfwinOrTie( );
			Outcome = mmwinOrTie( );
		} while ( Outcome == -2);
		
		tttdisplayBoard();
		cfdisplayBoard();
		mmdisplayBoard();
		
		switch (Outcome) {
		case NOUGHT:
			System.out.println("Player1 wins!");
			break;
		case CROSS:
			System.out.println("Player 2 wins!");
			break;
		case YELLOW:
			System.out.print("Player1 wins!");
			break;
		case RED:
			System.out.print("Player2 wins!");
			break;
		case GREEN:
			System.out.print("Player1 wins!");
			break;
		case BLUE:
			System.out.print("Player2 wins!");
			break;	
		case 0:
			System.out.println("Tie.");
			break;
		}
	}
	
	/*display the Tic Tac Toe board*/
	static void tttdisplayBoard() {
		System.out.print("TicTacToe:");
		System.out.println();
		for(int r=0; r < tttgameboard.length; r++) {
			System.out.print("|");
			for (int c=0; c < tttgameboard[r].length; c++)
			{
				switch(tttgameboard[r][c]) {
				case NOUGHT:
					System.out.print("O");
				break;
				case CROSS:
					System.out.print("X");
				break;
				default: //Empty
					System.out.print(" ");
				}
					System.out.print("|");
			}
			System.out.println("\n-------");
		}
	}
	/*display the Connect Four board*/
	static void cfdisplayBoard() {
		System.out.print("ConnectFour:");
		System.out.println();
		for(int r=0; r < cfgameboard.length; r++) {
			System.out.print("|");
			for(int c=0; c < cfgameboard.length; c++)
			{
				switch(cfgameboard[r][c]) {
				case YELLOW:
					System.out.print("Y");
				break;
				case RED:
					System.out.print("R");
				break;
				default: //Empty
					System.out.print(" ");
				}
					System.out.print("|");
			}
			System.out.println("\n           ");
		}
	}
	/* display the Mastermind board */
	static void mmdisplayBoard() {
		System.out.print("Mastermind:");
		System.out.println();
		for(int r=0; r < mmgameboard.length; r++) {
			System.out.print("|");
			for (int c=0; c < mmgameboard[r].length; c++)
			{
				switch(mmgameboard[r][c]) {
				case YELLOW:
					System.out.print("Y");
				break;
				case RED:
					System.out.print("R");
				break;
				case GREEN:
					System.out.print("G");
				break;
				case BLUE:
					System.out.print("B");
				break;
				case MAGENTA:
					System.out.print("M");
				break;
				case ORANGE:
					System.out.print("M");
				break;
				default: //Empty
					System.out.print(" ");
				}
					System.out.print("|");
			}
			System.out.println("\n-------------");
		}
	}

	/* createBoard */
	// Create a 3x3 board for TicTacToe
	private static void tttcreateBoard(int i, int j) {
		//TODO Initialize the tttgameboard
	}
	// Create a 6x7 board for ConnectFour
	private static void cfcreateBoard(int i, int j) {
		//TODO Initialize the cfgameboard
	}
	// Create a 5x8 board for Mastermind
	private static void mmcreateBoard(int i, int j) {
		//TODO Initialize the mmgameboard
	}
	private static int mmwinOrTie() {
		//TODO Determine whether X or O won or there is a tie
		return -2;
	}
	private static int cfwinOrTie() {
		// TODO Auto-generated method stub
		return 0;
	}
	private static int tttwinOrTie() {
		// TODO Auto-generated method stub
		return 0;
	}
}