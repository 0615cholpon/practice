package exceptions;

public class Charger {
    public static void main(String[] args) {
        int [] nums = {34, 4, 6};
        System.out.println("Hello!");
        try{
            System.out.println(nums[1]);
            String s = "hi";
            System.out.println(s.charAt(0));
            System.exit(0); //==> just to avoid getting "Bye" but not recommended!
                                  // Program termination explicitly!

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Handled!");
        }finally {
            System.out.println("Bye!");

        }
    }
}
