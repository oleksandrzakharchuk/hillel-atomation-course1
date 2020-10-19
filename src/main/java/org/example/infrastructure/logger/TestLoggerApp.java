package org.example.infrastructure.logger;

public class TestLoggerApp {
    public static void main(String[] args) {
        TestLogger logger = new TestLogger() {
            @Override
            public void log(String msg) {

            }
        };

        logger.log("Start browser");
        //selenium code
        logger.log("Open website");
        //selenium code
        logger.log("Open login form");
        //selenium code
        logger.log("Enter credentials");
        //selenium code
        logger.log("Clic login");
        //selenium code
        logger.log("Test user successfully logged in");
        //selenium code
        logger.log("Close browser");
        //selenium code

    }
}
