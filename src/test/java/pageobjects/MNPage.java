package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MNPage extends BaseClass {

	public MNPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "celebrantDetails-code")
	public static WebElement celebrantCode;

	@FindBy(id = "celebrantDetails-registrationNumber")
	public static WebElement celebrantRegistrationNumber;

	@FindBy(id = "marriageDetails-date-dateOfMarriage-day")
	public static WebElement dateOfMarriageDay;

	@FindBy(id = "marriageDetails-date-dateOfMarriage-month")
	public static WebElement dateOfMarriageMonth;

	@FindBy(id = "marriageDetails-date-dateOfMarriage-year")
	public static WebElement dateOfMarriageYear;

	@FindBy(id = "marriageDetails-placeOfMarriage-line1")
	public static WebElement placeOfMarriageLine1;

	@FindBy(id = "marriageDetails-placeOfMarriage-suburb")
	public static WebElement placeOfMarriageSuburb;

	@FindBy(id = "marriageDetails-placeOfMarriage-postcode")
	public static WebElement placeOfMarriagePostcode;

	@FindBy(id = "marriageDetails-placeOfMarriage-marriageRites")
	public static WebElement marriageRites;

	@FindBy(id = "groomDetails-groomsName-familyName")
	public static WebElement groomsNameFamilyName;

	@FindBy(id = "groomDetails-groomsName-firstGivenName")
	public static WebElement groomsNameFirstGivenName;

	@FindBy(id = "groomDetails-groomsName-gender")
	public static WebElement groomsGender;

	@FindBy(id = "groomDetails-groomsOccupation-occupation")
	public static WebElement groomsOccupation;

	@FindBy(id = "groomDetails-groomsResidentialAddress-line1")
	public static WebElement groomsResidentialAddressLine1;

	@FindBy(id = "groomDetails-groomsResidentialAddress-suburb")
	public static WebElement groomsResidentialAddressSuburb;

	@FindBy(id = "groomDetails-groomsResidentialAddress-postcode")
	public static WebElement groomsResidentialAddressPostcode;

	@FindBy(id = "groomDetails-groomsConjugalStatus-conjugalStatus")
	public static WebElement groomsConjugalStatus;

	@FindBy(id = "groomDetails-placeOfBirth-suburbTownCity")
	public static WebElement groomPlaceOfBirthSuburbTownCity;

	@FindBy(id = "groomDetails-groomsBirthDetails-dateOfBirth-day")
	public static WebElement groomDOBDay;

	@FindBy(id = "groomDetails-groomsBirthDetails-dateOfBirth-month")
	public static WebElement groomDOBMonth;

	@FindBy(id = "groomDetails-groomsBirthDetails-dateOfBirth-year")
	public static WebElement groomDOBYear;

	@FindBy(id = "groomDetails-groomsFathersDetails-familyName")
	public static WebElement groomsFathersDetailsFamilyName;

	@FindBy(id = "groomDetails-groomsFathersDetails-firstGivenName")
	public static WebElement groomsFathersDetailsFirstGivenName;

	@FindBy(id = "groomDetails-groomsMothersDetails-familyName")
	public static WebElement groomsMothersDetailsFamilyName;

	@FindBy(id = "groomDetails-groomsMothersDetails-familyNameAtBirth")
	public static WebElement groomsMothersDetailsFamilyNameAtBirth;

	@FindBy(id = "groomDetails-groomsMothersDetails-firstGivenName")
	public static WebElement groomsMothersDetailsFirstGivenName;

	@FindBy(id = "brideDetails-bridesName-familyName")
	public static WebElement bridesNameFamilyName;

	@FindBy(id = "brideDetails-bridesName-firstGivenName")
	public static WebElement bridesNameFirstGivenName;

	@FindBy(id = "brideDetails-bridesName-gender")
	public static WebElement bridesGender;

	@FindBy(id = "brideDetails-bridesOccupation-occupation")
	public static WebElement bridesOccupation;

	@FindBy(id = "brideDetails-bridesResidentialAddress-line1")
	public static WebElement bridesResidentialAddressLine1;

	@FindBy(id = "brideDetails-bridesResidentialAddress-suburb")
	public static WebElement bridesResidentialAddressSuburb;

	@FindBy(id = "brideDetails-bridesResidentialAddress-postcode")
	public static WebElement bridesResidentialAddressPostcode;

	@FindBy(id = "brideDetails-bridesConjugalStatus-conjugalStatus")
	public static WebElement bridesConjugalStatus;

	@FindBy(id = "brideDetails-placeOfBirth-suburbTownCity")
	public static WebElement bridesPlaceOfBirthSuburbTownCity;

	@FindBy(id = "brideDetails-bridesBirthDetails-dateOfBirth-day")
	public static WebElement bridesDOBday;

	@FindBy(id = "brideDetails-bridesBirthDetails-dateOfBirth-month")
	public static WebElement bridesDOBMonth;

	@FindBy(id = "brideDetails-bridesBirthDetails-dateOfBirth-year")
	public static WebElement bridesDOBYear;

	@FindBy(id = "brideDetails-bridesFathersDetails-familyName")
	public static WebElement bridesFathersDetailsFamilyName;

	@FindBy(id = "brideDetails-bridesFathersDetails-firstGivenName")
	public static WebElement bridesFathersDetailsFirstGivenName;

	@FindBy(id = "brideDetails-bridesMothersDetails-familyName")
	public static WebElement bridesMothersDetailsFamilyName;

	@FindBy(id = "brideDetails-bridesMothersDetails-familyNameAtBirth")
	public static WebElement bridesMothersDetailsFamilyNameAtBirth;

	@FindBy(id = "brideDetails-bridesMothersDetails-firstGivenName")
	public static WebElement bridesMothersDetailsFirstGivenName;

	@FindBy(id = "additionalGroomDetails-groomsResidence-periodOfResidencyInAustraliaYears")
	public static WebElement groomsPeriodOfResidencyInAustraliaYears;

	@FindBy(id = "additionalGroomDetails-groomsResidence-periodOfResidencyInAustraliaMonths")
	public static WebElement groomsPeriodOfResidencyInAustraliaMonths;

	@FindBy(id = "additionalBrideDetails-bridesResidence-periodOfResidencyInAustraliaYears")
	public static WebElement bridesPeriodOfResidencyInAustraliaYears;

	@FindBy(id = "additionalBrideDetails-bridesResidence-periodOfResidencyInAustraliaMonths")
	public static WebElement bridesPeriodOfResidencyInAustraliaMonths;

	@FindBy(id = "noimLodgement-dateReceived-day")
	public static WebElement noimDateReceivedDay;

	@FindBy(id = "noimLodgement-dateReceived-month")
	public static WebElement noimDateReceivedMonth;

	@FindBy(id = "noimLodgement-dateReceived-year")
	public static WebElement noimDateReceivedYear;

	@FindBy(id = "noimLodgement-groomsSignature-groomSignature")
	public static WebElement groomsSignature;

	@FindBy(id = "noimLodgement-groomsSignature-groomSignatureWitnessed")
	public static WebElement groomSignatureWitnessed;

	@FindBy(id = "noimLodgement-groomsSignature-groomWitnessTitle")
	public static WebElement groomWitnessTitle;

	@FindBy(id = "noimLodgement-bridesSignature-brideSignature")
	public static WebElement bridesSignature;

	@FindBy(id = "noimLodgement-bridesSignature-brideSignatureWitnessed")
	public static WebElement brideSignatureWitnessed;

	@FindBy(id = "noimLodgement-bridesSignature-brideWitnessTitle")
	public static WebElement brideWitnessTitle;

	@FindBy(id = "noimLodgement-celebrantsSignature-celebrantSignature")
	public static WebElement celebrantsSignature;

	@FindBy(id = "partiesIdentification-groomsIdentification-evidenceOfBirth")
	public static WebElement groomsvidenceOfBirth;

	@FindBy(id = "partiesIdentification-groomsIdentification-passportNumber")
	public static WebElement groomsPassportNumber;

	@FindBy(id = "partiesIdentification-groomsIdentification-identityConfirmed")
	public static WebElement groomsIdentityConfirmed;

	@FindBy(id = "partiesIdentification-groomsIdentification-documentType")
	public static WebElement groomsIdentificationDocumentType;

	@FindBy(id = "partiesIdentification-groomsIdentification-placeOfIssue")
	public static WebElement groomsIdentificationPlaceOfIssue;

	@FindBy(id = "partiesIdentification-groomsIdentification-documentNumber")
	public static WebElement groomsIdentificationDocumentNumber;

	@FindBy(id = "partiesIdentification-groomsIdentification-issueOfDocumentsS425a")
	public static WebElement groomsIdentificationIssueOfDocumentsS425a;

	@FindBy(id = "partiesIdentification-bridesIdentification-evidenceOfBirth")
	public static WebElement bridesEvidenceOfBirth;

	@FindBy(id = "partiesIdentification-bridesIdentification-passportNumber")
	public static WebElement bridesPassportNumber;

	@FindBy(id = "partiesIdentification-bridesIdentification-identityConfirmed")
	public static WebElement bridesIdentityConfirmed;

	@FindBy(id = "partiesIdentification-bridesIdentification-documentType")
	public static WebElement bridesDdocumentType;

	@FindBy(id = "partiesIdentification-bridesIdentification-placeOfIssue")
	public static WebElement bridesPlaceOfIssue;

	@FindBy(id = "partiesIdentification-bridesIdentification-documentNumber")
	public static WebElement bridesDocumentNumber;

	@FindBy(id = "partiesIdentification-bridesIdentification-issueOfDocumentsS425a")
	public static WebElement bridesIssueOfDocumentsS425a;

	@FindBy(id = "statutoryRequirements-shorteningOfTime-shorteningOfTimeApprovalReceived")
	public static WebElement statutoryRequirementsShorteningOfTimeApprovalReceived;

	@FindBy(id = "statutoryRequirements-shorteningOfTime-shorteningOfTimeSighted")
	public static WebElement statutoryRequirementsShorteningOfTimeSighted;

	@FindBy(id = "statutoryRequirements-shorteningOfTime-shorteningOfTimeReason")
	public static WebElement statutoryRequirementsShorteningOfTimeReason;

	@FindBy(id = "statutoryRequirements-shorteningOfTime-shorteningOfTimeLocation")
	public static WebElement statutoryRequirementsShorteningOfTimeLocation;

	@FindBy(id = "declarationsForm14-groomsSignature-groomCompletedAndSigned")
	public static WebElement groomsSignatureDeclarationsForm14;

	@FindBy(id = "declarationsForm14-groomsSignature-celebrantSignedGroomsDeclaration")
	public static WebElement celebrantSignedGroomsDeclaration;

	@FindBy(id = "declarationsForm14-bridesSignature-brideCompletedAndSigned")
	public static WebElement brideSignatureDeclarationsForm14;

	@FindBy(id = "declarationsForm14-bridesSignature-celebrantSignedBridesDeclaration")
	public static WebElement celebrantSignedBrideDeclarationn;

	@FindBy(id = "solemnisationDetails-groomsSignature-groomSigned")
	public static WebElement groomSignedSolemnisationDetails;

	@FindBy(id = "solemnisationDetails-bridesSignature-brideSigned")
	public static WebElement brideSignedSolemnisationDetails;

	@FindBy(id = "solemnisationDetails-celebrantsSignature-celebrantSigned")
	public static WebElement celebrantSignedSolemnisationDetails;

	@FindBy(id = "solemnisationDetails-1stWitness-familyName")
	public static WebElement witnessOneFamilyName;

	@FindBy(id = "solemnisationDetails-1stWitness-firstGivenName")
	public static WebElement witnessOneFirstGivenName;

	@FindBy(id = "solemnisationDetails-1stWitness-witness1Signed")
	public static WebElement witnessOneSignedForm16;

	@FindBy(id = "solemnisationDetails-2ndWitness-familyName")
	public static WebElement witnessTwoFamilyName;

	@FindBy(id = "solemnisationDetails-2ndWitness-firstGivenName")
	public static WebElement witnessTwoFirstGivenName;

	@FindBy(id = "solemnisationDetails-2ndWitness-witness2Signed")
	public static WebElement witnessTwoSignedForm16;

	@FindBy(id = "solemnisationDetails-celebrantOath-celebrantOath")
	public static WebElement celebrantOath;

	@FindBy(id = "originalMarriageDocumentsReceived-originalMarriageDocumentsReceived")
	public static WebElement originalMarriageDocumentsReceived;

	@FindBy(xpath = ".//marriage-notification-page//search-results//table//tr[2]/td[1]/div/a")
	public static WebElement matchingNotifivation;

	@FindBy(xpath = ".//*/div[text() = 'Registered']")
	public static WebElement marriageRegStatus;

}
