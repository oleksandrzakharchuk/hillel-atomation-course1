package example.pageobject.itHillel.pages.com.lingualeo;
import org.example.base.TestBase1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Lingualeo extends TestBase1 {
    private WebDriver webDriver;

    @Before
    public void setUp() {
        logger.log("Start browser");
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        webDriver = new ChromeDriver();

        System.out.println("Open website");
        webDriver.get("https://lingualeo.com/ru/");

    }
    @After
    public void cleanUp() {
        logger.log("Close browser");
        if (webDriver != null)
            webDriver.quit();
    }

    @Test
    public void testCheckUrlTitle() {
        logger.log("Check URL");
        assertEquals("https://lingualeo.com/ru", webDriver.getCurrentUrl());
        System.out.println(webDriver.getCurrentUrl());
    }

    @Test
    public void testCheckTitle() {
        logger.log("Check Title");
        assertEquals("Lingualeo — иностранные языки онлайн", webDriver.getTitle());
        System.out.println(webDriver.getTitle());
    }
    @Test
    public void testSuccessLogin() throws InterruptedException {
        //TestLogger logger = null;
        // System.out.println("Finding the element 'Войти' ");
        // assert logger != null;
        logger.log("Click on 'Войти'");
        webDriver.findElement(By.cssSelector(".ll-leokit__site-menu__auth-btn")).click();

        //System.out.println("Finding the element 'E-mail'");
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


            logger.log("Finding the element '  '");
            assertTrue(webDriver.findElement(By.cssSelector(".ll-leokit__site-menu__header__title span:last-child")).isDisplayed());
            logger.log("'LinguaLeo' found");
        }
    }







