package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        File file = new File("/Users/chopa/Desktop/charAandB.txt");


            Scanner input = new Scanner(file);
            System.out.println(input.nextLine());
            Thread.sleep(2000);

        System.out.println("end of the program");
    }
}
