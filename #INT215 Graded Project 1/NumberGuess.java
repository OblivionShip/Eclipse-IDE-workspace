package numberguess;

public class NumberGuess {
	public static void main( String [ ] args ) {
		// Define program variables
		int randNum, attemptNum, guessNum;
		
		// Generate a random number between 1 and 10
		randNum = new java.util.Random().nextInt(10)+1;
		
		//Display a message
		System.out.println
		("I am thinking of a random number between 1 and 10.");
		
		//Ask for a guess and check the input
				for (attemptNum = 0; attemptNum < 3; attemptNum = attemptNum+1) {
				System.out.print("Guess what it is?");
					java.util.Scanner scan = new java.util.Scanner(System.in);
					guessNum = scan.nextInt();
					System.out.println("You guessed " + guessNum);
					if (guessNum == randNum) {
						System.out.println("You guessed it!");
						break;
				}	
						System.out.println("Sorry, try again!");
				}
			}
		}