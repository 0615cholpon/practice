package ocaExam;

public class TaskStringBuilder {
    public static void main(String[] args) {
        System.out.println(maskCC("1234-5678-9101-1121"));
    }
    public static String maskCC(String creditCard){
        String x = "XXXX-XXXX-XXXX-";
        //return x + creditCard.substring(15, 19); Another way!
        StringBuilder sb = new StringBuilder(x);
        //sb.append(creditCard, 15, 19);
        return sb.toString();
    }
}
