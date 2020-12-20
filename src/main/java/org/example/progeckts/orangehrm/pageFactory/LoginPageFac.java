package org.example.progeckts.orangehrm.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageFac {

    private final WebDriver webDriver;
    private final WebDriverWait wait;

    private final String errorMsgId="spanMessage";

    @FindBy(id = "txtUsername")
    private WebElement loginInput;

    @FindBy(id = "txtPassword")
    private WebElement passwordInput;

    @FindBy(id = "btnLogin")
    private WebElement loginButton;

    @FindBy(id = errorMsgId)
    private WebElement errorMessage;

    @FindBy(id = "drop")
    private WebElement topLinksBar;

    public LoginPageFac(WebDriver webDriver) {
        this.webDriver = webDriver;
        wait=new WebDriverWait(this.webDriver,30);

        PageFactory.initElements(this.webDriver, this);
    }

    public void enterLogin(String login) {
        loginInput.click();
        loginInput.clear();
        loginInput.sendKeys(login);

    }

    public void enterPassword(String password) {
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public String getErrorMessage() {
wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id(errorMsgId)));
    return errorMessage.getText();

    }
    public void topLinksBar(){
        topLinksBar.click();
    }
}


















