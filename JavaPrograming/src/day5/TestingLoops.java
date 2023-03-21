package day5;

public class TestingLoops {

	public static void main(String[] args) {
//		
//		for (int i = 0; i <= 10; i++) {
//			if(i!=2 && i!=5 && i!=10) {
//				System.out.println(i);
//			}
//		}
		
		Boolean flag = true;
		if(flag) {
			for(int i = 1; i<= 5; i++) {
				System.out.println(i);
			}
		} else {
			for(int i = 10; i>=1; i--) {
				System.out.println(i);
			}
		}
		
	}
}
