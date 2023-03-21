package day9;

public class GreetingsMain 
{
	public static void main(String[] args) 
	{
	
		Greetings greetings = new Greetings();
		greetings.greeting1();
		
		String str = greetings.greeting2();
		System.out.println(str);
		
		System.out.println(greetings.greeting2());
		
		String str1 = greetings.greeting4("Chester");
		System.out.println(str1);
	}
}
