package org.example.homeworks.hw09;

public class TestPlayerCabinet extends TestBaseGameS {
    @Override
    protected void beforeTest() {
        logger.log("Login Player  to Game ");

           }

    @Override
    protected void afterTest() {

    }

    public void testLoginPlayerAccount() {
        logger.log("Negative testing of the Player password field");

    }
    public void testPlayerInformation() {
        logger.log("Check player information");

    }
    public void testСhangingPassword () {

        logger.log("Check change password of the Player");
    }

    public void testAchievements() {

        logger.log("Check Player verification of achievement information");
    }
}


