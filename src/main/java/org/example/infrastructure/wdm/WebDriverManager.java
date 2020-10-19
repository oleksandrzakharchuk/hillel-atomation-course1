package org.example.infrastructure.wdm;


public interface WebDriverManager {

    String getBrowser();

    void destroyBrowser(String browser);

    String createBrowser();

    void closeBrowser(String browser);
}


    //public String createBrowser() {
        //public WebDriver createBrowser(){

        /*switch (ConfigurationManager.getInstance().getTestBrowser()) {

            case "chrome":
                return "Google Chrome";
            //return new ChromeDriver();

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




