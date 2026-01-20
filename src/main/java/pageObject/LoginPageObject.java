package pageObject;

import org.openqa.selenium.By;

public final class LoginPageObject {

    private LoginPageObject() {}

    public static final By LOGIN_LINK = By.id("loginLink");
    public static final By USERNAME = By.name("UserName");
    public static final By PASSWORD = By.name("Password");
    public static final By REMEMBER_ME = By.id("RememberMe");
    public static final By LOGIN_BUTTON = By.cssSelector(".btn");
}
