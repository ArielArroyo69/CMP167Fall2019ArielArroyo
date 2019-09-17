/**
 * 
 * @author Ariel Arroyo
 *
 */

import java.util.Scanner;
public class IntegerExpressions {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
	
	System.out.println("Enter firstInt:");
		int firstInt = input.nextInt(); //First Input
		
	System.out.println("Enter secondInt:");
		int secondInt = input.nextInt(); //Second Input
		
	System.out.println("Enter thirdInt:");
		int thirdInt = input.nextInt(); //Third Input
		
		//Result Processes
		int firstResult = (firstInt+secondInt) / (thirdInt); //firstInt plus secondInt, divided by the thirdInt
		int secondResult = (secondInt*thirdInt) / (secondInt+firstInt); //secondInt times thirdInt, divided by the secondInt plus the firstInt
		int thirdResult = (firstInt*thirdInt) % (secondInt); //firstInt times thirdInt, divided by the secondInt
		
		
	//Results
		System.out.printf("%nFirst Result = %d%nSecond Result = %d%nThird Result = %d", firstResult, secondResult, thirdResult);
		
	
}
}