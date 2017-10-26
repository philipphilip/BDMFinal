package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoreRDNPage extends BaseClass {

	public CoreRDNPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "subjectDetails-currentName-familyName")
	public static WebElement subjectFamilyName;
	
	@FindBy(id = "subjectDetails-currentName-firstGivenName")
	public static WebElement subjectGivenName;
	
	@FindBy(id = "subjectDetails-birthDetails-dateOfBirth-day")
	public static WebElement subjectBirthDay;
	
	@FindBy(id = "subjectDetails-birthDetails-dateOfBirth-month")
	public static WebElement subjectBirthMonth;
	
	@FindBy(id = "subjectDetails-birthDetails-dateOfBirth-year")
	public static WebElement subjectBirthYear;
	
	@FindBy(id = "subjectDetails-birthDetails-suburb")
	public static WebElement subjectBirthSuburb;
	
	@FindBy(id = "subjectDetails-birthDetails-sex")
	public static WebElement subjectBirthSex;
	
	@FindBy(id = "parent1Details-familyName")
	public static WebElement parent1FamilyName;
	
	@FindBy(id = "parent1Details-familyNameSameToFamilyNameAtBirth")
	public static WebElement parent1FamilyNameSameAsBirth;
	
	@FindBy(id = "parent1Details-familyNameAtBirth")
	public static WebElement parent1FamilyNameAtBirth;
	
	@FindBy(id = "parent1Details-firstGivenName")
	public static WebElement parent1GivenName;
	
	@FindBy(id = "parent1Details-dateOfBirth-day")
	public static WebElement parent1BirthDay;
	
	@FindBy(id = "parent1Details-dateOfBirth-month")
	public static WebElement parent1BirthMonth;
	
	@FindBy(id = "parent1Details-dateOfBirth-year")
	public static WebElement parent1BirthYear;
	
	@FindBy(id = "parent1Details-suburb")
	public static WebElement parent1BirthSuburb;
	
	@FindBy(id = "parent2Details-familyName")
	public static WebElement parent2FamilyName;
	
	@FindBy(id = "parent2Details-familyNameSameToFamilyNameAtBirth")
	public static WebElement parent2FamilyNameSameAsBirth;
	
	@FindBy(id = "parent2Details-familyNameAtBirth")
	public static WebElement parent2FamilyNameAtBirth;
	
	@FindBy(id = "parent2Details-firstGivenName")
	public static WebElement parent2GivenName;
	
	@FindBy(id = "parent2Details-dateOfBirth-day")
	public static WebElement parent2BirthDay;
	
	@FindBy(id = "parent2Details-dateOfBirth-month")
	public static WebElement parent2BirthMonth;
	
	@FindBy(id = "parent2Details-dateOfBirth-year")
	public static WebElement parent2BirthYear;
	
	@FindBy(id = "parent2Details-suburb")
	public static WebElement parent2BirthSuburb;
	
	@FindBy(id = "changeOfSexDetails-maritalStatus")
	public static WebElement maritalStatus;
	
	@FindBy(id = "changeOfSexDetails-sexToBeRegistered")
	public static WebElement sexToBeRegistered;
	
	@FindBy(id = "subjectDetails-residentialAddress-line1")
	public static WebElement residentialAddressLine1;
	
	@FindBy(id = "subjectDetails-postalAddress-suburb")
	public static WebElement residentialSuburb;
	
	@FindBy(id = "subjectDetails-residentialAddress-postcode")
	public static WebElement residentialPostCode;
	
	@FindBy(id = "subjectDetails-residingInVictoriaForPastYear")
	public static WebElement residingInVicForPast12Months;
	
	@FindBy(id = "subjectDetails-sameAsResidentialAddress")
	public static WebElement sameAsResidentialAddress;
	
	@FindBy(id = "subjectDetails-contactDetails-telephoneNo")
	public static WebElement contactNumber;
	
	@FindBy(id = "medicalPractitioner1Details-name-familyName")
	public static WebElement doctor1FamilyName;
	
	@FindBy(id = "medicalPractitioner1Details-name-firstGivenName")
	public static WebElement doctor1GivenName;
	
	@FindBy(id = "medicalPractitioner1Details-address-line1")
	public static WebElement doctor1AddressLine1;
	
	@FindBy(id = "medicalPractitioner1Details-address-suburb")
	public static WebElement doctor1Suburb;
	
	@FindBy(id = "medicalPractitioner1Details-address-postcode")
	public static WebElement doctor1PostCode;
	
	@FindBy(id = "medicalPractitioner1Details-telephoneNo")
	public static WebElement doctor1TelephoneNo;
	
	@FindBy(id = "medicalPractitioner2Details-name-familyName")
	public static WebElement doctor2FamilyName;
	
	@FindBy(id = "medicalPractitioner2Details-name-firstGivenName")
	public static WebElement doctor2GivenName;
	
	@FindBy(id = "medicalPractitioner2Details-address-line1")
	public static WebElement doctor2AddressLine1;
	
	@FindBy(id = "medicalPractitioner2Details-address-suburb")
	public static WebElement doctor2Suburb;
	
	@FindBy(id = "medicalPractitioner2Details-address-postcode")
	public static WebElement doctor2PostCode;
	
	@FindBy(id = "medicalPractitioner2Details-telephoneNo")
	public static WebElement doctor2TelephoneNo;
	
	@FindBy(id = "declaration-declarationFromApplicant")
	public static WebElement declaration;
}
