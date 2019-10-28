import java.util.Scanner;
public class EvenSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int answer = 0;
		
		System.out.println("Enter a Number:");
		int value = input.nextInt();
		
		for (int i = 0; i<=value; i+=2) {
			answer = answer + i;
		}
		
		System.out.println(answer);

	}

}
