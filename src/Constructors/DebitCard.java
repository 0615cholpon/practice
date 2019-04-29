package Constructors;

public class DebitCard {
	long cardNumber;
	String holderName;
	String type;
	int pin;
	double balance;
	public DebitCard(long cardNumber, String holderName, int pin, double balance, String type) {
		this.cardNumber = cardNumber;
		this.holderName = holderName;
		this.pin = pin;
		this.balance = balance;
		
		if(!type.equals("Mastercard") || !type.equals("Visa")) {
			System.out.println("Invalid type!");
		}else {
			this.type = type;
		}
		String pinL = pin + "";
		if(pinL.length()= 4) {
			System.out.println("Invalid pin");
		}else {
			this.pin = pin;
		}
		
		String cardL = cardNumber + "";
		if(cardL.length() != 16) {
			System.out.println("Invalid card number");
		}else {
			this.cardNumber = cardNumber;
		}
		
		
	}

}
