import java.util.Scanner;
public class Words {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		System.out.println("Enter 4 words:");
		//User Input
		
		//Input Word Options
		String word1 = input.next();
		String word2 = input.next();
		String word3 = input.next();
		String word4 = input.next();
	
	//Word 1
	int letter1 = word1.indexOf("h");
	int lengthWord1 = word1.length();
	//Word 2
	int letter2 = word2.indexOf("i");
	int lengthWord2 = word2.length();
	//Word 3
	int letter3 = word3.indexOf("hi");
	int lengthWord3 = word3.length();
	//Word 4
	int letter4 = word4.indexOf("bee");
	int lengthWord4 = word4.length();
		
	System.out.printf("%nWord 1 = \"%s\" Length = %d position of \'h\' = %d%nWord 2 = \"%s\" Length = %d position of \'i\' = %d%nWord 3 = \"%s\" Length = %d position of \"hi\" = %d%nWord 4 = \"%s\" Length = %d position of \"bee\" = %d", word1, lengthWord1, letter1, word2, lengthWord2, letter2, word3, lengthWord3, letter3, word4, lengthWord4, letter4);
}}