package day13;

public class DataConversionMethods {

	public static void main(String[] args) {
		// String --- int
		
		String s = "welcome";
		String s1 = "10";
		String s2 = "20";
		
		System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));
		System.out.println(s1+s2);
		
		// String --> Double
		String s3 = "150.15";
		String s4 = "130.20";
		double s3dbl = Double.parseDouble(s3); 
		double s4dbl = Double.parseDouble(s4);
		System.out.println(s3dbl + s4dbl);

		// String --> Boolean 
		String sbool = "true";
		boolean bool = Boolean.parseBoolean(sbool);
		System.out.println(bool);
		
		// int, double, char, boolean ---> String 
		int a = 10;
		double d = 15.15;
		char c = 'A';
		boolean b = false;
		
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(b));
	}
}
