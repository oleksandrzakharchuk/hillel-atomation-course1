package org.example.progeckts.orangehrm.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MainPageFact {

    private WebDriver webDriver;

    @FindBy(id = "frmLogin")
    WebElement loginPanel;

/*public TopLinksBar topLinksBar(){
    return new TopLinksBar(webDriver.findElement(By.id("top-menu"));

}*/


    public MainPageFact(WebDriver webDriver) {
        this.webDriver = webDriver;

        PageFactory.initElements(this.webDriver, this);
    }

    public void clickLoginButtonFac() {
        List<WebElement> loginLinks = loginPanel.findElements(By.tagName("LOGIN Panel"));
        for (WebElement link : loginLinks) {
            if (link.getText().equals("LOGIN Panel")) {
                link.click();
                break;
            }
        }
    }


    public void LoginPageFac(WebDriver webDriver) {
        this.webDriver = webDriver;
        WebDriverWait wait = new WebDriverWait(this.webDriver, 30);

        PageFactory.initElements(this.webDriver, this);


    }

    public void clickLoginButton() {
        WebElement frmLogin=webDriver.findElement(By.id("frmLogin"));
        List<WebElement> loginLinks = loginPanel.findElements(By.tagName("LOGIN Panel"));
        for (WebElement link : loginLinks) {
            if (link.getText().equals("LOGIN Panel")) {
                link.click();
                break;

            }
        }

    }
}
