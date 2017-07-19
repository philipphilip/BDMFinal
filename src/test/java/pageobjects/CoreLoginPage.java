package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CoreLoginPage extends BaseClass {

	public CoreLoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = ".//*[@id='Username']")
	public static WebElement username;

	@FindBy(xpath = ".//*[@id='Password']")
	public static WebElement password;

	@FindBy(xpath = ".//*[contains(text(),'Login')]")
	public static WebElement signin_button;

	@FindBy(id = "username")
	public static WebElement coreAdminUsername;

	@FindBy(id = "password")
	public static WebElement coreAdminUpassword;

	@FindBy(xpath = ".//div/form/div[3]/button[contains(text(),'Login')]")
	public static WebElement coreAdminUsignin_button;

	@FindBy(xpath = ".//*/a[contains(text(),'About')]")
	public static WebElement the_about_tab;

	@FindBy(how = How.ID, using = "email_create")
	public static WebElement email_create;

	@FindBy(how = How.ID, using = "SubmitCreate")
	public static WebElement submit_create;

	@FindBy(xpath = "//*/a[contains(text(),'Marriage')]")
	public static WebElement marriageTab;

	@FindBy(xpath = "//*/a[contains(text(),'New Marriage Notification')]")
	public static WebElement new_marriageNote;

	@FindBy(xpath = "//*/a[contains(text(),'Logout')]")
	public static WebElement sign_out;
}
