//Ariel Arroyo
//Homework 1.1

import java.util.Scanner;
public class CurrencyExchange {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	//Conversion Rates
		double peso = 0.0544;
		double quetzal = 0.1305;
		double colons = 0.1144;
	
	System.out.println("Enter number of Mexican Pesos:");
		int Mex = input.nextInt();
	
	System.out.println("Enter number of Guatemalan Quetzals:");
		int Gua = input.nextInt();
		
	System.out.println("Enter number of Salvadoran Colons:");
		int Sal = input.nextInt();
		
		double MexUS = Mex*peso;
		double GuaUS = Gua*quetzal;
		double SalUS = Sal*colons;
		
		double result = MexUS+GuaUS+SalUS;
	System.out.println("US Dollars = " +result);
		}
} 