package inheritance;

public class Table {
	public static void main(String[] args) {
		Table table = new Table();
		Dog dog = new Dog();
		dog.age = 2; // age is coming from parent class Animal
						// We are extending Dog from Animal class;
		dog.breed = "shepherd"; // breed is coming from Dog class;
		dog.gender = "male";
		dog.eat();
	
	}

}
