package mockInterview;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        a = a * b; // 50
        b = a / b; // 10
        a = a / b; // 5
        System.out.println(a);
        System.out.println(b);

    }
}
