package VATasks;

import java.util.Scanner;

public class domainCut {
public static void main(String[] args) {
Scanner  input = new Scanner(System.in);
System.out.println("Enter url: ");
String url = input.nextLine();
if(url.startsWith("www.")) {
	System.out.println("www is present");
	
}else {
	System.out.println("Invalid format");
	return;
}
//www.etsy.com => 12 length
// url.length()- 4 =>will give the position of the (.)
int dotIndex = url.length() - 4;
if(url.charAt(dotIndex) == '.') {
	System.out.println(". is there before extension");
}
else {
	System.out.println(". might be misplaced");
}
String domain = url.substring(4, url.length() -4);
System.out.println("Domain: " + domain);
String extention = url.substring(dotIndex + 1);
System.out.println("Extension: " + extention);
}
}
