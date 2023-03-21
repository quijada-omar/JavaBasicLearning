package day7;

import java.util.Arrays;

public class StringOperations {
	public static void main(String[] args) {
		String s = "welcome";
//		String s = new String("welcome");
		System.out.println(s);
		
//		length of string
		System.out.println(s.length()); 
		
//		concat or join strings
		String s1 = "welcome", s2 = "to Java", s3 = "automation";

		System.out.println(s1+s2); //welcometo Java
		System.out.println(s1.concat(s2));
		
		
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2).concat(s3));
		
		s = "       automation 		";
		System.out.println(s.length());
		System.out.println(s.trim().length());
		
//	 	charAt()
		s = "welcome";
		System.out.println(s.charAt(3));
		
//		Contains - return boolean true/false
		System.out.println(s.contains("Wel"));
		System.out.println(s.contains("wel"));
		System.out.println(s.contains("com"));
		
//		Equals ignore case
//		Compare 2 Strings
		
		s1 = "WELCOME"; s2 = "welcome";
		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.equalsIgnoreCase(s2)); // true 
		
//		replace()
		
		s = "welcome to selenium automation testing selenium training";
		
		System.out.println(s.replace('e', 'X'));
		
		System.out.println(s.replace("selenium", "java"));
		
		// substring(starting index, )
		
		String ss = "welcome";
		System.out.println(ss.substring(2,7)); // lcome
		System.out.println(ss.substring(2,5)); // lco
		
		// split divide the string into multiple parts using delimeter
		
		s = "abc@gmail.com";
		
		String a[] = s.split("@");
		
		System.out.println(Arrays.toString(a));
		
		s = "abc,def,ghi";
		
		String b[] = s.split(",");
		
		System.out.println(Arrays.toString(b));
		
//		toUpperCase, toLowerCase
		
		s = "wElCoMe";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		
	}
}
