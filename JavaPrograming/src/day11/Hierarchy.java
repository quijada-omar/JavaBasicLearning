package day11;


class Parent{
	void display(int a) {
		System.out.println(a);
	}
}

class Child1 extends Parent{
	void show(int b) {
		System.out.println(b);
	}
}

class Child2 extends Parent{
	void print(int c) {
		System.out.println(c);
	}
}


public class Hierarchy {
	public static void main(String[] args) {
		Child1 child1 = new Child1();
		child1.display(100);
		child1.show(200);
		
		Child2 c2 = new Child2();
		c2.display(300);
		c2.print(250);
		
		
	}
}

