package SwitchStatement;

import java.util.Scanner;

public class AgeValidator {
public static void main(String[] args) {
	// write a program that asks age from the user
	// switch based on the age
	// if age 16 print "almost done with high school"
	// 24 print "almost done with university
	// for everything else "keep living"
	
// make sure entered age is only 0-120--> 
	
	Scanner input = new Scanner (System.in);
	System.out.println("Please ener your age: ");
	 int age = input.nextInt();
	 
if(age > 0 && age <= 120) {
switch(age) {
case 16:
	System.out.println("Almost done with high school");
	
	break;
case 24: 
	System.out.println("Done with university");

default:
	System.out.println("Keep living!");
	break;
}
}
else {
	System.out.println("Invalid age!");
}
}
}


