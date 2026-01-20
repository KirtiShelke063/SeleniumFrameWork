package pageObject;

import org.openqa.selenium.By;

public class CreateEmployeePageObject {

    public By name = By.name("Name");
    public By duration = By.id("DurationWorked");
    public By email = By.name("Email");
    public By salary = By.name("Salary");
    public By grade = By.name("Grade");
    public By createButton = By.xpath("//input[@value='Create']");
}
