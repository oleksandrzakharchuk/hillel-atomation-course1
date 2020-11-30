package example.pageobject.itHillel;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
   // WebDriver webDriver = getWebDriver();
    //WebDriver webDriver;
   // ItHillelSite website;

    @Test
    public void firstTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        //website=new ItHillelSite(webDriver);
        ChromeDriver driver=new ChromeDriver();

       driver.get("https://ithillel.ua/");
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
        WebDriver wd =new ChromeDriver();
        String baseUrl = "https://www.google.com";
        wd.get(baseUrl);
    }

    /*public WebDriver getWebDriver() {
        return webDriver;
    }

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;*/
    }

