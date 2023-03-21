package day4;

public class NestedIfElse {
public static void main(String[] args) {
	if(true) {
		if(false) {
			System.out.println("123");
		} else {
			System.out.println("abc");
		}
	} else if(false) { 
		if(true)
			System.out.println("xyz");
	}
}
}
