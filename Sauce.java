
import java.util.Scanner;
public class Sauce {
	//main method
	//the program starts at the main method
	public static void main(String[] args) {
		//This creates Scanner Object
		Scanner input = new Scanner(System.in);
		//Prompts the user for an input
		System.out.println("Enter Your Name");
		//wait for input from the user
		//grabs it, then stores in the variable
		String name = input.nextLine();
		//Reply to user
		System.out.println("Thank you, "+name);
	}


}
