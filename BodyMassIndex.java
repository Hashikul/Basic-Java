package dot.com.basic;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      Scanner in = new Scanner(System.in);
		      System.out.print("Input weight in pound: ");
		      double weight = in.nextDouble();
		      System.out.print("\nInput height in inch: ");
		      double height = in.nextDouble();
		      double BMI = weight / (height * height)*703;
		      System.out.println("The Body Mass Index (BMI) is " + BMI);
		      in.close();
		  
	}

}
