package objectdatatypes;

public class Apple {
	// instance variables
	// all  
	// type != null --> is type not pointing to anywhere 
	
	int size;
	String type;
	String color;
	String taste;

public void setValues(int sizeValue, String typeValue, String colorValue, String tasteValue) {
	// if u set values as the original one, they'll be local values;
	// BUT if you put (this.size --> we mention about instance variables;
	size = sizeValue;
	type = typeValue;
	color = colorValue;
	taste = tasteValue;
		
	}
	
	
public void ripe() {
	if(type != null) {
		System.out.println("Type: " + type);	
	}else {
		System.out.println("Sorry, type is null!");
	}
	if(size !=0) {
		System.out.println("Size: " + size);	
	}
	else {
		System.out.println("Sorry, size is 0");
	}

	if(color != null) {
		System.out.println("Color: " + color);
		
	}else {
		System.out.println("Sorry, it's null");
	}
	
    if(taste != null) {
	System.out.println("Taste: " + taste);
    } else {
    	System.out.println("Sorry, it's null!");
    }

}

}
