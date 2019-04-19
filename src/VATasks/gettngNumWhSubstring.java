package VATasks;

public class gettngNumWhSubstring {
	public static void main(String[] args) {
		String search = "About 10000000 is found (0.42 seconds)";
		search = search.replace("About ", "");
		//search = search.replace(" is found (0.32 seconds)", "");
				//System.out.println(search);

	search = search.substring(0, search.indexOf(" "));
		System.out.println(search);
	}

}
