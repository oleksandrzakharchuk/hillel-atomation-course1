package org.example.mysite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SampleTest {

private WebDriver webDriver;

    @Before
    public void setUp(){
        System.out.println("Start browser");
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        webDriver = new ChromeDriver();

        System.out.println("Open website");
        webDriver.get("https://ithillel.ua/");

    }

    @After
           public void cleanUp(){
        System.out.println("Close browser");
        if (webDriver!=null)
        webDriver.quit();
    }


    @Test
    public void someTest() {
        System.out.println("Check URL");

        assertEquals("https://ithillel.ua/ua/", webDriver.getCurrentUrl());

        System.out.println("Check Title");

        assertEquals("Комп'ютерна школа Hillel у Києві: курси IT-технологій", webDriver.getTitle());

        //System.out.println(webDriver.getCurrentUrl());
       // System.out.println(webDriver.getTitle());
       // System.out.println();

    }
    @Test
    public void registerToCourse(){

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



   // C:\chromedriver

//Intellij IDEA никак не может подключить  chromedriver для Chrome.
//Java.lang.IllegalStateException: The path to the driver executable must be set by the webdriver.chrome.driver system property; for more information, see https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver. The latest version can be downloaded from http://chromedriver.storage.googleapis.com/index.html
