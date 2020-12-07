package orangehrmTestEx;

import jdk.internal.access.JavaIOFileDescriptorAccess;
import org.example.logger.StdTestLogger;
import org.example.logger.TestLogger;
import org.example.utils.TimeUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OrangeHrm {

    TestLogger logger = new StdTestLogger();
    private JavaIOFileDescriptorAccess webDriver;

    @Test
    public void testSeccesLogin() throws InterruptedException {
        logger.log("Open browser");
         //WebDriver webDriver = new FirefoxDriver();
       // System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");


        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        WebDriver webDriver=new ChromeDriver();

        webDriver.manage().window().setSize(new Dimension(1920, 1240));

        WebDriverWait wait=new WebDriverWait(webDriver, 30, 1000);

        logger.log("Open website");
        webDriver.get("https://s2.demo.opensourcecms.com/orangehrm/");
        // Thread.sleep(5000);


        logger.log("Check URL");
        assertEquals("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login", webDriver.getCurrentUrl());
        System.out.println(webDriver.getCurrentUrl());

        logger.log("Check Title");
        assertEquals("", webDriver.getTitle());
        System.out.println(webDriver.getTitle());

        //logger.log("Check LOGIN Panel");
        // webDriver.findElement(By.linkText("LOGIN Panel")).click();
        //logger.log("'LOGIN Panel' found")
        // NoSuchElementException: Unable to locate element: LOGIN Panel
        Thread.sleep(2000);

        logger.log("Check LOGIN Panel");
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("frmLogin")));
        WebElement frmLogin=webDriver.findElement(By.id("frmLogin"));
        List<WebElement> loginLinks=frmLogin.findElements(By.tagName("LOGIN Panel"));
       for(WebElement link:loginLinks){
           if(link.getText().equals("LOGIN Panel")){
               link.click();
               break;
           }
       }
        logger.log("'LOGIN Panel' found");

        logger.log("Click on 'Username' link ");
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("frmLogin")));
        WebElement usernameInput=webDriver.findElement(By.id("txtUsername"));
        usernameInput.click();
        usernameInput.clear();
        usernameInput.sendKeys("opensourcecms");
        logger.log("Entered Username");

        /*webDriver.findElement(By.id("txtUsername")).click();
        logger.log("Enter Username");
        webDriver.findElement(By.id("txtUsername")).sendKeys("opensourcecms");
*/
        logger.log("Click on 'Password' link ");
        WebElement passwordInput=webDriver.findElement(By.id("txtPassword"));
        passwordInput.click();
        passwordInput.clear();

        for(char letter:"opensourcecms".toCharArray()){
            passwordInput.sendKeys("" +letter);
            Thread.sleep(300);
        }

       /* webDriver.findElement(By.id("txtPassword")).click();
        logger.log("Enter Password ");
        webDriver.findElement(By.id("txtPassword")).sendKeys("opensourcecms");*/

        logger.log("Click 'Login' button");
          webDriver.findElement(By.id("btnLogin")).click();
          //Thread.sleep(3000);
        logger.log("Check Login is successful ");

        logger.log("Check companyLogoHeader");
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("companyLogoHeader")));
        assertTrue(webDriver.findElement(By.id("companyLogoHeader")).isDisplayed());
        logger.log("'Orangehrm' found");

        logger.log("Check top-menu");
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("top-menu")));
        assertTrue(webDriver.findElement(By.id("top-menu")).isDisplayed());
        logger.log("'Top-menu' found");

       // Thread.sleep(300);
        TimeUtils.waitFor(2);

        webDriver.quit();



    }
}


