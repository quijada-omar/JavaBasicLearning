package day5;

public class BreakStatement {
	
	public static void main(String[] args) {
		
		for (int i = 1; i<=5;i++) {
			if(i==3 || i==5) {
				continue;
			}
			System.out.println(i);
		}
	}
}
