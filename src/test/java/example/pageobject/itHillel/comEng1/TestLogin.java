package example.pageobject.itHillel.comEng1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestLogin {
    private WebDriver webDriver;

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
    }

    @After
    public void cleanUp() {
        System.out.println("Close browser");
        if (webDriver != null)
            webDriver.quit();
    }


    @Test
    public void someTest() {
        System.out.println("Check URL");

        assertEquals("https://www.englishdom.com/", webDriver.getCurrentUrl());
        System.out.println(webDriver.getCurrentUrl());

        System.out.println("Check Title");
        assertEquals("Английский по Скайпу — обучение английскому языку по Скайпу в онлайн-школе EnglishDom", webDriver.getTitle());
        System.out.println(webDriver.getTitle());
    }

    @Test
    public void pageRegistration() {
        System.out.println("Finding the element 'EnglishDom'.");
        webDriver.findElement(new By.ByXPath("//*[@id=\"is-js\"]/body/header/div[1]/nav/div/div/a[2]/img"));
        System.out.println(" 'EnglishDom' found");
    }
    @Test
    public void enterToRegisterToSite() {
        System.out.println("Finding the element 'Enter' ");
        webDriver.findElement(new By.ByXPath("//*[@id=\"phn-login-btn-2\"]/span"));
        webDriver.findElement(new By.ByXPath("//*[@id=\"phn-login-btn-2\"]/span")).click();
        System.out.println(" ''Enter'' found and click");
    }
    @Test
    public void RegisterToSite() {
        System.out.println("Finding the element 'Registration' ");
        webDriver.findElement(new By.ByXPath("//*[@id=\"is-js\"]/body/div[11]/div/div/div/div[1]/div/div/a[1]"));
        webDriver.findElement(new By.ByXPath("//*[@id=\"is-js\"]/body/div[11]/div/div/div/div[1]/div/div/a[1]")).click();
        System.out.println("Found and  click to 'Registration' ");

        webDriver.findElement(new By.ByXPath("//*[@id=\"mail-3\"]")).click();
        webDriver.findElement(new By.ByXPath("//*[@id=\"mail-3\"]")).sendKeys("zahirolek@gmail.com");
    }


        @Test
        public void registerToCourse () {

            System.out.println("Click on register button");

            webDriver.findElement(By.id("signCoursesButton")).click();

            System.out.println("Enter name");

            webDriver.findElement(By.id("signCourses")).findElement(By.id("modal_name")).click();
            webDriver.findElement(By.id("signCourses")).findElement(By.id("modal_name")).sendKeys("ь");

            System.out.println("Enter email");

            webDriver.findElement(By.id("signCourses")).findElement(By.id("modal_email")).click();
            webDriver.findElement(By.id("signCourses")).findElement(By.id("modal_email")).sendKeys("ivan@gmail.com");

            System.out.println("Enter phonenumber");

            webDriver.findElement(By.id("signCourses")).findElement(By.id("modal_phone")).click();
            webDriver.findElement(By.id("signCourses")).findElement(By.id("modal_phone")).sendKeys("+38 (063) 123-45-67");

            System.out.println("Chek error message");

            assertTrue(webDriver.findElement(By.id("signCourses")).findElement(By.className("modal__error")).getText().contains("Обов'язково виберіть курс, на який хочете відправити запит"));


        }

    }



