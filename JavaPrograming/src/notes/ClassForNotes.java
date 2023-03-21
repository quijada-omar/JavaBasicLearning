package notes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ClassForNotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Primitive Data-types
//		Keywords
		byte byteMinValue = Byte.MIN_VALUE;
		byte byteMaxValue = Byte.MAX_VALUE;
		
		System.out.println(byteMinValue + "\t - \t" + byteMaxValue);
		
		short shortMinValue = Short.MIN_VALUE;
		short shortMaxValue = Short.MAX_VALUE;

		System.out.println(shortMinValue + "\t - \t" + shortMaxValue);
		
		int intMinValue = Integer.MIN_VALUE;
		int intMaxValue = Integer.MAX_VALUE;
		
		System.out.println(shortMinValue + "\t - \t" + shortMaxValue);
		
		long longMin = Long.MIN_VALUE;
		long longMax = Long.MAX_VALUE;
		
		System.out.println(longMin + "\t - \t" + longMax);
		
		float floatMin = Float.MIN_VALUE;
		float floatMax = Float.MAX_VALUE;
		
		System.out.println(floatMin + "\t - \t" + floatMax);
		
		double dubMax = Double.MAX_VALUE;
		double dubMin = Double.MIN_VALUE;
		
		System.out.println(dubMin + "\t - \t" + dubMax);
		
		int charMin = Character.MIN_VALUE;
		int charMax = Character.MAX_VALUE;

		System.out.println(charMin + " - " + charMax);
		
		boolean trueOrFalse = false;
		
		System.out.println(trueOrFalse);
		
		// Non-primitive data-types
		// Pre-defined classes
		String thisIsAString = "I am a string";
		ArrayList<String> thisIsAnArrayList = new ArrayList<String>();
		HashSet<String> thisIsAHashSet = new HashSet<String>();
		HashMap<Integer, String> thisIsAHashMap = new HashMap<Integer, String>();
		//		 etc, these are called collections / derived or non-primitive / Upper case characters at the beginning
		
	}

}
