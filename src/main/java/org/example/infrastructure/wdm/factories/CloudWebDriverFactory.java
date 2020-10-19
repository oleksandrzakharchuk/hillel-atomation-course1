package org.example.infrastructure.wdm.factories;

import org.example.infrastructure.config.ConfigurationManager;
import org.example.infrastructure.wdm.enums.WebDriverType;

public class CloudWebDriverFactory implements WebDriverFactory {

    @Override
    public String create() {
        WebDriverType webDriverType=WebDriverType.valueOf(ConfigurationManager.getInstance().getTestBrowser().toUpperCase());
//вычитка со сстроки
        switch (webDriverType) {
            case CHROME:
            case HEADLESS_CHROME:
                return "CLOUD GoogleChrome";
            case FIREFOX:
                return "CLOUD Mozilla Firefox";
            case  EDGE:
            return "CLOUD Internet Explorer";
            case SAFARI:
                return "CLOUD Apple Safari";

            default:
            return "";

        }

    }
}

