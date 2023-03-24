package day14;

import java.util.Scanner;

public class HandleExceptions {

	public static void main(String[] args) {
		System.out.println("Program has started...");
		System.out.println("Program is in progress...");

		//	Example 1		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");

		int num = sc.nextInt();

		
		try {
			System.out.println(100/num);
		} catch (ArithmeticException e) {
			// TODO: handle exception
//			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("You have entered invalid input");
		}
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");



	}
}
