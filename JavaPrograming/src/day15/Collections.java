package day15;

import java.util.ArrayList;
import java.util.List;


class Employee{
	int empno;
	String empname;
	
	void display() {
		
	}
}

public class Collections {
	// Limitations of Arrays
	/*
	 *
	 * ArrayList 
	 * 1) Heterogenius data   - allowed 
	 * 2) Insertion order     - preserved (index)
	 * 3) Duplicate elements -- allowed
	 * 4) Multiple nulls 	  - allowed
	 * 
	 * */
	
	public static void main(String[] args) {
//		Declaration
		ArrayList myList = new ArrayList<>();
//		ArrayList<String> myList = new ArrayList<String>();
//		List myList = new ArrayList();

//		Adding data elements into arraylist
		myList.add(100);
		myList.add(10.5);
		myList.add("welcome");
		myList.add(true);
		myList.add(100);
		myList.add(null);
		myList.add(null);

//		Size of an ArrayList 
		System.out.println(myList.size()); 	// returns an Integer type
		System.out.println(myList); 		// 
		
//		Remove value from ArrayList
		myList.remove(0);  // 100     
		System.out.println(myList); // 100 removed
		System.out.println(myList.remove(0)); // print new value removed 10.5
		
		myList.add("");
		System.out.println(myList);
		
//		Inserting new element in the middle of the list
		myList.add(2, "java");
		System.out.println("After insertion:" + myList);
		
		System.out.println(myList.get(3));
		
		for(Object x:myList) {
			System.out.println(x);
		}
		
		myList.clear();
		
		System.out.println("After clearing:" + myList);
		
		
		
		
	}
}
