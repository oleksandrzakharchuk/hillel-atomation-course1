package org.example.progeckts.shaman.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ErrorMessageShaman {
    private WebElement element;
    private WebDriverWait wait;

    public ErrorMessageShaman(WebElement element, WebDriverWait wait) {
        this.element = element;
        this.wait = wait;
    }
    public String getText(){
        wait.until(ExpectedConditions.presenceOfNestedElementLocatedBy(element, By.cssSelector("[class*=error]")));
        return element.findElement(By.cssSelector("[class*=error]")).getText().trim();
    }
}
