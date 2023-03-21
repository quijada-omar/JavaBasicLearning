package day5;

public class Assignment5 {
	public static void main(String[] args) {
		int input = 333, sum = 0;
		while (input > 0) {
			sum += input%10;
			input/=10;
		}
		System.out.println("Suma de numeros " + sum);
	
	}
}
