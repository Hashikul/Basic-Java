package dot.com.basic;

import java.util.Scanner;

public class InchToMeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double inch;
		double meter;
		Scanner in=new Scanner(System.in);
		System.out.println("Input A Value For Inch : ");
		inch=in.nextDouble();
		meter=inch*0.0254;
		System.out.println(inch+ " Inch Is " +meter+" Meters ");
		in.close();
	}
 
}
