package com.app.outboundengine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OutboundengineTests {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

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

        }
    }

