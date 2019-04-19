package replit;
import java.util.Arrays;

public class ArraysEx {
	public static void main(String[] args) {
		String[] numbers = {"zero", "one", "two","three","four"};
		String  word="";
		String []arr = {};
		String container = "";
		int counter = 0;
	
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].contains("e")) {
				counter ++;	
		}
	}
String [] fewValues = new String [counter]; 

for(int i = 0; i < arr.length; i++) {
	int a = 0;
	if(arr[i].contains("e")) {
		a++;
		word += arr[a];	
	}
}
System.out.println(fewValues);
}
}