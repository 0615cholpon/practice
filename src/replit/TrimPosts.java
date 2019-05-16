package replit;

import java.util.ArrayList;

import VATasks.trimSpaces;

public class TrimPosts {
	
	public static void main(String[] args) {
		String []test = {"abc", "foo bar", "123"};
		
	System.out.println(trim_posts(test, 3));
		
	}

	public static StringBuilder trim_posts(String[] r,int size) 
	  {
		StringBuilder test = new StringBuilder();
		for(int i = 0; i < r.length; i++) {
			if(r[i].length() <= size) {
				test.append(r[i] + "<br>");
			}
		}
		return test;
	  
	  }
	  
} 


