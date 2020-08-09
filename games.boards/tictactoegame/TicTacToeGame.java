package tictactoegame;
import java.util.Scanner;

public class TicTacToeGame {
	static int[][] gameboard = new int[3][3];
	static final int EMPTY = 0;
	static final int NOUGHT = -1;
	static final int CROSS = 1;

	public static void main (String [] args) {
		createBoard(3,3);
		int turn = 0;
		int tttPlayer;
		int tttoutcome;
		java.util.Scanner scan = new java.util.Scanner(System.in);
		do {
			tttdisplayBoard( );
			tttPlayer = (turn % 2 == 0)? NOUGHT : CROSS;
			if (tttPlayer == NOUGHT) 
				System.out.println ("\n�O's turn�");
			else System.out.println("\n�X's turn�" ); 
			System.out.print("Enter row and column:" ); 
			try {
				set(tttPlayer, scan.nextInt(), scan.nextInt());
			} catch (Exception ex) 
			{System.err.println(ex); turn--;}
			
			turn ++;
			tttoutcome = tttwinOrTie( );
		} while ( tttoutcome == -2 );
		
		tttdisplayBoard();
		
		switch (tttoutcome) {
		case NOUGHT:
			System.out.println("O wins!");
			break;
		case CROSS:
			System.out.println("X wins!");
			break;
		case 0:
			System.out.println("Tie.");
			break;
		}
	}

	/* Set a square on the board must be empty */
	static void set(int val, int row, int col)
	throws IllegalArgumentException {
		if (gameboard[row][col] == EMPTY)
			gameboard[row][col] = val;
		else throw new IllegalArgumentException
			("Player already there!");
	}
	
	/* display the board */
	static void tttdisplayBoard() {
		for(int r=0; r < gameboard.length; r++) {
			System.out.print("|");
			for (int c = 0; c < gameboard[r].length; c++)
			{
				switch(gameboard[r][c]) {
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
	public static void createBoard(int rows, int cols) {
		//TODO Initialize the gameboard
		int r, c;
		int tttcreateBoard [][] = new int [3][3];
		
		for (r=0; r < 3; ++r) {
			for (c=0; c < 3; ++c) {
				tttcreateBoard[r][c]= (r*1)+(c*1);
				System.out.print(tttcreateBoard[r][c] + " ");
			}
			System.out.println();
		}
	}
	
	static int tttwinOrTie() {
		//TODO Determine whether X or O won or there is a tie
		if (gameboard[0][0] + gameboard[0][1] + gameboard[0][2] == 3*NOUGHT)
			{return NOUGHT;}
		if (gameboard[1][0] + gameboard[1][1] + gameboard[1][2] == 3*NOUGHT)
			{return NOUGHT;}
		if (gameboard[2][0] + gameboard[2][1] + gameboard[2][2] == 3*NOUGHT)
			{return NOUGHT;}
		
		if (gameboard[0][0] + gameboard[1][0] + gameboard[2][0] == 3*NOUGHT)
			{return NOUGHT;}
		if (gameboard[0][1] + gameboard[1][1] + gameboard[2][1] == 3*NOUGHT)
			{return NOUGHT;}
		if (gameboard[0][2] + gameboard[1][2] + gameboard[2][2] == 3*NOUGHT)
			{return NOUGHT;}
		if (gameboard[0][0] + gameboard[1][1] + gameboard[2][2] == 3*NOUGHT)
			{return NOUGHT;}
		if (gameboard[0][2] + gameboard[1][1] + gameboard[2][0] == 3*NOUGHT)
			{return NOUGHT;}
		
		if (gameboard[0][0] + gameboard[0][1] + gameboard[0][2] == 3*CROSS)
			{return CROSS;}
		if (gameboard[1][0] + gameboard[1][1] + gameboard[1][2] == 3*CROSS)
			{return CROSS;}
		if (gameboard[2][0] + gameboard[2][1] + gameboard[2][2] == 3*CROSS)
			{return CROSS;}
		
		if (gameboard[0][0] + gameboard[1][0] + gameboard[2][0] == 3*CROSS)
			{return CROSS;}
		if (gameboard[0][1] + gameboard[1][1] + gameboard[2][1] == 3*CROSS)
			{return CROSS;}
		if (gameboard[0][2] + gameboard[1][2] + gameboard[2][2] == 3*CROSS)
			{return CROSS;}
		if (gameboard[0][0] + gameboard[1][1] + gameboard[2][2] == 3*CROSS)
			{return CROSS;}
		if (gameboard[0][2] + gameboard[1][1] + gameboard[2][0] == 3*CROSS)
			{return CROSS;}
		
		if (gameboard[2][2] + gameboard[1][2] + gameboard[1][1] + gameboard[0][1]
				+ gameboard[2][0] == 5*NOUGHT)
			{return 0;}
		if (gameboard[0][0] + gameboard[1][0] + gameboard[1][1] + gameboard[2][1] 
				+  gameboard[0][2] == 5*NOUGHT)
			{return 0;}
		if (gameboard[0][2] + gameboard[1][2] + gameboard[1][1] + gameboard[2][1]
				+ gameboard[0][0] == 5*NOUGHT)
			{return 0;}
		if (gameboard[2][0] + gameboard[2][1] + gameboard[1][1] + gameboard[1][2]
				+ gameboard[0][0] == 5*NOUGHT)
			{return 0;}
		if (gameboard[0][0] + gameboard[0][1] + gameboard[1][1] + gameboard[1][2]
				+ gameboard[2][0] == 5*NOUGHT)
			{return 0;}
		if (gameboard[2][0] + gameboard[1][0] + gameboard[1][1] + gameboard[0][1]
				+ gameboard[2][2] == 5*NOUGHT)
			{return 0;}
		if (gameboard[0][2] + gameboard[0][1] + gameboard[1][1] + gameboard[1][0]
				+ gameboard[2][2] == 5*NOUGHT)
			{return 0;}
		if (gameboard[2][2] + gameboard[2][1] + gameboard[1][1] + gameboard[1][0]
				+ gameboard[0][2] == 5*NOUGHT)
			{return 0;}
		if(gameboard[0][2] + gameboard[0][1] + gameboard[1][2] + gameboard[2][1]
				+  gameboard[1][0] == 5*NOUGHT)
			{return 0;}
		if(gameboard[0][0] + gameboard[1][0] + gameboard[0][1] + gameboard[2][1]
				+  gameboard[1][2] == 5*NOUGHT)
			{return 0;}
		if(gameboard[2][0] + gameboard[1][0] + gameboard[2][1] + gameboard[0][1]
				+  gameboard[1][2] == 5*NOUGHT)
			{return 0;}
		if(gameboard[2][2] + gameboard[1][2] + gameboard[2][1] + gameboard[0][1]
				+  gameboard[1][0] == 5*NOUGHT)
			{return 0;}
		if (gameboard[0][2] + gameboard[0][1] + gameboard[1][2] + gameboard[1][0]
				+ gameboard[2][0] == 5*NOUGHT)
			{return 0;}
		if (gameboard[0][2] + gameboard[0][1] + gameboard[2][1] + gameboard[2][0]
				+ gameboard[2][1] == 5*NOUGHT)
			{return 0;}
		if (gameboard[0][0] + gameboard[0][1] + gameboard[1][0] + gameboard[2][1]
				+ gameboard[2][2] == 5*NOUGHT)
			{return 0;}
		if (gameboard[0][0] + gameboard[0][1] + gameboard[1][0] + gameboard[1][2]
				+ gameboard[2][2] == 5*NOUGHT)
			{return 0;}
		if (gameboard[2][2] + gameboard[2][1] + gameboard[1][2] + gameboard[1][0]
				+ gameboard[0][0] == 5*NOUGHT)
			{return 0;}
		if (gameboard[2][2] + gameboard[2][1] + gameboard[1][2] + gameboard[0][1]
				+ gameboard[0][0] == 5*NOUGHT)
			{return 0;}
		if (gameboard[2][0] + gameboard[2][1] + gameboard[1][0] + gameboard[0][1]
				+ gameboard[0][2] == 5*NOUGHT)
			{return 0;}
		if (gameboard[2][0] + gameboard[2][1] + gameboard[1][0] + gameboard[1][2]
				+ gameboard[2][2] == 5*NOUGHT)
			{return 0;}
		if (gameboard[2][0] + gameboard[1][0] + gameboard[2][1] + gameboard[0][2]
				+ gameboard[0][1] == 5*NOUGHT)
			{return 0;}
		if (gameboard[2][0] + gameboard[1][0] + gameboard[2][1] + gameboard[1][2]
				+ gameboard[0][2] == 5*NOUGHT)
			{return 0;}
		if (gameboard[0][0] + gameboard[0][2] + gameboard[1][2] + gameboard[2][0]
				+ gameboard[2][1] == 5*NOUGHT)
			{return 0;}
		if (gameboard[2][2] + gameboard[0][1] + gameboard[0][2] + gameboard[1][0]
				+ gameboard[2][0] == 5*NOUGHT)
			{return 0;}
		if (gameboard[0][2] + gameboard[1][0] + gameboard[0][0] + gameboard[2][2]
				+ gameboard[2][1] == 5*NOUGHT)
			{return 0;}
		if (gameboard[2][0] + gameboard[2][2] + gameboard[1][2] + gameboard[0][0]
				+ gameboard[0][1] == 5*NOUGHT)
			{return 0;}
		if (gameboard[0][0] + gameboard[0][1] + gameboard[2][0] + gameboard[2][1]
				+ gameboard[1][2] == 5*NOUGHT)
			{return 0;}
		if (gameboard[2][0] + gameboard[1][0] + gameboard[2][2] + gameboard[1][2]
				+ gameboard[0][1] == 5*NOUGHT)
			{return 0;}
		if (gameboard[0][1] + gameboard[0][2] + gameboard[2][1] + gameboard[2][2]
				+ gameboard[1][0] == 5*NOUGHT)
			{return 0;}
		if (gameboard[0][0] + gameboard[1][0] + gameboard[0][2] + gameboard[1][2]
				+ gameboard[2][1] == 5*NOUGHT)
			{return 0;}

		return -2;
	}
} // END of Program