package org.example.progeckts.shaman.page;

import org.example.progeckts.shaman.elements.ErrorMessageShaman;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageShaman {

    private WebDriver browser;
    private WebDriverWait wait;

    public LoginPageShaman(WebDriver browser, WebDriverWait wait) {
        this.browser = browser;
        this.wait = wait;
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("[class*=\"forgot-password\"]")));
    }

    public void setEmail(String email){
        getInput(Type.EMAIL).findElement(By.cssSelector("input")).sendKeys(email);
    }

    public void setPassword(String password) {
        getInput(Type.PASSWORD).findElement(By.cssSelector("input")).sendKeys(password);
    }
    public void clickSubmit() {
        browser.findElement(By.cssSelector("[type=\"submit\"]")).click();
    }

     public void clickForgotPassword(String email) {
         browser.findElement(By.cssSelector("[class*=\"forgot-password\"]")).click();
     }
     public String getEmailErrorMessage(){
        return new ErrorMessageShaman(getInput(Type.EMAIL),wait).getText().trim();
            }
     public String getPasswordErrorMessage(){
         return new ErrorMessageShaman(getInput(Type.PASSWORD),wait).getText().trim();
     }

    private WebElement getInput(Type type){
    return browser.findElement(By.cssSelector("[class*=\"" +type.toString().toLowerCase()+ "-input\"] "));
    }
    enum Type{
        EMAIL, PASSWORD
}
}

