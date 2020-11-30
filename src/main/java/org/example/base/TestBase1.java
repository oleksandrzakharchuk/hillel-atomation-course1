package org.example.base;

import org.example.config.ConfigurationManager;
import org.example.data.UsersDataMapper;
import org.example.data.FileUserDataMapper;
import org.example.logger.FileTestLogger;
import org.example.logger.StdTestLogger;
import org.example.logger.TestLogger;
import org.example.wdm.DefaultWebDriverManager;
import org.example.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public abstract class TestBase1 {

    protected final TestLogger logger = getLogger();
    private WebDriverManager wdm;
    protected String browser;

    protected UsersDataMapper usersMapper = new FileUserDataMapper("users.txt");

    @Before
    public void startUp() {
        logger.log("Launch browser");
        wdm = new DefaultWebDriverManager();
        browser = wdm.getBrowser();

       /* logger.log("Open website");
        System.out.println("-->" + browser + " opening "); //+TestUrl.getUrl());
//...*/
        beforeTest();
    }
    @After
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
                return new FileTestLogger(System.currentTimeMillis() + "_file.log");
            case "std":
            default:
                return new StdTestLogger();
        }
    }
}




