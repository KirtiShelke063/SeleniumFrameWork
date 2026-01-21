package Test;

import org.testng.annotations.Test;

import pageEvent.LoginPageEvent;
import base.baseClass;
import pageEvent.LoginPageEvent;

public class LoginTest extends baseClass {

    @Test
    public void verifyValidLogin() {

        LoginPageEvent login = new LoginPageEvent();
        login.login("admin", "password");
    }
}
