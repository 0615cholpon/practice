package methodOverriding;

public class CheckingAccount extends BankAccount{
	@Override
	public void transfer(double amount) {
		balance -= amount;
		double fee = amount/5;
		balance -= fee;
	}

}
