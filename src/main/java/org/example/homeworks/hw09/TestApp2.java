package org.example.homeworks.hw09;
//test framework
public class TestApp2 {
    public static void main(String[] args) {

        GuestTests guestTests = new GuestTests();
        guestTests.startUp();
        guestTests.TestOpenCatalog();
        guestTests.cleanUp();
        System.out.println("--------------");

        guestTests.startUp();
        guestTests.TestOpenShopingCart();
        guestTests.cleanUp();

        System.out.println("___________");

        ClientTest clientTests = new ClientTest();
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
