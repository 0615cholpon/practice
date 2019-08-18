package wednesdayRecap;

public class Student {
    String firstName;
    String lastName;
    static int studentCount;


    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        studentCount++;
        System.out.println("Added Student: " + this.firstName + " " + this.lastName);
        System.out.println("Number of students: " + studentCount);
    }
}
