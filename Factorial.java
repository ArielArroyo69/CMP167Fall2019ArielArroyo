import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		int number = 0;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input a number:");
		number = input.nextInt();
		
		for (int i = number-1; i > 0; i--) {
			number = number * (i);
		}
		
		System.out.println(number);
		
		

	}

}
