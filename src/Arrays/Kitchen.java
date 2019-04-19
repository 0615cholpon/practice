package Arrays;

public class Kitchen {
	public static void main(String[] args) {
		String [] KitchenItems = {"knife", "wooden spoons", "plates"
				+ "cups", "forks", "pan", "pot", "trash can", "fridge", "dishwasher"};
		
			
			for(int i = 0; i < KitchenItems.length; i++) {
				if(KitchenItems[i].trim().contains(" ")) {
				
				System.out.println(KitchenItems[i]);
			
		}
			}
		
			
			
			
			
			
	}
}
