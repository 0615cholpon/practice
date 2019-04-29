package objectdatatypes;

public class AppleTest {
	public static void main(String[] args) {
		Apple app1 = new Apple();
//		app1.color = "yellow";
//		app1.size = 65;
//		app1.taste = "delicious";
//		app1.type = "golden";
//	
//		app1.ripe();
		
		app1.setValues(12, "Golden", "yellow", "sweet");
		app1.ripe();
		
	}

}
