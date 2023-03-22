package day12;


interface Shape{
	//	Final and static variables
	int length = 10;
	int widht = 20;
	
	void circle(); // abstract method
	default void square() { // default method
		System.out.println("This is square: default method");
	}
	
	static void rectangle() { // static method
		System.out.println("This is rectangle: static method");
	}
	
}



public class InheritanceDemo implements Shape{
	public static void main(String[] args) {
		
		InheritanceDemo inheritanceDemo = new InheritanceDemo();
		inheritanceDemo.circle();
		inheritanceDemo.square();
		Shape.rectangle();      //  Static method can directly access
		
//		Shape sh = new Shape(); // Incorrect 
		Shape sh = new InheritanceDemo();
		sh.circle();
		sh.square();
	
		
	}

	@Override
	public void circle() {
		// TODO Auto-generated method stub
		System.out.println("This is circle()");
	}
}
