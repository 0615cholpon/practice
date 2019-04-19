package Casting;

public class ConversionTask {
	public static void main(String[] args) {
    String year = "Published on Feb 12, 2018";
    String year1 = year.substring(21);
    System.out.println(year1);
    //double convert = Double.valueOf(year1);
    int c = Integer.valueOf(year1);
    System.out.println(c);
    
    if(c <= 2019) {
    	System.out.println("Valid year!");
    }
    else {
    	System.out.println("Invalid year!");
    }
    
    
	}

}
