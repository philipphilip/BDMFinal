package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoreAdminCreateInternalUserPage extends BaseClass {

	public CoreAdminCreateInternalUserPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = ".//input[@name = 'username']")
	public static WebElement loginUserName;
	
	@FindBy(xpath = ".//input[@name = 'familyName']")
	public static WebElement userFamilyName;
	
	@FindBy(xpath = ".//input[@name = 'givenName']")
	public static WebElement userGivenName;
	
	@FindBy(xpath = ".//input[@name = 'emailAddress']")
	public static WebElement userEmailAddress;
	
	@FindBy(xpath = ".//input[@name = 'contactNumber']")
	public static WebElement userContactNumber;
	
	@FindBy(xpath = ".//select[@name = 'location']")
	public static WebElement location;
	
	@FindBy(xpath = ".//*[@id=\"roleAssignment\"]//input[@value = 'Add']")
	public static WebElement addButton;
	
	@FindBy(xpath = ".//select[@name = 'roleId']")
	public static WebElement roleId;
	
	@FindBy(xpath = ".//select[@name = 'level']")
	public static WebElement level;
	
	@FindBy(xpath = ".//select[@name = 'division']")
	public static WebElement division;
	
	@FindBy(xpath = "//*/option[text() = 'Processing']")
	public static WebElement processingTeam;
	
	@FindBy(xpath = "//*/option[text() = 'Registrations']")
	public static WebElement registrationsTeam;
	
	@FindBy(id = "btnRight")
	public static WebElement rightButton;
	
	@FindBy(xpath = "//*/input[@name = 'userCurrentTime']")
	public static WebElement userCurrentTimeCheckbox;
	
	@FindBy(id = "endDate")
	public static WebElement roleEffectiveDate;
	
	@FindBy(xpath = ".//div[1]/div/div/div[3]/input[@value = 'Add']")
	public static WebElement addRoleButton;
	
	@FindBy(xpath = ".//button[text() = 'Submit']")
	public static WebElement submitButton;
	
	@FindBy(xpath = ".//app-user-list//td[1]")
	public static WebElement searchResultsUserName;
	
	@FindBy(id = "familyName")
	public static WebElement searchFamilyName;
	
	@FindBy(xpath = ".//input[@value = 'Search']")
	public static WebElement searchButton;
}
