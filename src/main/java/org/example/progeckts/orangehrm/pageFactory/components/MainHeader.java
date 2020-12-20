package org.example.progeckts.orangehrm.pageFactory.components;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainHeader {

    private WebDriver webDriver;
    private WebDriverWait wait;
    private JavascriptExecutor js;
    private WebElement root;

    public MainHeader(WebDriver webDriver) {
        this.webDriver = webDriver;

        wait=new WebDriverWait(this.webDriver, 30);
        js=(JavascriptExecutor)this.webDriver;

        root=webDriver.findElement(By.id("top-menu"));
    }
    public void viewAdminCatalog(){
        try {
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("drop")));
        root.findElement(By.className("drop")).click();

        } catch (Exception e) {

            throw new RuntimeException("Admin catalog was not opened due to exeption: "+ e);
        }
    }
    public void viewPimCatalog(){

    }
    public void viewLeaveCatalog(){

    }

}
