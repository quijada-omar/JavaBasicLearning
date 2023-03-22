package day13;

public class TestMain {
	
	public static void main(String[] args) {
	
		Test t = new Test();
		System.out.println(t.x);  // This is incorrect
		t.m1();					  // Because they're private.
		
	}
	
}
