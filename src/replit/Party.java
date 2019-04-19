package replit;

import java.util.Scanner;

public class Party {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter guest name:");
		String guest = input.nextLine();
		
		System.out.println("Do you want to enter new guest name:");
		String YesorNo = input.nextLine();
		boolean check = true;
		String guest1 ="";
		while(check) {
			if(YesorNo.equals("yes")) {
				System.out.println("Please enter guest name:");
				 guest1 = input.nextLine();
				 System.out.println("Do you want to enter new guest name:");
				 YesorNo = input.nextLine();
				
			}if(YesorNo.equals("no")) {
				System.out.println("Guest's list: " + guest + ", " + guest1);
				break;
			}
			}
			
		}
	}

