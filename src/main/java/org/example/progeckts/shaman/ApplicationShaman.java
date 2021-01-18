package org.example.progeckts.shaman;


import org.example.progeckts.shaman.page.LoginPageShaman;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ApplicationShaman {
    private WebDriver browser;
    private WebDriverWait wait;

    public ApplicationShaman(WebDriver browser, WebDriverWait wait) {
        this.browser = browser;
        this.wait = wait;
    }
    public LoginPageShaman getLoginPageShaman(){
        return new LoginPageShaman(browser, wait);
    }
}
