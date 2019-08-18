package interfaces;

import interfaces.Bookmark;
import interfaces.Browser;

public class IE extends Browser {

    public static void someIEMethod(){
        System.out.println("test");
        Bookmark.statMethod();
    }


    @Override
    public void openBrowser() {
        System.out.println("IE is opening");
    }

    @Override
    public void closeBrowser() {
        System.out.println("IE is closing");
    }


    @Override
    public void openNewTab(String url) {
        System.out.println("IE is opening a new tab and going to: " + url);
    }


    @Override
    public void goToUrl(String url) {
        System.out.println("IE is going to: " + url);
    }


}
