package org.example.infrastructure;

public class TestBase {
    protected TestLogger logger;
    private WebDriverManager wdm;

    protected String browser;
    public void startUp(){
        logger=new TestLogger();

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
