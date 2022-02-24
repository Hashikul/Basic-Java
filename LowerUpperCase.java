package dot.com.basic;

import java.util.Scanner;

public class LowerUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter The String: ");
		String str=in.nextLine();
		char ch;
		for(int i=0; i<str.length(); i++) {
			ch=str.charAt(i);
			if(Character.isUpperCase(ch))
				System.out.println(Character.toLowerCase(ch));
			else
				System.out.print(Character.toUpperCase(ch));
				
			in.close();
		}
	}

}
