package com.wakanowTest;

import org.example.logger.StdTestLogger;
import org.example.logger.TestLogger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class WakanowTests {

        TestLogger logger = new StdTestLogger();


        @Test
        public void testOpenBrowser () throws InterruptedException {

            logger.log("Open browser");

        /*System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();*/

            System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
            WebDriver webDriver = new FirefoxDriver();

            webDriver.manage().window().setSize(new Dimension(1280, 1024));

            WebDriverWait wait = new WebDriverWait(webDriver, 30, 1000);

            logger.log("Open website");
            webDriver.get("https://www.wakanow.com/en-ng");
            Thread.sleep(1000);

            logger.log("Check URL");
            assertEquals("https://www.wakanow.com/en-ng", webDriver.getCurrentUrl());
            System.out.println(webDriver.getCurrentUrl());
            Thread.sleep(1000);

            logger.log("Check Title");
            assertEquals("Book Cheap Flights, Hotels and Vacation Packages | Wakanow", webDriver.getTitle());
            System.out.println(webDriver.getTitle());
            Thread.sleep(1000);

            logger.log("Click on 'roundtrip' radio button ");
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".ng-arrow-wrapper")));
            WebElement radioBtn=webDriver.findElement(By.cssSelector(".ng-arrow-wrapper"));
            radioBtn.click();


            //// Click on roundtrip radio button
            //        WebElement radioBtn = driver.findElement(By.id("roundtrip"));
            //        radioBtn.click();
            // Insert data into Flying from text box

            logger.log("Insert data 'DeptCode'form-control ");
           // wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".form-control ng-pristine ng-valid ng-touched")));
            WebElement formControl=webDriver.findElement(By.cssSelector(".bg-white "));
            formControl.click();
            formControl.sendKeys(". 12 ");
            formControl.sendKeys("");
            //formControl.click(".readonly");


           /* driver.findElement(By.id("intlDeptCode")).click();
            driver.findElement(By.id("intlDeptCode")).sendKeys(SourcePattern);
            driver.findElement(By.id("intlDeptCode")).click();*/
        }
    }



