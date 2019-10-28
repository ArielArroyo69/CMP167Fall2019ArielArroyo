import java.util.Scanner;
public class NameAndPet {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		String pet = "";
		String petName = "";
		
		System.out.println("What's your name?");
		name = input.next();
		
		System.out.println("\nDo you have a pet? (Y/N)");
		pet = input.next();
		
		while (!pet.equalsIgnoreCase("Y") && (!pet.equalsIgnoreCase("N"))){
			System.out.println("Invalid Answer");
			System.out.println("\nDo you have a pet? (Y/N)");
			pet = input.next();
		}
		
		if (pet.equalsIgnoreCase("Y")) {
			System.out.println("\nWhat's your pet's name");
			petName = input.next();
			int petNameLength = petName.length();
			System.out.printf("%n%s, %s had %d characters", name, petName, petNameLength);
		}
		
		else
			System.out.printf("%nGet a pet %s", name);
		
		
	}

}
