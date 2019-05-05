package Statics;

public class BestBuyTest {
	public static void main(String[] args) {
		BestBuy b1 = new BestBuy();
		b1.location = "Chicago Downtown";
		
		BestBuy b2 = new BestBuy();
		b2.location = "Des Plaines, IL";
		
		BestBuy b3 = new BestBuy();
		b3.location = "O'Hare area";
		//System.out.println(b2.location);
		
		// How to access to static fields/variables?!
		// We need to invoke from the class!
		
		//BestBuy.numOfComputers = 90;
		//System.out.println(b1.numOfComputers);//still will show the #. But incorrect!
		
//		b3.numOfComputers = 445;
//		System.out.println(b3.numOfComputers);
//		//Whenever/whoever changes the value, it'll be updated!
//		b1.sell();
//		b2.sell();
//		System.out.println(b3.numOfComputers);
		System.out.println(BestBuy.numOfComputers);
		
		
		
		
		
		}

}
