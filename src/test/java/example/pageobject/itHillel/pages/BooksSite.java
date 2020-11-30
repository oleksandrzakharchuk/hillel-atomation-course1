package example.pageobject.itHillel.pages;

import org.openqa.selenium.WebDriver;

public class BooksSite {
    WebDriver webDriver;

    public BooksSite(WebDriver driver) {
        webDriver = driver;
    }

    public MainPage mainpage() {return new MainPage(webDriver); }

    public SearchResultsPage searchResultsPage() {return new SearchResultsPage(webDriver); }

    public BookInfoPage bookInfoPage() {return new BookInfoPage(webDriver); }
}
