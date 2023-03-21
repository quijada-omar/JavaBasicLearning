package day7;

public class Swap2Strings {
	public static void main(String[] args) {
		String x = "john", y = "david", temp = "";
		System.out.println(x + " " + y);
		temp = y+","+x;
		String []a = temp.split(",");
		x = a[0];
		y = a[1];
		System.out.println(x + " " + y);
	}
}
