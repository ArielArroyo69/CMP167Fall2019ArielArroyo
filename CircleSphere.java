/***
 * 
 * @author Ariel Arroyo
 *
 */
import java.util.Scanner;
import java.lang.Math;
import java.math.BigDecimal;
public class CircleSphere {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter radius:");
	
		double radius = input.nextDouble();
	
		//Radius Calculations
		double circleCircumference = 2 * radius * Math.PI;
		double circleArea = Math.PI * Math.pow(radius, 2);
		double sphereArea = 4 * Math.PI * Math.pow(radius, 2);
		double sphereVolume = (Math.pow(radius, 3) * Math.PI) * 4/3;
		
		
		//Output
		System.out.println("Circle Circumference = "+circleCircumference);
		System.out.println("Circle Area = "+circleArea);
		System.out.println("Sphere Area = "+sphereArea);
		System.out.println("Sphere Volume = "+sphereVolume);
}}

//System.out.printf("%nCircle Circumference = %f%nCircle Area = %f%nSphere Area = %0f%nSphere Volume = %f", circleCircumference, circleArea, sphereArea, sphereVolume);
//System.out.println("Circle Circumference = "+circleCircumference);
//System.out.println("Circle Area = "+circleArea);
//System.out.println("Sphere Area = "+sphereArea);
//System.out.println("Sphere Volume = "+sphereVolume);