package StringManipulation;

public class CheckAccount {
	public static void main(String[] args) {
		String s = "Account number: 55557278";
	// Check if "number" is starting with upper case or lower case;
	// Print "Starts with Upper case" if "Number"
	// Print "Starts with Upper case" if "number" 
	
		
//		int space = s.indexOf(" ") + 1;
//		// System.out.println(space);
//		
//		if (s.charAt(space)== 'n') {
//			System.out.println("Starts with lower case");
//		}
//		else {
//			System.out.println("Starts with upper case");
//		}
		//DONE
//  ====================================================
	//  Print "Valid account length" if valid
		// Print "Invalid account length" if invalid;
//		int firstIndex = s.indexOf(":") + 2;
//		String accountNumber = s.substring(firstIndex);
//		if (accountNumber.length()==8) {
//			System.out.println("Valid account number length");
//		}
//		else {
//			System.out.println("Invalid account number length");
//		}
//		
	//================================================
		
		// print
		String account;
		
		int indexOffirst = s.indexOf(":") +2;
		if(s.charAt(indexOffirst)== '2') {
			account = s.substring(indexOffirst, indexOffirst + 6);
		}
		else {
			account = s.substring(indexOffirst, indexOffirst + 5);
		}
		System.out.println("Account Number: " + account);
	}
	

}
