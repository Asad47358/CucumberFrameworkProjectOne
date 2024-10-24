package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import page.AddEmployeeToHRMS;
import utils.CommonMethods;
import utils.ConfigReader;

import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

public class AddEmpolyeeToHRMS extends CommonMethods {


    @Then("user able to click on PIM tab")
    public void user_able_to_click_on_pim_tab() {

        click(dashbordPage.pimOption);

    }
    @Then("user able to click on Add Employee tab")
    public void user_able_to_click_on_add_employee_tab() {

        click(dashbordPage.AddEmployee);

    }
    @Then("user should able to enter firstname and lastname")
    public void user_should_able_to_enter_firstname_and_lastname() {

        sendText("Asad",addEmployeeToHRMS.FirstName);
        sendText("Ahmadzad", addEmployeeToHRMS.LastName);

    }
    @Then("user able to click on Save button")
    public void user_able_to_click_on_save_button() {

        click(addEmployeeToHRMS.SaveButton);

    }
    @Then("user should able to enter firstname lastname and middleName")
    public void user_should_able_to_enter_firstname_lastname_and_middle_name() {

        sendText("Hasib", addEmployeeToHRMS.FirstName);
        sendText("Ahmadzad", addEmployeeToHRMS.LastName);
        sendText("ullah", addEmployeeToHRMS.MiddleName);

    }
    @Then("user should able to enter ID")
    public void user_should_able_to_enter_id() {

        sendText("9608586", addEmployeeToHRMS.empID);

    }
    @Then("the system should provide error messages for users")
    public void the_system_should_provide_error_messages_for_users() {
        Assert.assertTrue(addEmployeeToHRMS.existingEmpIdErrorMsg.isDisplayed());


    }

}
