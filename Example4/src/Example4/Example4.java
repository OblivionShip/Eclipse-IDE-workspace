package Example4;
import java.util.Scanner;
public class Example4 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String user, pass;
		
		System.out.println("Enter your username: ");
		user = input.nextLine();
		
		System.out.println("Enter your password: ");
		pass = input.nextLine();
		
		
		if (user.equals("User") && (pass.equals("Pass"))) {
			System.out.println("Welcome non-fake.");
		}else {
			System.out.println("Sorry, you fake.");
		}
	}
}