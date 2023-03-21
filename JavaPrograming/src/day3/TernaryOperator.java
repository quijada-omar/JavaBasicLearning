package day3;

public class TernaryOperator {
	public static void main(String[] args) {

//		var = exp ? result1:result2;
		int a = 200, b=100;
		int x = (a > b) ? a  :  b;
		System.out.println(x);
		
		a=1000;
		b=2000;
		x = b<a?b:a;
		System.out.println(x);
		
		int age= 20;
		String res = age >= 18? "Can vote":"Can't vote";
		System.out.println(res);
		
//		Unary operators   ++ -- += -= *= /= %= !
//		Binary operators  + - * / % > >= < <= != == || && ! = 
// 		Ternary operator ?:
		
		// Assignnment
		// Swapping of 2 numbers
		//
	}
}
