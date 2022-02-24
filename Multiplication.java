package dot.com.basic;

import java.util.Scanner;

public class Multiplication {

	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		int a,b,mul;
		
		System.out.println("Enter First Number: ");
		a = input.nextInt();
		
		System.out.println("Enter Second Number: ");
		b = input.nextInt();
 
		mul = a*b;
		System.out.println("Result= "+mul);
		
	
	
	}

}
