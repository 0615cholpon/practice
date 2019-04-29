package Constructors;

public class Phone {
	boolean touchscreen;
	String model;
	int memory;
	String color;
	long phoneNum;
	
	public Phone(String model, String color) {
		this.model = model;
		this.color = color;
	}
    public Phone(String model, String color, int memory, boolean touchscreen) {
//    	this.model = model;
//    	this.color = color;
    	this(model, color); //instead of writing full!
    	this.touchscreen = touchscreen;
    	
    	if(memory < 0) {
    		System.out.println("Invalid memory");
    		
    	}
    	else {
    		this.memory = memory;
    	}
    		
    }
    
  public boolean text(long phoneNum, String text) {
	  String phoneLength = String.valueOf(phoneNum);
	  if(phoneLength.length() == 10 && !text.isEmpty()) {
		  System.out.println(text + " is sent to " + phoneNum);
		  return true;
	  }else {
		  System.out.println("Invalid phone number or message!");
		  return false;
	  }
  }
  public void call (long phoneNum) {
	  String phL = phoneNum + "";
	  if(phL.length() == 10) {
		  System.out.println("Calling to "+ phoneNum);
	  }else {
		  System.out.println("Invalid phone number!");
	  }
  }
}
