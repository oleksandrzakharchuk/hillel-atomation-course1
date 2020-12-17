package progeckts.OldPageObjeck;

import org.example.logger.StdTestLogger;
import org.example.logger.TestLogger;
import org.example.progeckts.orangehrm.oldPageObjeck.AdminPage;
import org.example.progeckts.orangehrm.oldPageObjeck.LoginPage;
import org.example.progeckts.orangehrm.oldPageObjeck.MainPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginTests {

    private WebDriver webDriver;
    private TestLogger logger;
    private LoginPage loginPage;


    public LoginTests() {
    }


    @Before
    public void before() {
        logger = new StdTestLogger();
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
        webDriver = new ChromeDriver();
        MainPage mainPage = new MainPage(webDriver, logger);

        loginPage = mainPage.open().clickLoginLink();

    }

    @After
    public void after() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }

    @Test
    public void testSuccessLogin() throws InterruptedException {
        AdminPage adminPage = loginPage
                .enterLogin("opensourcecms")
                .enterPassword("opensourcecms")
                .clickLoginButton()
                .waitForPageLoad();



        logger.log("Checks companyLogoHeader");
        assertTrue(adminPage.checkCompanyLogoHeader());
        logger.log("'Orangehrm' found");

        logger.log("Checks top-menu");
        assertTrue(adminPage.checkTopMenu());
        logger.log("'Top-menu' found");

    }

    @Test
    public void testEmptyPassword() {
         loginPage.enterLogin("opensourcecms")
                  .clickFailLoginButton();

        assertTrue(loginPage.isErrorMessagePresent());
        assertEquals("Password cannot be empty", loginPage.getErrorMessage());
        logger.log("'Password cannot be empty' message is displayed");
    }

    @Test
    public void testIncorrectPassword() throws InterruptedException {
         loginPage
                .enterLogin("opensourcecms")
                .enterPassword("123")
                .clickFailLoginButton();

        assertTrue(loginPage.isErrorMessagePresent());
        assertEquals("Username cannot be empty", loginPage.getErrorMessage());
        logger.log("'Username cannot be empty' message is displayed");

    }

    @Test
    public void testSubmitEmptyLoginForm() {
        loginPage.clickFailLoginButton();

        assertTrue(loginPage.isErrorMessagePresent());
        assertEquals("Username cannot be empty", loginPage.getErrorMessage());
        logger.log("'Username cannot be empty' message is displayed");
    }
}
