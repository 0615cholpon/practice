package ForEachLoop;

public class Fruits {
	public static void main(String[] args) {
		String[]favoriteFruits = {"Orange", "Apples", "Mango", "Pineapple"};
// print only even # fruits
		// print odd # fruits
		for(String fruit: favoriteFruits) {
			if(fruit.length()%2 == 1) {
				System.out.println(fruit);
			}
		}
		
		
		
}
}