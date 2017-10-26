package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoreRNPage extends BaseClass {

	public CoreRNPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//*/a[text()='Additional Notification Details']")
	public static WebElement additionalNotificationDetailsLink;
	
	@FindBy(id = "additionalNotificationDetails-dateReceivedAtRegistry")
	public static WebElement dateReceivedAtRegistry;
	
	@FindBy(id = "additionalNotificationDetails-dateSubmittedApplicant1-day")
	public static WebElement applicant1DateSubmittedDay;
	
	@FindBy(id = "additionalNotificationDetails-dateSubmittedApplicant1-month")
	public static WebElement applicant1DateSubmittedMonth;
	
	@FindBy(id = "additionalNotificationDetails-dateSubmittedApplicant1-year")
	public static WebElement applicant1DateSubmittedYear;
	
	@FindBy(id = "additionalNotificationDetails-dateSubmittedApplicant2-day")
	public static WebElement applicant2DateSubmittedDay;
	
	@FindBy(id = "additionalNotificationDetails-dateSubmittedApplicant2-month")
	public static WebElement applicant2DateSubmittedMonth;
	
	@FindBy(id = "additionalNotificationDetails-dateSubmittedApplicant2-year")
	public static WebElement applicant2DateSubmittedYear;
	
	@FindBy(id = "additionalNotificationDetails-typeOfRelationship")
	public static WebElement typeOfRelationship;
	
	@FindBy(id = "applicant1Details-applicantsName-familyName")
	public static WebElement applicant1FamilyName;
	
	@FindBy(id = "applicant1Details-applicantsName-familyNameSameToFamilyNameAtBirth")
	public static WebElement applicant1FamiliyNameSameAsBirth;
	
	@FindBy(id = "applicant1Details-applicantsName-familyNameAtBirth")
	public static WebElement applicant1FamilyNameAtBirth;
	
	@FindBy(id = "applicant1Details-applicantsName-firstGivenName")
	public static WebElement applicant1FirstName;
	
	@FindBy(id = "applicant1Details-applicantsDetails-sex")
	public static WebElement applicant1Sex;
	
	@FindBy(id = "applicant1Details-applicantsDetails-dateOfBirth-day")
	public static WebElement applicant1BirthDay;
	
	@FindBy(id = "applicant1Details-applicantsDetails-dateOfBirth-month")
	public static WebElement applicant1BirthMonth;
	
	@FindBy(id = "applicant1Details-applicantsDetails-dateOfBirth-year")
	public static WebElement applicant1BirthYear;
	
	@FindBy(id = "applicant1Details-applicantsDetails-occupation")
	public static WebElement applicant1Occupation;
	
	@FindBy(id = "applicant1Details-applicantsDetails-relationshipStatus")
	public static WebElement applicant1RelationshipStatus;
	
	@FindBy(id = "applicant1Details-placeOfBirth-suburbTownCity")
	public static WebElement applicant1BirthSuburb;
	
	@FindBy(id = "applicant1Details-residentialAddress-line1")
	public static WebElement applicant1AddressLine1;
	
	@FindBy(id = "applicant1Details-residentialAddress-suburb")
	public static WebElement applicant1AddressSuburb;
	
	@FindBy(id = "applicant1Details-residentialAddress-postcode")
	public static WebElement applicant1AddressPostcode;
	
	@FindBy(id = "applicant1Details-residentialAddress-residingInVictoria")
	public static WebElement applicant1ResidingInVictoria;
	
	@FindBy(id = "applicant1Details-contactDetails-telephoneNo")
	public static WebElement applicant1Phone;
	
	@FindBy(id = "applicant1Details-parent1-parentType")
	public static WebElement applicant1Parent1Type;
	
	@FindBy(id = "applicant1Details-parent1-familyName")
	public static WebElement applicant1Parent1FamilyName;
	
	@FindBy(id = "applicant1Details-parent1-familyNameSameToFamilyNameAtBirth")
	public static WebElement applicant1Parent1FamilyNameSameAsBirth;
	
	@FindBy(id = "applicant1Details-parent1-familyNameAtBirth")
	public static WebElement applicant1Parent1FamilyNameAtBirth;
	
	@FindBy(id = "applicant1Details-parent1-firstGivenName")
	public static WebElement applicant1Parent1FirstName;
	
	@FindBy(id = "applicant1Details-parent2-parentType")
	public static WebElement applicant1Parent2Type;
	
	@FindBy(id = "applicant1Details-parent2-familyName")
	public static WebElement applicant1Parent2FamilyName;
	
	@FindBy(id = "applicant1Details-parent2-familyNameSameToFamilyNameAtBirth")
	public static WebElement applicant1Parent2FamilyNameSameAsBirth;
	
	@FindBy(id = "applicant1Details-parent2-familyNameAtBirth")
	public static WebElement applicant1Parent2FamilyNameAtBirth;
	
	@FindBy(id = "applicant1Details-parent2-firstGivenName")
	public static WebElement applicant1Parent2FirstName;
	
	@FindBy(id = "applicant1Details-relationshipDetails-dateOfRelationship-day")
	public static WebElement applicant1DateOfRelationshipDay;
	
	@FindBy(id = "applicant1Details-relationshipDetails-dateOfRelationship-month")
	public static WebElement applicant1DateOfRelationshipMonth;
	
	@FindBy(id = "applicant1Details-relationshipDetails-dateOfRelationship-year")
	public static WebElement applicant1DateOfRelationshipYear;
	
	@FindBy(id = "applicant1Details-relationshipDetails-dateOfRelationshipCelebration-day")
	public static WebElement applicant1RelCelebrationDay;
	
	@FindBy(id = "applicant1Details-relationshipDetails-dateOfRelationshipCelebration-month")
	public static WebElement applicant1RelCelebrationMonth;
	
	@FindBy(id = "applicant1Details-relationshipDetails-dateOfRelationshipCelebration-year")
	public static WebElement applicant1RelCelebrationYear;
	
	@FindBy(id = "applicant1Details-applicant2ContactDetails-familyName")
	public static WebElement applicant2ContactFamilyName;
	
	@FindBy(id = "applicant1Details-applicant2ContactDetails-firstGivenName")
	public static WebElement applicant2ContactFirstName;
	
	@FindBy(id = "applicant1Details-applicant2ContactDetails-otherApplicantMobileNumber")
	public static WebElement applicant2ContactPhone;
	
	@FindBy(id = "applicant1Details-notificationDetails-poiVerificationMethod")
	public static WebElement applicant1HowPoiVerified;
	
	@FindBy(id = "applicant2Details-applicantsName-familyName")
	public static WebElement applicant2FamilyName;
	
	@FindBy (id = "applicant2Details-applicantsName-familyNameSameToFamilyNameAtBirth")
	public static WebElement applicant2FamilyNameSameAsBirth;
	
	@FindBy(id = "applicant2Details-applicantsName-familyNameAtBirth")
	public static WebElement applicant2FamilyNameAtBirth;
	
	@FindBy(id = "applicant2Details-applicantsName-firstGivenName")
	public static WebElement applicant2FirstName;
	
	@FindBy(id = "applicant2Details-applicantsDetails-sex")
	public static WebElement applicant2Sex;
	
	@FindBy(id = "applicant2Details-applicantsDetails-dateOfBirth-day")
	public static WebElement applicant2BirthDay;
	
	@FindBy(id = "applicant2Details-applicantsDetails-dateOfBirth-month")
	public static WebElement applicant2BirthMonth;
	
	@FindBy(id = "applicant2Details-applicantsDetails-dateOfBirth-year")
	public static WebElement applicant2BirthYear;
	
	@FindBy(id = "applicant2Details-applicantsDetails-occupation")
	public static WebElement applicant2Occupation;
	
	@FindBy(id = "applicant2Details-applicantsDetails-relationshipStatus")
	public static WebElement applicant2RelationshipStatus;
	
	@FindBy(id = "applicant2Details-placeOfBirth-suburbTownCity")
	public static WebElement applicant2BirthSuburb;
	
	@FindBy(id = "applicant2Details-residentialAddress-line1")
	public static WebElement applicant2AddressLine1;
	
	@FindBy(id = "applicant2Details-residentialAddress-suburb")
	public static WebElement applicant2AddressSuburb;
	
	@FindBy(id = "applicant2Details-residentialAddress-postcode")
	public static WebElement applicant2AddressPostcode;
	
	@FindBy(id = "applicant2Details-residentialAddress-residingInVictoria")
	public static WebElement applicant2ResidingInVictoria;
	
	@FindBy(id = "applicant2Details-contactDetails-telephoneNo")
	public static WebElement applicant2Phone;
	
	@FindBy(id = "applicant2Details-parent1-parentType")
	public static WebElement applicant2Parent1Type;
	
	@FindBy(id = "applicant2Details-parent1-familyName")
	public static WebElement applicant2Parent1FamilyName;
	
	@FindBy(id = "applicant2Details-parent1-familyNameSameToFamilyNameAtBirth")
	public static WebElement applicant2Parent1FamilyNameSameAsBirth;
	
	@FindBy(id = "applicant2Details-parent1-familyNameAtBirth")
	public static WebElement applicant2Parent1FamilyNameAtBirth;
	
	@FindBy(id = "applicant2Details-parent1-firstGivenName")
	public static WebElement applicant2Parent1FirstName;
	
	@FindBy(id = "applicant2Details-parent2-parentType")
	public static WebElement applicant2Parent2Type;
	
	@FindBy(id = "applicant2Details-parent2-familyName")
	public static WebElement applicant2Parent2FamilyName;
	
	@FindBy(id = "applicant2Details-parent2-familyNameSameToFamilyNameAtBirth")
	public static WebElement applicant2Parent2FamlyNameSameAsBirth;
	
	@FindBy(id = "applicant2Details-parent2-familyNameAtBirth")
	public static WebElement applicant2Parent2FamilyNameAtBirth;
	
	@FindBy(id = "applicant2Details-parent2-firstGivenName")
	public static WebElement applicant2Parent2FirstName;
	
	@FindBy(id = "applicant2Details-relationshipDetails-dateOfRelationship-day")
	public static WebElement applicant2DateOfRelationshipDay;
	
	@FindBy(id = "applicant2Details-relationshipDetails-dateOfRelationship-month")
	public static WebElement applicant2DateOfRelationshipMonth;
	
	@FindBy(id = "applicant2Details-relationshipDetails-dateOfRelationship-year")
	public static WebElement applicant2DateOfRelationshipYear;
	
	@FindBy(id = "applicant2Details-relationshipDetails-dateOfRelationshipCelebration-day")
	public static WebElement applicant2RelCelebrationDay;
	
	@FindBy(id = "applicant2Details-relationshipDetails-dateOfRelationshipCelebration-month")
	public static WebElement applicant2RelCelebrationMonth;
	
	@FindBy(id = "applicant2Details-relationshipDetails-dateOfRelationshipCelebration-year")
	public static WebElement applicant2RelCelebrationYear;
	
	@FindBy(id = "applicant2Details-notificationDetails-poiVerificationMethod")
	public static WebElement applicant2HowPoiVerified;
}
