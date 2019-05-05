package encapsulation;

public class Person {
	private String name;
	private String gender;
	private int age;
	private double height;
	private double weight;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		if(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")) {
			this.gender = gender;
		}else {
			System.out.println("Gender should be either male or female");
		}
			
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age >= 0 && age <= 120) {
			this.age = age;	
		}else {
			System.out.println("Invalid age!");
		}
		
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if(height > 0) {
			this.height = height;
		}else {
			System.out.println("Incorrect height measurement");
		}
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		if(weight > 0) {
			this.weight = weight;
		}else {
			System.out.println("Please check one more time!");
		}
	}
	public void info() {
		System.out.println("Information about the Person:");
		System.out.println();
		System.out.println("Name: " + this.name);
		System.out.println("Gender: " + this.gender);
		System.out.println("Age: " + this.age);
		System.out.println("Height: " + this.height);
		System.out.println("Weight: " + this.weight);
	}
	public static void getHairCut(Person object) {
		if(object.gender.equalsIgnoreCase("male")) {
			System.out.println(object.name + " is getting haircut at Men Barbershop!");
			
		}else if(object.gender.equalsIgnoreCase("female")) {
			System.out.println(object.name + " is getting haircut at Women Hair Salon!");
		}else {
			System.out.println("Not able to get haircut!");
		}
		
	}
	public static void getMarried(Person object1, Person object2) {
		if (object1.age >= 18 && object2.age >= 18) {
			if (object1.gender.equalsIgnoreCase("man") && object2.gender.equalsIgnoreCase("female")) {

			} else if (object2.gender.equalsIgnoreCase("female") && object1.gender.equalsIgnoreCase("male")) {

				System.out.println("Valid marriage!");

			} else {
				System.out.println("Invalid marriage!");
			}
		} else {
			System.out.println("Too young to get married!");
		}

	}
	

}
