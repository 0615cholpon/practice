package exceptions;

public class Uber {
    public static void main(String[] args) {
        Driver driver1 = new Driver();
        try {
            driver1.setName("James Bond");
            driver1.setAge(-25);
        } catch (InvalidAgeException e) {
            System.out.println("Catch block from age!");
        } catch (Exception e){
            System.out.println("Catch block for general!");
            //System.out.println("Invalid age!");
        }

        try {
            driver1.setLocation("IL");
        } catch (InvalidLocationException e) {
            System.out.println("Catch from location!");
        }

        driver1.info();
        Exception ex = new Exception();
        StringIndexOutOfBoundsException s = new StringIndexOutOfBoundsException();


    }
}
