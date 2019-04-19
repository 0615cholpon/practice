package Casting;

import java.util.Scanner;

public class Conversion2 {
	public static void main(String[] args) {
//String garage = ("Toyota, Nissan, "
//				+ "Honda, BMW, Mazerati, "
//				+ "Ford").toLowerCase();
//System.out.println("We have these cars in the garage: " + garage);
//
//
//if(garage.isEmpty()) {
//	System.out.println("no cars in garage!");
//	}else {
//	
//		if(garage.contains("toyota") || garage.contains("nissan")) {
//		System.out.println("There is a japanese car in the garage!");
//	}else {
//		System.out.println("No Japanese cars!");
//	} 
//	
//	if(garage.contains("bmw")) {
//		System.out.println("There is a german car in the garage!");
//	}else {
//		System.out.println("No german cars");
//	}
//	
//	if (garage.contains("mazerati")) {
//		System.out.println("There is an Italian car in the garage!");
//	}else {
//		System.out.println("No Italian car!");
//	}
//	
//	if (garage.contains("jaguar")){
//		System.out.println("It's a British car!");
//	}else {
//		System.out.println("No British cars!");
//	}
////}
//
//String name = "Beauty";
//char a = name.charAt(2);
//System.out.println(a);
//
//String nameCap = (a + "").toUpperCase();
//System.out.println(nameCap);
		

String str = "Cybertek";
String str1 = str.substring(2, 5).toUpperCase();
String str2 = str.replace("ber", str1);
System.out.println(str2);

/// indexOf() & charAt();

String str3 = "Cybertek";
String str4 = (str3.charAt(4)+ "").toUpperCase();
String str5 = str3.replace("r", str4);
System.out.println(str5);
//////////////////////////////////////////////////////
String name = "Aigul";
String name1 = (name.charAt(2)+ "").toUpperCase();
String name2 = name.replace(name.charAt(2)+ "", name1);
System.out.println(name2);
/////////////////////////////////////////////////////////
Scanner input = new Scanner(System.in);
System.out.println("Please enter your word: ");
String country = input.nextLine();

int middle = country.length()/2;
String country1 = (country.charAt(middle)+ "").toUpperCase();
String capCountry = country.replace(country.charAt(middle) + "", country1);
System.out.println(capCountry);
///////////////////////////////////////////////////////////






 





	}

}
