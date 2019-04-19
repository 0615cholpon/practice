package ForEachLoop;

public class EmailValid {
	public static void main(String[] args) {
		String []email = {"cholpon@email.com", "@hotmail.com", "@mail.ru", "@org.com", "@.list", "Cholpon","Albina"};
		for(String Correctemail: email) {
			if(Correctemail.contains("@") && Correctemail.contains(".")) {
				System.out.println(Correctemail);

	}
}		
	}

}
