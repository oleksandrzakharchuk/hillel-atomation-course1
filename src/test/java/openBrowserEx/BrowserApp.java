package openBrowserEx;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserApp {


    public static void main(String[] args) throws InterruptedException {

       System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
        WebDriver webDriver =  new FirefoxDriver();

        webDriver.get("https://www.google.com");

       /* System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();*/

        //webDriver.get("https://www.google.com");

        // webDriver.get("http://ithillel.ua/");

    /*   DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Google Chrome");*/
        //capabilities.setCapability(CapabilityType.BROWSER_NAME, "Firefox");
        /*capabilities.setCapability("platform", "windows");
        ChromeOptions options=new ChromeOptions();
        options.merge();*/
//https://wiki.saucelabs.com/display/DOCS/Getting+Started+with+Selenium+for+Automated+Website+Testing
        //https://wiki.saucelabs.com/display/DOCS/Test+Configuration+Options

       // WebDriver webDriver=new SafariDriver();


       Thread.sleep(3000);

        webDriver.quit();
    }
}
