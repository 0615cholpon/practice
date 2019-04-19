package StringManipulation;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String school = "Cybertek";
		
//		//System.out.println(school.substring(2, 5));
//		String capWord = school.substring(2, 5).toUpperCase();
//		System.out.println(capWord);
//		System.out.println(school.substring(0, 2) + capWord + school.substring(5, 8) );
//		
//		
//	String name = "My name is: Cholpon";
//	int colon = name.indexOf(":");
//	//System.out.println(colon);
//	String nameCut = name.substring(colon + 2).toUpperCase();
//	System.out.println(nameCut);
//	
//	String result = name.substring(0, colon + 1) + nameCut; 
////	System.out.println(result);
////	
//		String word;
//		System.out.println("Please enter your word: ");
//		word = input.nextLine();
//		String result = "";
//		
//		for (int i = word.length()-1; i >= 0; i--) {
//			char letter = word.charAt(i);
//			result += letter + "";
//			if(result.equals(word)) {
//				System.out.println("Palindrome!");
//				
//			}else {
//				System.out.println("Not Palindrome!");
//			}
//				
//		}
//		System.out.println(result);
		
		String countryCity = "Kyrgyzstanbishkek";
		
//		String cutWords = countryCity.substring(0, 10);
//		
//        String  city = countryCity.substring(10);
//		
//		String capcity = city.substring(0, 1).toUpperCase();
//		city= capcity + city.substring(1);
//	    System.out.println(capcity);
//		String putTogether = cutWords + " " + city;
//		System.out.println(putTogether);
		
		String word = "shabolotovacholpon";
		String lastName = word.substring(0, 11);
		String correctLastName = lastName.replace('s', 'S');
		
		String firstName = word.substring(11);
		String correctFirstName = firstName.replace('c', 'C');
		
		String together = correctLastName + " " + correctFirstName;
		System.out.println(together);
		
	}

}
