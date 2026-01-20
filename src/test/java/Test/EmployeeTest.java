package Test;

import org.testng.annotations.Test;

import base.baseClass;
import pageEvent.CreateEmployeePageEvent;
import pageEvent.EmployeeListEvent;
import pageEvent.LoginPageEvent;

public class EmployeeTest extends baseClass {

    @Test
    public void verifyCreateEmployee() {

        // Login
        LoginPageEvent login = new LoginPageEvent();
        login.login("admin", "password");

        // Open Employee List
        EmployeeListEvent employeeList = new EmployeeListEvent();
        employeeList.openEmployeeList();
        employeeList.clickCreateNew();

        // Create Employee
        CreateEmployeePageEvent createEmployee = new CreateEmployeePageEvent();
        createEmployee.createEmployee(
                "John Doe",
                "5",
                "john.doe@test.com",
                "6000",
                "Senior"
        );
    }
}
