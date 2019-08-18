package interfaces;


public class Chrome extends Browser implements Bookmark, Translator {

    @Override
    public void translate(){
        System.out.println("Chrome is translating the content of the web page");
    }


    @Override
    public void addUrlToBookmark(String url) {
        System.out.println("Adding url to Bookmark: " + url);
    }

    @Override
    public void defMethod() {
        System.out.println("Overridden default method");
    }

    @Override
    public void openBrowser() {
        System.out.println("Chrome is opening");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Chrome is closing");
    }


    @Override
    public void goToUrl(String url) {
        System.out.println("Chrome is going to:  " + url);
    }

    @Override
    public void openNewTab(String url) {
        System.out.println("Opening a new tab: " + url);
    }

    @Override
    public void addUrlToBookmark() {
        System.out.println("Adding current url to the Bookmark in Chrome");
    }

    @Override
    public void removeUrlFromBookmark() {
        System.out.println("Removing current url from the Bookmark in Chrome");

    }
}
