package replit;

public class Profit {
	public static void main(String[] args) {
		System.out.println(c_profits(60, 10));
	}
public static String c_profits(int buy_Price, int sell_Price) {
	
	if(buy_Price > sell_Price) {

	return  "loss"; 
	}else if(buy_Price == sell_Price){
		return "no profit";
	}else {
		return "profit";
	}
	
}
}
