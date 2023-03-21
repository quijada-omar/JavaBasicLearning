package day11;


class ABC{
	void m1(int a) {
		System.out.println(a);
	}
	
	void m2(int b) {
		System.out.println(b);
	}
}

class XYZ extends ABC{
	@Override
	void m1(int a) {
		System.out.println(a*a);
	}
	//Overload
	void m2(int b, int a) {
		System.out.println(a+b);
	}
}

public class OverridingOverloading {

	public static void main(String[] args) {
		XYZ xyz = new XYZ();
		xyz.m2(1,2);
		xyz.m2(1);
		xyz.m1(1);
	}
}
