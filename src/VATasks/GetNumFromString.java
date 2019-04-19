package VATasks;

public class GetNumFromString {
public static void main(String[] args) {
String word = "I wrote [5] lines of code";
 int start = word.indexOf('[')+1;
 int end = word.indexOf(']');
 String total = word.substring(start, end);
System.out.println("Lines of code: " + total);
//System.out.println("Lines of code: " + word.substring(word.indexOf('[') +1, (word.indexOf(']'))));
 int count = Integer.valueOf(total);
 System.out.println("Converted to int: " + count);
 if(count > 10) {
	 System.out.println("Code line is greater than 10");
 }
 else {
	 System.out.println("Less than 10");
 }
}
}
