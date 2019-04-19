package NestedLoop;

import java.util.Random;

public class UniqueNumGen {
	public static void main(String[] args) {
		Random sunny = new Random();
		
		String result = "";
		int count = 0;
		for (int i = 0; i < 9; i++) {
			int ii = sunny.nextInt(10);
			
			while(result.contains(ii + "")) {
				ii = sunny.nextInt(10);
				count++;
			}
			result+=ii;
		}
		System.out.println(count);
		System.out.println(result);
	}

}
