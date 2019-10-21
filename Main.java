import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String mode = "";
		String operation = "";
		String trig = "";
		String startOver = "Y";
		int amountofnumbers;
		double answer = 0;
		double number = 0;

		while (startOver.equalsIgnoreCase("Y")) { //This is the entire loop for starting over

		System.out.println("Enter the calculator mode: Standard/Scientific?");
		mode = input.next(); //Choosing Standard or Scientific
		
		if (mode.equalsIgnoreCase("standard"))
			System.out.printf("The calculator will operate in %s mode.\n", mode); //Zybooks wants this for some reason
		
		while (!mode.equalsIgnoreCase("Standard") && (!mode.equalsIgnoreCase("Scientific"))){
			System.out.println("Invalid Operation Recieved");
		    System.out.println("");
		    System.out.println("Enter the calculator mode: Standard/Scientific?");
		    mode = input.next();
		} //Invalid response for putting neither standard or scientific


		if (mode.equalsIgnoreCase("standard")) {
			System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
			operation = input.next(); //Prompting user for operation
			
		while (!operation.equals("+") && (!operation.equals("-") && (!operation.equals("*") && (!operation.equals("/"))))){
				System.out.println("Invalid Operation Recieved");
			    System.out.println("");
			    System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
			    operation = input.next();
			} //Invalid operation statement	

				if (operation.equals("+")){
					System.out.println("How many numbers do you want to add?");
					amountofnumbers = input.nextInt();
					System.out.printf("Enter %d numbers\n", amountofnumbers);
					for (int i = 1; i <= amountofnumbers; i++) {
						number = input.nextDouble();
						if (i == 1)
							answer = number;
						if (i > 1)
							answer = answer + number;
					} //This FOR amount of numbers loop
					System.out.println("Result: " +answer);
				} //This is the addition
				
				if (operation.equals("-")){
					System.out.println("How many numbers do you want to subtract?");
					amountofnumbers = input.nextInt();
					System.out.printf("Enter %d numbers\n", amountofnumbers);
					for (int i = 1; i <= amountofnumbers; i++) {
						number = input.nextDouble();
						if (i == 1)
							answer = number;
						if (i > 1)
							answer = answer - number;
					} //This FOR amount of numbers loop
					System.out.println("Result: " +answer);
				} //This is the subtraction
				
				if (operation.equals("*")){
					System.out.println("How many numbers do you want to multiply?");
					amountofnumbers = input.nextInt();
					System.out.printf("Enter %d numbers\n", amountofnumbers);
					for (int i = 1; i <= amountofnumbers; i++) {
						number = input.nextDouble();
						if (i == 1)
							answer = number;
						if (i > 1)
							answer = answer * number;
					} //This FOR amount of numbers loop
					System.out.println("Result: " +answer);
				} //This is the multiplication
				
				if (operation.equals("/")){
					System.out.println("How many numbers do you want to divide?");
					amountofnumbers = input.nextInt();
					System.out.printf("Enter %d numbers\n", amountofnumbers);
					for (int i = 1; i <= amountofnumbers; i++) {
						number = input.nextDouble();
						if (i == 1)
							answer = number;
						if (i > 1)
							answer = answer / number;
					} //This FOR amount of numbers loop
					System.out.println("Result: " +answer);
				} //This is the division
		} //If standard is choosing ^^
		
			if (mode.equalsIgnoreCase("scientific")) {
			System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
			operation = input.next(); //Prompting user for operation
			
			while (!operation.equals("+") && (!operation.equals("-") && (!operation.equals("*") && (!operation.equals("/")
					 && (!operation.equals("sin") && (!operation.equals("cos") && (!operation.equals("tan")))))))){
				System.out.println("Invalid Operation Recieved");
			    System.out.println("");
			    System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
			    operation = input.next(); //Invalid operation statement
			}
			    
			if (operation.equals("+")){
				System.out.println("How many numbers do you want to add?");
				amountofnumbers = input.nextInt();
				System.out.printf("Enter %d numbers\n", amountofnumbers);
				for (int i = 1; i <= amountofnumbers; i++) {
					number = input.nextDouble();
					if (i == 1)
						answer = number;
					if (i > 1)
						answer = answer + number;
				} //This FOR amount of numbers loop
				System.out.println("Result: " +answer);
			} //This is the addition
				
			if (operation.equals("-")){
				System.out.println("How many numbers do you want to subtract?");
				amountofnumbers = input.nextInt();
				System.out.printf("Enter %d numbers\n", amountofnumbers);
				for (int i = 1; i <= amountofnumbers; i++) {
					number = input.nextDouble();
					if (i == 1)
						answer = number;
					if (i > 1)
						answer = answer - number;
				} //This FOR amount of numbers loop
				System.out.println("Result: " +answer);
			} //This is the subtraction
				
			if (operation.equals("*")){
				System.out.println("How many numbers do you want to multiply?");
				amountofnumbers = input.nextInt();
				System.out.printf("Enter %d numbers\n", amountofnumbers);
				for (int i = 1; i <= amountofnumbers; i++) {
					number = input.nextDouble();
					if (i == 1)
						answer = number;
					if (i > 1)
						answer = answer * number;
				} //This FOR amount of numbers loop
				System.out.println("Result: " +answer);
			} //This is the multiplication
				
			if (operation.equals("/")){
				System.out.println("How many numbers do you want to divide?");
				amountofnumbers = input.nextInt();
				System.out.printf("Enter %d numbers\n", amountofnumbers);
				for (int i = 1; i <= amountofnumbers; i++) {
					number = input.nextDouble();
					if (i == 1)
						answer = number;
					if (i > 1)
						answer = answer / number;
				} //This FOR amount of numbers loop
				System.out.println("Result: " +answer);
			} //This is the division
			
							if (operation.equalsIgnoreCase("sin")) {
								System.out.println("Enter a number in radians to find the sine");
									number = input.nextDouble();
									answer = Math.sin(number);
								System.out.println("Result: " +answer);
					} //This is Sine
							if (operation.equalsIgnoreCase("cos")) {
								System.out.println("Enter a number in radians to find the cosine");
									number = input.nextDouble();
									answer = Math.cos(number);
								System.out.println("Result: " +answer);
					} //This is Cosine
							if (operation.equalsIgnoreCase("tan")) {
								System.out.println("Enter a number in radians to find the tangent");
									number = input.nextDouble();
									answer = Math.tan(number);
								System.out.println("Result: " +answer);
					} //This is Tangent
		} //If scientific is chosen ^^
			//After all calculations are done system prints this
		System.out.println("Do you want to start over? (Y/N)");
		startOver = input.next(); //If Y is input, Calculator starts over, If not, Loops ends
		
		} //End of the entire calculator
		System.out.println("Goodbye"); //Goodbye after loop ends
	}
	
}