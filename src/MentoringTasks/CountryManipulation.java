package MentoringTasks;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.stream.Stream;

public class CountryManipulation {
public static void main(String[] args)throws FileNotFoundException {
	BufferedReader br = new BufferedReader(new FileReader("Countries of the world.csv"));
    
    Stream<String> countriesStream = br.lines();
    Object[]countriesObject = countriesStream.toArray();
    ArrayList<Country>countriesList = new ArrayList<Country>();
    
    for(int i = 5; i < countriesObject.length; i++) {
    String []country = countriesObject[5].toString().split(",");
    
    
    String name = country[0].trim();
    int population = Integer.valueOf(country[1].trim());
    int area = Integer.valueOf(country[2].trim());
    double populationDensity = Double.valueOf(country[3].trim());
	double netMigration =  Double.valueOf(country[4].trim());
	double infantMortality = Double.valueOf(country[5].trim());
	int GPD = Integer.valueOf(country[6].trim());
	double phones = Double.valueOf(country[7].trim());
	double birthRate = Double.valueOf(country[8].trim());
	double deathRate = Double.valueOf(country[9].trim());
	
	Country c = new Country(name, population, area, populationDensity, netMigration, infantMortality, GPD, phones, birthRate, deathRate);
//    System.out.println(c.population);
	countriesList.add(c);
    }
    
    //System.out.println(countriesList.size());
    int leastPhones = Integer.MAX_VALUE; 
    Country countryWithPoorPeople = null;
    for(Country c : countriesList) {
    	if(c.phones < leastPhones && c.phones > 0) {
    		//leastPhones = c.phones;
    		countryWithPoorPeople = c;
    	}
    }
    System.out.println(countryWithPoorPeople.name);
    
}
}
