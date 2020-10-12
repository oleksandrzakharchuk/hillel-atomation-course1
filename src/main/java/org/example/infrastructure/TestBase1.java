package org.example.infrastructure;

public class TestBase1 {
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
        System.out.println("-->" + browser + " opening " + TestServer.GetUrl());
//...
        beforeTest();
    }

    public void cleanUp(){
        afterTest();
        //...
        wdm.closeBrowser(browser);
    }

    protected void beforeTest() {
        System.out.println("------>DEFOULT BEFORE TEST");
    }
    protected void afterTest() {
        System.out.println("-----> DEFOLT AFTER TEST");
    }
}

