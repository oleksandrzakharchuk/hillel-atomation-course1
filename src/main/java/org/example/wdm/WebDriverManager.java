
package org.example.wdm;


import org.openqa.selenium.WebDriver;

public interface WebDriverManager {



    WebDriver getBrowser();

    void destroyBrowser(WebDriver browser);



    WebDriver createBrowser();

    void closeBrowser(WebDriver browser);

    WebDriver getAvailableWebDriver();

}



    //public String createBrowser() {
        //public WebDriver createBrowser(){

        /*switch (ConfigurationManager.getInstance().getTestBrowser()) {

            case "chrome":
                return "Google Chrome";
           return new ChromeDriver();

            case "firefox":
                return "MozillaFirefox";

            case "ie":
                return "Internet Explorer";
            default:
                return "";
        }
    }
*/

//    public void closeBrowser(String browser){
//
//        System.out.println("Closing browser:" +browser);
   //     }

   // }*/




