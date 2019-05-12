package MentoringTasks;

public class Country {
	String name; 
	int population;
	int area;
	double populationDensity;
	double netMigration; 
	double infantMortality;
	int GPD;
	double phones;
	double birthRate;
	double deathRate;
	public Country(String name, int population, int area, double populationDensity,
	double netMigration, double infantMortality, int GPD, double phones, double birthRate,
	double deathRate) {
		this.name = name;
		this.population = population;
		this.area = area;
		this.populationDensity = populationDensity;
		this.netMigration = netMigration;
		this.infantMortality = infantMortality;
		this.GPD = GPD;
		this.phones = phones;
		this.birthRate = birthRate;
		this.deathRate = deathRate;
	
	}
	

}
