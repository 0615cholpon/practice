package ObjectDataEx;

public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student();
		student.name = "Cholpon";
		student.age = 28;
		student.email = "cshabolotova@gmail.com";
		
	student.read();
	student.read("Khaled Hussein", "Running Kite", 346);
		
	}

}
