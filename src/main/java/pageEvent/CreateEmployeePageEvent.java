package pageEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import driver.DriverManager;
import pageObject.CreateEmployeePageObject;

public class CreateEmployeePageEvent {

    WebDriver driver;
    CreateEmployeePageObject createEmployee = new CreateEmployeePageObject();

    public CreateEmployeePageEvent() {
        driver = DriverManager.getDriver();
    }

    public void createEmployee(
            String name,
            String duration,
            String email,
            String salary,
            String grade) {

        driver.findElement(createEmployee.name).sendKeys(name);
        driver.findElement(createEmployee.duration).sendKeys(duration);
        driver.findElement(createEmployee.email).sendKeys(email);
        driver.findElement(createEmployee.salary).sendKeys(salary);

        new Select(driver.findElement(createEmployee.grade))
                .selectByVisibleText(grade);

        driver.findElement(createEmployee.createButton).click();
    }
}
