package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoreCONPage extends BaseClass {

	public CoreCONPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = ".//a[text() = 'Additional Notification Details']")
	public static WebElement additionalNotificationDetails;

	@FindBy(id = "additionalNotificationDetails-connType")
	public static WebElement connType;

	@FindBy(id = "subjectDetails-currentName-firstGivenName")
	public static WebElement firstGivenName;

	@FindBy(id = "subjectDetails-birthDetails-dateOfBirth-day")
	public static WebElement dateOfBirthDay;

	@FindBy(id = "subjectDetails-birthDetails-dateOfBirth-month")
	public static WebElement dateOfBirthMonth;

	@FindBy(id = "subjectDetails-birthDetails-dateOfBirth-year")
	public static WebElement dateOfBirthYear;

	@FindBy(id = "subjectDetails-birthDetails-country")
	public static WebElement countryOfBirth;

	@FindBy(id = "subjectDetails-birthDetails-isCurrentNameDifferentFromBirthName")
	public static WebElement isCurrentNameDifferentFromBirthName;

	@FindBy(id = "subjectDetails-birthDetails-sex")
	public static WebElement subjectSex;

	@FindBy(id = "subjectDetails-residentialAddress-line1")
	public static WebElement residentialAddressLine1;

	@FindBy(id = "subjectDetails-residentialAddress-suburb")
	public static WebElement residentialAddressSuburb;

	@FindBy(id = "subjectDetails-residentialAddress-postcode")
	public static WebElement residentialAddressPostcode;

	@FindBy(id = "subjectDetails-residentialAddress-residingInVictoriaForPastTwelveMonths")
	public static WebElement residingInVictoriaForPastTwelveMonths;

	@FindBy(id = "subjectDetails-contactDetails-telephoneNo")
	public static WebElement contactDetailsTelephoneNo;

	@FindBy(id = "parent1Details-parentType")
	public static WebElement parent1ParentType;

	@FindBy(id = "parent1Details-firstGivenName")
	public static WebElement parent1FirstGivenName;

	@FindBy(id = "newNameDetails-firstGivenName")
	public static WebElement newNameDetailsFirstGivenName;

	@FindBy(id = "supportingInformation-hasFinancialDefaults")
	public static WebElement hasFinancialDefaults;

	@FindBy(id = "supportingInformation-hasBeenDeclaredBankrupt")
	public static WebElement hasBeenDeclaredBankrupt;

	@FindBy(id = "supportingInformation-hasBeenArrestedChargedOnBailOrConvictedOfFraud")
	public static WebElement hasBeenArrestedChargedOnBailOrConvictedOfFraud;

	@FindBy(id = "supportingInformation-isPrisonerOnParoleOrRegisteredSexOffender")
	public static WebElement isPrisonerOnParoleOrRegisteredSexOffender;

	@FindBy(id = "supportingInformation-certificates-isOriginalCertSubmitted")
	public static WebElement isOriginalCertSubmitted;

	@FindBy(id = "supportingInformation-certificates-numOfCertsIssued")
	public static WebElement numOfCertsIssued;

	@FindBy(id = "previouslyRegisteredNames-reasonForChangingTheName")
	public static WebElement reasonForChangingTheName;

	@FindBy(id = "previouslyRegisteredNames-allIdentityDocumentsAreInCurrentName")
	public static WebElement allIdentityDocumentsAreInCurrentName;

	@FindBy(id = "previouslyRegisteredNames-numberOfPreviousChangesOfName")
	public static WebElement numberOfPreviousChangesOfName;

	@FindBy(id = "declarant1Details-relationshipToSubject")
	public static WebElement relationshipToSubject;

	@FindBy(id = "declarant1Details-firstGivenName")
	public static WebElement declarant1FirstGivenName;

	@FindBy(id = "declarant1Details-declarationFromApplicant")
	public static WebElement declarationFromApplicant;

	@FindBy(id = "proofOfIdentity-rightToResideInAus")
	public static WebElement rightToResideInAus;

	@FindBy(id = "guarantorDetails-isGuarantorNeeded")
	public static WebElement isGuarantorNeeded;

	@FindBy(xpath = ".//*[@id='error-message']/div/div")
	public static WebElement ChangeNotificationsuccessful;

}
