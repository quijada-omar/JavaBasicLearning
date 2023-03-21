package day9;

public class Greetings {
//	No params No return value
	void greeting1() 
	{
		System.out.println("Hello...");
	}
	
//	No params returns value
	String greeting2(){
		return "Hello... How are you doing?";
	}
	
//	Takes params NO RETURN
	
	void greeting3(String name) {
		System.out.println("Hello " + name);
	}
	
//	Takes params Return value
	String greeting4(String name) {
		return "hello... " + name;
	}
}
