package org.example.wdm;

import org.example.config.ConfigurationManager;
import org.example.wdm.enums.RunOn;
import org.example.wdm.factories.CloudWebDriverFactory;
import org.example.wdm.factories.LocalWebDriverFactory;
import org.example.wdm.factories.RemoteWebDriverFactory;
import org.example.wdm.factories.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class DefaultWebDriverManager implements WebDriverManager{

    @Override
    public String getBrowser() {
        String result = null;
        WebDriverFactory webDriverFactory = null;

        RunOn runOn = RunOn.valueOf(ConfigurationManager.getInstance().getRunOn().toUpperCase());

        switch (runOn) {
            case LOCAL:
                webDriverFactory = new LocalWebDriverFactory();
                break;
            case REMOTE:
                webDriverFactory = new RemoteWebDriverFactory();
                break;
            case CLOUD:
                webDriverFactory = new CloudWebDriverFactory();
                break;
            default:
                result = "";
                break;// to be fixed
        }
        if (result == null) {
            result = webDriverFactory.create();
        }
        return result;
    }

    @Override
    public void destroyBrowser(WebDriver browser) {

    }

    @Override
    public void destroyBrowser(String browser)
    {System.out.println("Closing browser:"+browser);}

    @Override
    public WebDriver createBrowser() {
        return null;
    }

    @Override
    public void closeBrowser(WebDriver browser) {

    }

    /*@Override
    public void closeBrowser(WebDriver browser) {

    }
*/
    @Override
    public WebDriver getAvailableWebDriver() {
        return null;
    }
}



