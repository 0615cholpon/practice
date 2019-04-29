package objectdatatypes;

public class Test {
	public static void main(String[] args) {
		Watch watch1 = new Watch();
		watch1.price=200.00;
		watch1.brand = "Swatch";
		//System.out.println(watch1.brand);
		watch1.color = "dark brown";
		//System.out.println(watch1.color);
		
		Watch watch2 = new Watch();
		watch2.price = 499.99;
		System.out.println(watch2.price);
		watch2.style = "diamond";
		//System.out.println(watch2.style);
		watch1.tick();
		watch2.tick();
	
	}

}
