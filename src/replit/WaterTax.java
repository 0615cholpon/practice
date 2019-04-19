package replit;

public class WaterTax {
	public static void main(String[] args) {
		System.out.println(waterTax(151.00));
	}
public static double waterTax(double units) {
	double bill = 0.0;
	if(units <= 50) {
	return bill = units * 0.60;
	}else if(units > 50 && units <= 100) {
		return bill = (units * 0.90);
	}else if(units > 100 && units <= 150) {
		return bill = (units * 0.90) + 50.00;
	}else if(units > 150) {
		return bill = (units * 0.90) + 100;
	}
	return bill;
}
}
