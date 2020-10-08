package org.example.homeworks.hw09;

public class ClientTest1 extends TestBase1 {

    @Override
    protected void beforeTest() {
        logger.log("Login client");

        logger.log("Open orders page");
    }

    @Override
    protected void afterTest() {

    }

    public void testOrdersPage() {
        logger.log("Check orders are present");

    }

    public void testCompleteOrdersPage() {
        logger.log("Check completed order");
    }

    public void testProgresOrdersPage() {
        logger.log("Check completed order");
    }
}

