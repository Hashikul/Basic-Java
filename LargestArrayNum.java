package dot.com.basic;

import java.util.Scanner;

public class LargestArrayNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n,max;
    Scanner in=new Scanner(System.in);
    System.out.println("Number Of Element In The Array : ");
    n=in.nextInt();
    int a[]=new int[n];
    System.out.println("Enter Element Of Array : ");
    for(int i=0;i<n;i++)  {
    	a[i]=in.nextInt();
    }
    max=a[0];
    for(int i=0;i<n;i++) {
    	if(max<a[i]) {
    		max=a[i];
    	}
    }
    System.out.println("Largest Value Of Array : "+max);
    in.close();
	}

}
