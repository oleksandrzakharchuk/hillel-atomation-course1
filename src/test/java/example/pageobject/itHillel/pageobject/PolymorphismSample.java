package example.pageobject.itHillel.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PolymorphismSample {
    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;

    @BeforeTest


    public void setUp(String browserName) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
    }

    @Test
    public void successfulLoginTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        loginPage.open();
        assertTrue(loginPage.atPage());
        loginPage.enterUserName("admin");
        loginPage.enterPassword("changeme");
        loginPage.clickLogin();
        assertTrue(homePage.atPage());
    }

    @Test
    public void wrongPasswordLoginTest() {
        loginPage.open();
        assertTrue(loginPage.atPage());
        loginPage.enterUserName("admin");
        loginPage.enterPassword("wrongPassword");
        loginPage.clickLogin();
        assertTrue(homePage.atPage());
    }

    @Test
    public void wrongLoginNameLoginTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver.get("https://lingualeo.com");
        driver.findElement(By.id("login")).sendKeys("wrongUserName");
        driver.findElement(By.id("pass")).sendKeys("changeme");
        assertEquals("Home Page", driver.getTitle());
    }

}
