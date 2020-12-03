package example.pageobject.itHillel.pages.com.lingualeo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class Lingualeo {
    private WebDriver webDriver;

    @Before
    public void setUp() {
        System.out.println("Start browser");
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        webDriver = new ChromeDriver();

        System.out.println("Open website");
        webDriver.get("https://lingualeo.com/ru/");

    }

    @After
    public void cleanUp() {
        System.out.println("Close browser");
        if (webDriver != null)
            webDriver.quit();
    }

    @Test
    public void testCheckUrlTitle() {
        System.out.println("Check URL");
        assertEquals("https://lingualeo.com/ru", webDriver.getCurrentUrl());
        System.out.println(webDriver.getCurrentUrl());
    }

    @Test
    public void testCheckTitle() {
        System.out.println("Check Title");
        assertEquals("Lingualeo — иностранные языки онлайн", webDriver.getTitle());
        System.out.println(webDriver.getTitle());
    }

    @Test
    public void TestFindingElements() {
        System.out.println("Finding the element 'LinguaLeo'.");
        webDriver.findElement(new By.ByXPath("//*[@id=\"app\"]/div/div[1]/div[1]/div[3]/div/div[1]/div[1]/a"));
        System.out.println(" 'LinguaLeo' found");

    }

        /*@Test
        public void TestFindElementCourses(){
            System.out.println("Finding the element 'Courses'.");
            webDriver.findElement(new By.ByXPath("//*[@id=\"app\"]/div/div[1]/div[1]/div[3]/div/ul/li[4]/div/div/a/span/span[2]"));
            System.out.println(" 'Courses' found");
        }*/

        /*System.out.println("Finding the element 'Grammatical'");
        webDriver.findElement(new By.ByXPath("//*[@id=\"app\"]/div/div[1]/div[1]/div[3]/div/ul/li[4]/div/div/ul/li[1]/div/div/a/span/span[2]"));
        System.out.println(" 'Grammatical' found");*/

    @Test
    public void TestCheckTitle() {
        System.out.println("Check Title");
        assertEquals("Lingualeo — иностранные языки онлайн", webDriver.getTitle());
        System.out.println(webDriver.getTitle());
    }

    @Test
    public void enterToRegisterToSite3() throws InterruptedException {
        System.out.println("Finding the element 'Enter' ");
       /* webDriver.findElement(new By.ByXPath("//*[@id=\"phn-login-btn-2\"]/span"));
        Thread.sleep(3000);*/
        webDriver.findElement(new By.ByXPath("//*[@id=\"phn-login-btn-2\"]/span")).click();
        Thread.sleep(3000);
        System.out.println(" ''Enter'' found and click");
    }
}






