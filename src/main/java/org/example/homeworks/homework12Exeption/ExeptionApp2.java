package org.example.homeworks.homework12Exeption;

import org.example.infrastructure.wdm.DefaultWebDriverManager;
import org.example.infrastructure.wdm.WebDriverManager;

public class ExeptionApp2 {
    public static void main(String[] args) {

        String browser=null;
        WebDriverManager wdm= new DefaultWebDriverManager();

        try{
            browser=wdm.getBrowser();


       /* }catch (Exception ex) {
            ex.printStackTrace();*/
        }finally {
            if(browser!=null)
                System.out.println("Closed browser");
                wdm.destroyBrowser(browser);
            System.out.println("Finnaly blok");

        }
        System.out.println("END");

    }
}
    /*Closed browser
    Closing browser:LOCAL Google Chrome
        Finnaly blok
        END*/