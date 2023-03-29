package day15;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {

	
	
	public static void main(String[] args) {
	
//		HashMap declaring
//		Map hm = new HashMap();
		HashMap<Integer, String> hm = new HashMap<>();
		
//		Adding database to hashmap
		hm.put(101, "John");
		hm.put(102, "Scott");
		hm.put(103, "John");
		hm.put(104, "Mary");
		hm.put(101, "David");
		
		System.out.println(hm);
		System.out.println(hm.size());
		
		// Remove pair
		
		hm.remove(103);
		System.out.println("After removing pair:" + hm);
		System.out.println(hm.get(102));
		
//		Print only keys from hashmap
		System.out.println(hm.keySet());
		
//		Print values from hashmap
		for(Object k:hm.keySet()) {
			System.out.println(k+":\t"+hm.get(k));
		}
		
		hm.clear();
		System.out.println(hm);
		
	}
}
