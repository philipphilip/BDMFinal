package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EregistryCertificatesPage extends BaseClass {

	public EregistryCertificatesPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "productDetails-productDetails-linkedDocType")
	public static WebElement lifeEvent;
	
	@FindBy(id = "productDetails-productDetails-keyword")
	public static WebElement keyword;
	
	@FindBy(id = "productDetails-productDetails-quantity")
	public static WebElement quantity;
	
	@FindBy(id = "productDetails-productDetails-reasonCertificateIsRequired")
	public static WebElement reasonCertificateRequired;
	
	@FindBy(xpath = "//*[@id=\"applicantDetails\"]/div/div[2]/div/div/cge-text-input[1]/div/div")
	public static WebElement applicantFamilyName;
	
	@FindBy(id = "subjectDetails-dateOfEvent-dateOfDeath")
	public static WebElement dateOfDeathType;
	
	@FindBy(id = "date-of-death-on-day")
	public static WebElement dateOfDeathDay;
	
	@FindBy(id = "date-of-death-on-month")
	public static WebElement dateOfDeathMonth;
	
	@FindBy(id = "date-of-death-on-year")
	public static WebElement dateOfDeathYear;
	
	@FindBy(id = "subjectDetails-placeOfEvent-placeOfDeath")
	public static WebElement placeOfDeathSuburb;
	
	@FindBy(id = "deathSubjectDetails-deceasedDetails-familyName")
	public static WebElement deceasedFamilyName;
	
	@FindBy(id = "deathSubjectDetails-deceasedDetails-givenNames")
	public static WebElement deceasedGivenName;
	
	@FindBy(id = "deathSubjectDetails-deceasedDetails-familyNameAtBirth")
	public static WebElement deceasedFamilyNameAtBirth;
	
	@FindBy(id = "subjectDetails-deceasedDetails-dateOfBirth-day")
	public static WebElement dateOfBirthDay;
	
	@FindBy(id = "subjectDetails-deceasedDetails-dateOfBirth-month")
	public static WebElement dateOfBirthMonth;
	
	@FindBy(id = "subjectDetails-deceasedDetails-dateOfBirth-year")
	public static WebElement dateOfBirthYear;
	
	@FindBy(id = "deathSubjectDetails-parent1Details-type")
	public static WebElement parent1Type;
	
	@FindBy(id = "deathSubjectDetails-parent1Details-familyName")
	public static WebElement parent1FamilyName;
	
	@FindBy(id = "deathSubjectDetails-parent1Details-givenNames")
	public static WebElement parent1GivenName;
	
	@FindBy(id = "deathSubjectDetails-parent1Details-familyNameAtBirth")
	public static WebElement parent1FamilyNameAtBirth;
	
	@FindBy(id = "deathSubjectDetails-parent2Details-type")
	public static WebElement parent2Type;
	
	@FindBy(id = "deathSubjectDetails-parent2Details-familyName")
	public static WebElement parent2FamilyName;
	
	@FindBy(id = "deathSubjectDetails-parent2Details-firstGivenName")
	public static WebElement parent2GivenName;
	
	@FindBy(id = "deathSubjectDetails-parent2Details-familyNameAtBirth")
	public static WebElement parent2FamilyNameAtBirth;
	
	@FindBy(id = "orderDeliveryDetails-toPassport-sendCopyOfTheCertificateToPassportOffice")
	public static WebElement sendToPassportOffice;
	
	@FindBy(id = "orderDeliveryDetails-applicantPostalDetails-deliveryOption")
	public static WebElement deliveryOption;
	
	@FindBy(id = "orderDeliveryDetails-deliveryAddress-copyFrom")
	public static WebElement copyFrom;
	
	@FindBy(id = "orderDeliveryDetails-deliveryAddress-contactPhoneNumber")
	public static WebElement contactPhoneNumber;
	
	@FindBy(id = "certificate-draftList-subject1Name")
	public static WebElement subject1NameDrafts;
	
	@FindBy(id = "certificate-submittedList-subject1Name")
	public static WebElement subject1NameSubmits;
	
	@FindBy(id = "certificate-PaymentReference-method")
	public static WebElement paymentMethod;
	
	@FindBy(xpath = ".//h2[contains(text(),'Payment Successful')]")
	public static WebElement paymentSuccessMessage;
	
	@FindBy(xpath = ".//*[@id=\"certificatesList\"]//cge-text-input[1]/div/div")
	public static WebElement paymentReferenceNumber;
	
	@FindBy(xpath = ".//certificate-wiz-page/div/div[2]/alert/div")
	public static WebElement saveSuccessfulMessage;

	@FindBy(xpath = ".//*/td[2]/div/div")
	public static WebElement certificateNotificationNumber;
}
