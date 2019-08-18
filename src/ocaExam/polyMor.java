package ocaExam;

public class polyMor {
    public static void main(String[] args) {
        Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();
        b1 = (Base)b3;
        Base b4 = b3;
        b1.test();
        b4.test();

    }
}
