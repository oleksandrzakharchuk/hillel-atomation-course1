package org.example.homeworks.hw09;

import org.example.logger.TestLogger;
import org.example.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class TestBaseGameS {
    protected TestLogger logger;
    private WebDriverManager wdm;

    protected WebDriver browser;
    public void startUp(){
        logger= new TestLogger() {
            @Override
            public void log(String msg) {

            }
        };

        logger.log("Launch browser");
        wdm= new WebDriverManager() {
            @Override
            public String getBrowser() {
                return null;
            }

            @Override
            public void destroyBrowser(WebDriver browser) {

            }

           /* @Override
            public void destroyBrowserWebDriver browser) {

            }*/

            @Override
            public WebDriver createBrowser() {
                return null;
            }

            @Override
            public void closeBrowser(WebDriver browser) {

            }

            @Override
            public WebDriver getAvailableWebDriver() {
                return null;
            }
        };
        browser= wdm.createBrowser();

        logger.log("Open website");
        System.out.println("-->" + browser + " opening " );
//...
        beforeTest();
    }

    public void cleanUp(){
        afterTest();
        //...
        wdm.closeBrowser(browser);
    }

    protected void beforeTest() {

    }
    protected void afterTest() {

    }
}

