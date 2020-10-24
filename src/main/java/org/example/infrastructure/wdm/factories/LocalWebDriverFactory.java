package org.example.infrastructure.wdm.factories;

import org.example.infrastructure.config.ConfigurationManager;
import org.example.infrastructure.wdm.enums.WebDriverType;

public class LocalWebDriverFactory implements WebDriverFactory {

@Override
    public String create(){
        WebDriverType webDriverType=
            WebDriverType.valueOf(ConfigurationManager.getInstance().getTestBrowser().toUpperCase());

    switch (webDriverType)//switch (String)
    {
        case CHROME:
        case HEADLESS_CHROME:
            return "LOCAL Google Chrome";
        case FIREFOX:
            return "LOCAL Mozilla Firefox";
        case EDGE:
            return "LOCAL Internet Explorer";
        case SAFARI:
            return "LOCAL Apple Safari";
        default:
           // return "";
            throw new IllegalArgumentException();
    }
    }
}

