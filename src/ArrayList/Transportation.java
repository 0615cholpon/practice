package ArrayList;

import java.util.ArrayList;

public class Transportation {
	public static void main(String[] args) {
		ArrayList <String> names = new ArrayList<>();
		System.out.println(names.size());
		names.add("Adam");
		names.add("James");
		System.out.println(names);
		System.out.println(names.size());

		names.add(0, "Albina");
		System.out.println(names);
		
		System.out.println(names.get(1));
		
		System.out.println(names.contains("James"));
		
		System.out.println(names.indexOf("James"));
		
		System.out.println(names.remove("James"));
		System.out.println(names);
		names.remove(0); // we can remove through the element name or index;
		System.out.println(names);
		names.add("James");
		names.add("James");
		System.out.println(names);
		System.out.println(names.indexOf("James"));
		//names.clear();
		System.out.println(names.isEmpty());
		System.out.println(names);
		

	 
		

	}

}
