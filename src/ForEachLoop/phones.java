package ForEachLoop;

public class phones {
	public static void main(String[] args) {
		String [] phones = {"Iphone", "Samsung", "LG","Google Pixel", "Motorola"};
		int phoneLength = phones.length;
		String [] phone2 = {"Iphone", "Samsung", "LG","Google Pixel", "Motorola"};
		int phoneLength1 = phone2.length;
		int counter = 0;
		if(phoneLength == phoneLength1) {
			for (int i = 0; i < phoneLength; i++) {
				if(phones[i].equals(phone2[i])) {
					counter ++;
				}	
			}	
		}
		if(counter == phoneLength) {
			System.out.println("They are the same!");
		}else {

			System.out.println("Arrays ARENT' same!");
		}




	}
}	

