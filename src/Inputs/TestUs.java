package Inputs;

import java.util.Scanner;

public class TestUs {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String place;
		String School;
		String team;
		String Gossiping;
		String Food;
		String Job;
		String Wish;
		 int days;
		 int salary;
		 double height;
		 
		 
		 System.out.println("Where do you study?: ");
		 place = input.nextLine();
		 
		 System.out.println("In which school do you study?: ");
		 School = input.nextLine();
		 
		 System.out.println("What's your team's name?: ");
		 team = input.nextLine();
		
		 
		 System.out.println("What do you do when you are with your besties?: ");
		 Gossiping = input.nextLine();
		 
		 System.out.println("What do you eat for your lunch?: ");
		 Food = input.nextLine();
		 
		 System.out.println("Tell us something motivational: ");
		 Wish = input.nextLine();
		 
		 System.out.println("How many days are you studying?: ");
		 days = input.nextInt();
		 
		 System.out.println("How much money would you like to earn per year?: ");
		 salary = input.nextInt();
		 
		 System.out.println("What is your height?: ");
		 height = input.nextDouble();
		 
		 
				 

		 
		
		
		
		
	}

}
