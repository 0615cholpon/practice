package mockInterview;

import java.util.Scanner;

public class primeNumbers {
    public static void main(String[] args) {
        System.out.println("enter number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.nextLine();
        boolean test = false;
        // Write a java program to check a number is prime or not?
        if(num < 2){
            System.out.println("not prime number");
            return;
        }
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                test = true;
                System.out.println("not prime number");
                break;
            }
        }
        if(!test){
            System.out.println("prime number");
        }

    }
}
