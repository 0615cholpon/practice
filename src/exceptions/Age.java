package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int varAge = 0;
   try{
            varAge = input.nextInt();
        }catch (InputMismatchException e) { //We can also type "Exception";
       System.out.println("Entered value isn't numeric");
       String word = "hi";

       try {
           System.out.println(word.charAt(5));

       } catch (StringIndexOutOfBoundsException b) {
           System.out.println("not valid index of 5");

       }
   }
   catch (Exception c){
       System.out.println("Any other exceptions happened");
 }
        System.out.println("Your age is: " + varAge);
    }
}
