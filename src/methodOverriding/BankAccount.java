package methodOverriding;

public class BankAccount {
	public double balance;
	public long accountNumber;
	public String name;
	
	
	public void info() {
		System.out.println("Customer Information\n");
		System.out.println("Name: " + this.name);
		System.out.println("Account number: " + this.accountNumber);
    	System.out.println("Balance: " + this.balance);
	}
	
	
	public void transfer(double amount) {
		balance -= amount;
		double fee = amount/10;
		balance -= fee;
		System.out.println(amount + " is transfered successfully with fee " + fee);
	}
	
	public void deposit(double addition) {
		balance += addition;
	}

}
