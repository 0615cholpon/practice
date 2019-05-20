package superPackage;

public class Country {
	int population;
	String name;
	final String capital;
	public Country(String cap) {
		this.capital = cap;
	}
	public Country() {
		capital = "Something";
		
	}
	
	public void anthem() {
		System.out.println("Anthem method in Country Class!");
		
	}

	

}
