package progeckts.shaman;

import org.example.progeckts.shaman.page.LoginPageShaman;
import org.junit.Assert;
import org.junit.Test;

public class DemoShaman  {

    LoginPageShaman loginPageShaman;

    /*@Override
    protected void beforeTest() {
        loginPageShaman= app.getLoginPageShaman();
    }
*/
    @Test
    public void testAutoraizdWithEmptyFields(){
loginPageShaman.clickSubmit();
        Assert.assertEquals("Email cannot be blank.", loginPageShaman.getEmailErrorMessage());
        Assert.assertEquals("Password cannot be blank.",loginPageShaman.getPasswordErrorMessage());

/*
System.out.println(app.getLoginPageShaman().getEmailErrorMessage());
System.out.println(app.getLoginPageShaman().getPasswordErrorMessage());
*/
    }

}
