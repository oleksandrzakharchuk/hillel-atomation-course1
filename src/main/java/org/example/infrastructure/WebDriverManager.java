package org.example.infrastructure;

import java.util.concurrent.Callable;

public class WebDriverManager {

    public String createBrowser() {
        //public WebDriver createBrowser(){

        switch (ConfigurationMamager.getInstanse().getTestBrowser()) {

            case "chrome":
                return "Google Chrome";
            //return new ChromeDriver();

            case "firefox":
                return "MazillaFirefox";

            case "ie":
                return "Internet Explorer";
            default:
                return "";
        }
    }


    public void closeBrowser(String browser){

        System.out.println("Closing browser:" +browser);
        }

    }




