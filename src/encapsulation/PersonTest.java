package encapsulation;

public class PersonTest {
public static void main(String[] args) {
	Person person1 = new Person();
	person1.setName("Darika");
	person1.setAge(2);
	person1.setGender("female");
	person1.setHeight(80.0);
	person1.setWeight(15);
	//System.out.println(person1.getName());
	//System.out.println(person1.getAge());
	person1.info();
	Person.getHairCut(person1);
	
	Person person2 = new Person();
	person2.setName("James");
	person2.setGender("male");
	person2.setAge(18);
	
	Person person3 = new Person();
	person3.setAge(18);
	person3.setGender("female");
	person3.setName("Jessica");
	
	Person.getMarried(person2, person3);
}
	

}
