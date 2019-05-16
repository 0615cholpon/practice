package replit;

public class CamelTest {
	public static void main(String[] args) {
		String name = "i love java";
	    System.out.println(camelCase(name));
	    
	}
public static String camelCase(String in){
		
		
		in = in.toLowerCase().trim();
		String[]convertCamel = in.split(" ");
		String total = "";
		for(int i = 0; i < convertCamel.length; i++){
		  convertCamel[i] = (convertCamel[i].substring(0, 1)).toUpperCase() 
		  + convertCamel[i].substring(1, convertCamel[i].length());
		  
		  total += convertCamel[i] + " ";
		 
		}
		
		return total.trim();
	}
public int population(String city){
	String[]cityList = new String[1000];
	 for(int i = 0; i < cityList.length; i++){
	
	   
	 }
		
		return -1;  
	}

}
