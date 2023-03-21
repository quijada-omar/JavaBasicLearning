package day5;

public class Assignment {
	public static void main(String[] args) {
		int input = 1234, result = 0;
		int inputPreview = input;
		while (input>0) {
			int temp=input; 
			result=(result*10) + temp%10; 
			input /= 10;
			System.out.println(temp + " " + input + " " + result);
		}
		System.out.println("Input: " + inputPreview + ", Result: " + result);
	}
}
