package org.example.infrastructure.wdm.factories;

import org.example.infrastructure.config.ConfigurationManager;
import org.example.infrastructure.wdm.enums.WebDriverType;

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
}

