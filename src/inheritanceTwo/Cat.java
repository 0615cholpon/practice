package inheritanceTwo;
import inheritance.Animal;
import inheritance.Dog;
public class Cat extends Animal{
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.gender = "unknown"; // should be protected in order to see it here.
		//cat1.color -> complains 'cuz it's default but gender is protected! 
		cat1.eat();
		
		Dog d = new Dog();
		d.eat();
		
		
		
	}

}
