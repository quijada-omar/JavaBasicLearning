package day3;

public class IncrementOperator {
//	++ is called increment operator, pre, post
	public static void main(String[] args) {
		int a = 10;
// Scenario 1
//		Post increment - There is no difference
//		a=a+1;
//		a++;
//		Pre increment		
//		++a;
//		System.out.println(a);
	
//	Scenario 2
		int res = a++;
//		int res = ++a;
		System.out.println(res);  // Con a++ se guarda el primer valor y luego se incrementa
		System.out.println(a);
	}
	
}
