package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdoptionPage extends BaseClass {

	public AdoptionPage(WebDriver driver) {
		super(driver);
	}

	
	
	@FindBy(id = "adoptionDetails-dateReceivedAtRegistry")
	public static WebElement dateReceivedAtRegistry;
		
	@FindBy(id = "adoptionDetails-adoptionType")
	public static WebElement adoptionType;

	@FindBy(id = "adoptionDetails-adoptionOrderNumber")
	public static WebElement adoptionOrderNumber;

	@FindBy(id = "adoptionDetails-dateOfOrder-day")
	public static WebElement dateOfOrderDay;

	@FindBy(id = "adoptionDetails-dateOfOrder-month")
	public static WebElement dateOfOrderMonth;

	@FindBy(id = "adoptionDetails-dateOfOrder-year")
	public static WebElement dateOfOrderYear;

	@FindBy(id = "adoptionDetails-aoInRespectToAboriginalChild")
	public static WebElement aoInRespectToAboriginalChild;

	@FindBy(id = "adoptionDetails-singleParentAdoption")
	public static WebElement singleParentAdoption;

	@FindBy(id = "preAdoptionChildsDetails-name-familyName")
	public static WebElement preAdoptionChildsNameFamilyName;

	@FindBy(id = "preAdoptionChildsDetails-name-firstGivenName")
	public static WebElement preAdoptionChildsNameGivenName;

	@FindBy(id = "preAdoptionChildsDetails-birthDetails-dateOfBirth-day")
	public static WebElement preAdoptionChildsDOBDay;

	@FindBy(id = "preAdoptionChildsDetails-birthDetails-dateOfBirth-month")
	public static WebElement preAdoptionChildsDOBMonth;

	@FindBy(id = "preAdoptionChildsDetails-birthDetails-dateOfBirth-year")
	public static WebElement preAdoptionChildsDOBYear;

	@FindBy(id = "preAdoptionChildsDetails-birthDetails-sexAtBirth")
	public static WebElement childsSexAtBirth;

	@FindBy(id = "preAdoptionChildsDetails-birthDetails-country")
	public static WebElement birthDetailsCountry;

	@FindBy(id = "preAdoptionChildsDetails-birthDetails-suburbTownCity")
	public static WebElement birthDetailsSuburbTownCity;

	@FindBy(id = "adoptionChildsDetails-name-familyName")
	public static WebElement childsNewNameFamilyName;

	@FindBy(id = "adoptionChildsDetails-name-firstGivenName")
	public static WebElement childsNewNameFirstGivenName;

	@FindBy(id = "adoptionParent1Details-recordAs")
	public static WebElement adoptionParent1RecordAs;

	@FindBy(id = "adoptionParent1Details-name-familyName")
	public static WebElement adoptionParent1FamilyName;

	@FindBy(id = "adoptionParent1Details-name-familyNameAtBirth")
	public static WebElement adoptionParent1FamilyNameAtBirth;

	@FindBy(id = "adoptionParent1Details-name-firstGivenName")
	public static WebElement adoptionParent1FirstGivenName;

	@FindBy(id = "adoptionParent1Details-details-dateOfBirth-day")
	public static WebElement adoptionParent1DOBDay;

	@FindBy(id = "adoptionParent1Details-details-dateOfBirth-month")
	public static WebElement adoptionParent1DOBMonth;

	@FindBy(id = "adoptionParent1Details-details-dateOfBirth-year")
	public static WebElement adoptionParent1DOBYear;

	@FindBy(id = "adoptionParent1Details-details-occupation")
	public static WebElement adoptionParent1Occupation;

	@FindBy(id = "adoptionParent1Details-placeOfBirth-suburbTownCity")
	public static WebElement adoptionParent1PlaceOfBirthSuburbTownCity;

	@FindBy(id = "adoptionParent1Details-usualPlaceOfResidence-line1")
	public static WebElement adoptionParent1UsualPlaceOfResidenceLine1;

	@FindBy(id = "adoptionParent1Details-usualPlaceOfResidence-suburb")
	public static WebElement adoptionParent1UsualPlaceOfResidenceSuburb;

	@FindBy(id = "adoptionParent1Details-usualPlaceOfResidence-postcode")
	public static WebElement adoptionParent1usualPlaceOfResidencePostcode;

	@FindBy(id = "adoptionParent1Details-contactDetails-emailAddress")
	public static WebElement adoptionParent1EmailAddress;

	@FindBy(id = "adoptionParent1Details-contactDetails-telephoneNo")
	public static WebElement adoptionParent1TelephoneNo;

	@FindBy(id = "childrenOfThisRelationship-numberOfIssues")
	public static WebElement childrenOfThisRelationshipNumberOfIssues;

	@FindBy(id = "otherChildrenOfParent1-numberOfIssues")
	public static WebElement otherChildrenOfParent1NumberOfIssues;

	@FindBy(id = "otherDetails-adoptiveParentsRelatedToChild")
	public static WebElement adoptiveParentsRelatedToChild;

	@FindBy(id = "adoptionInformantDetails-relationshipToSubject")
	public static WebElement informantDetailsRelationshipToSubject;

	@FindBy(id = "adoptionInformantDetails-name-familyName")
	public static WebElement informantDetailsFamilyName;

	@FindBy(id = "adoptionInformantDetails-name-firstGivenName")
	public static WebElement informantDetailsFirstGivenName;

	@FindBy(id = "adoptionInformantDetails-residentialAddress-line1")
	public static WebElement informantDetailsResidentialAddressLine1;

	@FindBy(id = "adoptionInformantDetails-residentialAddress-suburb")
	public static WebElement informantDetailsResidentialAddressSuburb;

	@FindBy(id = "adoptionInformantDetails-residentialAddress-postcode")
	public static WebElement informantDetailsResidentialAddressPostcode;

	@FindBy(id = "adoptionDetails-supportingInformation")
	public static WebElement memoValidated;
}
