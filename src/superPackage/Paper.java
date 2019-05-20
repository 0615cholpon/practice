package superPackage;

public class Paper {
	static String name;
	final static int numOfPapers;//if u don't give value then u can do it in static block
	static {
		numOfPapers = 2;
		name = "Cholpon";
		System.out.println(name);
	}
	public static void main(String[] args) {
//		Paper.numOfPapers = 2;
		System.out.println(Paper.numOfPapers);
//		Paper p1 = new Paper();
//		p1.numOfPapers = 34;
//		System.out.println(p1.numOfPapers); //will be 2 'cuz our variable is static and we can 
//		                                    //use directly class without creating an object!
//		System.out.println(Paper.numOfPapers);

	}

}
