package replit;

public class Book {
	  //instance variables for Book object
//    private String author;
//    private String title;
//    private int id;
//    private int pages;
//    //static variable to track number of books with unknown author
//    private static int unknownAuthors;
    public static void main(String[] args) {
		String word = "love programming";
		System.out.println(capitalize(word));
	}
    
	public static String capitalize(String word) {
		word = word.toLowerCase();
		String []wordSp = word.split(" ");
		String test = "";
		for(int i = 0; i < wordSp.length; i++) {
			wordSp[i] = (wordSp[i].substring(0, 1).toUpperCase() + 
					wordSp[i].substring(1, word.length()));
			test += wordSp[i] + " ";
		
		}
		return test;
		
		}
	
//	public static boolean isTitleWord(String word) {
//		word = word.toLowerCase();
//		for(int i = 0; i < word.length(); i++) {
//		if(word.equals("a") || word.equals("an") || word.equals("the") 
//		|| word.equals("and") || word.equals("but") || word.equals("for") 
//		|| word.equals("nor") || word.equals("or") || word.equals("so") 
//		|| word.equals("yet") || word.equals("at") || word.equals("by") 
//		|| word.equals("in") || word.equals("into") || word.equals("near")
//        || word.equals("of") || word.equals("on") || word.equals("to") 
//        || word.equals("than") || word.equals("via")) {
//			return false;
//		}
//		}
//		return true;
//		
//				
//	}
//	public Book(int id, String author, String title, int pages ) {
////	    public void setId(int id){
////	      this.id = id;
////	    }
////	    
////	    public void setAuthor(String author){
////	      this.author = author;
////	    }
////	    
////	    public void setTitle(String title){
////	      this.title = title;
////	    }
////	    
////	    public void setPages(int pages){
////	      this.pages = pages;
////	    }
//	       
//	       
//	       
//	    }
//	public void setAuthor(String author) {
//		capitalize(author);
//		for(int i = 0; i < author.length(); i++) {
//			if(author.isEmpty()){
//		        this.author = "Unknown";
//		        unknownAuthors ++;
//		      }
//			
//		}
//	}
//	 
//    public void setTitle(String title) {
//
//     title = title.trim(); 
//     String []totalWords = title.split(" ");  //where to use?
//        if(title.isEmpty()) {
//        	this.title = "";
//        }else {
//        	capitalize(title);
//        	isTitleWord(title);
//        	this.title = title;
//        }
//
//    }
//    /**
//     * toString instance method, String representation of the Book object
//     * @return String
//     * Format includes author, title, id, pages of the Book object:
//     * Book[author=Marufjon T, title=Selenium Cookbook, id=10, pages=300]
//     */
//    public String toString() {
//      Book book = new Book(12, "Aitmatov", "Ak Keme", 365);
//      return "author=" + this.author + ", " + "title=" + this.title + ", " 
//    		  + "id=" + this.id + ", " + "pages=" + pages;
//    }
//	
	      
	
}
