package teamTask;

import java.util.Arrays;

public class GetNumString {
	public static void main(String[] args) {
		String str = "24ge56";
		
		System.out.println(Arrays.toString(extractNum(str)));	
	}
	public static int [] extractNum(String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			char num = str.charAt(i);
		    if(num >= 48 && num <= 57) {
			    count++;    
			}	
		}
		int [] newArr = new int[count];
		int counter = 0;
		for(int j = 0; j < str.length(); j++){
			char num1 = str.charAt(j);
			if(num1 >= 48 && num1 <= 57) {
				String n = num1 + "";
				int number = Integer.valueOf(n);
				 counter++;
				 newArr[counter-1] = number;
			 }		
		}
		return newArr;	
	}

}
