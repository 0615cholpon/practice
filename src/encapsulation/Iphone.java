package encapsulation;

public class Iphone {
	private String model;  //Encapsulating!
	private int memory;
	
	public void setMemory(int memory) {
		if(memory >= 128) {
			this.memory = memory;
				
		}else {
			System.out.println("Invalid memory!");
		}
	}
	public int getMemory() {
		return this.memory;
	}
	public void info() {
		System.out.println("Model: " + this.model);
		System.out.println("Memory: " + this.memory);
	}

}
