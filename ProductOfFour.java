import java.util.Scanner;
public class ProductOfFour {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter four int values to multiply");
			int num1 = input.nextInt();
			int num2 = input.nextInt();
			int num3 = input.nextInt();
			int num4 = input.nextInt();
			
			int result = num1*num2*num3*num4;
		System.out.println(result);
			
				

	}

}