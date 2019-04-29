package replit;

public class CurrencyConvert {
	public static void main(String[] args) {
		String [][] money = {{"qwer", "11"}, {"som", "5"}};
		String [][] convertionRate = {{"qwer", "0.6"}, {"som", "100"}};
		System.out.println(convertC(money, convertionRate));
		
	}
	
	

public static  double convertC(String[][] money, String[][] convertionRate) {
	double result = 0.0;
	
	for(int i = 0; i < money.length; i++) {
		for(int j = 0; j < money[i].length; j++) {
			if(money[i][j].equals(convertionRate[i][j])) {
		result += Double.parseDouble(money[i][1]) * Double.parseDouble(convertionRate[i][1]);
		
		
			}		

} 


}
	return result;
}

}
