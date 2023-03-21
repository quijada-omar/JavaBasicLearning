package day7;

import java.util.Iterator;

public class Assignment1 {
	public static void main(String[] args) {

//		Reverse a string
		
		String s = "abc", reversedS = "";
		System.out.println(s);
		for(int i = s.length()-1; i >= 0; i--) {
			reversedS+=s.charAt(i);
		}
		System.out.println(reversedS);
	}
}
