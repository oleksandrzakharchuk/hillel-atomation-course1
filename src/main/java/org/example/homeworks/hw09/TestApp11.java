package org.example.homeworks.hw09;

import org.example.logger.TestLogger;
import org.example.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class TestApp11 {
    public static void main(String[] args) {
        TestLogger logger = new TestLogger() {
            @Override
            public void log(String msg) {

            }
        };

        logger.log("Launch browser");
        WebDriverManager wdm = new WebDriverManager() {
            @Override
            public String getBrowser() {
                return null;
            }

            @Override
            public void destroyBrowser(WebDriver browser) {

            }

            @Override
            public void destroyBrowser(String browser) {

            }

            @Override
            public WebDriver createBrowser() {
                return null;
            }

            @Override
            public void closeBrowser(WebDriver browser) {

            }

           /* @Override
            public void closeBrowser(WebDriver browser) {

            }*/

            @Override
            public WebDriver getAvailableWebDriver() {
                return null;
            }
        };
        WebDriver browser = wdm.createBrowser();

        logger.log("Open website");
        System.out.println("-->" + browser + " opening " );

        logger.log("Precondition1");
        System.out.println("-->Step 1");

        logger.log("Precondition2");
        System.out.println("-->Step 2");

        logger.log("Precondition3");
        System.out.println("-->Step3");

        logger.log("Check smth");
        System.out.println("-->Chek text on page");

        logger.log("Close browser ");
        wdm.closeBrowser(browser);
    }
}


