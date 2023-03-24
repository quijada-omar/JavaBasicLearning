package day14;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Program has started...");
		System.out.println("Program is in progress...");
		
//		Example 1
/*		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = sc.nextInt();
		
		System.out.println(100/num);
		System.out.println("Program is completed");
		System.out.println("Program is exited");
*/	

//		Example 2
/*
		int a[] = new int[5];  	// 0... 4
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		System.out.println("Enter position to add value [0-4]");
		int pos = sc.nextInt();
		
		a[pos] = num;   		// ArrayIndexOutOfBoundsException
		System.out.println(a[pos]);
		System.out.println("Program is completed");
		System.out.println("Program is exited...");
*/	

//		Example 3
		String s = "welcome";
		int snum = Integer.parseInt(s);
		System.out.println(snum);
		
		
		System.out.println("Program is completed");
		System.out.println("Program is exited...");
		
	}
}
