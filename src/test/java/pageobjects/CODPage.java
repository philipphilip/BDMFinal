package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CODPage extends BaseClass {

	public CODPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "additionalNotificationDetails-causeOfDeathType")
	public static WebElement causeOfDeathType;

	@FindBy(id = "deceasedDetails-name-deceasedName-familyName")
	public static WebElement deceasedFamilyName;

	@FindBy(id = "deceasedDetails-name-deceasedName-firstGivenName")
	public static WebElement deceasedfirstName;

	@FindBy(id = "deceasedDetails-name-sex")
	public static WebElement sex;

	@FindBy(id = "deceasedDetails-name-aboriginalOrTorresStraitIslanderOrigin")
	public static WebElement aboriginalOrTorresStraitIslanderOrigin;

	@FindBy(id = "deceasedDetails-name-howDidYouConfirmTheNameOfTheDeceased")
	public static WebElement howDidYouConfirmTheNameOfTtheDeceased;

	@FindBy(id = "deceasedDetails-birthDetails-dateOfBirth-type")
	public static WebElement dateOfBirthType;

	@FindBy(id = "deceasedDetails-birthDetails-dateOfBirth-day")
	public static WebElement deceasedDOBDay;

	@FindBy(id = "deceasedDetails-birthDetails-dateOfBirth-month")
	public static WebElement deceasedDOBMonth;

	@FindBy(id = "deceasedDetails-birthDetails-dateOfBirth-year")
	public static WebElement deceasedDOBYear;

	@FindBy(id = "deceasedDetails-mothersDetails-mothersName-familyName")
	public static WebElement mothersFamilyName;

	@FindBy(id = "deceasedDetails-mothersDetails-mothersName-firstGivenName")
	public static WebElement mothersFirstName;

	@FindBy(id = "deceasedDetails-mothersDetails-mothersDateOfBirth-day")
	public static WebElement mothersDOBDay;

	@FindBy(id = "deceasedDetails-mothersDetails-mothersDateOfBirth-month")
	public static WebElement mothersDOBMonth;

	@FindBy(id = "deceasedDetails-mothersDetails-mothersDateOfBirth-year")
	public static WebElement mothersDOBYear;

	@FindBy(id = "dateOfDeath-dateOfDeath-day")
	public static WebElement dateOfDeathDay;

	@FindBy(id = "dateOfDeath-dateOfDeath-month")
	public static WebElement dateOfDeathMonth;

	@FindBy(id = "dateOfDeath-dateOfDeath-year")
	public static WebElement dateOfDeathYear;

	@FindBy(id = "placeOfDeath-whereDidDeathOccur")
	public static WebElement whereDidDeathOccur;

	@FindBy(id = "placeOfDeath-hospital-hospitalName")
	public static WebElement placeOfDeathHospitalName;

	@FindBy(id = "placeOfDeath-hospital-hospitalTownSuburbCity")
	public static WebElement placeOfDeathHhospitalSuburb;

	@FindBy(id = "eligibilityToStateCauseOfDeath-deathReportable")
	public static WebElement IsThisDeathRreportableInAccordanceWithSections10or13;

	@FindBy(id = "eligibilityToStateCauseOfDeath-examineDeceasedBody")
	public static WebElement didYouExamineTheDeceasedsBodyAfterBeath;

	@FindBy(id = "eligibilityToStateCauseOfDeath-providedMedicalCare")
	public static WebElement wereYouResponsibleForProvidingMedicalCareToDeceasedImmediatelyDeforeDeath;

	@FindBy(id = "eligibilityToStateCauseOfDeath-dateLastSeenAlive-day")
	public static WebElement dateLastSeenAliveDay;

	@FindBy(id = "eligibilityToStateCauseOfDeath-dateLastSeenAlive-month")
	public static WebElement dateLastSeenAliveMonth;

	@FindBy(id = "eligibilityToStateCauseOfDeath-dateLastSeenAlive-year")
	public static WebElement dateLastSeenAliveYear;

	@FindBy(id = "abilityToAccuratelyAdviseCauseOfDeath-doctorExaminingOnBehalf")
	public static WebElement iAmDoctorExaminingOnBehalfOfAnotherDr;

	@FindBy(id = "abilityToAccuratelyAdviseCauseOfDeath-referencedMedicalHistory")
	public static WebElement iHaveReferencedTheCauseOfDeathWithTheDeceasedcompleteMedicalHistory;

	@FindBy(id = "abilityToAccuratelyAdviseCauseOfDeath-detailedDeathKnowledge")
	public static WebElement ihaveDetailedKnowledgeOfTheCircumstancesSurroundingThisDeath;

	@FindBy(id = "abilityToAccuratelyAdviseCauseOfDeath-otherAdvice")
	public static WebElement abilityToAccuratelyAdviseCOBOtherAdvice;

	@FindBy(id = "supportingInformation-cardiacPacemakerPresent")
	public static WebElement IsThereCardiacPacemakerOrBatteryPoweredDeviceInTheBody;

	@FindBy(id = "supportingInformation-wasPostMortemHeld")
	public static WebElement wasPostMortemHeld;

	@FindBy(id = "supportingInformation-disposalOrganiser")
	public static WebElement WhoIsOrganisingDisposalOfDeceasedRemains;
	
	
	
	@FindBy(id = "supportingInformation-funeralDirector-funeralDirectorsIdNumber")
	public static WebElement funeralDirectorIDNumber;
	
	@FindBy(id = "supportingInformation-funeralDirector-name-familyName")
	public static WebElement funeralDirectorFamilyName;
	
	@FindBy(id = "supportingInformation-funeralDirector-funeralDirectorsBusinessName")
	public static WebElement funeralDirectorBusinessName;
	
	@FindBy(id = "supportingInformation-funeralDirector-funeralDirectorAddress-line1")
	public static WebElement funeralDirectorAddressLine1;
	
	@FindBy(id = "supportingInformation-funeralDirector-funeralDirectorAddress-suburb")
	public static WebElement funeralDirectorSuburb;
	
	@FindBy(id = "supportingInformation-funeralDirector-funeralDirectorAddress-postcode")
	public static WebElement funeralDirectorPostcode;
	
	@FindBy(id = "supportingInformation-funeralDirector-funeralDirectorEmail")
	public static WebElement funeralDirectorEmailAddress;
	
	
	
	
	
	

	@FindBy(id = "siblingsOfTheDeceased-deceasedUnder18")
	public static WebElement wasTheDeceasedUnder18;

	@FindBy(id = "detailsOfMedicalPractitioner-name-familyName")
	public static WebElement medicalPractitionerFamilyName;

	@FindBy(id = "detailsOfMedicalPractitioner-name-firstGivenName")
	public static WebElement medicalPractitionerFirstName;

	@FindBy(id = "detailsOfMedicalPractitioner-name-businessName")
	public static WebElement medicalPractitionerBusinessName;

	@FindBy(id = "detailsOfMedicalPractitioner-address-line1")
	public static WebElement medicalPractitionerAddressLine1;

	@FindBy(id = "detailsOfMedicalPractitioner-address-suburb")
	public static WebElement medicalPractitionerSuburb;

	@FindBy(id = "detailsOfMedicalPractitioner-address-postcode")
	public static WebElement medicalPractitionerPostcode;

	@FindBy(id = "detailsOfMedicalPractitioner-address-emailAddress")
	public static WebElement medicalPractitionerEmail;

	@FindBy(id = "detailsOfMedicalPractitioner-address-ahpraNumber")
	public static WebElement medicalPractitionerAHPRANumber;

	@FindBy(id = "declarationByMedicalPractitioner-acquiredBenefits")
	public static WebElement DidYouAcquireOrAnticipateAnyBenefitByReasonOfThisDeath;

}
