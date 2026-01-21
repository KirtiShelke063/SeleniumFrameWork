package pageEvent;

import org.openqa.selenium.WebDriver;

import driver.DriverManager;
import pageObject.LoginPageObject;
import utils.WaitUtils;

public class LoginPageEvent {

    private WebDriver driver;

    public LoginPageEvent() {
        this.driver = DriverManager.getDriver();
    }

    public void openLoginPage() {
        WaitUtils.waitForClick(driver, LoginPageObject.LOGIN_LINK);
        driver.findElement(LoginPageObject.LOGIN_LINK).click();
    }

    public void login(String username, String password) {

        WaitUtils.waitForVisibility(driver, LoginPageObject.USERNAME);
        driver.findElement(LoginPageObject.USERNAME).sendKeys(username);

        driver.findElement(LoginPageObject.PASSWORD).sendKeys(password);
        driver.findElement(LoginPageObject.REMEMBER_ME).click();
        driver.findElement(LoginPageObject.LOGIN_BUTTON).click();
    }
}
