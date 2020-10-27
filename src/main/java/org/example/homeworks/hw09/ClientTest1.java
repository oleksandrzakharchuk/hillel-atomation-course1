package org.example.homeworks.hw09;

import org.example.infrastructure.base.TestBase1;
import org.example.infrastructure.data.User;

public class ClientTest1 extends TestBase1 {



    @Override
    protected void beforeTest() {
super.beforeTest();

        logger.log("Login client");
        //User regularuser=new User("", "", "");
        User regularuser=usersMapper.FindUserByEmail("test5@gmail.com");

        //work with users. txt
        //
//loginPage.loginUser(user.getEmail, user.getPassword);
        System.out.println(regularuser.getEmail()+"-"+regularuser.getPassword());

        logger.log("Open orders page");

    }

    @Override
    protected void afterTest() {

    }

    public void testOrdersPage() { logger.log("Check orders are present");}

    public void testCompleteOrdersPage() {
        logger.log("Check completed order");
    }

    public void testProgresOrdersPage() {
        logger.log("Check completed order");
    }
}

