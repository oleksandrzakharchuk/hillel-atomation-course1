package org.example.infrastructure.base;

import org.example.infrastructure.config.ConfigurationManager;
import org.example.infrastructure.data.FileUserDataMapper;
import org.example.infrastructure.data.UsersDataMapper;
import org.example.infrastructure.logger.FileTestLogger;
import org.example.infrastructure.logger.StdTestLogger;
import org.example.infrastructure.logger.TestLogger;
import org.example.infrastructure.wdm.DefaultWebDriverManager;
import org.example.infrastructure.wdm.WebDriverManager;

public abstract class TestBase1 {

    protected final TestLogger logger = getLogger();
    private WebDriverManager wdm;
    protected String browser;

    protected UsersDataMapper usersMapper=new FileUserDataMapper();


    public void startUp() {
        logger.log("Launch browser");
        wdm = new DefaultWebDriverManager();
        browser = wdm.getBrowser();

        logger.log("Open website");
        System.out.println("-->" + browser + " opening " ); //+TestUrl.getUrl());
//...
        beforeTest();
    }

    public void cleanUp() {
        afterTest();
        //...
        wdm.destroyBrowser(browser);
    }

    protected void beforeTest() {
        System.out.println("------>DEFOULT BEFORE TEST");
    }

    protected void afterTest() {
        System.out.println("-----> DEFOLT AFTER TEST");
    }

    private TestLogger getLogger() {
        switch (ConfigurationManager.getInstance().getLogType()) {

            case "file":
                return new FileTestLogger(System.currentTimeMillis()+"_file.log");
            case "std":
            default:
                return new StdTestLogger();
        }
    }
}





