package progeckts.ua.orange;

import org.example.base.TestBaseO;

public abstract class OrangeUaTestBase extends TestBaseO {

    @Override
    protected void beforeTest() {
        logger.log("Open orange website main page");
        webDriver.get("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login");
    }

    //protected OrangeWebsite orangeWebsite;
    //public WebDriver webDriver;
    //private TestLogger logger;
    //private MainPageFact mainPageFact;
    //private LoginPageFac loginPageFac;

    /*@Before
    public void beforeTest() {
    logger.log("Open allo website main page");

        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        webDriver = new FirefoxDriver();

        //MainPageFact mainPageFact = new MainPageFact(webDriver);
        webDriver.get("https://allo.ua/");

        alloWebsite =new AlloWebsite(webDriver);
    }*/
}
