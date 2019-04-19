package Operator;

public class LogicalAnd {

public static void main(String[] args) {
int age = 22;
String name = "John";
String weather = "rainy";

boolean check = (age >= 21) & ((name = "Adam") == "Adam");
System.out.println(check);
System.out.println(name);	
	
	String username = "jbond";
	String passwd = "jbond123";
	
	
boolean login = (username == "jbond") & (passwd == "Cholpon1");
System.out.println(username);
System.out.println(passwd);
System.out.println(login);
	
	
	
	
	
}	
	
	
}
