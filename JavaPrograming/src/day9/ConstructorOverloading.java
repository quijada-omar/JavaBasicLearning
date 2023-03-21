package day9;

public class ConstructorOverloading {
	
	int x,y,z;
	double d;
	
	
	ConstructorOverloading() {
		// TODO Auto-generated constructor stub
		x=10;
		y=20;
		d=0.0;
	}
	
	
	ConstructorOverloading(int a, int b)
	{
		x=a;
		y=b;
	}

	ConstructorOverloading(int a,double b)
	{
		x=a;
		d=b;
	}

	ConstructorOverloading(double b,int a)
	{
		x=a;
		d=b;
	}
	
	void display() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		
		ConstructorOverloading co = new ConstructorOverloading(100,200.5);
		co.display();
		
	}
}
