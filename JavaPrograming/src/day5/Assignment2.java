package day5;

public class Assignment2 {
	public static void main(String[] args) {
		int input = 1221, result = 0;
		int inputPreview = input;
		while (input>0) {
			int temp=input; 
			result=(result*10) + temp%10; 
			input /= 10;
		}
		if(inputPreview==result)
			System.out.println("Is palindrome!");
		else
			System.out.println("Not a palindrome!");
	}
}
