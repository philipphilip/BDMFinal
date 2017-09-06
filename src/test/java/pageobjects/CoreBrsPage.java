package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoreBrsPage extends BaseClass {

	public CoreBrsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = ".//*/a[contains(text(),'New')]")
	public static WebElement new_tab;

	@FindBy(xpath = ".//*/li[2]/a[contains(text(),'Birth Registration Statement')]")
	public static WebElement new_BRS;

	@FindBy(xpath = ".//*/button-panel//input[1]")
	public static WebElement validate_BRS_field_button;

	@FindBy(xpath = ".//*/li[2]/a[contains(text(),'Birth Registration Statement')]")
	public static WebElement Date_Received_at_Registry;

	@FindBy(id = "additionalNotificationDetails-dateReceivedAtRegistry")
	public static WebElement dateReceivedAtRegistry;

	@FindBy(id = "additionalNotificationDetails-crossOutWhiteOut")
	public static WebElement crossOutWhiteOut;

	@FindBy(id = "additionalNotificationDetails-cannotObtainDetailSignatureOfOneOfTheParents")
	public static WebElement cannotObtainDetailSignatureOfOneOfTheParents;

	@FindBy(id = "additionalNotificationDetails-whyIsntTheParentOfChildCompletingTheForm")
	public static WebElement whyIsntTheParentOfChildCompletingTheForm;

	@FindBy(id = "additionalNotificationDetails-surrogacyReferenceNumber")
	public static WebElement surrogacyReferenceNumber;

	@FindBy(id = "childsDetails-name-familyName")
	public static WebElement childs_familyName;

	@FindBy(id = "childsDetails-name-firstGivenName")
	public static WebElement childs_firstGivenName;

	@FindBy(id = "childsDetails-name-otherGivenNames")
	public static WebElement childs_otherGivenNames;

	@FindBy(id = "childsDetails-birthDetails-dateOfBirth-day")
	public static WebElement childs_DOB_day;

	@FindBy(id = "childsDetails-birthDetails-dateOfBirth-month")
	public static WebElement childs_DOB_month;

	@FindBy(id = "childsDetails-birthDetails-dateOfBirth-year")
	public static WebElement childs_DOB_year;

	@FindBy(id = "childsDetails-birthDetails-sexAtBirth")
	public static WebElement sexAtBirth;

	@FindBy(id = "childsDetails-birthDetails-bornAlive")
	public static WebElement child_born_Alive;

	@FindBy(id = "childsDetails-birthDetails-gestationPeriod")
	public static WebElement childs_gestationPeriod;

	@FindBy(id = "childsDetails-birthDetails-weight")
	public static WebElement childs_weight;

	@FindBy(id = "childsDetails-birthDetails-multipleBirth")
	public static WebElement multipleBirth;

	@FindBy(id = "childsDetails-birthDetails-birthOrder")
	public static WebElement birthOrder;

	@FindBy(id = "childsDetails-birthDetails-birthOrderOf")
	public static WebElement birthOrderOf;

	@FindBy(id = "childsDetails-birthDetails-wasTheChildBornInHospital")
	public static WebElement wasTheChildBornInHospital;

	@FindBy(id = "childsDetails-birthDetails-hospitalName")
	public static WebElement hospitalName;

	@FindBy(id = "childsDetails-birthDetails-hospitalTownSuburbCity")
	public static WebElement hospitalTownSuburbCity;

	@FindBy(id = "parent1Details-recordAs")
	public static WebElement parent1_recordAs;

	@FindBy(id = "parent1Details-name-familyName")
	public static WebElement parent1_familyName;

	@FindBy(id = "parent1Details-name-familyNameAtBirth")
	public static WebElement parent1_familyNameAtBirth;

	@FindBy(id = "parent1Details-name-firstGivenName")
	public static WebElement parent1_firstGivenName;

	@FindBy(id = "parent1Details-name-otherGivenNames")
	public static WebElement parent1_otherGivenNames;

	@FindBy(id = "parent1Details-details-dateOfBirth-day")
	public static WebElement parent1_dateOfBirth_day;

	@FindBy(id = "parent1Details-details-dateOfBirth-month")
	public static WebElement parent1_dateOfBirth_month;

	@FindBy(id = "parent1Details-details-dateOfBirth-year")
	public static WebElement parent1_dateOfBirth_year;

	@FindBy(id = "parent1Details-details-age")
	public static WebElement parent1_age;

	@FindBy(id = "parent1Details-details-occupation")
	public static WebElement parent1_occupation;

	@FindBy(id = "parent1Details-details-aboriginalOrTorresStraitIslanderOrigin")
	public static WebElement parent1_aboriginal;

	@FindBy(id = "parent1Details-details-deceased")
	public static WebElement parent1_deceased;

	@FindBy(id = "parent1Details-placeOfBirth-country")
	public static WebElement parent1_placeOfBirth_country;

	@FindBy(id = "parent1Details-placeOfBirth-suburbTownCity")
	public static WebElement parent1_placeOfBirth_suburbTownCity;

	@FindBy(id = "parent1Details-placeOfBirth-stateTerritory")
	public static WebElement parent1_placeOfBirth_stateterritory;

	@FindBy(id = "parent1Details-usualPlaceOfResidence-country")
	public static WebElement parent1_usualPlaceOfResidence_country;

	@FindBy(id = "parent1Details-usualPlaceOfResidence-line1")
	public static WebElement parent1_usualPlaceOfResidence_line1;

	@FindBy(id = "parent1Details-usualPlaceOfResidence-line2")
	public static WebElement parent1_usualPlaceOfResidence_line2;

	@FindBy(id = "parent1Details-usualPlaceOfResidence-suburb")
	public static WebElement parent1_usualPlaceOfResidence_Suburb;

	@FindBy(id = "parent1Details-usualPlaceOfResidence-state")
	public static WebElement parent1_usualPlaceOfResidence_state;

	@FindBy(id = "parent1Details-usualPlaceOfResidence-postcode")
	public static WebElement parent1_usualPlaceOfResidence_postcode;

	@FindBy(id = "parent1Details-contactDetails-emailAddress")
	public static WebElement parent1_emailAddress;

	@FindBy(id = "parent1Details-contactDetails-telephoneNo")
	public static WebElement parent1_contactDetails_telephoneNo;

	@FindBy(id = "parent1Details-proofOfIdentity-poiVerifiedOfParent")
	public static WebElement parent1_poiVerifiedOfParent;

	@FindBy(id = "parent1Details-proofOfIdentity-howPoiVerifiedOfParent")
	public static WebElement parent1_howPoiVerifiedOfParent;

	@FindBy(id = "parent1Details-declaration-declarationFromApplicant")
	public static WebElement parent1_declarationFromApplicant;

	@FindBy(id = "parent2ParticipationDetails-isThereASecondParentParticipatingInRegistrationOfBirth")
	public static WebElement parent2_isParticipating;

	@FindBy(id = "parent2ParticipationDetails-willTheParent2BeFillingParent2DetailsOnTheForm")
	public static WebElement parent2_willFillParent2Details;

	@FindBy(id = "parent2ParticipationDetails-doYouparent1HaveAnySafetyConcernsFromParent2BeingContacted")
	public static WebElement doYouparent1HaveAnySafetyConcernsFromParent2BeingContacted;

	@FindBy(id = "parent2ParticipationDetails-attachEvidenceToSupportAnySexualAssaultOrDomesticViolenceOrAnythingElse")
	public static WebElement attachEvidenceToSupportSexualAssault;

	@FindBy(id = "parent2ParticipationDetails-name-familyName")
	public static WebElement parent2ParticipationDetails_familyName;

	@FindBy(id = "parent2ParticipationDetails-name-firstGivenName")
	public static WebElement parent2ParticipationDetails_firstGivenName;

	@FindBy(id = "parent2ParticipationDetails-name-otherGivenNames")
	public static WebElement parent2ParticipationDetails_otherGivenNames;

	@FindBy(id = "parent2ParticipationDetails-emailAddress")
	public static WebElement parent2ParticipationDetails_emailAddress;

	@FindBy(id = "parent2ParticipationDetails-mobileNumber")
	public static WebElement parent2ParticipationDetails_mobileNumber;

	@FindBy(id = "parentageDisputeDeclaration-isThereADisputeOfParentage")
	public static WebElement isThereADisputeOfParentage;

	@FindBy(id = "parentageDisputeDeclaration-name-familyName")
	public static WebElement parentageDispute_familyName;

	@FindBy(id = "parentageDisputeDeclaration-name-firstGivenName")
	public static WebElement parentageDispute_firstGivenName;

	@FindBy(id = "parentageDisputeDeclaration-name-otherGivenNames")
	public static WebElement parentageDispute_otherGivenNames;

	@FindBy(id = "parentageDisputeDeclaration-dateOfBirth-day")
	public static WebElement parentageDispute_dateOfBirth_day;

	@FindBy(id = "parentageDisputeDeclaration-dateOfBirth-month")
	public static WebElement parentageDispute_dateOfBirth_month;

	@FindBy(id = "parentageDisputeDeclaration-dateOfBirth-year")
	public static WebElement parentageDispute_dateOfBirth_year;

	@FindBy(id = "childNameDisputeDeclaration-isThereADisputeOfChildsName")
	public static WebElement isThereADisputeOfChildsName;

	@FindBy(id = "childNameDisputeDeclaration-childsProposedName-familyName")
	public static WebElement childsProposedName_familyName;

	@FindBy(id = "childNameDisputeDeclaration-childsProposedName-firstGivenName")
	public static WebElement childsProposedName_firstGivenName;

	@FindBy(id = "childNameDisputeDeclaration-childsProposedName-otherGivenNames")
	public static WebElement childsProposedName_otherGivenNames;

	@FindBy(id = "parent2Details-recordAs")
	public static WebElement parent2_recordAs;

	@FindBy(id = "parent2Details-name-familyName")
	public static WebElement parent2_familyName;
				  
	@FindBy(id = "parent2Details-name-firstGivenName")
	public static WebElement parent2_firstGivenName;

	@FindBy(id = "parent2Details-name-otherGivenNames")
	public static WebElement parent2_otherGivenNames;

	@FindBy(id = "parent2Details-details-dateOfBirth-day")
	public static WebElement parent2dateOfBirth_day;

	@FindBy(id = "parent2Details-details-dateOfBirth-month")
	public static WebElement parent2dateOfBirth_month;

	@FindBy(id = "parent2Details-details-dateOfBirth-year")
	public static WebElement parent2dateOfBirth_year;

	@FindBy(id = "parent2Details-details-age")
	public static WebElement parent2_age;

	@FindBy(id = "parent2Details-details-occupation")
	public static WebElement parent2_occupation;

	@FindBy(id = "parent2Details-details-aboriginalOrTorresStraitIslanderOrigin")
	public static WebElement parent2_aboriginal;

	@FindBy(id = "parent2Details-details-deceased")
	public static WebElement parent2Details_deceased;

	@FindBy(id = "parent2Details-placeOfBirth-country")
	public static WebElement parent2_country;

	@FindBy(id = "parent2Details-placeOfBirth-suburbTownCity")
	public static WebElement parent2_suburbTownCity;

	@FindBy(id = "parent2Details-placeOfBirth-stateTerritory")
	public static WebElement parent2_stateTerritory;

	@FindBy(id = "parent2Details-usualPlaceOfResidence-country")
	public static WebElement parent2_usualPlaceOfResidence_country;

	@FindBy(id = "parent2Details-usualPlaceOfResidence-line1")
	public static WebElement parent2_usualPlaceOfResidence_line1;

	@FindBy(id = "parent2Details-usualPlaceOfResidence-line2")
	public static WebElement parent2_usualPlaceOfResidence_line2;

	@FindBy(id = "parent2Details-usualPlaceOfResidence-suburb")
	public static WebElement parent2_usualPlaceOfResidence_suburb;

	@FindBy(id = "parent2Details-usualPlaceOfResidence-state")
	public static WebElement parent2_usualPlaceOfResidence_state;

	@FindBy(id = "parent2Details-usualPlaceOfResidence-postcode")
	public static WebElement parent2_usualPlaceOfResidence_postcode;

	@FindBy(id = "parent2Details-contactDetails-emailAddress")
	public static WebElement parent2_emailAddress;

	@FindBy(id = "parent2Details-contactDetails-telephoneNo")
	public static WebElement parent2_telephoneNo;

	@FindBy(id = "parent2Details-proofOfIdentity-poiVerifiedOfParent")
	public static WebElement parent2_poiVerifiedOfParent;

	@FindBy(id = "relationshipDetails-relationshipStatus")
	public static WebElement relationshipStatus;

	@FindBy(id = "relationshipDetails-dateOfRelationshipRegistration-day")
	public static WebElement dateOfRelationshipRegistrationDay;

	@FindBy(id = "relationshipDetails-dateOfRelationshipRegistration-month")
	public static WebElement dateOfRelationshipRegistrationMonth;

	@FindBy(id = "relationshipDetails-dateOfRelationshipRegistration-year")
	public static WebElement dateOfRelationshipRegistrationYear;

	// @FindBy(id = "relationshipDetails-dateOfRelationshipRegistration-day")
	// public static WebElement dateRelationshipRegistredDay;
	//
	// @FindBy(id = "relationshipDetails-dateOfRelationshipRegistration-month")
	// public static WebElement dateRelationshipRegistredMonth;
	//
	// @FindBy(id = "relationshipDetails-dateOfRelationshipRegistration-year")
	// public static WebElement dateRelationshipRegistredYear;

	@FindBy(id = "relationshipDetails-isTheRelationshipStatusDisputedByParent2")
	public static WebElement isTheRelationshipStatusDisputedByParent2;

	@FindBy(id = "donorTreatmentDetails-donorTreatmentReceived")
	public static WebElement donorTreatmentReceived;

	@FindBy(id = "childrenOfThisRelationship-numberOfIssues")
	public static WebElement childrenOfThisRelationship;

	@FindBy(id = "relationshipDetails-suburbTownCity")
	public static WebElement childrenOfThisRelationship_Suburb;

	@FindBy(id = "otherChildrenOfParent1-numberOfIssues")
	public static WebElement otherChildrenOfParent1;

	@FindBy(id = "informant1Details-relationshipToSubject")
	public static WebElement informant1_relationshipToSubject;

	@FindBy(id = "informant1Details-name-familyName")
	public static WebElement informant1_familyName;

	@FindBy(id = "informant1Details-name-firstGivenName")
	public static WebElement informant1_firstGivenName;

	@FindBy(id = "informant1Details-name-otherGivenNames")
	public static WebElement informant1_otherGivenNames;

	@FindBy(id = "informant1Details-name-dateOfBirth-day")
	public static WebElement informant1_DOB_day;

	@FindBy(id = "informant1Details-name-dateOfBirth-month")
	public static WebElement informant1_DOB_month;

	@FindBy(id = "informant1Details-name-dateOfBirth-year")
	public static WebElement informant1_DOB_year;

	@FindBy(id = "informant1Details-residentialAddress-line1")
	public static WebElement informant1_residentialAddress_line1;

	@FindBy(id = "informant1Details-residentialAddress-suburb")
	public static WebElement informant1_residentialAddress_suburb;

	@FindBy(id = "informant1Details-residentialAddress-postcode")
	public static WebElement informant1_residentialAddress_postcode;

	@FindBy(id = "informant1Details-contactAddress-line1")
	public static WebElement informant1_contactAddress_line1;

	@FindBy(id = "informant1Details-contactAddress-suburb")
	public static WebElement informant1_contactAddress_suburb;

	@FindBy(id = "informant1Details-contactAddress-postcode")
	public static WebElement informant1_contactAddress_postcode;

	@FindBy(id = "informant1Details-contactDetails-telephoneNo")
	public static WebElement informant1_telephoneNo;

	@FindBy(id = "informant1Details-contactDetails-emailAddress")
	public static WebElement informant1_emailAddress;

	/////////////////

	@FindBy(id = "informant2Details-relationshipToSubject")
	public static WebElement informant2_relationshipToSubject;

	@FindBy(id = "informant2Details-name-familyName")
	public static WebElement informant2_familyName;

	@FindBy(id = "informant2Details-name-firstGivenName")
	public static WebElement informant2_firstGivenName;

	@FindBy(id = "informant2Details-name-otherGivenNames")
	public static WebElement informant2_otherGivenNames;

	@FindBy(id = "informant2Details-name-dateOfBirth-day")
	public static WebElement informant2_DOB_day;

	@FindBy(id = "informant2Details-name-dateOfBirth-month")
	public static WebElement informant2_DOB_month;

	@FindBy(id = "informant2Details-name-dateOfBirth-year")
	public static WebElement informant2_DOB_year;

	@FindBy(id = "informant2Details-residentialAddress-line1")
	public static WebElement informant2_residentialAddress_line1;

	@FindBy(id = "informant2Details-residentialAddress-suburb")
	public static WebElement informant2_residentialAddress_suburb;

	@FindBy(id = "informant2Details-residentialAddress-postcode")
	public static WebElement informant2_residentialAddress_postcode;

	@FindBy(id = "informant2Details-contactAddress-line1")
	public static WebElement informant2_contactAddress_line1;

	@FindBy(id = "informant2Details-contactAddress-suburb")
	public static WebElement informant2_contactAddress_suburb;

	@FindBy(id = "informant2Details-contactAddress-postcode")
	public static WebElement informant2_contactAddress_postcode;

	@FindBy(id = "informant2Details-contactDetails-telephoneNo")
	public static WebElement informant2_telephoneNo;

	@FindBy(id = "informant2Details-contactDetails-emailAddress")
	public static WebElement informant2_emailAddress;

	@FindBy(xpath = ".//th[1]/input")
	public static WebElement validateCheckBox;

	// @FindBy(xpath = ".//brs-page//input[@value='Override']")
	// public static WebElement overrideButton;

	// @FindBy(xpath = "//form//*[@id='Reason Code *']")
	// public static WebElement acceptionReason;

	// @FindBy(xpath = "//*[@id='override-reasonCode']")
	// public static WebElement acceptionReason;

	// @FindBy(id = "override-comment")
	// public static WebElement reasonComment;

	// @FindBy(xpath =
	// ".//BRS-page/override-popup/base-popup/div/div/div/div[3]/div/button[text()='Override']")
	// public static WebElement overrideButton2;

	// @FindBy(xpath = ".//*[@id='error-message']/div/div")
	// public static WebElement errorBaner;

	public static void view_BRS_Form_Errors() {
		validate_BRS_field_button.click();

	}

	// public static void validateform() throws Exception {
	// CoreControls.validateButton.click();
	// Thread.sleep(3000);
	// boolean formHasErrors = errorBaner.getText()
	// .equals("There are validation errors in your Birth Registration
	// Statement.");
	// if (formHasErrors) {
	// validateCheckBox.click();
	// overrideButton.click();
	// Thread.sleep(3000);
	// acceptionReason.sendKeys("Court Order");
	// reasonComment.sendKeys("any reason");
	// overrideButton2.click();
	// System.out.println("There were validation errors that got overridden");
	// } else {
	// System.out.println("There are no validation errors");
	// }
	// }

}
