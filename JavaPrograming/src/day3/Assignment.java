package day3;

public class Assignment {
	public static void main(String[] args) {
//		// Method 1
		int a = 10, b = 20;
		
		System.out.println("Value of a before swapping " + a);
		System.out.println("Value of b before swapping " + b);
		
//		int temp;
//		
//		temp = a;
//		a = b;
//		b = temp;
//		
//		System.out.println("Value of a after swapping " + a);
//		System.out.println("Value of b after swapping " + b);
//		
		// Method 2 Sum and sub
		
//		a+=b;  10 + 20 = 30
//		b=a-b; 30 - 20 = 10
//		a-=b;  30 - 10 = 20 
//		System.out.println();
//		System.out.println("Value of a after swapping " + a);
//		System.out.println("Value of b after swapping " + b);
//		
		// Multiplication and slash operators
		// only if a or b are not 0
		
//		a = a*b; // a = a * b = 200
//		b = a/b; // b = a / b = 200/20 = 10
//		a = a/b; // a = a / b = 200/10 = 20
		
		// Logic 4 Bitwise XOR (^)
		
//		a = a^b; 
//		b = a^b;  
//		a = a^b;

		// Single statement
		b = a+b-(a=b); // 1) a = 20, 2) 10+20 - (20) = 10 3) a = 20 , b = 10; 
		
		System.out.println("Value of a after swapping " + a);
		System.out.println("Value of b after swapping " + b);
		
	}
}
