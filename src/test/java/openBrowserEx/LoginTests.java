package openBrowserEx;

import org.example.base.TestBase1;
import org.example.logger.StdTestLogger;
import org.example.logger.TestLogger;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginTests extends TestBase1 {
    @Before
    public void setUp() {
        System.out.println("Start browser");
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
    }
    @Test
    public void testSuccessLogin() throws InterruptedException {
        WebDriver webDriver=new ChromeDriver();

        logger.log("Open browser");
        TestLogger logger=new StdTestLogger();

        logger.log("Open website");
        webDriver.get("https://lingualeo.com/ru");

        logger.log("Click on 'войти'");
        webDriver.findElement(By.cssSelector(".ll-leokit__site-menu__auth-btn")).click();

        logger.log("Enter E-mail");
        webDriver.findElement(By.cssSelector(".ll-ModalAuthAlt__credentials")).sendKeys("zahirolek@gmail.com");
        Thread.sleep(3000);

        logger.log("Enter password");
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[3]/div/div[1]/div[2]/div/div[3]/form/input[2]")).sendKeys("Ol24041967");

       Thread.sleep(3000);

        logger.log("Click 'Создать аккаунт");
        webDriver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/div[1]/div[3]/div/div[1]/div[2]/div/div[3]/form/button/span")).click();
        Thread.sleep(3000);

        logger.log("Login to website as admin");
        logger.log("Check login is successful");
        Thread.sleep(3000);

        System.out.println("Check URL");
        assertEquals("https://lingualeo.com/ru",webDriver.getCurrentUrl());
        System.out.println(webDriver.getCurrentUrl());

        System.out.println("Finding the element 'LinguaLeo'.");
        assertTrue(webDriver.findElement(By.cssSelector(".ll-leokit__site-logo")).isDisplayed());
        System.out.println(" 'LinguaLeo' found");

       // assertTrue(webDriver.findElement(By.cssSelector(".ll-leokit__side-menu-item__m-selected")).isDisplayed());
       // assertTrue(webDriver.findElement(By.cssSelector(".ll-leokit__side-menu-item__content__title")).isDisplayed());

        webDriver.quit();

    }
}
