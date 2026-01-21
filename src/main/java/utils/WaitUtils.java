package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Frameworkconstants;

public final class WaitUtils {

    private WaitUtils() {}

    public static void waitForVisibility(WebDriver driver, By locator) {

        new WebDriverWait(driver, Duration.ofSeconds(Frameworkconstants.EXPLICIT_WAIT))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForClick(WebDriver driver, By locator) {
        new WebDriverWait(driver, Duration.ofSeconds(Frameworkconstants.EXPLICIT_WAIT))
                .until(ExpectedConditions.elementToBeClickable(locator));
    }
}
