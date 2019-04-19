package forLoop;

import java.util.Scanner;

public class MOndayTask {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter the number: ");
		int x = input.nextInt();
int num = 0;
for(num = 1; num <= x; num ++) {
	if(num % 2 == 0 && num % 3 == 0) {
		System.out.print(num * num + " ");
	}
	
}
		
	}

}
