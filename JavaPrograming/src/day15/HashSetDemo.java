package day15;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	/**
	 *  Heterogenous data allowed
	 *  Insertion order not preserved
	 *  Duplicate elements not allowed
	 * 	Multiple nulls not allowed / only one single null is allowed
	 * 
	 * */
	
	public static void main(String[] args) {
		HashSet myset = new HashSet(); // Heterogenous data allowed
//		Set mySet1 = new HashSet();
//		HashSet<Integer> mySet = new HashSet<Integer>();
		
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(100);
		myset.add(null);
		myset.add(null);

		System.out.println(myset); 	// Insertion order not preservedd
		System.out.println(myset.size()); // 4 
		
		// Remove from hashset
		// we pass value but not index
		myset.remove(10.5);
		System.out.println("After removing:" + myset);
		
//		 Insertion is not possible in hashset
//		 Get specific value from HashSet - not possible 
		 
		for(Object x:myset) {
			System.out.println(x);
		}
		
		
	}
}

