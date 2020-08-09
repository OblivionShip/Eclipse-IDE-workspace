package games.board;
import games.boards.*;
import games.board.Board;
import games.board.Mark;
import games.board.Outcome;
import games.board.Player;
import games.board.Cell;
import games.utilities.*;
import java.lang.ArrayIndexOutOfBoundsException;

public class BoardGameTester {
	private static int[][] tttgameboard = new int[3][3];
	private static int[][] cfgameboard = new int[6][7];
	private static int[][] mmgameboard = new int[5][8];

	public static void main(String[] args) {
        Boolean check = true;

        // 3x3 board for Tic Tac Toe
        Board tttgameboard = new Board (3,3);
        // Set a cell to a nought or cross on the Tic-Tac-Toe board.
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (check == true) {
                    tttgameboard.setCell(Mark.NOUGHT, r, c);
                    check = false;
                } else {
                    tttgameboard.setCell(Mark.CROSS, r, c);
                    check = true;
                }
            }
        }
        // 6x7 board for Connect Four
        Board cfgameboard = new Board (6,7);
        // Set a cell to yellow or red on the Connect Four board.
        for (int r = 0; r < 6; r++) {
            for (int c = 0; c < 7; c++) {
                if (check == true) {
                    cfgameboard.setCell(Mark.YELLOW, r, c);
                    check = false;
                } else {
                    cfgameboard.setCell(Mark.RED, r, c);
                    check = true;
                }
            }
        }
        // 5x8 board for Mastermind; blue mark
        Board mmgameboard = new Board (5,8);
        // Set a cell to yellow, red, green, blue, magenta, or orange on the Mastermind board.
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 8; c++) {
                if (check == true ) {
                    mmgameboard.setCell(Mark.YELLOW, r, c);
                    check = false;
                } else {
                    mmgameboard.setCell(Mark.RED, r, c);
                } if (c == 2) {
                    mmgameboard.setCell(Mark.GREEN, r, c);
                } if (c == 3) {
                	mmgameboard.setCell(Mark.BLUE, r, c);
                } if (c == 4) {
                	mmgameboard.setCell(Mark.MAGENTA, r, c);
                } if (c == 5) {
                    mmgameboard.setCell(Mark.ORANGE, r, c);
                }
            }
        }
        
        System.out.println ("Tic Tac Toe");
        System.out.println(tttgameboard.toString());
        System.out.println("Connect Four");
        System.out.println(cfgameboard.toString());
        System.out.println ("Mastermind");
        System.out.println(mmgameboard.toString());
        
        FileManager.writeToFileAsync(tttgameboard.toString(), "ttt.txt");
        FileManager.writeToFileAsync(cfgameboard.toString(), "c4.txt");
        FileManager.writeToFileAsync(mmgameboard.toString(), "mm.txt");
        }
	} 