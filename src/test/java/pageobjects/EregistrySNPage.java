package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EregistrySNPage extends BaseClass {

	public EregistrySNPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "surrogacyDetails-spoNumber")
	public static WebElement surrogacyOrderNumber;
	
	@FindBy(id = "surrogacyDetails-dateOrderMade-day")
	public static WebElement dateOrderMadeDay;
	
	@FindBy(id = "surrogacyDetails-dateOrderMade-month")
	public static WebElement dateOrderMadeMonth;
	
	@FindBy(id = "surrogacyDetails-dateOrderMade-year")
	public static WebElement dateOrderMadeYear;
	
	@FindBy(id = "presurrogacyChildDetails-name-familyName")
	public static WebElement currentFamilyName;
	
	@FindBy(id = "presurrogacyChildDetails-name-firstGivenName")
	public static WebElement currentFirstName;
	
	@FindBy(id = "presurrogacyChildDetails-birthCertReference")
	public static WebElement birthCertificate;
	
	@FindBy(id = "presurrogacyChildDetails-birthDetails-dateOfBirth-day")
	public static WebElement childDateOfBirthDay;
	
	@FindBy(id = "presurrogacyChildDetails-birthDetails-dateOfBirth-month")
	public static WebElement childDateOfBirthMonth;
	
	@FindBy(id = "presurrogacyChildDetails-birthDetails-dateOfBirth-year")
	public static WebElement childDateOfBirthYear;
	
	@FindBy(id = "surrogacyChildDetails-birthDetails-sexAtBirth")
	public static WebElement sexAtBirth;
	
	@FindBy(id = "surrogacyChildDetails-birthDetails-address-suburbTownCity")
	public static WebElement birthSuburb;
	
	@FindBy(id = "presurrogacyParent1Details-recordAs")
	public static WebElement preSurrogacyParent1RecordAs;
	
	@FindBy(id = "presurrogacyParent1Details-name-familyName")
	public static WebElement preSurrogacyParent1FamilyName;
	
	@FindBy(id = "presurrogacyParent1Details-name-firstGivenName")
	public static WebElement preSurrogacyParent1FirstName;
	
	@FindBy(id = "presurrogacyParent2Details-recordAs")
	public static WebElement preSurrogacyParent2RecordAs;
	
	@FindBy(id = "presurrogacyParent2Details-name-familyName")
	public static WebElement preSurrogacyParent2FamilyName;
	
	@FindBy(id = "presurrogacyParent2Details-name-firstGivenName")
	public static WebElement preSurrogacyParent2FirstName;
	
	@FindBy(id = "commissioningParent1Details-recordAs")
	public static WebElement commissioningParent1RecordAs;
	
	@FindBy(id = "commissioningParent1Details-name-familyName")
	public static WebElement commissioningParent1FamilyName;
	
	@FindBy(id = "commissioningParent1Details-name-firstGivenName")
	public static WebElement commissioningParent1FirstName;
	
	@FindBy(id = "commissioningParent1Details-emailAddress")
	public static WebElement commissioningParent1Email;
	
	@FindBy(id = "commissioningParent1Details-telephoneNo")
	public static WebElement commissioningParent1Phone;
	
	@FindBy(id = "commissioningParent2Details-recordAs")
	public static WebElement commissioningParent2RecordAs;
	
	@FindBy(id = "commissioningParent2Details-name-familyName")
	public static WebElement commissioningParent2FamilyName;
	
	@FindBy(id = "commissioningParent2Details-name-firstGivenName")
	public static WebElement commissioningParent2FirstName;
	
	@FindBy(id = "commissioningParent2Details-emailAddress")
	public static WebElement commissioningParent2Email;
	
	@FindBy(id = "commissioningParent2Details-telephoneNo")
	public static WebElement commissioningParent2Phone;
}
