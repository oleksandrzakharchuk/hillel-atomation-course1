package org.example.base;

import org.example.config.ConfigurationManager;
import org.example.logger.FileTestLogger;
import org.example.logger.StdTestLogger;
import org.example.logger.TestLogger;
import org.example.progeckts.shaman.ApplicationShaman;
import org.example.wdm.DefaultWebDriverManager;
import org.example.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestBaseO  {

    protected final TestLogger logger = getLogger();
    private WebDriverManager wdm;
    protected WebDriver webDriver;
    protected SeleniumUtils seleniumUtils;
   // protected UsersDataMapper usersMapper=new FileUserDataMapper("users.txt");

    //protected WebDriver browser;
    protected WebDriverWait wait;


    protected ApplicationShaman app;


    @Before
    public void setUp() {
         System.setProperty("webdriver.chrome.driver", "C:\\сhrom\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        logger.log("Launch browser");
        wdm = new DefaultWebDriverManager();
        webDriver = wdm.getBrowser();
        seleniumUtils=new SeleniumUtils(webDriver);

       // usersMapper = new FileUserDataMapper("users.txt");
     //browser = wdm.getAvailableWebDriver();
       logger.log("Open website");

        //webDriver.manage().window().maximize();
        //wait = new WebDriverWait(webDriver, 10000);
        //webDriver.get("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login");
        app = new ApplicationShaman(webDriver, wait);

        beforeTest();
    }

    @After
    public void cleanUp() {
        afterTest();
        wdm.destroyBrowser(webDriver);
    }

    protected void beforeTest() {
    }

    protected  void afterTest() {
    }
    private TestLogger getLogger(){
        switch (ConfigurationManager.getInstance().getLogType()){
            case "file":
                return new FileTestLogger(System.currentTimeMillis() + "_file.log");
            case "std":
            default:
                return new StdTestLogger();
        }
    }
}

