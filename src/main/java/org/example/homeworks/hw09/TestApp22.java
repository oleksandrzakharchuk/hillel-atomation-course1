package org.example.homeworks.hw09;

public class TestApp22 {
    public static void main(String[] args) {

        GuestTests1 guestTests = new GuestTests1();
        guestTests.startUp();
        guestTests.TestOpenCatalog();
        guestTests.cleanUp();
        System.out.println("--------------");

        guestTests.startUp();
        guestTests.TestOpenShopingCart();
        guestTests.cleanUp();

        System.out.println("___________");

        ClientTest1 clientTests = new ClientTest1();
        clientTests.startUp();
        clientTests.testCompleteOrdersPage();
        clientTests.cleanUp();
        System.out.println("___________");

        clientTests.startUp();
        clientTests.testProgresOrdersPage();
        clientTests.cleanUp();
        System.out.println("___________");

        clientTests.startUp();
        clientTests.testOrdersPage();
        clientTests.cleanUp();

        System.out.println("___________");
    }
}

