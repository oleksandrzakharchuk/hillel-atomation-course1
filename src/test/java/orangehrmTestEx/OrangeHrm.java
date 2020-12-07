package orangehrmTestEx;

import org.example.logger.StdTestLogger;
import org.example.logger.TestLogger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

//import sun.jvm.hotspot.utilities.soql.JSJavaScriptEngine;

public class OrangeHrm {

    TestLogger logger = new StdTestLogger();

      @Test
    public void testSeccesLogin() throws InterruptedException {
        logger.log("Open browser");

        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
        WebDriver webDriver = new FirefoxDriver();

        /*System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();
*/
        logger.log("Open website");
        webDriver.get("https://s2.demo.opensourcecms.com/orangehrm/");


        logger.log("Check URL");
        assertEquals("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login", webDriver.getCurrentUrl());
        System.out.println(webDriver.getCurrentUrl());

        logger.log("Check Title");
        assertEquals("", webDriver.getTitle());
        System.out.println(webDriver.getTitle());

        /* logger.log("Check LOGIN Panel");
        webDriver.findElement(By.linkText("LOGIN Panel"));
       // logger.log("'LOGIN Panel' found"); not founded */

        logger.log("Check LOGIN Panel");
        WebElement frmLogin=webDriver.findElement(By.id("frmLogin"));
        frmLogin.findElements(By.tagName("LOGIN Panel"));
        List<WebElement> loginLinks=frmLogin.findElements(By.tagName("LOGIN Panel"));
        logger.log("'LOGIN Panel' found");

        logger.log("Click on 'Username' link ");
        webDriver.findElement(By.id("txtUsername")).click();
        logger.log("Enter Username");
        webDriver.findElement(By.id("txtUsername")).sendKeys("opensourcecms");

        logger.log("Click on 'Password' link ");
        webDriver.findElement(By.id("txtPassword")).click();
        logger.log("Enter Password ");
        webDriver.findElement(By.id("txtPassword")).sendKeys("opensourcecms");

        logger.log("Click 'Login' button");
        webDriver.findElement(By.id("btnLogin")).click();

        logger.log("Check Login is successful ");

        logger.log("Check companyLogoHeader");
        assertTrue(webDriver.findElement(By.id("companyLogoHeader")).isDisplayed());
        logger.log("'Orangehrm' found");

        logger.log("Check top-menu");
        assertTrue(webDriver.findElement(By.id("top-menu")).isDisplayed());
        logger.log("'Top-menu' found");

        Thread.sleep(300);

        webDriver.quit();

    }
}


