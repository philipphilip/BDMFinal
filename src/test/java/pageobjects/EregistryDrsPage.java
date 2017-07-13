package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EregistryDrsPage extends BaseClass {

	public EregistryDrsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "deceasedDetails-name-familyName")
	public static WebElement familyName;

	@FindBy(id = "deceasedDetails-name-givenNames")
	public static WebElement givenName;

	@FindBy(id = "deceasedDetails-sex")
	public static WebElement sex;

	@FindBy(id = "deceasedDetails-relevantDates-dateOfDeath-type")
	public static WebElement dateOfDeathType;

	@FindBy(id = "deceasedDetails-relevantDates-dateOfDeath-dateExact-day")
	public static WebElement deathDay;

	@FindBy(id = "deceasedDetails-relevantDates-dateOfDeath-dateExact-month")
	public static WebElement deathMonth;

	@FindBy(id = "deceasedDetails-relevantDates-dateOfDeath-dateExact-year")
	public static WebElement deathYear;

	@FindBy(id = "deceasedDetails-relevantDates-dateOfBirth-type")
	public static WebElement dateOfBirthType;

	@FindBy(id = "deceasedDetails-relevantDates-dateOfBirth-day")
	public static WebElement birthDay;

	@FindBy(id = "deceasedDetails-relevantDates-dateOfBirth-month")
	public static WebElement birthMonth;

	@FindBy(id = "deceasedDetails-relevantDates-dateOfBirth-year")
	public static WebElement birthYear;

	@FindBy(id = "deceasedDetails-placeOfDeath-whereDidDeathOccur")
	public static WebElement deathWhere;

	@FindBy(id = "deceasedDetails-placeOfDeath-hospitalName")
	public static WebElement hospitalName;

	@FindBy(id = "deceasedDetails-placeOfDeath-hospitalTownSuburbCity")
	public static WebElement hospitalTownSuburbCity;

	@FindBy(id = "deceasedDetails-place-suburbTownCity")
	public static WebElement birthSuburb;

	@FindBy(id = "deceasedDetails-residence-line1")
	public static WebElement residenceLine1;

	@FindBy(id = "deceasedDetails-residence-suburb")
	public static WebElement residenceSuburb;

	@FindBy(id = "deceasedDetails-residence-postcode")
	public static WebElement residencePostcode ;

	@FindBy(id = "deceasedDetails-otherDetails-occupationDuringWorkingLife")
	public static WebElement occupation;

	@FindBy(id = "deceasedDetails-otherDetails-aboriginalOrTorresStraitIslanderOrigin")
	public static WebElement aboriginal;

	@FindBy(id = "deceasedRelationshipDetails-relationshipStatus")
	public static WebElement relationship;

	@FindBy(id = "deceasedRelationshipDetails-registrationPlace-suburb")
	public static WebElement relationshipSuburb;

	@FindBy(id = "deceasedRelationshipDetails-ageAtCommencement")
	public static WebElement relationshipAge;

	@FindBy(id = "deceasedRelationshipDetails-spouseDetails-spouseName-familyName")
	public static WebElement spouseFamilyName;

	@FindBy(id = "deceasedRelationshipDetails-spouseDetails-spouseName-firstGivenName")
	public static WebElement spouseGivenName;

	@FindBy(id = "deceasedPreviousRelationshipDetails-numberOfPreviousRelationships")
	public static WebElement numberPreviousRelationships;

	@FindBy(id = "childrenOfTheDeceased-numberOfChildren")
	public static WebElement numberOfChildren;

	@FindBy(id = "parentsOfDeceased-parent1-parentType")
	public static WebElement parent1Type;

	@FindBy(id = "parentsOfDeceased-parent1-familyName")
	public static WebElement parent1FamilyName;

	@FindBy(id = "parentsOfDeceased-parent1-givenNames")
	public static WebElement parent1GivenName;

	@FindBy(id = "parentsOfDeceased-parent1-occupation")
	public static WebElement parent1Occupation;

	@FindBy(id = "parentsOfDeceased-parent2-parentType")
	public static WebElement parent2Type;

	@FindBy(id = "parentsOfDeceased-parent2-familyName")
	public static WebElement parent2FamilyName;

	@FindBy(id = "parentsOfDeceased-parent2-givenNames")
	public static WebElement parent2GivenName;

	@FindBy(id = "parentsOfDeceased-parent2-occupation")
	public static WebElement parent2Occupation;

	@FindBy(id = "siblingsOfTheDeceased-deceasedUnder18")
	public static WebElement under18;

	@FindBy(id = "siblingsOfTheDeceased-numberOfSiblings")
	public static WebElement numberSibling;

	@FindBy(id = "informantDetails-relationshipToSubject")
	public static WebElement informantRelationship;

	@FindBy(id = "informantDetails-name-familyName")
	public static WebElement informantFamilyName;

	@FindBy(id = "informantDetails-name-givenNames")
	public static WebElement informantGivenName;

	@FindBy(id = "informantDetails-residentialAddress-line1")
	public static WebElement informantLine1;

	@FindBy(id = "informantDetails-residentialAddress-suburb")
	public static WebElement informantSuburb;

	@FindBy(id = "informantDetails-residentialAddress-postcode")
	public static WebElement informantPostcode;

	@FindBy(id = "informantDetails-postalAddress-sameAsResidentialAddress")
	public static WebElement informantSameasPostalAddress;

	@FindBy(id = "informantDetails-contactDetails-telephoneNo")
	public static WebElement informantTelephone;

	@FindBy(id = "disposalDetails-methodOfDisposal")
	public static WebElement methodOfDisposal;

	@FindBy(id = "disposalDetails-dateOfDisposal-day")
	public static WebElement disposalDay;

	@FindBy(id = "disposalDetails-dateOfDisposal-month")
	public static WebElement disposalMonth;

	@FindBy(id = "disposalDetails-dateOfDisposal-year")
	public static WebElement disposalYear;

	@FindBy(id = "disposalDetails-remainsDisposedOffWithin30Days")
	public static WebElement  within30Days;

	@FindBy(id = "disposalDetails-cemeteryAddress-nameOfCemetery")
	public static WebElement cemeteryName;

	@FindBy(id = "disposalDetails-cemeteryAddress-line1")
	public static WebElement cemeteryLine1;

	@FindBy(id = "disposalDetails-cemeteryAddress-suburb")
	public static WebElement cemeterySuburb;


	@FindBy(id = "disposalDetails-cemeteryAddress-postcode")
	public static WebElement cemeteryPostcode;

	@FindBy(id = "deathCertification-deathCertifiedBy")
	public static WebElement deathCertifiedBy;

	@FindBy(id = "deathCertification-coroner-suburb")
	public static WebElement coronerSuburb;

	@FindBy(xpath = "/html/body/app/ng-component/div[2]/main/div/drs/div/div[2]/form/input[2]")
	public static WebElement saveButton;


}
