package replit;

public class Ingredients {
	public static void main(String[] args) {
		boolean check = getThunderBlazz(false, false, 1, 2, 3);
		if(check) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
public static boolean getThunderBlazz(boolean available,boolean gift, 
		int ingredient1, int ingredient2, int ingredient3) {
	

	
	if((available==true || gift==true || (ingredient1 == 1 && ingredient2 == 2 && 
		ingredient3 == 3) || (ingredient1 == 3 && ingredient2 == 1 && ingredient3 ==2))) {
		return true;
	}else {
		return false;
	}
}
}
