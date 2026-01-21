package pageEvent;

import org.openqa.selenium.WebDriver;

import driver.DriverManager;
import pageObject.EmployeeListPageObject;

public class EmployeeListEvent {

    WebDriver driver;

    EmployeeListPageObject employeeList = new EmployeeListPageObject();

    public EmployeeListEvent() {

        driver = DriverManager.getDriver();
    }

    public void openEmployeeList() {
        driver.findElement(employeeList.employeeListLink).click();
    }

    public void clickCreateNew() {
        driver.findElement(employeeList.createNew).click();
    }
}
