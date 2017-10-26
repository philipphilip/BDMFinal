package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EregistryCodPage extends BaseClass {

	public EregistryCodPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "additionalNotificationDetails-causeOfDeathType")
	public static WebElement codType;

	@FindBy(id = "deceasedDetails-name-deceasedName-familyName")
	public static WebElement familyName;
	
	@FindBy(id = "deceasedDetails-name-deceasedName-familyNameSameToFamilyNameAtBirth")
	public static WebElement familyNameSameAsBirth;
	
	@FindBy(id = "deceasedDetails-name-deceasedName-familyNameAtBirth")
	public static WebElement familyNameAtBirth;

	@FindBy(id = "deceasedDetails-name-deceasedName-firstGivenName")
	public static WebElement givenName;

	@FindBy(id = "deceasedDetails-name-sex")
	public static WebElement sex;

	@FindBy(id = "deceasedDetails-name-aboriginalOrTorresStraitIslanderOrigin")
	public static WebElement aboriginal;

	@FindBy(id = "deceasedDetails-name-howDidYouConfirmTheNameOfTheDeceased")
	public static WebElement confirmName;

	@FindBy(id = "deceasedDetails-birthDetails-dateOfBirthType")
	public static WebElement dateOfBirthType;

	@FindBy(id = "deceasedDetails-birthDetails-dateOfBirth-day")
	public static WebElement dateOfBirthDay;

	@FindBy(id = "deceasedDetails-birthDetails-dateOfBirth-month")
	public static WebElement dateOfBirthMonth;

	@FindBy(id = "deceasedDetails-birthDetails-dateOfBirth-year")
	public static WebElement dateOfBirthYear;

	@FindBy(id = "deceasedDetails-mothersDetails-mothersName-familyName")
	public static WebElement motherFamilyName;
	
	@FindBy(id = "deceasedDetails-mothersDetails-mothersName-familyNameSameToFamilyNameAtBirth")
	public static WebElement motherFamilyNameSameAsBirth;

	@FindBy(id = "deceasedDetails-mothersDetails-mothersName-firstGivenName")
	public static WebElement motherGivenName;

	@FindBy(id = "deceasedDetails-mothersDetails-mothersDateOfBirth-day")
	public static WebElement motherDateOfBirthDay;

	@FindBy(id = "deceasedDetails-mothersDetails-mothersDateOfBirth-month")
	public static WebElement motherDateOfBirthMonth;

	@FindBy(id = "deceasedDetails-mothersDetails-mothersDateOfBirth-year")
	public static WebElement motherDateOfBirthYear;

	@FindBy(id = "dateOfDeath-type")
	public static WebElement deathDateType;

	@FindBy(id = "dateOfDeath-dateOfDeath-onDate-day")
	public static WebElement deathDateDay;

	@FindBy(id = "dateOfDeath-dateOfDeath-onDate-month")
	public static WebElement deathDateMonth;

	@FindBy(id = "dateOfDeath-dateOfDeath-onDate-year")
	public static WebElement deathDateYear;
	
	@FindBy(id = "dateOfDeath-ageAtDeath")
	public static WebElement ageAtDeath;
	
	@FindBy(id = "dateOfDeath-units")
	public static WebElement ageAtDeathUnits;

	@FindBy(id = "placeOfDeath-whereDidDeathOccur")
	public static WebElement deathOccur;

	@FindBy(id = "placeOfDeath-hospital-hospitalName")
	public static WebElement hospitalName;

	@FindBy(id = "placeOfDeath-hospital-hospitalTownSuburbCity")
	public static WebElement hospitalTown;

	@FindBy(id = "eligibilityToStateCauseOfDeath-deathReportable")
	public static WebElement reviewable;

	@FindBy(id = "eligibilityToStateCauseOfDeath-examineDeceasedBody")
	public static WebElement examineDody;

	@FindBy(id = "eligibilityToStateCauseOfDeath-dateOfExamination-day")
	public static WebElement examineDay;

	@FindBy(id = "eligibilityToStateCauseOfDeath-dateOfExamination-month")
	public static WebElement examineMonth;

	@FindBy(id = "eligibilityToStateCauseOfDeath-dateOfExamination-year")
	public static WebElement examineYear;

	@FindBy(id = "eligibilityToStateCauseOfDeath-providedMedicalCare")
	public static WebElement medicalCare;

	@FindBy(id = "eligibilityToStateCauseOfDeath-dateLastSeenAlive-day")
	public static WebElement seenAliveDay;

	@FindBy(id = "eligibilityToStateCauseOfDeath-dateLastSeenAlive-month")
	public static WebElement seenAliveMonth;

	@FindBy(id = "eligibilityToStateCauseOfDeath-dateLastSeenAlive-year")
	public static WebElement seenAliveYear;

	@FindBy(id = "abilityToAccuratelyAdviseCauseOfDeath-referencedMedicalHistory")
	public static WebElement medicalHistory;

	@FindBy(id = "abilityToAccuratelyAdviseCauseOfDeath-detailedDeathKnowledge")
	public static WebElement detailedKnowledge;

	@FindBy(id = "abilityToAccuratelyAdviseCauseOfDeath-otherAdvice")
	public static WebElement otherAdvice;

	@FindBy(id = "causeOfDeath-direct-numberOfConditions")
	public static WebElement numberOfDisease ;

	@FindBy(id = "causeOfDeath-antecedent-numberOfConditions")
	public static WebElement numberOfAntecedentCauses;

	@FindBy(id = "causeOfDeath-other-numberOfConditions")
	public static WebElement numberOfOtherSignificantConditions;

	@FindBy(id = "supportingInformation-cardiacPacemakerPresent")
	public static WebElement deviceInBody ;

	@FindBy(id = "supportingInformation-performedRecentProcedure")
	public static WebElement operationWithinFourWeeks;

	@FindBy(id = "supportingInformation-pregnantInPastYear")
	public static WebElement pregnantIn12months;

	@FindBy(id = "supportingInformation-wasPostMortemHeld")
	public static WebElement postMortemHeld;

	@FindBy(id = "supportingInformation-disposalOrganiser")
	public static WebElement organisingDisposal;

	@FindBy(id = "supportingInformation-otherPersonsDetail-otherPersonsName-familyName")
	public static WebElement otherPersonFamilyName;

	@FindBy(id = "supportingInformation-otherPersonsDetail-otherPersonsName-firstGivenName")
	public static WebElement otherPersonFirstName;

	@FindBy(id = "supportingInformation-otherPersonsDetail-otherPersonsTelephoneNo")
	public static WebElement otherPersonTelephoneNo;

	@FindBy(id = "siblingsOfTheDeceased-deceasedUnder18")
	public static WebElement under18;

	@FindBy(id = "detailsOfMedicalPractitioner-address-telephoneNo")
	public static WebElement telephoneNo;

	@FindBy(id = "detailsOfMedicalPractitioner-address-ahpraNumber")
	public static WebElement AHPRA;

	@FindBy(id = "declarationByMedicalPractitioner-acquiredBenefits")
	public static WebElement declaration;

}
