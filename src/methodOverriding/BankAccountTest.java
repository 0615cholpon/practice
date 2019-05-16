package methodOverriding;

public class BankAccountTest {
	public static void main(String[] args) {
//		BankAccount b1 = new BankAccount();
//		b1.accountNumber = 1234567890L;
//		b1.balance = 4000;
//		b1.name = "Cholpon Shabolotova";
//		b1.transfer(20);
//		b1.info();
//		b1.deposit(30);
//		b1.info();
		
		SavingsAccount acc = new SavingsAccount();
		acc.name = "Cholpon Shabolotova";
		acc.accountNumber = 123456789L;
		acc.balance = 20000;
		acc.interestIncome = 10;
		acc.transfer(200);
		acc.info();

	}

}
