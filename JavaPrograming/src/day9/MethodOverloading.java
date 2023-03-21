package day9;

public class MethodOverloading {
	int x,y,z;
	double d;
	
	void sum() {
		x= 10;
		y= 20;
		System.out.println(x+y);
	}
	void sum(int a, int b) {
		x=a;
		y=b;
		System.out.println(x+y);
	}
	
	void sum(int a, double b) {
		x=a;
		d=b;
		System.out.println(x+d);
	}

	void sum(double b, int a) {
		x=a;
		d=b;
		System.out.println(x+d);
	}
	
	public static void main(String[] args) {
	
		MethodOverloading overloading = new MethodOverloading();
		overloading.sum();
		overloading.sum(1.5,2);
		overloading.sum(1, 1.5);
		overloading.sum(1.5, 1);
	}
}
