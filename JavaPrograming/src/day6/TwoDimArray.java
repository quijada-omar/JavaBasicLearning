package day6;

import java.util.Iterator;

public class TwoDimArray {
	public static void main(String[] args) {
		int a[][] = new int[3][2]; // Rows / Columns
		
//		int [][]a  = new int[3][2];
		
//		int []a[] = new int[3][2];
	
//		
//		a[0][0] = 100;
//		a[0][1] = 200;
//		
//		a[1][0] = 300;
//		a[1][1] = 400;
//		
//		a[2][0] = 500;
//		a[2][1] = 600;
//		
//		
		// Approach 2
		int b[][] = {
				{1,2,3,4},
				{10,20,30,40}, 
				{100,200,300,400},
				{10,20,30,40}
		};
		
//		Length of an array.
		
//		System.out.println(b.length);
		
//		Length of an element of the array
		
//		System.out.println(b[2].length);
		
//		Get an specific element get the 2 of the 3rd row and 2nd column
		
//		System.out.println(b[3][1]);
	
//		Reading data from array using classic for loop
		
//		for(int row = 0; row < b.length; row++)
//		{
//			for(int col=0; col<b[row].length; col++) {
//				System.out.print(b[row][col]+"\t");
//			}
//			System.out.println();
//		}

		// reading 2d array data using enhanced for loop
		
		for(int x[]:b) {
			for(int v:x) {
				System.out.print(v+"\t");
			}
			System.out.println();
		}
		
				
		
	}
}
