package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import constants.Frameworkconstants;
import driver.DriverManager;

public class baseClass {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = DriverManager.getDriver();
        driver.get(Frameworkconstants.BASE_URL);
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
