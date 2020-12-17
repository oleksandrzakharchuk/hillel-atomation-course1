package com.app.outboundengine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OutboundengineTests {
    WebDriver webDriver;

    public static void main(String[] args) {


        /*System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();*/


       System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();


        webDriver.get("https://app.outboundengine.com/");

        webDriver.findElement(By.id("user_email")).click();
        webDriver.findElement(By.id("user_email")).clear();
        webDriver.findElement(By.id("user_email")).sendKeys("roksolaansm@yahoo.com");

        webDriver.findElement(By.id("user_password")).click();
        webDriver.findElement(By.id("user_password")).clear();
        webDriver.findElement(By.id("user_password")).sendKeys("roksolaansm");

        webDriver.findElement(By.id("loginButton")).click();

        //WebElement mainListPanel = webDriver.findElement(By.id(""));

        //List<WebElement> rows=webDriver.findElements(By.cssSelector("tr[data-boundview*='gridview']"));
        //    webDriver.quit();

        //for (WebElement row:rows){
        //if (row.getText().contains("logo_cheks_038@sinc.sendgrid.net")){
       // row.findElement(By.cssSelector(".x-grid-row-checked")).click();

        //webDriver.findElement(By.cssSelector("a[id*='flyui-button'])")).click();
        webDriver.quit();
        }
    }

