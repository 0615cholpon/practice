package ObjectDataEx;

public class BookTest {
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.title = "Running Kite";
		book1.pages = 365;
		book1.author = "Khaled Hussein";
		
		Book book2 = new Book();
		book2.title = "Three Comrades";
		book2.pages = 400;
		book2.author = "Erich Maria Remark";
		
		Book book3 = new Book();
		book3.title = "Sense and Sensibility";
		book3.pages = 200;
		book3.author = "Jane Austin";
		
		
		Book [] totalAuthors = new Book[3];
		totalAuthors[0] = book1;
		totalAuthors[1] = book2;
		totalAuthors[2] = book3;
		
		for(int i = 0; i < totalAuthors.length; i++) {
		System.out.println(totalAuthors[i].author);
			
		}
		System.out.println();
		for(Book b: totalAuthors) {
			System.out.println(b.author);
		}
 	}

}
