package day7;

public class StringComparisons {
	public static void main(String[] args) {
//
//		Approach 1
//		String s1 = "welcome";
//		String s2 = "welcome";
//		
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
//		
//		
//		Approach 2 
//		String s1 = new String("welcome"); // 
//		String s2 = new String("welcome");
//	 
//		System.out.println(s1==s2);  // false comparing objects 
//		System.out.println(s1.equals(s2)); // true comparing content of object
//		
		
//		Approach 3		
		String s1 = "abc", s2 = new String("abc"), s3 = s2;
//		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		
//		System.out.println(s1==s2);		// false
//		System.out.println(s1.equals(s3)); // true
//		System.out.println();
//		System.out.println(s2.equals(s3));
//		System.out.println(s2==s3);
		
//		Approach 4
		
		s1 = "abc";
		s2 = new String("abc");
		s3=s2;
		
	}
}
