package day5;

public class Assignment3 {
	public static void main(String[] args) {
		
		int input = 12221, number = 0;
		int oddCounter = 0, evenCounter = 0;
		
		while (input>0) {
			int temp=input; 
			number= temp%10; 
			input /= 10;
			System.out.println(number+" "+input);
			if(number%2==0)
				evenCounter+=1;
			else
				oddCounter+=1;
		}
		
		System.out.println("# of Odds: " + oddCounter);
		System.out.println("# of Evens: " + evenCounter);
		
		
		
		
	}
}
