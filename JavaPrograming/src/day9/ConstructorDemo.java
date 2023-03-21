package day9;

public class ConstructorDemo 
{
	int x,y;
	String s;
	
//	ConstructorDemo() 	// Default
//	{
//		x=100;
//		y=200;
//		s="welcome";
//	}
	public ConstructorDemo(int a, int b, String str) {
		// TODO Auto-generated constructor stub
		x=a;
		y=b;
		s=str;
	}
	
	
	void displayData() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);
	}
	
	public static void main(String[] args) 
	{
		
//		ConstructorDemo cd = new ConstructorDemo(); // Default constructor
		ConstructorDemo cd = new ConstructorDemo(10,20,"Welcome"); // Invoking parameter constructor
		cd.displayData();
		
		
		
	}
}
