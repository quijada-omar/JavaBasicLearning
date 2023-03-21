package day10;

public class StaticMain {

	public static void main(String[] args) {
		 System.out.println(StaticExample.a);
//		 System.out.println(b); // Incorrect because is non static
		 
		 StaticExample.m1();
//		 m2(); // Incorrect because is not static
		 
		 // 2 static methods can acces non-static stuff through out object
		 
		 StaticExample se = new StaticExample();
		 System.out.println(se.b);
		 se.m2();
		 
		 String ss = Test.s;
		 System.out.println(ss.length());
	}
}
