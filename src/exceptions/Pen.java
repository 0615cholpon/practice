package exceptions;

import java.util.Scanner;

public class Pen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the word: ");
        String word = input.nextLine();
        System.out.println("Start of the program!");
        String ss = null;


        try {
            System.out.println(word.charAt(2));
            System.out.println(ss.length());


        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Invalid word");
        }catch (Exception e){
            System.out.println("ss is pointing to a null!");
        }
        System.out.println("End of the program!");
  }
}
