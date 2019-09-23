/***
 * 
 * @author Ariel
 *
 */
import java.util.Scanner;
public class CarDealer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int creditScore , age;
		System.out.println("Hello, I'm a fruit vendor, \ndo you want to buy a fruit?");
		String Answer = input.next();
		
		if(Answer.equalsIgnoreCase("Yes")) {
			System.out.println("Ok, let me show you what I have.\nWait, how old are you?");
			age = input.nextInt();
			if(age>=25) {
				System.out.println("Ok, Good");
				System.out.println("What fruit do you want?");
				String model = input.nextLine();
				switch(model) {
				case "Apple":
					System.out.println("Here's an apple");
					break;
				case "Pear":
					System.out.println("Here's a Pear");
					break;
				case "Orange":
					System.out.println("Here's a Orange");
					break;
				}
			}else {
				System.out.println("Sorry, I can't sell you a fruit");
			}
		}else {
			System.out.println("Ok, come back when you're ready");
		}

	}

}
