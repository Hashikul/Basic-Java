package dot.com.basic;

import java.util.Scanner;

public class MultiplicationTable {

	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		input = new Scanner(System.in);
		
		System.out.println("Enter The Number: ");
		num = input.nextInt();
		
		
		for (int mul=1;mul<=10;mul++) {
	  System.out.println(num+"x"+mul+"="+num*mul);
			
	}

   }
}
