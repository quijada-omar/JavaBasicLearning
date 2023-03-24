package day14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleTryCatchBlocks {

	public static void main(String[] args) {
		
		System.out.println("Program is in progress...");

		//	Example 1		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");

		int num = sc.nextInt();
		
		String s = null;

	/*	
		try {
//			System.out.println(100/num);
			System.out.println(s.length());

		} catch (ArithmeticException e) {
			// TODO: handle exception
//			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Arithmetic exception thrown: You have entered invalid input");
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("Number format exception thrown: You have entered invalid input");
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Null pointer exception: You have entered invalid input");
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Input mismatch exception: You have entered invalid input");
		}
		*/
		
		try {
			System.out.println(s.length());
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage() + " : " + "Exception thrown");
		}
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");
		
	}
	
}
