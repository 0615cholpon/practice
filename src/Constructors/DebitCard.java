package Constructors;

public class DebitCard {
	String cardNumber;
	String holderName;
	String type;
	int pin;
	double balance;
	public DebitCard(String cardNumber, String holderName, int pin, double balance, String type) {
		this.cardNumber = cardNumber;
		this.holderName = holderName;
		this.pin = pin;
		this.balance = balance;
		
		if(type.equalsIgnoreCase("Mastercard") || type.equalsIgnoreCase("Visa")) {
			this.type = type;
			
		}else {
			System.out.println("Invalid type!");
			
		}
		String pinL = pin + "";
		if(pinL.length()== 4) {
			this.pin = pin;
			
		}else {
			System.out.println("Invalid pin");
			
		}
		
		String cardL = cardNumber + "";
		if(cardL.length() == 16) {
			this.cardNumber = cardNumber;	
		}else {
			System.out.println("Invalid card number");	
		}
		
		
	}

}
