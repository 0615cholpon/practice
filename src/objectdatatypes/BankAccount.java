package objectdatatypes;

public class BankAccount {
	String type;
	int accountNumber;
	double balance;
	String holderName;
	
	
	public void deposit(double check) {
		System.out.println(check + " is depositied to your account!");
		balance += check;	
	}
	public void transfer(double trans) {
		System.out.println(trans + " $ " + " is transferred from your account!" );
		balance -= trans;
	}
	public void info() {
		System.out.println("\n Here is your bank informnation");
		System.out.println("Name: " + holderName);
		System.out.println("Balance: " + balance);
		System.out.println("Type: " + type);
		System.out.println("Account Number: " + accountNumber);
		
	}

}
