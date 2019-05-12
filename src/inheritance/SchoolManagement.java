package inheritance;

public class SchoolManagement {
	public static void main(String[] args) {
		InClassStudent student = new InClassStudent();
		student.name = "Cholpon";
		student.age = 29;
		student.batchID = 11;
		student.study("JAVA");
		student.takeExam(99);
		System.out.println(student.grade);
		
		OnlineStudent student1 = new OnlineStudent();
		student1.name = "Someone";
		student1.age = 27;
		student1.batchID = 11;
		student1.study("JAVA");
		student1.takeExam(89);
		System.out.println(student1.grade);
	
	}

}
