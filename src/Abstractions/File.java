package Abstractions;

public abstract class File {
	
	String name;
	int count;
	
	public abstract void open();
	public void close() {
		System.out.println("File is closing!");
	}

}
