package MentoringTasks;

public class Phone extends Device{
	String contact;
	String pictures;
	String assistantName;
	String phoneModel;
	
	public void madeCall() {
		System.out.println("Calling " + contact);
	}
	public void wakeUpWithVoice() {
		if(phoneModel.equalsIgnoreCase("ipHone")) {
			System.out.println(String.format("Waking up %s with %s ", phoneModel, assistantName));
		}
		else if(phoneModel.equalsIgnoreCase("android")) {
			System.out.println();
		}
		
	}
	
	public void google() {
		
	}

}
