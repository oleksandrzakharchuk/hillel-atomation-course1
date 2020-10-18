package org.example.homeworks.hw09;

import org.example.infrastructure.TestLogger;
import org.example.infrastructure.WebDriverManager;

public class TestBaseGameS {
    protected TestLogger logger;
    private WebDriverManager wdm;

    protected String browser;
    public void startUp(){
        logger= new TestLogger() {
            @Override
            public void log(String msg) {

            }
        };

        logger.log("Launch browser");
        wdm=new WebDriverManager();
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

