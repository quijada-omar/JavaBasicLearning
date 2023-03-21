package day3;

public class OperatorsDemo {
	public static void main(String[] args) {
//	 	A.L.I.A.C.
//		Arithmetic operators +-*/%
		int a = 20, b = 10;
		System.out.println("Sum of a and b is " + (a+b));
		System.out.println("Diff of a and b is " + (a-b));
		System.out.println("Mult of a and b is " + (a*b));
		System.out.println("Division of a and b is " + (a/b));
		System.out.println("Module division of a and b is " + (a%b));
		
// 		Relational comparison operators > >= < <= != ==
		System.out.println("a>b:" + (a>b)); 	// true
		System.out.println("a<b:" + (a<b));		// false
		b = 20;
		System.out.println("a>=b: " + (a>=b));  // true
		System.out.println("a<=b: " + (a<=b)); 	// true
		
		System.out.println("a!=b: " + (a!=b)); // false
		System.out.println("a==b: " + (a==b)); // true
		
//		Logical operators && || !
//		Works between 2 boolean values
//		Returns true / false
		
		boolean x = true, y = false;
		
		System.out.println("x&&y" + (x&&y)); // false
		System.out.println("x||y" + (x||y)); // true
		System.out.println("!x" + (!x));
		System.out.println("!y" + (!y));
		
		boolean b1 = 10>20, b2 = 20 > 10;	// false, true
		System.out.println("b1&&b2: " + (b1&&b2));
		System.out.println("b1||b2: "  + (b1||b2));
		
		
		
		
		
		
	}
}
