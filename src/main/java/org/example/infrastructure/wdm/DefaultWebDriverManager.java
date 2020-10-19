package org.example.infrastructure.wdm;

import org.example.infrastructure.config.ConfigurationManager;
import org.example.infrastructure.wdm.enums.RunOn;
import org.example.infrastructure.wdm.factories.CloudWebDriverFactory;
import org.example.infrastructure.wdm.factories.LocalWebDriverFactory;
import org.example.infrastructure.wdm.factories.RemoteWebDriverFactory;
import org.example.infrastructure.wdm.factories.WebDriverFactory;

public class DefaultWebDriverManager implements WebDriverManager{

    @Override
    public String getBrowser(){
       WebDriverFactory webDriverFactory;

        RunOn runOn=RunOn.valueOf(ConfigurationManager.getInstance().getRunOn().toUpperCase());

        switch (runOn){
            case LOCAL:
                webDriverFactory=new LocalWebDriverFactory();
                break;
            case REMOTE:
                webDriverFactory=new RemoteWebDriverFactory();
                break;
            case CLOUD:
                webDriverFactory=new CloudWebDriverFactory();
                break;
            default:
                return "";// to be fixed
        }
        return webDriverFactory.create();
    }

    @Override
    public void destroyBrowser(String browser)
    {System.out.println("Closing browser:"+browser);}

    @Override
    public String createBrowser() {
        return null;
    }

    @Override
    public void closeBrowser(String browser) {

    }
}



