import java.util.Random;
public class RandomNumberGenerator {
	public static void main(String[] args) {
		Random randGen;
		int num;
		int num2;
		
		randGen=new Random();
		num = randGen.nextInt(100) + 1;
					
		
		System.out.println("And your number is...");
		System.out.println(num);
		
		if (num==7 || num==37 || num==67 || num==97)
			System.out.println("Today's your lucky day!");
		
		if (num==1-49)
			System.out.println("That's a low roll.");
		
		if (num==50-100)
			System.out.println("That's a high roll.");
		
	}
	
}
