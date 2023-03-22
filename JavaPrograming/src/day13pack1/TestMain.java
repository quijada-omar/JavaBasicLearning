package day13pack1;

import day13.Test;
/*
public class TestMain extends Test {
	
	public static void main(String[] args) {
	
		TestMain tm = new TestMain();
		System.out.println(tm.x);
		tm.m1();

		
		Test t = new Test();
		System.out.println(t.x);  // This is incorrect
		t.m1();					  // Because they're private.
		
	}
	
}*/

public class TestMain{
	
	public static void main(String[] args) {
	
		Test t = new Test();
		System.out.println(t.x);  // This is incorrect
		t.m1();					  // Because they're private.
		
	}
	
}

