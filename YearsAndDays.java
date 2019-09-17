/**
 * @author Ariel Arroyo
 */
import java.util.Scanner;
public class YearsAndDays {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of days:");
		//User Prompt
		
		int userDays = input.nextInt(); //Days input by user
		int numYears = (userDays) / 365; //Those days turned into years
		int numDays = (userDays) - (numYears*365); //Remaining total of days
		
		
		System.out.printf("%n%d years and %d days", numYears, numDays); //Output
}}