package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoreDRSPage extends BaseClass {

	public CoreDRSPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "deceasedDetails-name-familyName")
	public static WebElement deceasedFamilyName;

	@FindBy(id = "deceasedDetails-name-familyNameSameToFamilyNameAtBirth")
	public static WebElement familyNameSameToFamilyNameAtBirth;

	@FindBy(id = "deceasedDetails-name-firstGivenName")
	public static WebElement deceasedFirstName;

	@FindBy(id = "deceasedDetails-name-otherGivenNames")
	public static WebElement deceasedOtherGivenNames;

	@FindBy(id = "deceasedDetails-sex")
	public static WebElement Sex;

	@FindBy(id = "deceasedDetails-relevantDates-dateOfDeath-day")
	public static WebElement DateOfDeathDay;

	@FindBy(id = "deceasedDetails-relevantDates-dateOfDeath-month")
	public static WebElement DateOfDeathMoth;

	@FindBy(id = "deceasedDetails-relevantDates-dateOfDeath-year")
	public static WebElement DateOfDeathYear;

	@FindBy(id = "deceasedDetails-relevantDates-dateOfBirth-day")
	public static WebElement deceasedDOBDay;

	@FindBy(id = "deceasedDetails-relevantDates-dateOfBirth-month")
	public static WebElement deceasedDOBMonth;

	@FindBy(id = "deceasedDetails-relevantDates-dateOfBirth-year")
	public static WebElement deceasedDOBYear;

	@FindBy(id = "deceasedDetails-relevantDates-whereDidDeathOccur")
	public static WebElement placeOfDeath;

	@FindBy(id = "deceasedDetails-placeOfDeath-hospitalName")
	public static WebElement hospitalName;

	@FindBy(id = "deceasedDetails-placeOfDeath-hospitalTownSuburbCity")
	public static WebElement hospitalTown;

	@FindBy(id = "deceasedDetails-usualResidentialAddress-line1")
	public static WebElement usualAddressLine1;

	@FindBy(id = "deceasedDetails-usualResidentialAddress-suburb")
	public static WebElement usualAddressSuburb;

	@FindBy(id = "deceasedDetails-usualResidentialAddress-postcode")
	public static WebElement usualAddressPostcode;

	@FindBy(id = "deceasedDetails-placeOfBirth-suburbTownCity")
	public static WebElement placeOfBirthSuburb;

	@FindBy(id = "deceasedDetails-occupationDuringWorkingLife")
	public static WebElement occupationDuringWorkingLife;

	@FindBy(id = "deceasedDetails-aboriginalOrTorresStraitIslanderOrigin")
	public static WebElement aboriginalOrTorresStraitIslanderOrigin;

	@FindBy(id = "deceasedRelationshipDetails-relationshipStatusAtTimeOfDeath")
	public static WebElement relationshipStatusAtTimeOfDeath;

	@FindBy(id = "parentsOfDeceased-parentOne-parentType")
	public static WebElement parentsOfDeceasedType;

	@FindBy(id = "parentsOfDeceased-parentOne-familyName")
	public static WebElement parentOneFamilyName;

	@FindBy(id = "parentsOfDeceased-parentOne-familyNameSameToFamilyNameAtBirth")
	public static WebElement parentOneFamilyNameSameToFamilyNameAtBirth;

	@FindBy(id = "parentsOfDeceased-parentOne-familyNameAtBirth")
	public static WebElement parentOneFamilyNameAtBirth;

	@FindBy(id = "parentsOfDeceased-parentOne-firstGivenName")
	public static WebElement parentOneFirstName;

	@FindBy(id = "parentsOfDeceased-parentTwo-parentType")
	public static WebElement parentsTwoOfDeceasedType;

	@FindBy(id = "parentsOfDeceased-parentTwo-familyName")
	public static WebElement parentTwoFamilyName;

	@FindBy(id = "parentsOfDeceased-parentTwo-familyNameSameToFamilyNameAtBirth")
	public static WebElement parentTwoFamilyNameSameToFamilyNameAtBirth;

	@FindBy(id = "parentsOfDeceased-parentTwo-familyNameAtBirth")
	public static WebElement parentTwoFamilyNameAtBirth;

	@FindBy(id = "parentsOfDeceased-parentTwo-firstGivenName")
	public static WebElement parentTwoFirstName;

	@FindBy(id = "siblingsOfTheDeceased-deceasedUnder18")
	public static WebElement WasTheDeceasedUnder18;

	@FindBy(id = "informantDetails-relationshipToSubject")
	public static WebElement informantRelationshipToSubject;

	@FindBy(id = "informantDetails-name-familyName")
	public static WebElement informatFamilyName;

	@FindBy(id = "informantDetails-name-firstGivenName")
	public static WebElement informatFirstName;

	@FindBy(id = "informantDetails-residentialAddress-line1")
	public static WebElement informantAddressLine1;

	@FindBy(id = "informantDetails-residentialAddress-suburb")
	public static WebElement informantAddressSuburb;

	@FindBy(id = "informantDetails-residentialAddress-postcode")
	public static WebElement informantAddressPostcode;

	@FindBy(id = "informantDetails-postalAddress-sameAsResidentialAddress")
	public static WebElement postalAddressSameAsResidential;

	@FindBy(id = "informantDetails-contactDetails-emailAddress")
	public static WebElement informantEmail;

	@FindBy(id = "disposalDetails-dateOfDisposal-day")
	public static WebElement DateOfDisposalOrSentOverseasDay;

	@FindBy(id = "disposalDetails-dateOfDisposal-month")
	public static WebElement DateOfDisposalOrSentOverseasMonth;

	@FindBy(id = "disposalDetails-dateOfDisposal-year")
	public static WebElement DateOfDisposalOrSentOverseasYear;

	@FindBy(id = "disposalDetails-methodOfDisposal")
	public static WebElement methodOfDisposal;

	@FindBy(id = "disposalDetails-remainsDisposedWithin30Days")
	public static WebElement remainsDisposedOffWithin30Days;

	@FindBy(id = "disposalDetails-cemeteryAddress-nameOfCemetery")
	public static WebElement nameOfCemetery;

	@FindBy(id = "disposalDetails-cemeteryAddress-line1")
	public static WebElement cemeteryAddressLine1;

	@FindBy(id = "disposalDetails-cemeteryAddress-suburb")
	public static WebElement cemeterySuburb;

	@FindBy(id = "disposalDetails-cemeteryAddress-postcode")
	public static WebElement cemeteryPostcode;

	@FindBy(id = "funeralDirectorDetails-name-idNumber")
	public static WebElement FuneralDirectorNumber;

	@FindBy(id = "funeralDirectorDetails-name-consultantName-familyName")
	public static WebElement FuneralDirectorFamilyName;

	@FindBy(id = "funeralDirectorDetails-address-telephoneNo")
	public static WebElement FuneralDirectorTelephone;

}
