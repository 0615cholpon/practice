package ocaExam;

public class Appl {
    String myStr = "7007";

    public void doStuff(String str){
        int myNum = 0;

        try {
            String myStr = str;
            myNum = Integer.parseInt(myStr);
        }catch (NumberFormatException ne){
            System.err.println("Error");
        }
        System.out.println("My str: " + myStr + " my num: " + myNum);
    }

    public static void main(String[] args) {
        Appl a = new Appl();
        a.doStuff("9009");
    }
}
