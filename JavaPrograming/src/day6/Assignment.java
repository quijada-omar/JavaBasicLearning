package day6;

public class Assignment {
	public static void main(String[] args) {
		//		1) Find sum of element in array
		int input[] = {1,2,3,4,5}, sum = 0;
		//		for (int i : input) 
		//			sum += i;
		//		System.out.println(sum);

		//		2) Print even and odd numbers from array

		int input2[] = {1,2,3,4,5}, even = 0, odd = 0;

		for(int i = 0; i<input2.length; i++) {
			if(input2[i]%2==0) {
				even++;
			}
			else { 
				odd++;
			}
		}
		System.out.println("Even: " +even+" odd: "+odd);

	}
}
