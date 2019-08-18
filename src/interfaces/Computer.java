package interfaces;

import interfaces.Bookmark;
import interfaces.Chrome;

public class Computer {

    public static void main(String[] args) {
        Chrome ch1 = new Chrome();
        ch1.openBrowser();
        ch1.closeBrowser();
        ch1.goToUrl("google.com");
        ch1.openNewTab("facebook.com");
        ch1.addUrlToBookmark();
        ch1.defMethod();
        Bookmark.statMethod();

    }
}
