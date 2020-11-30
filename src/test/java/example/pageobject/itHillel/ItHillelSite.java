package example.pageobject.itHillel;

import org.openqa.selenium.WebDriver;

public class ItHillelSite {
    WebDriver webDriver;

    public ItHillelSite(WebDriver driver) {
        webDriver = driver;
    }
}

   /* public MainPage mainpage() {return new MainPage(webDriver); }

    public SearchResultsPage searchResultsPage() {return new SearchResultsPage(webDriver); }

    public BookInfoPage bookInfoPage() {return new BookInfoPage(webDriver); }
}*/
