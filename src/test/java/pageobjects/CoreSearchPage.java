package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoreSearchPage extends BaseClass {

	public CoreSearchPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "deceasedDetails-name-familyName")
	public static WebElement deceasedFamilyName;
	
	@FindBy(id = "deceasedDetails-name-deceasedName-familyName")
	public static WebElement deceasedFamilyNameCod;
	
	@FindBy (id = "childsDetails-name-familyName")
	public static WebElement brsChildFamilyName;
	
	@FindBy(xpath = ".//button-panel//input[@value='Search']")
	public static WebElement searchButton;
	
	@FindBy(xpath = ".//search-results//div/a")
	public static WebElement firstSearchResult;
	
	@FindBy(xpath = ".//id-search-results//div/a")
	public static WebElement firstIdSearchResult;
	
	@FindBy(xpath = "//*[@id=\"deceasedDetails\"]//name-group/cge-text-input[1]/div/div")
	public static WebElement deceasedFamilyNameCheck;
	
	@FindBy(xpath = "//*[@id=\"statusBox\"]/div[2]/a")
	public static WebElement notificationId;
	
	@FindBy(xpath = "//*[@id=\"statusBox\"]/div[3]")
	public static WebElement notificationStatus;
	
	@FindBy(id = "itemNumber")
	public static WebElement itemNumber;
	
	@FindBy(id = "itemYear")
	public static WebElement itemYear;
	
	@FindBy(id = "appdetails-applicant-familyName")
	public static WebElement applicantFamilyName;
	
	@FindBy(id = "subject-familyName")
	public static WebElement subjectFamilyName;
	
	@FindBy(id = "preAdoptionChildsDetails-name-familyName")
	public static WebElement adoptedChildFormerFamilyName;
	
	@FindBy(xpath = "//*[@id=\"preAdoptionChildsDetails\"]//name-group/cge-text-input[1]/div/div")
	public static WebElement searchAdoptionNotifiationFamilyName;
	
	@FindBy(id = "presurrogacyChildDetails-name-familyName")
	public static WebElement preSurrogacyChildFamilyName;
	
	@FindBy(xpath = "//*[@id=\"presurrogacyChildDetails\"]//name-group/cge-text-input[1]/div/div")
	public static WebElement searchSurrogacyNotificationFamilyName;
	
	@FindBy(id = "applicant1Details-applicantsName-familyName")
	public static WebElement relationshipApplicant1FamilyName;
}
