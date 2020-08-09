package connectfourgameboard;
import java.util.Scanner;
import java.util.Scanner.*;
import java.util.function.*;
		
public class connectfourgameboard {
	static int[][] gameboard = new int[6][7];
	static final int EMPTY = 0;
	static final int YELLOW = -1;
	static final int RED = 1;
	
	static void set(int val, int row, int col)
	throws IllegalArgumentException {
		if (gameboard[row][col] == EMPTY)
			gameboard[row][col] = val;
		else throw new IllegalArgumentException
			("Column is full!");
	}
//Create a 6 x 7 board for a Connect Four Game
	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  int[][] values = new int[6][7];
		  int noOfDisk = 0;
		  String s;
		  int disk;
		 
		  do {
		 
		   noOfDisk++;
		   if (noOfDisk % 2 == 0) {
		    s = "red";
		    disk = 1;
		   } else {
		    s = "yellow";
		    disk = 2;
		   }
		 
		   System.out.print("Drop a " + s + " disk at column (0–6):");
		   int col = input.nextInt();
		   for (int i = values.length - 1; i >= 0; i--) {
		    if (values[i][col] == 0) {
		     values[i][col] = disk;
		     break;
		    }
		    if (i == 0)
		     System.out.println("Column full. Try again.");
		   }
		   displayBoard(values);
		 
		  } while (checkBoard(values) == false && noOfDisk != 6 * 7);
		   
		  if(checkBoard(values)) {
		   System.out.println("The " + s + " player won");
		    
		  }else {
		   System.out.println("It is a draw.");
		  }
		 
		 }
		 
		 public static void displayBoard(int[][] values) {
		 
		  for (int i = 0; i < values.length; i++) {
		   System.out.print("|");
		   for (int j = 0; j < values[i].length; j++) {
		    char c;
		    if (values[i][j] == 1) {
		     c = 'R';
		    } else if (values[i][j] == 2) {
		     c = 'Y';
		    } else {
		     c = ' ';
		    }
		 
		    System.out.print(c + "|");
		   }
		   System.out.println();
		  }
		 
		  for (int i = 0; i <= values.length * 2; i++) {
		   System.out.print("-");
		  }
		 
		  System.out.println();
		 
		 }
		 
		 public static boolean checkBoard(int[][] values) {
			return false;
			
		 }
}