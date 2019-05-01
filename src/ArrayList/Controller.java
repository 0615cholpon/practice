package ArrayList;

import java.util.ArrayList;

public class Controller {
	public static void main(String[] args) {
		ArrayList<Integer> ages = new ArrayList<Integer>();
		ages.add(120);
		ages.add(0, 1);
		System.out.println(ages);
		int age = 23;
		Integer conAge = age;
		System.out.println(conAge);
	}

}
