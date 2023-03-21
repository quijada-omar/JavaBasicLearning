package day6;

import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		
		// Declaration
		
//		 Approach 1
		
//		int a[] = new int [5];
//		a[0] = 1;
//		a[1] = 1;
//		a[2] = 1;
//		a[3] = 1;
//		a[4] = 1;
//		a[5] = 1;
//		
		
//		 Approach 2
		
		int a[] = {10,20,30,40,50,60};
		
//		Length or size of an array
		
		System.out.println(a.length);
		
//		Get single value from an array
		
		System.out.println(a[3]);
		
//		Get all values from array
		
		System.out.println(a.toString()); // Print the array like an object
		
//		Get all values from an array approach 2
		
		System.out.println(Arrays.toString(a));
	
//		Get values by using loop
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
//		Read data from array using enhanced for loop
		
		for (int i : a) {
			System.out.println(i);
		}
		
	}
}
