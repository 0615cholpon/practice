package objectdatatypes;

public class Person {
	String name;
	String gender;
	int age;
	
	// name that is declared  within the method is called local variable;
	// name that is declared inside the class is called the class is called instance variable;
	// when we have same name , java calls from local;
	public void talk() {
		String name = "James";
		System.out.println(this.name);
		// but it's considering the name from the class
		// this -> is a reference to the current object of its type. It behaves just like an object from the class type;
	}

}
