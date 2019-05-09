package replit;

public class Carpet {
	public static void main(String[] args) {
		Carpet c = new Carpet();
		System.out.println(c.totalPrice);
		Carpet c2 = new Carpet(20.0, 20.0, 2.0, false);
		System.out.println(c2.totalPrice);
  
	}
	
	  public double width,length,unitPrice,totalPrice;
	  public boolean isPersian;
	
	 
	 
	 public Carpet(){
	   this.width = 300.0;
	   this.length = 300.0;
	   this.totalPrice = 200.0;
	   this.isPersian = false;
	   this.unitPrice = 0;
	 }
	 
	 public Carpet(double width, double length, double unitPrice, boolean isPersian){
	   this.width = width;
	   this.length = length;
	   this.unitPrice = unitPrice; 
	   this.isPersian = isPersian;
	   this.totalPrice = (width + length) * unitPrice;
	 
	 if(isPersian){
	   totalPrice += 200;
	  
	   
	 }
	 }
	   
	 }
	  
	  


