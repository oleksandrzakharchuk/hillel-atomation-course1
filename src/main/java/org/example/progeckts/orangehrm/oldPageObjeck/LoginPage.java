package org.example.progeckts.orangehrm.oldPageObjeck;

import org.example.logger.TestLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private final WebDriver webDriver;
    private final TestLogger logger;
    private final WebDriverWait wait;


    public LoginPage(WebDriver webDriver, TestLogger logger) {
        this.webDriver = webDriver;
        wait=new WebDriverWait(this.webDriver,30);
        this.logger=logger;
    }
    public LoginPage enterLogin(String login){
        logger.log("Enter login");
        WebElement usernameInput=webDriver.findElement(By.id("txtUsername"));
        usernameInput.click();
        usernameInput.clear();
        usernameInput.sendKeys(login);
        return this;
    }
    public LoginPage enterPassword(String password) throws InterruptedException {
        logger.log("Enter password");
        WebElement passwordInput=webDriver.findElement(By.id("txtPassword"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(password);

        return this;
    }
    public AdminPage clickLoginButton(){
        clickLogin();
        return new AdminPage(webDriver);


    }
    public LoginPage clickFailLoginButton(){
        webDriver.findElement(By.id("btnLogin")).click();
        clickLogin();
        return this;
    }

    public Boolean isErrorMessagePresent(){
        return getErrorMessageElement().isDisplayed();
    }

    public String getErrorMessage(){
        return getErrorMessageElement().getText();
    }
    private WebElement getErrorMessageElement(){
    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("spanMessage")));
    return webDriver.findElement(By.id("spanMessage"));
}

    private void clickLogin(){
        logger.log("Click Login Button");
        webDriver.findElement(By.id("btnLogin")).click();
    }


    }

