package day4;

public class LargestNumber {
	public static void main(String[] args) {
		int a=300, b=200, c=100;
		if (a>b && a>c) {
			System.out.println("A is the largest "+ a);
		} else if(b>a && b>c) {
			System.out.println("B is the largest " + b);
		} else {
			System.out.println("C is the largest " + c);
		}

	}
}
