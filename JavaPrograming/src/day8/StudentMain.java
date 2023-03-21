package day8;

public class StudentMain {
	public static void main(String[] args) {
//		Student stu = new Student();
		// Approach 1: Using reference variable		
		//		stu.sid = 102;
		//		stu.sname = "Chester";
		//		stu.grade = 'A';
		//		

		// Aproach 2: using method
		//		stu.setData(102, "Chester",'B');

		// Aproach 3 using constructor
		Student stu = new Student(102, "John", 'B');
		
		stu.show();
	}
}
