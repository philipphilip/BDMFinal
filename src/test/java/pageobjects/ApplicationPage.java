package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplicationPage extends BaseClass {

	public ApplicationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "productDetails-productDetails-dateReceivedAtRegistry")
	public static WebElement dateReceivedAtRegistry;

	@FindBy(id = "productDetails-productDetails-productCode")
	public static WebElement productCode;

	@FindBy(id = "productDetails-productDetails-keyword")
	public static WebElement keyword;

	@FindBy(id = "productDetails-productDetails-reasonCertificateIsRequired")
	public static WebElement reasonCertificateIsRequired;

	@FindBy(id = "applicationDetails-applicationDetails-relationshipToSubject")
	public static WebElement relationshipToSubject;

	@FindBy(id = "productDetails-productDetails-submittedWithNotification")
	public static WebElement submittedWithNotification;

	@FindBy(xpath = ".//*/input[@value='Next']")
	public static WebElement nextButton;

	@FindBy(id = "applicantDetails-applicantDetails-familyName")
	public static WebElement applicantFamilyName;

	@FindBy(id = "applicantDetails-applicantDetails-givenNames")
	public static WebElement applicantGivenName;

	@FindBy(id = "applicantDetails-applicantDetails-dateOfBirth-day")
	public static WebElement applicantDOBDay;

	@FindBy(id = "applicantDetails-applicantDetails-dateOfBirth-month")
	public static WebElement applicantDOBMonth;

	@FindBy(id = "applicantDetails-applicantDetails-dateOfBirth-year")
	public static WebElement applicantDOBYear;

	@FindBy(id = "applicantDetails-address-line1")
	public static WebElement applicantAddressLine1;

	@FindBy(id = "applicantDetails-address-suburb")
	public static WebElement applicantAddressSuburb;

	@FindBy(id = "applicantDetails-address-postcode")
	public static WebElement applicantAddressPostcode;

	@FindBy(id = "applicantDetails-applicantDetails-phoneNumber")
	public static WebElement applicantPhoneNumber;

	@FindBy(id = "orderDeliveryDetails-deliveryAddress-familyName")
	public static WebElement deliveryAddressFamilyName;

	@FindBy(id = "aorderDeliveryDetails-address-line1")
	public static WebElement orderDeliveryAddressLine1;

	@FindBy(id = "orderDeliveryDetails-address-suburb")
	public static WebElement orderDeliveryAddressSuburb;

	@FindBy(id = "orderDeliveryDetails-address-postcode")
	public static WebElement orderDeliveryAddressPostcode;

	@FindBy(id = "orderDeliveryDetails-deliveryAddress-contactPhoneNumber")
	public static WebElement orderDeliveryContactPhoneNumber;

	@FindBy(id = "subjectDetails-matchType")
	public static WebElement matchType;

	@FindBy(id = "subjectDetails-dateOfEvent-dateOfDeath-type-day")
	public static WebElement dateOfDeathTypeDay;

	@FindBy(id = "subjectDetails-dateOfEvent-dateOfDeath-type-month")
	public static WebElement dateOfDeathTypeMonth;
	@FindBy(id = "subjectDetails-dateOfEvent-dateOfDeath-type-year")
	public static WebElement dateOfDeathTypeYear;

	@FindBy(id = "subjectDetails-subjectDeathDetails-familyName")
	public static WebElement deathDetailsFamilyName;

	@FindBy(id = "subjectDetails-subjectDeathDetails-familyNameAtBirth")
	public static WebElement deathDetailsFamilyNameAtBirth;

	@FindBy(id = "subjectDetails-subjectDeathDetails-givenNames")
	public static WebElement deathDetailsGivenNames;

	@FindBy(id = "subjectDetails-subjectDeathDetails-placeOfDeathSuburbTownCity")
	public static WebElement placeOfDeathSuburbTownCity;

	@FindBy(xpath = ".//*/input[@value='No matches']")
	public static WebElement noMatchButton;

	@FindBy(xpath = ".//*/input[@value='Submit Application']")
	public static WebElement submitApplication;

	@FindBy(xpath = ".//*/div[@class='alert-full']/alert/div")
	public static WebElement successMessage;

	@FindBy(xpath = ".//*[@id='error-message']/div/div[text()='There are validation errors in your application.']")
	public static WebElement errorBaner;

	@FindBy(xpath = ".//th[1]/input")
	public static WebElement validateCheckBox;

	@FindBy(xpath = ".//input[@value='Override']")
	public static WebElement overrideButton;

	@FindBy(xpath = ".//*[@id='Reason Code *']")
	public static WebElement acceptionReason;

	@FindBy(xpath = ".//application-wiz-page/override-popup/base-popup//div[@class='cge-input-field']/cge-wrapped-text-area/textarea[@id='Comments *']")
	public static WebElement reasonComment;

	@FindBy(xpath = ".//*/override-popup/base-popup/div/div/div/div[3]/div/button[text()='Override']")
	public static WebElement overrideButton2;

	public static void validateform() throws Exception {
		Thread.sleep(3000);
		boolean formHasErrors = errorBaner.getText().equals("There are validation errors in your application.");
		if (formHasErrors) {
			validateCheckBox.click();
			overrideButton.click();
			Thread.sleep(3000);
			acceptionReason.sendKeys("Court Order");
			reasonComment.sendKeys("any reason");
			overrideButton2.click();
			System.out.println("There were validation errors that got overridden");
		} else {
			System.out.println("There are no validation errors");
		}
	}

}
