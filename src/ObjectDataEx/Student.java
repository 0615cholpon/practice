package ObjectDataEx;

public class Student {
	public Student() { // --> constructor!
		
	}
	String name;
	int age;
	String email;
public void read() {
	System.out.println(name + " is reading");
	
}
public void read(String author, String title, int pages) {
	
	// It accepts Book data type and simply print out “student %studentName 
	// is reading %bookTitle by %authorName” 
	
	System.out.println(name + " is reading " + title + " by " + author);
}

}
