package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EregistryNobPage extends BaseClass {

	public EregistryNobPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "birthMothersDetails-name-familyName")
	public static WebElement birthMotherFamilyName;
	
	@FindBy(id = "birthMothersDetails-name-familyNameSameAtBirth")
	public static WebElement familyNameSameAsFamilyNameAtBirth;
	
	@FindBy(id = "birthMothersDetails-name-familyNameAtBirth")
	public static WebElement birthMotherFamilyNameAtBirth;
	
	@FindBy(id = "birthMothersDetails-name-givenNames")
	public static WebElement birthMotherGivenNames;
	
	@FindBy(id = "birthMothersDetails-details-dateOfBirth-day")
	public static WebElement birthMotherDateOfBirthDay;
	
	@FindBy(id = "birthMothersDetails-details-dateOfBirth-month")
	public static WebElement birthMotherDateOfBirthMonth;
	
	@FindBy(id = "birthMothersDetails-details-dateOfBirth-year")
	public static WebElement birthMotherDateOfBirthYear;
	
	@FindBy(id = "birthMothersDetails-details-aboriginalOrTorresStraitIslanderOrigin")
	public static WebElement birthMotherAboriginality;
	
	@FindBy(id = "birthDetails-childsDetails-bornAlive")
	public static WebElement bornAlive;
	
	@FindBy(id = "birthMothersDetails-residentialAddress-line1")
	public static WebElement birthMotherResidentialAddressLine1;
	
	@FindBy(id = "birthMothersDetails-residentialAddress-suburb")
	public static WebElement birthMotherResidentialAddressSuburb;
	
	@FindBy(id = "birthMothersDetails-residentialAddress-postcode")
	public static WebElement birthMotherResidentialAddressPostcode;
	
	@FindBy(id = "birthMothersDetails-details-mobileNumber")
	public static WebElement birthMotherMobileNumber;
	
	@FindBy(id = "birthMothersDetails-details-emailAddress")
	public static WebElement birthMotherEmailId;
	
	@FindBy(id = "birthDetails-childsDetails-dateOfBirth-day")
	public static WebElement childDateOfBirthDay;
	
	@FindBy(id = "birthDetails-childsDetails-dateOfBirth-month")
	public static WebElement childDateOfBirthMonth;
	
	@FindBy(id = "birthDetails-childsDetails-dateOfBirth-year")
	public static WebElement childDateOfBirthYear;
	
	@FindBy(id = "birthDetails-childsDetails-timeOfBirth")
	public static WebElement childTimeOfBirth;
	
	@FindBy(id = "birthDetails-childsDetails-sexAtBirth")
	public static WebElement childSexAtBirth;
	
	@FindBy(id = "birthDetails-childsDetails-weight")
	public static WebElement childWeight;
	
	@FindBy(id = "birthDetails-hospitalBirth-hospitalName")
	public static WebElement birthHospitalName;
	
	@FindBy(id = "birthDetails-hospitalBirth-hospitalTownSuburbCity")
	public static WebElement birthHospitalSuburb;
	
	@FindBy(id = "birthDetails-childsDetails-multipleBirth")
	public static WebElement multiplebirth;
	
	@FindBy(id = "birthDetails-childsDetails-birthOrder")
	public static WebElement birthOrder;
	
	@FindBy(id = "birthDetails-childsDetails-birthOrderOf")
	public static WebElement birthOrderOf;
}
