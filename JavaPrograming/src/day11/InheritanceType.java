package day11;



/**
 * 
 */

class A{
	
	int a = 100;
	
	void display() {
		System.out.println(a);
	}
}


class B extends A{
	int b  = 200;
	void show() {
		System.out.println(b);
	}	
}

class C extends B{
	int c;
	void print() {
		System.out.println(c);
	}
}


public class InheritanceType {
	public static void main(String[] args) {
		B bobj =  new B();
//		System.out.println(bobj.a);
//		System.out.println(bobj.b);

		bobj.a = 200;
		bobj.b = 100;
		
		bobj.display();

		bobj.show();

		C cobj = new C();
		
		cobj.a = 1;
		cobj.b = 2;
		cobj.c = 3;
		
		cobj.display();
		cobj.show();
		cobj.print();
		
	}
}
