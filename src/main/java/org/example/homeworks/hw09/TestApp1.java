package org.example.homeworks.hw09;

import org.example.infrastructure.TestLogger;
import org.example.infrastructure.TestServer;
import org.example.infrastructure.WebDriverManager;

public class TestApp1 {
    public static void main(String[] args) {
        TestLogger logger=new TestLogger();

        logger.log("Launch browser");
        WebDriverManager wdm=new WebDriverManager();
        String brawser= wdm.createBrowser();

        logger.log("Open website");
        System.out.println("-->"+brawser+"opening"+ TestServer.GetUrl());

        logger.log("Precondition1");
        System.out.println("-->Step1");

        logger.log("Precondition2");
        System.out.println("-->Step2");

        logger.log("Precondition3");
        System.out.println("-->Step3");

        logger.log("Check smth");
        System.out.println("-->Chek text on page");

        logger.log("Close browser");
        wdm.closeBrowser(brawser);
    }
}

