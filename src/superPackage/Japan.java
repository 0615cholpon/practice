package superPackage;

public class Japan extends Country{
	
	
	public void sakura() {
		//super.anthem();
		System.out.println("Sakura Method");
		
	}
	@Override
	public void anthem() {
		super.anthem();
		System.out.println("Some extra prints!");
	}
	
	
	
	
	
//	public static void main(String[] args) {
//		Japan j = new Japan();
//		final int AGE = 45; // age is 45 FOREVER! BUT we can use lower case too!
//		System.out.println(AGE);
//
//	}
	
	
	

}
