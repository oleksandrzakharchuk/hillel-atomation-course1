package org.example.progeckts.orangehrm.oldPageObjeck;

import org.example.logger.TestLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPage {
    private final WebDriver webDriver;
    private TestLogger logger;

    public MainPage(WebDriver webDriver, TestLogger logger) {
        this.webDriver = webDriver;

        this.logger=logger;
    }
    public MainPage open(){
        logger.log("Open main page");
        webDriver.get("https://s2.demo.opensourcecms.com/orangehrm/");
        return this;
    }
public LoginPage clickLoginLink(){
        logger.log ("Click login linck");
    WebElement frmLogin=webDriver.findElement(By.id("frmLogin"));
    List<WebElement> loginLinks=frmLogin.findElements(By.tagName("LOGIN Panel"));
    for(WebElement link:loginLinks){
        if(link.getText().equals("LOGIN Panel")){
            link.click();
            break;
        }
    }
        return new LoginPage(webDriver,logger);
}
}

