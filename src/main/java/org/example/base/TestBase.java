package org.example.base;

import com.wixpress.automation.webdriver.WebDriverManager;
import org.example.progeckts.shaman.ApplicationShaman;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class TestBase {


    private WebDriverManager wdm;
    protected WebDriver browser;
    protected WebDriverWait wait;
    protected ApplicationShaman app;


    @Before
    public void setUp() {
       // System.setProperty("webdriver.chrome.driver", "C:\\сhrom\\chromedriver.exe");
        //WebDriver webDriver = new ChromeDriver();
        wdm = new WebDriverManager();
        browser = wdm.getAvailableWebDriver();
        browser.manage().window().maximize();
        wait = new WebDriverWait(browser, 10000);
        browser.get("https://www.shamancloud.com/shaman");
        app = new ApplicationShaman(browser, wait);
        beforeTest();
    }

    @After
    public void tearDown() {
        afterTest();
        wdm.recoverWebDriver(browser);
    }

    protected void beforeTest() {
    }

    protected  void afterTest() {
    }
}


