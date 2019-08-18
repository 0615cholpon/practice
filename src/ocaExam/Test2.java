package ocaExam;

public class Test2 {
    void readCard(int cardNo){
        System.out.println("Reading card");
    }

    void checkCard(int cardNo)throws RuntimeException{
        System.out.println("Checking card");
    }
    public static void main(String[] args) {
        Test2 t = new Test2();
        int cardNo = 1234;
        t.readCard(cardNo);
        t.checkCard(cardNo);


    }
}
