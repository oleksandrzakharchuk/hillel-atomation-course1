package org.example.progeckts.orangehrm.oldPageObjeck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPage {
private final WebDriver webDriver;
private final WebDriverWait wait;

    public AdminPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        wait=new WebDriverWait(this.webDriver,30);
    }

    public AdminPage waitForPageLoad(){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("companyLogoHeader")));
        return this;
    }
    public Boolean checkCompanyLogoHeader(){
        return webDriver.findElement(By.id("companyLogoHeader")).isDisplayed();

    }
    public Boolean checkTopMenu(){

        return webDriver.findElement(By.id("top-menu")).isDisplayed();
    }
}

