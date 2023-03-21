package day5;

public class Assignment4 {

	public static void main(String[] args) {
		
		int input = 123456;
		int noOfDigits = 0;
		int temp = 0;
		while(input>0) {
			input/=10;
			noOfDigits+=1;
		}
		System.out.println(noOfDigits);
	}
}
