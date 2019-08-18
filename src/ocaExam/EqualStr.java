package ocaExam;

public class EqualStr {
    public static void main(String[] args) {
        String str = " ";
        str.trim();
        System.out.println(str.equalsIgnoreCase("") + " " + str.isEmpty());
    }
}
