package inheritance;

public class PetSmart {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.color = "black";
		dog1.gender = "male";
		dog1.eat();
		
		dog1.animalStatic();
		Dog.animalStatic();
		Animal.animalStatic();
		//Animal a1 = new Animal();
		//a1.eat();     
	
	
	}

}
