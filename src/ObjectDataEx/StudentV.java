package ObjectDataEx;

public class StudentV {
	Student name;
	int age;
	
	
public void read() {
	System.out.println(name + " is reading!");
}
public void read(Book book) {
	System.out.println(name + " is reading " + book.title + "by " + book.author + ".");
}
}
