package interfaces;

public interface Bookmark {


    void addUrlToBookmark();
    public abstract void addUrlToBookmark(String url);


    public abstract void removeUrlFromBookmark();



    public default void defMethod(){
        System.out.println("This is default method");
    }

    public static void statMethod(){
        System.out.println("Static method in Interface");
    }




}
