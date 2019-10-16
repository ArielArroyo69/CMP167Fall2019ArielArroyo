import java.util.Scanner;
public class SMSAbbreviations2 {

	public static void main(String[] args) {
			Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter the SMS Abbreviation: ");
		String abbreviation = scnr.nextLine();
		
		String translation = "";
		
		if (abbreviation.equalsIgnoreCase("BFF")) {
			translation = "Best Friend Forever";
			System.out.println(abbreviation + " means " +translation);
		}
		else if (abbreviation.equalsIgnoreCase("IMHO")) {
			translation = "In My Humble Opinion";
			System.out.println(abbreviation + " means " +translation);
		}
		else if (abbreviation.equalsIgnoreCase("2QT")) {
			translation = "Too Cute";
			System.out.println(abbreviation + " means " +translation);
		}
		else
			System.out.println("Unknown Abbreviation");
		
		return;
		

	}

}

