package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class DashbordPage extends CommonMethods {

    @FindBy(id = "welcome")
    public WebElement welcomeText;

    @FindBy(id = "menu_pim_viewPimModule")
    public WebElement pimOption;



    @FindBy(id="menu_pim_addEmployee")
    public WebElement AddEmployee;

    public DashbordPage() {
        PageFactory.initElements(driver,this);
    }


}
