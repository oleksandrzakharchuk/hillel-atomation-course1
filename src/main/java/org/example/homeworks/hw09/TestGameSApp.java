package org.example.homeworks.hw09;

public class TestGameSApp {
    public static void main(String[] args) {

        TestPlayerCabinet playerTests = new TestPlayerCabinet();
        playerTests.startUp();
        playerTests.testLoginPlayerAccount();
        playerTests.cleanUp();
        System.out.println("--------------");

        playerTests.startUp();
        playerTests.testPlayerInformation();
        playerTests.cleanUp();

        System.out.println("___________");

        playerTests.startUp();
        playerTests.testСhangingPassword();
        playerTests.cleanUp();

        System.out.println("___________");

        playerTests.startUp();
        playerTests.testAchievements();
        playerTests.cleanUp();

        System.out.println("___________");

        TestMentorCabinet mentorTests = new TestMentorCabinet();
        mentorTests.startUp();
        mentorTests.testLoginMentorAccount();
        mentorTests.cleanUp();
        System.out.println("___________");

        mentorTests.startUp();
        mentorTests.testMentorInformation();
        mentorTests.cleanUp();
        System.out.println("___________");

        mentorTests.startUp();
        mentorTests.testMentorAccessToGroupsOfPlayers();
        mentorTests.cleanUp();

        System.out.println("___________");
    }
}


