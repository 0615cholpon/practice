package ocaExam;

public class ABCD extends AB {
    @Override
    public void test() {
        System.out.println("C");
    }

    public static void main(String[] args) {
        A b1 = new A();
        A b2 = new C();

        b1 = (A)b2;

        A b3 = (B)b2;


    }
}
