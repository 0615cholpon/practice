package ocaExam;

public class RandomA {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Duke");
        String str1 = sb.toString();
        String str2 = str1;
        System.out.println(str1 == str2);

    }
}
