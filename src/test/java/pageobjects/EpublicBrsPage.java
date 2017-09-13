package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EpublicBrsPage extends BaseClass {

	public EpublicBrsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "brs-parent1Details-group1-recordAs")
	public static WebElement parentType;
	
	@FindBy(id = "brs-parent1Details-group1-familyName")
	public static WebElement familyName;
	
	@FindBy(id = "brs-parent1Details-group1-familyNameAtBirth")
	public static WebElement familyNameAtBirth;
	
	@FindBy(id = "brs-parent1Details-group1-firstGivenName")
	public static WebElement givenName;
	
	@FindBy(id = "brs-parent1Details-group1-dateOfBirth")
	public static WebElement birthday;
	
	@FindBy(id = "brs-parent1Details-placeOfBirth-suburbTownCity")
	public static WebElement suburb;
	
	@FindBy(id = "brs-parent1Details-placeOfBirth-stateTerritory")
	public static WebElement  state;
	
	@FindBy(id = "brs-parent1Details-group3-aboriginalOrTorresStraitIslanderOrigin")
	public static WebElement aboriginal;
	
	@FindBy(id = "brs-parent1Details-group1-occupation")
	public static WebElement occupation;
	
	@FindBy(id = "brs-parent1Details-residence-line1")
	public static WebElement street;
	
	@FindBy(id = "brs-parent1Details-residence-suburb")
	public static WebElement addressSuburb;
	
	@FindBy(id = "brs-parent1Details-residence-state")
	public static WebElement addressState;
	
	@FindBy(id = "brs-parent1Details-residence-postcode")
	public static WebElement postcode;
	
	@FindBy(id = "brs-childDetails-name-familyName")
	public static WebElement childFamilyName;
	
	@FindBy(id = "brs-childDetails-name-firstGivenName")
	public static WebElement childFirstName;
	
	@FindBy(id = "brs-childDetails-childDetails-dateOfBirth")
	public static WebElement dateOfBirth;
	
	@FindBy(id = "brs-childDetails-childDetails-sexOfChild")
	public static WebElement sex;
	
	@FindBy(id = "brs-childDetails-childDetails-multipleBirth1")
	public static WebElement  multipleBirthNO;
	
	@FindBy(id = "brs-childDetails-childDetails-bornAlive0")
	public static WebElement bornAliveYes;
	
	@FindBy(id = "brs-childDetails-childDetails-wasTheChildBornInHospital0")
	public static WebElement hospitalYes;
	
	@FindBy(id = "select2-brs-childDetails-childDetails-hospitalName-container")
	public static WebElement hospital;
	
	@FindBy(xpath = "//*[@id=\"select2-brs-childDetails-childDetails-hospitalName-results\"]/li[5]")
	public static WebElement hospitallist;
	
	@FindBy(id = "brs-childDetails-childDetails-hospitalTownSuburbCity")
	public static WebElement hospitalSuburb;
	
	@FindBy(xpath = "//*[@id=\"brs-childDetails-childDetails-hospitalTownSuburbCity\"]/option[2]")
	public static WebElement hospitalSuburblist;
	
	@FindBy(id = "brs-relationshipDetails-relationshipStatus")
	public static WebElement relationship;
	
	@FindBy(id = "brs-relationshipDetails-dateOfRelationshipRegistration")
	public static WebElement relationshipDate;
	
	@FindBy(id = "brs-relationshipDetails-suburbTownCity")
	public static WebElement relationshipSuburb;
	
	@FindBy(id = "brs-parent2Details-contactDetails-mobileNumber")
	public static WebElement telephone;
	
	@FindBy(id = "brs-parent2ParticipationDetails-safetyConcernsFromParent2BeingContacted0")
	public static WebElement safetyConcernsFromParent2;
	
	@FindBy(id = "brs-informant1Details-informant1Details-relationshipToSubject")
	public static WebElement informantRelationship;
	
	@FindBy(id = "brs-informant1Details-informant1Details-familyName")
	public static WebElement informantFamilyName;
	
	@FindBy(id = "brs-informant1Details-informant1Details-firstGivenName")
	public static WebElement informantGivenName;
	
	@FindBy(id = "brs-informant1Details-informant1Details-dateOfBirth")
	public static WebElement informantDateOfBirth;
	
	@FindBy(id = "brs-informant1Details-residentialAddress-line1")
	public static WebElement informantAddressLine1;
	
	@FindBy(id = "brs-informant1Details-residentialAddress-suburb")
	public static WebElement informantAddressSuburb ;
	
	@FindBy(id = "brs-informant1Details-residentialAddress-postcode")
	public static WebElement informantAddressPostcode;
	
	@FindBy(id = "brs-informant1Details-contactAddress-same")
	public static WebElement SameAsResidentialAddress;
	
	@FindBy(id = "brs-informant1Details-contactDetails-emailAddress")
	public static WebElement informantContactEmail;
	
	@FindBy(id = "brs-parent2Details-name-familyName")
	public static WebElement parent2FamilyName;
	
	@FindBy(id = "brs-parent2Details-name-firstGivenName")
	public static WebElement parent2GivenName;	
}
