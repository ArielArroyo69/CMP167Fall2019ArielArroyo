import java.util.Scanner;
public class QuadraticFormula {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
			
			double x1;
			double x2;
			double square;
			
			System.out.println("Enter \"a\" Value");
			double a = scnr.nextDouble();
			
			System.out.println("Enter \"b\" Value");
			double b = scnr.nextDouble();
			
			System.out.println("Enter \"c\" Value");
			double c = scnr.nextDouble();
			
			square = Math.sqrt((b*b)-4*a*c);
			x1 = -b + square;
			x1 = x1/(2*a);
			
			x2 = -b - square;
			x2 = x2/(2*a);
			
			System.out.print("The roots are " +x1 +" and " +x2);

	}

}
