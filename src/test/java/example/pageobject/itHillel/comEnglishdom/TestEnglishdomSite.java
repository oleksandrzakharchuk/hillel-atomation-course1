package example.pageobject.itHillel.comEnglishdom;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestEnglishdomSite {

    private WebDriver webDriver;
    private MainPageEnglishdom loginPage;
    private Registration homePage;

    /*private MainPageEnglishdom homePage;
    private Registration loginPage;*/

    @Before
    public void setUp() {
        System.out.println("Start browser");
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        webDriver = new ChromeDriver();

        System.out.println("Open website");
        webDriver.get("https://www.englishdom.com/");

        //окно разворачивается на полный экран
        webDriver.manage().window().maximize();

        //задержка на выполнение теста = 10 сек.
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        webDriver = new ChromeDriver();
        loginPage = new MainPageEnglishdom(webDriver);
        homePage = new Registration(webDriver);
    }

    @After
    public void cleanUp() {
        System.out.println("Close browser");
        if (webDriver != null)
            webDriver.quit();
    }

    @Test
    public void someTest1() {

    }

    @Test
    public void pageRegistration2() {
        loginPage.open();
        loginPage.clickLogin();
    }

    @Test
    public void enterToRegisterToSite3() {
        loginPage.open();
        loginPage.clickLogin();
    }
}











