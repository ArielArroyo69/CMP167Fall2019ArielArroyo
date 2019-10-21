import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String mode = "";
		String operation = "";
		String trig = "";
		int amountofnumbers;
		double sum = 0;
		double number = 0;
		double number2 = 0;
		
		
		System.out.println("Enter the calculator mode: Standard/Scientific?");
		mode = input.next();
		
		if (mode.equalsIgnoreCase("standard")) {
			System.out.println("Enter wanted operation. +, -, *, or /");
			operation = input.next();
				if (operation.equals("+")){
					System.out.println("How many numbers do you want to add:");
					amountofnumbers = input.nextInt();
					System.out.printf("Enter %d numbers:\n", amountofnumbers);
					for (int i = 1; i <= amountofnumbers; i++) {
						number = input.nextDouble();
						if (i == 1)
							sum = number;
						if (i > 1)
							sum = sum + number;
						
					} //This FOR amount of numbers loop
					System.out.println(sum);
				} // This is IF Addition
		} // This is IF Standard
		

	}

}
