package Casting;

public class PrimitiveCasting {
	public static void main(String[] args) {
		short s = 45;
		int age = s;
		System.out.println(age);
		int size = age;
		System.out.println(size);
		
		//byte b = size; -->NO 'coz variable int is bigger than byte;
		// also byte is smaller than short for this reason we need to put (byte)short;
		//byte b = (byte)size;
		//System.out.println(b);
		//int num1 = 47;
		//short num2 = (short)num1;
		
		String str = "0.81";
		double sec = Double.valueOf(str);
		System.out.println(sec + 1);
		
		
		
		
		
		
		
		
	}

}
