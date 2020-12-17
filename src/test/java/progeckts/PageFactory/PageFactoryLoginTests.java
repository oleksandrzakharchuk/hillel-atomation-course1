package progeckts.PageFactory;

import org.example.logger.StdTestLogger;
import org.example.logger.TestLogger;
import org.example.progeckts.orangehrm.pageFactory.LoginPageFac;
import org.example.progeckts.orangehrm.pageFactory.MainPageFact;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertTrue;

public class PageFactoryLoginTests {

    public WebDriver webDriver;
    private TestLogger logger;
    private MainPageFact mainPageFact;
    private LoginPageFac loginPageFac;

    @Before
    public void before() {
        logger = new StdTestLogger();
        /*System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
        webDriver = new ChromeDriver();*/

         System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
         webDriver = new FirefoxDriver();

         logger.log("Open website");
        mainPageFact = new MainPageFact(webDriver);
        webDriver.get("https://s2.demo.opensourcecms.com/orangehrm/");

        logger.log("Click login link");
        mainPageFact.clickLoginButtonFac();

        loginPageFac=new LoginPageFac(webDriver);
        }

    @After
    public void after() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }

    @Test
    public void testSuccessLogin()  {
        logger.log("Enter login");
        loginPageFac.enterLogin("opensourcecms");

        logger.log("Enter password");
        loginPageFac.enterPassword("opensourcecms");

        logger.log("Click login button");
        loginPageFac.clickLoginButton();

        logger.log("Chek admin page");
        //check
    }

    @Test
    public void testEmptyPassword() {
        logger.log("Enter login");
        loginPageFac.enterLogin("opensourcecms");

        logger.log("Click login button");
        loginPageFac.clickLoginButton();

        logger.log("Chek error message");
        assertTrue(loginPageFac.getErrorMessage().contains("Password cannot be empty"));
    }

    @Test
    public void testIncorrectPassword() throws InterruptedException {
        logger.log("Enter login");
        loginPageFac.enterLogin("opensourcecms");

        logger.log("Enter password");
        loginPageFac.enterPassword("123");

        logger.log("Click login button");
        loginPageFac.clickLoginButton();

        logger.log("Chek error message");
       assertTrue(loginPageFac.getErrorMessage().contains("Invalid credentials"));
    }

    @Test
    public void testSubmitEmptyLoginForm() {

        logger.log("Click login button");
        loginPageFac.clickLoginButton();

        logger.log("Chek error message");
        assertTrue(loginPageFac.getErrorMessage().contains("Username cannot be empty"));

    }

    public void setWebDriver(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
