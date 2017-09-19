package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EregistryANPage extends BaseClass {

	public EregistryANPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "adoptionDetails-adoptionOrderNumber")
	public static WebElement adoptionOrderNumber;
	
	@FindBy(id = "adoptionDetails-dateOfOrder-day")
	public static WebElement dateOfOrderDay;
	
	@FindBy(id = "adoptionDetails-dateOfOrder-month")
	public static WebElement dateOfOrderMonth;
	
	@FindBy(id = "adoptionDetails-dateOfOrder-year")
	public static WebElement dateOfOrderYear;
	
	@FindBy(id = "adoptionDetails-aoInRespectToAboriginalChild")
	public static WebElement adoptionInRespectToAboriginalChild;
	
	@FindBy(id = "preAdoptionChildsDetails-formerFamilyName")
	public static WebElement formerFamilyName;
	
	@FindBy(id = "preAdoptionChildsDetails-formerfamilyFirstName")
	public static WebElement formerFirstName;
	
	@FindBy(id = "preAdoptionChildsDetails-birthDetails-dateOfBirth-day")
	public static WebElement childDateOfBirthDay;
	
	@FindBy(id = "preAdoptionChildsDetails-birthDetails-dateOfBirth-month")
	public static WebElement childDateOfBirthMonth;
	
	@FindBy(id = "preAdoptionChildsDetails-birthDetails-dateOfBirth-year")
	public static WebElement childDateOfBirthYear;
	
	@FindBy(id = "preAdoptionChildsDetails-birthDetails-sexAtBirth")
	public static WebElement sexAtBirth;
	
	@FindBy(id = "preAdoptionChildsDetails-birthDetails-suburbTownCity")
	public static WebElement birthSuburb;
	
	@FindBy(id = "childsDetails-newName-familyName")
	public static WebElement newFamilyName;
	
	@FindBy(id = "childsDetails-newName-familyNameAtBirth")
	public static WebElement newFirstName;
	
	@FindBy(id = "adoptionParent1Details-recordAs")
	public static WebElement parent1RecordAs;
	
	@FindBy(id = "adoptionParent1Details-name-familyName")
	public static WebElement parent1FamilyName;
	
	@FindBy(id = "adoptionParent1Details-name-formerGivenNames")
	public static WebElement parent1FirstName;
	
	@FindBy(id = "adoptionParent1Details-details-dateOfBirth-day")
	public static WebElement parent1DateOfBirthDay;
	
	@FindBy(id = "adoptionParent1Details-details-dateOfBirth-month")
	public static WebElement parent1DateOfBirthMonth;
	
	@FindBy(id = "adoptionParent1Details-details-dateOfBirth-year")
	public static WebElement parent1DateOfBirthYear;
	
	@FindBy(id = "adoptionParent1Details-details-occupation")
	public static WebElement parent1Occupation;
	
	@FindBy(id = "adoptionParent1Details-placeOfBirth-suburbTownCity")
	public static WebElement parent1BirthSuburb;
	
	@FindBy(id = "adoptionParent2Details-recordAs")
	public static WebElement parent2RecordAs;
	
	@FindBy(id = "adoptionParent2Details-name-familyName")
	public static WebElement parent2FamilyName;
	
	@FindBy(id = "adoptionParent2Details-name-formerGivenNames")
	public static WebElement parent2FirstName;
	
	@FindBy(id = "adoptionParent2Details-details-dateOfBirth-day")
	public static WebElement parent2DateOfBirthDay;
	
	@FindBy(id = "adoptionParent2Details-details-dateOfBirth-month")
	public static WebElement parent2DateOfBirthMonth;
	
	@FindBy(id = "adoptionParent2Details-details-dateOfBirth-year")
	public static WebElement parent2DateOfBirthYear;
	
	@FindBy(id = "adoptionParent2Details-details-occupation")
	public static WebElement parent2Occupation;
	
	@FindBy(id = "adoptionParent2Details-placeOfBirth-suburbTownCity")
	public static WebElement parent2BirthSuburb;
	
	@FindBy(id = "adoptionRelationshipDetails-relationshipStatus")
	public static WebElement relationshipStatus;
	
	@FindBy(id = "adoptionRelationshipDetails-dateOfRelationship-day")
	public static WebElement dateOfRelationshipDay;
	
	@FindBy(id = "adoptionRelationshipDetails-dateOfRelationship-month")
	public static WebElement dateOfRelationshipMonth;
	
	@FindBy(id = "adoptionRelationshipDetails-dateOfRelationship-year")
	public static WebElement dateOfRelationshipYear;
	
	@FindBy(id = "adoptionRelationshipDetails-suburbTownCity")
	public static WebElement relationshipSuburb;
	
	@FindBy(id = "childrenOfThisRelationship-numberOfIssues")
	public static WebElement childrenOfThisRelationshipNumber;
	
	@FindBy(id = "adoptionDetails-memoValidated")
	public static WebElement memoValidated;
}
