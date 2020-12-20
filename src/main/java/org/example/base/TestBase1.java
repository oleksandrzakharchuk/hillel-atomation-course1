package org.example.base;

import org.example.config.ConfigurationManager;
import org.example.data.FileUserDataMapper;
import org.example.data.UsersDataMapper;
import org.example.logger.FileTestLogger;
import org.example.logger.StdTestLogger;
import org.example.logger.TestLogger;
import org.example.wdm.DefaultWebDriverManager;
import org.example.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;

@RunWith(JUnit4.class)
public abstract class TestBase1 {

    protected final TestLogger logger = getLogger();
    private WebDriverManager wdm;
    protected WebDriver webDriver;

    protected SeleniumUtils seleniumUtils;

    protected UsersDataMapper usersMapper;

    @Before
    public void startUp() {
        logger.log("Launch browser");
        wdm = new DefaultWebDriverManager();
        io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
        webDriver = wdm.getBrowser();

        seleniumUtils=new SeleniumUtils(webDriver);

        logger.log("Open website");


        usersMapper = new FileUserDataMapper("users.txt");
        beforeTest();
    }
    @After
    public void cleanUp() {
        afterTest();
        //...
        wdm.destroyBrowser(webDriver);
    }

    protected void beforeTest() {

    }

    protected void afterTest() {

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




