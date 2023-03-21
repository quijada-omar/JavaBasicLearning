package day10;

public class StaticExample {
	static int a = 10;
	int b = 20;
	
	static void m1() {
		System.out.println("This is  m1 static method");
	}
	
	void m2() {
		System.out.println("This is m2 non-static method");
	}
	
	void m() {
		System.out.println(a);
		System.out.println(b);
		
		m1();
		m2();
	}
	
//	public static void main(String[] args) {
//		 System.out.println(a);
////		 System.out.println(b); // Incorrect because is non static
//		 
//		 m1();
////		 m2(); // Incorrect because is not static
//		 
//		 // 2 static methods can acces non-static stuff through out object
//		 
//		 StaticExample se = new StaticExample();
//		 System.out.println(se.b);
//		 se.m2();
//	}
}
