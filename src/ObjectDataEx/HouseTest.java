package ObjectDataEx;

import java.util.Scanner;

public class HouseTest {
	public static void main(String[] args) {
		House h1 = new House();
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your house type: ");
		h1.type = input.nextLine();
        System.out.println("Please enter your address: ");
		h1.address = input.nextLine();
		System.out.println("Please enter how many rooms you have: ");
		h1.numRooms = input.nextInt();
		h1.info();
		
	}

}
