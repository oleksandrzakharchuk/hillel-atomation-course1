
package org.example.wdm;

import org.example.config.ConfigurationManager;
import org.example.wdm.enums.RunOn;
import org.openqa.selenium.WebDriver;

public class DefaultWebDriverManager implements WebDriverManager{

    @Override
    public WebDriver getBrowser() {

        RunOn runOn = RunOn.valueOf(ConfigurationManager.getInstance().getRunOn().toUpperCase());

        switch (runOn) {
            case LOCAL:
            case REMOTE:
            case CLOUD:
                break;
            default:
                break;// to be fixed
        }
        return null;
    }


    @Override
    public void destroyBrowser(WebDriver browser) {

    }


    @Override
    public WebDriver createBrowser() {
        return null;
    }


    @Override
    public void closeBrowser(WebDriver browser) {

    }

        @Override
    public WebDriver getAvailableWebDriver() {
        return null;
    }
}



