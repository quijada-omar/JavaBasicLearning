package day7;

public class Assignment2 {
	public static void main(String[] args) {
		
		String s = "aba", reversedS = "";
		System.out.println(s);
		for(int i = s.length()-1; i >= 0; i--) {
			reversedS+=s.charAt(i);
		}
		System.out.println(reversedS);
		if(s.equals(reversedS)) {
			System.out.println("IS A PALINDROME");
		} else {
			System.out.println("NOT A PALINDROME");
		}
		
	}
}
