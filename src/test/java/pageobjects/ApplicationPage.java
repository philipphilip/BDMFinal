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

	@FindBy(id = "productDetails-productDetails-template")
	public static WebElement productDetailsTemplate;

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

	@FindBy(id = "orderDeliveryDetails-applicantPostalDetails-deliveryOption")
	public static WebElement deliveryMethod;

	@FindBy(id = "orderDeliveryDetails-deliveryAddress-copyFrom")
	public static WebElement deliveryAddressCopyFrom;

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

	@FindBy(id = "override-reasonCode")
	public static WebElement acceptionReason;

	@FindBy(id = "override-comment")
	public static WebElement reasonComment;

	@FindBy(xpath = ".//*/override-popup/base-popup/div/div/div/div[3]/div/button[text()='Override']")
	public static WebElement overrideButton2;
	
	@FindBy(id = "subjectDetails-dateOfEvent-dateOfBirth-on-day")
	public static WebElement dateOfBirthDay;
	
	@FindBy(id = "subjectDetails-dateOfEvent-dateOfBirth-on-month")
	public static WebElement dateOfBirthMonth;
	
	@FindBy(id = "subjectDetails-dateOfEvent-dateOfBirth-on-year")
	public static WebElement dateOfBirthYear;
	
	@FindBy(id = "subjectDetails-subjectBirthDetails-familyName")
	public static WebElement birthDetailsFamilyName;
	
	@FindBy(id = "subjectDetails-subjectBirthDetails-givenNames")
	public static WebElement birthDetailsGivenName;
	
	@FindBy(id = "subjectDetails-subjectBirthDetails-placeOfBirthSuburbTownCity")
	public static WebElement placeOfBirthSuburbTownCity;
	
	@FindBy(xpath = ".//input[@value='Create Transaction']")
	public static WebElement createTransactionButton;
	
	@FindBy(id = "Paid - TODO REMOVE ME")
	public static WebElement paidCheckbox;
	
	@FindBy(xpath = ".//input[@value='Save']")
	public static WebElement saveTransactionButton;
	
	@FindBy(xpath = ".//input[@value='Generate Certificate']")
	public static WebElement generateCertificateButton;
	
	@FindBy(xpath = ".//input[@value='Print']")
	public static WebElement printCertificateButton;
	
	@FindBy(xpath = ".//action-panel//h3[contains(text(), 'Application')]")
	public static WebElement pageHeader;
	
	
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
