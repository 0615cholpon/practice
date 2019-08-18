package ocaExam;

public class CheckingTest {
    public static void main(String[] args) {
        CheckingAccount acct = new CheckingAccount((int)(Math.random() * 1000));
       acct.amount = 0; //--> CORRECT!
       acct.changeAmount(-acct.amount); //--> CORRECT!
       acct.changeAmount((-acct.getAmount())); //--> CORRECT!

        System.out.println(acct.getAmount());
    }
}
