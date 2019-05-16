package methodOverriding;

public class SavingsAccount extends BankAccount{
	double interestIncome;
	@Override
	public void transfer(double amount) {
		balance -= amount;
		double fee = amount/20;
		balance -= fee;
	}
	
	@Override
	public void info() {
		System.out.println("Customer Information\n");
		System.out.println("Name: " + this.name);
		System.out.println("Account number: " + this.accountNumber);
    	System.out.println("Balance: " + this.balance);
    	System.out.println("Interest income: " + this.interestIncome);
		
	}
	

}
