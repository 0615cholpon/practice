package Casting;

public class conversion1 {
	public static void main(String[] args) {
		
String 	text = "Sender:<Aigul Azhibaevna>. "
		+ "From Number:[550-27-97-12]. "
		+ "Message:{Cholpon, you should wear your hat!}";	

int s = text.indexOf("<")+1;
int s1 = text.indexOf(">");

String sender = text.substring(s, s1);
System.out.println("Sender: " + sender);

int num = text.indexOf("[")+1;
int num2 = text.indexOf("]");

String number = text.substring(num, num2);
System.out.println("Number: " + number);

int m = text.indexOf("{")+1;
int m1 = text.indexOf("}");

String message = text.substring(m, m1);
System.out.println("Message: " + message);

		
	}

}
