package replit;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSwap {
	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<>();
		list.add("school");
		list.add("pen");
		list.add("bag");
		list.add("home");
		System.out.println(list);
		swap(list, 0, 3);
		System.out.println(list);
		
	}
	 public static ArrayList<String> swap(ArrayList<String> list,int pos1,int pos2){
	  Collections.swap(list, pos1, pos2);
	  return list;
		  
		  
		  
		  
		  
		  }

}
