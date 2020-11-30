package example.pageobject.itHillel.comEnglishdom;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration {
    private WebDriver webDriver;

    public Registration(WebDriver webDriver) {
    }


    @Test
public void enterToRegisterToSite3() {
    System.out.println("Finding the element 'Enter' ");
    webDriver.findElement(new By.ByXPath("//*[@id=\"phn-login-btn-2\"]/span"));
    webDriver.findElement(new By.ByXPath("//*[@id=\"phn-login-btn-2\"]/span")).click();
    System.out.println(" ''Enter'' found and click");

    System.out.println("Finding the element 'email' ");
    // webDriver.findElement(new By.ByXPath("//*[@id=\"mail-3\"]")).click().;
    webDriver.findElement(new By.ByXPath("//*[@id=\"phn-login-form\"]/div[1]/input")).sendKeys("zahirolek@gmail.com");
    System.out.println(" ''Email'' found and click");


    System.out.println("Finding the element 'enterPassword' ");
    webDriver.findElement(new By.ByXPath("//*[@id=\"phn-login-form\"]/div[2]/input")).click();
    webDriver.findElement(new By.ByXPath("//*[@id=\"phn-login-form\"]/div[2]/input")).sendKeys(".RvqDgCbZbxcy2S");
    System.out.println(" ''Email'' found and click");

    System.out.println("Finding the element 'enter' ");
    webDriver.findElement(new By.ByXPath("//*[@id=\"phn-login-form\"]/div[3]/input")).click();
    webDriver.findElement(new By.ByXPath("//*[@id=\"phn-login-form\"]/div[3]/input")).sendKeys(".RvqDgCbZbxcy2S");
    System.out.println(" ''enter'' found and click");
}
    void clickRegistration() {

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

