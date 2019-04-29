package objectdatatypes;

public class BankAccountCheck {
	public static void main(String[] args) {
		BankAccount name1 = new BankAccount();
		name1.accountNumber = 123456789;
		name1.balance = 4000.00;
		name1.holderName = "Cholpon Shabolotova";
		name1.type = "checking";
		name1.info();
		
		System.out.println();
		name1.info();
		name1.deposit(100);
		name1.transfer(20);
		name1.info();
		
	}

}
