package stackAndHeap;

import Constructors.Item;

public class GC {
	public static void main(String[] args) {
		GC g = new GC();
		g = null;
		String name = new String ("James");
		name = null;
		Item keys = new Item("Key", 4);
		Item adaper = new Item("Mac Adapter", 20);
		keys = adaper;
		keys = null;
		System.gc();
		System.out.println("End of Program!");
	}
	
	public void finalize() {
		System.out.println("Finalize custom method!");
	}

}
