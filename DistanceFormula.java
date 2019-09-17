import java.util.Scanner;
import java.lang.Math;
public class DistanceFormula {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	//P1
	System.out.printf("Coordinates for P1%nEnter X1:");
	//Enter X1
	double x1 = input.nextDouble();
	//User Input X1
	System.out.printf("Enter Y1:");
	//Enter Y1
	double y1 = input.nextDouble();
	//User Input Y1
	
	//P2
	System.out.printf("%nCoordinates for P2%nEnter X2:");
	//Enter X2
	double x2 = input.nextDouble();
	//User Input X2
	System.out.printf("Enter Y2:");
	//Enter Y2
	double y2 = input.nextDouble();
	//User Input Y2
	
		double a = (x2-x1); //Difference between X
		double b = (y2-y1); //Difference between y
		double cSquared = (Math.pow(a, 2)) + (Math.pow(b, 2)); //Combined Difference
		
	double dist = Math.sqrt(cSquared); //Distance
	
	System.out.println("Distance between P1 and P2 = "+dist);
}}