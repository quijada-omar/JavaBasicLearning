package day12;

public class PQR extends MNO implements ABC, XYZ{
	
	public static void main(String[] args) {
		PQR obj = new PQR();
		obj.m1();
		obj.m2();
		obj.m3();
	}
	
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("This is m1 from ABC");
		System.out.println(y);
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("This is m2 from XYZ");
		System.out.println(x);
	}
	
}
