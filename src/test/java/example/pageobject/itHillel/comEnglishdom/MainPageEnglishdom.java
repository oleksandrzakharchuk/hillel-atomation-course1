package example.pageobject.itHillel.comEnglishdom;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class MainPageEnglishdom {

    WebDriver webDriver;

    MainPageEnglishdom(WebDriver driver) {
        this.webDriver = driver;
    }

    @Test
    public void someTest1() {
        System.out.println("Check URL");

        assertEquals("https://www.englishdom.com/", webDriver.getCurrentUrl());
        System.out.println(webDriver.getCurrentUrl());

        System.out.println("Check Title");
        assertEquals("Английский по Скайпу — обучение английскому языку по Скайпу в онлайн-школе EnglishDom", webDriver.getTitle());
        System.out.println(webDriver.getTitle());
    }
    public void pageRegistration2() {
        System.out.println("Finding the element 'EnglishDom'.");
        webDriver.findElement(new By.ByXPath("//*[@id=\"is-js\"]/body/header/div[1]/nav/div/div/a[2]/img"));
        System.out.println(" 'EnglishDom' found");
    }
    void clickLogin() {

    }

    void open() {
        webDriver.get("https://www.englishdom.com/");
    }

    boolean atPage() {
        if (webDriver.getTitle().equals("Login to Englishdom")) {
            return true;
        } else {
            return false;
        }
    }

}

