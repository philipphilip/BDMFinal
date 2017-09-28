package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoreCOSPage extends BaseClass {

	public CoreCOSPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = ".//a[text() = 'Change of Sex Notification']")
	public static WebElement ChangeOfSexNotification;

	@FindBy(xpath = ".//a[text() = 'Additional Notification Details']")
	public static WebElement additionaDetails;

	@FindBy(id = "subjectDetails-currentName-firstGivenName")
	public static WebElement firstGivenName;

	@FindBy(id = "subjectDetails-birthDetails-dateOfBirth-day")
	public static WebElement subjectDOBDay;

	@FindBy(id = "subjectDetails-birthDetails-dateOfBirth-month")
	public static WebElement subjectDOBMonth;

	@FindBy(id = "subjectDetails-birthDetails-dateOfBirth-year")
	public static WebElement subjectDOBYear;

	@FindBy(id = "subjectDetails-birthDetails-suburb")
	public static WebElement subjectDetailsSuburb;

	@FindBy(id = "subjectDetails-birthDetails-sex")
	public static WebElement subjectSex;

	@FindBy(id = "parent1Details-dateOfBirth-day")
	public static WebElement parent1DOBDay;

	@FindBy(id = "parent1Details-dateOfBirth-month")
	public static WebElement parent1DOBMonth;

	@FindBy(id = "parent1Details-dateOfBirth-year")
	public static WebElement parent1DOBYear;

	@FindBy(id = "parent1Details-suburb")
	public static WebElement parent1Suburb;

	@FindBy(id = "subjectDetails-residentialAddress-line1")
	public static WebElement subjectAddressLine1;

	@FindBy(id = "subjectDetails-residentialAddress-suburb")
	public static WebElement subjectAddressSuburb;

	@FindBy(id = "subjectDetails-residentialAddress-postcode")
	public static WebElement subjectAddressPostcode;

	@FindBy(id = "subjectDetails-postalAddress-line1")
	public static WebElement subjectPostalAddressLine1;

	@FindBy(id = "subjectDetails-postalAddress-suburb")
	public static WebElement subjectPostalAddressSuburb;

	@FindBy(id = "subjectDetails-postalAddress-postcode")
	public static WebElement subjectPostalAddressPostcode;

	@FindBy(id = "subjectDetails-contactDetails-telephoneNo")
	public static WebElement subjectTelephoneNo;

	@FindBy(id = "changeOfSexDetails-maritalStatus")
	public static WebElement maritalStatus;

	@FindBy(id = "changeOfSexDetails-sexToBeRegistered")
	public static WebElement sexToBeRegistered;

	@FindBy(id = "changeOfSexDetails-placeOfSexAffirmationSurgery")
	public static WebElement placeOfSexAffirmationSurgery;

	@FindBy(id = "changeOfNameDetails-changeOfNameLodged")
	public static WebElement changeOfNameLodged;

	@FindBy(id = "medicalPractitioner1Details-name-firstGivenName")
	public static WebElement medicalPractitionerFirstGivenName;

	@FindBy(id = "medicalPractitioner1Details-address-line1")
	public static WebElement medicalPractitionerAddressLine1;

	@FindBy(id = "medicalPractitioner1Details-address-suburb")
	public static WebElement medicalPractitionerAddressSuburb;

	@FindBy(id = "medicalPractitioner1Details-address-postcode")
	public static WebElement medicalPractitionerAddressPostcode;

	@FindBy(id = "medicalPractitioner1Details-telephoneNo")
	public static WebElement medicalPractitionerTelephoneNo;

	@FindBy(id = "medicalPractitioner2Details-name-firstGivenName")
	public static WebElement medicalPractitioner2FirstGivenName;

	@FindBy(id = "medicalPractitioner2Details-address-line1")
	public static WebElement medicalPractitioner2AddressLine1;

	@FindBy(id = "medicalPractitioner2Details-address-suburb")
	public static WebElement medicalPractitioner2AddressSuburb;

	@FindBy(id = "medicalPractitioner2Details-address-postcode")
	public static WebElement medicalPractitioner2AddressPostcode;

	@FindBy(id = "medicalPractitioner2Details-telephoneNo")
	public static WebElement medicalPractitioner2TelephoneNo;

	@FindBy(id = "declaration-relationshipToSubject")
	public static WebElement declarationRelationshipToSubject;

	@FindBy(id = "declaration-firstGivenName")
	public static WebElement declarationFirstGivenName;

	@FindBy(id = "declaration-declarationFromApplicant")
	public static WebElement declarationFromApplicant;
	
	@FindBy(xpath = "//*[@id='error-message']/div//div")
	public static WebElement alertMessage;
	

}
