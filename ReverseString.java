package dot.com.basic;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result="";
		System.out.println("Enter A String: ");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char ch[]=str.toCharArray();
		for(int i=ch.length-1; i>=0; i--)
		{
		
			result += ch[i];
	}
		
		System.out.println("Rverse String Is: "+result);
		in.close();
}
}
