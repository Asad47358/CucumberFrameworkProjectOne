package page;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeeToHRMS extends CommonMethods {

    @FindBy(id="firstName")
    public WebElement FirstName;

    @FindBy(id="middleName")
    public WebElement MiddleName;

    @FindBy(id="lastName")
    public WebElement LastName;

    @FindBy(id="employeeId")
    public WebElement empID;

    @FindBy(id="btnSave")
    public WebElement SaveButton;

    @FindBy(id="txtUsername")
    public WebElement userName;

    @FindBy(id="txtPassword")
    public WebElement Password;

    @FindBy (id ="btnLogin")
    public WebElement loginButton;

    @FindBy(id = "menu_pim_viewPimModule")
    public WebElement pimOption;

    @FindBy(xpath = "//div[@class='message warning fadable']")
    public WebElement existingEmpIdErrorMsg;

    public AddEmployeeToHRMS(){

        PageFactory.initElements(driver, this);
    }


}
