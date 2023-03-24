package day14;

import java.util.Scanner;

public class FinallyBlock {
	public static void main(String[] args) {
		System.out.println("Program is in progress...");
		String s = null;

		try {
			System.out.println(s.length());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Arithmetic exception thrown: You have entered invalid input");
		} finally {
			System.out.println("Entered into finally block");
		}
		System.out.println("Program is completed");
		System.out.println("Program is exited");
	}
}
