package org.example.homeworks.hw09;

public class TestMentorCabinet extends TestBaseGameS {
    @Override
protected void beforeTest() {
    logger.log("Login Mentor to Game ");

}

    @Override
    protected void afterTest() {

    }

    public void testLoginMentorAccount() {
        logger.log("Negative testing of the Mentor password field");

    }
    public void testMentorInformation() {
        logger.log("Check Mentor information");

    }
    public void testMentorAccessToGroupsOfPlayers () {

        logger.log("Check Mentor Access To Groups Of Players");
    }

    public void testAchievements() {

        logger.log("Check Mebtor verification of achievement information");
    }
}



