package org.example.wdm.factories;

import org.example.config.ConfigurationManager;
import org.example.wdm.enums.WebDriverType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class RemoteWebDriverFactory implements WebDriverFactory {

@Override
    public String create(){
    WebDriverType webDriverType=
            WebDriverType.valueOf(ConfigurationManager.getInstance().getTestBrowser().toUpperCase());

    switch (webDriverType){
        case CHROME:
        case HEADLESS_CHROME:
            return "REMOTE Google Chrome";
        case FIREFOX:
            return "REMOTE  Mazilla Firefox";
        case EDGE:
            return "REMOTE  Internet Explorer";
        case SAFARI:
            return "REMOTE  Apple Safari";
        default:
            return "";

    }
}

    @Override
    public void get(String s) {

    }

    @Override
    public String getCurrentUrl() {
        return null;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public List<WebElement> findElements(By by) {
        return null;
    }

    @Override
    public WebElement findElement(By by) {
        return null;
    }

    @Override
    public String getPageSource() {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public void quit() {

    }

    @Override
    public Set<String> getWindowHandles() {
        return null;
    }

    @Override
    public String getWindowHandle() {
        return null;
    }

    @Override
    public TargetLocator switchTo() {
        return null;
    }

    @Override
    public Navigation navigate() {
        return null;
    }

    @Override
    public Options manage() {
        return null;
    }
}

