package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EpublicApplicationPage extends BaseClass {

	public EpublicApplicationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "coo-applicantDetails-familyName")
	public static WebElement applicantFamilyName;
	
	@FindBy(id = "coo-applicantDetails-firstGivenName")
	public static WebElement applicantGivenName;
	
	@FindBy(id = "coo-applicantDetails-dateOfBirth")
	public static WebElement applicantDateOfBirth;
	
	@FindBy(id = "coo-applicantDetails-residentialAddress-line1")
	public static WebElement streetNo;
	
	@FindBy(id = "coo-applicantDetails-residentialAddress-suburb")
	public static WebElement suburb;
	
	@FindBy(id = "coo-applicantDetails-residentialAddress-state")
	public static WebElement state;
	
	@FindBy(id = "coo-applicantDetails-residentialAddress-postcode")
	public static WebElement postcode;
	
	@FindBy(id = "coo-applicantDetails-telephoneNo")
	public static WebElement telephoneNo;
	
	@FindBy(xpath = ".//*/button[contains(text(),'Next')]")
	public static WebElement nextButton;
	
	@FindBy(id = "coo-subjectDetails-selectProduct")
	public static WebElement typeOfCertificate;
	
	@FindBy(id = "coo-birth-dateOfBirthType")
	public static WebElement birthType;
	
	@FindBy(id = "coo-birth-dateOfBirth")
	public static WebElement dayOfBirth;
	
	@FindBy(id = "coo-birth-placeOfBirth")
	public static WebElement placezOfBirth;
	
	@FindBy(id = "coo-birth-relationshipToSubject")
	public static WebElement relationship;
	
	@FindBy(id = "coo-birth-reasonCertRequired")
	public static WebElement reason;
	
	@FindBy(id = "coo-birth-child-familyName")
	public static WebElement childFamilyName;
	
	@FindBy(id = "coo-birth-child-firstGivenName")
	public static WebElement childGivenName;
	
	@FindBy(id = "coo-birth-parent1-type")
	public static WebElement parentOneType;
	
	@FindBy(id = "coo-birth-parent1-familyName")
	public static WebElement parent1FamilyName;
	
	@FindBy(id = "coo-birth-parent1-firstGivenName")
	public static WebElement parentOneGivenName;
	
	@FindBy(id = "coo-birth-parent1-familyNameAtBirth")
	public static WebElement parent1FamilyNametAtBirth;
	
	@FindBy(id = "coo-birth-parent2-type")
	public static WebElement parentTwoType;
	
	@FindBy(id = "coo-birth-parent2-familyName")
	public static WebElement parent2FamilyName;
	
	@FindBy(id = "coo-birth-parent2-firstGivenName")
	public static WebElement parentTwoGivenName;
	
	@FindBy(id = "coo-birth-parent2-familyNameAtBirth")
	public static WebElement parent2FamilyNameAtBirth;
	
	@FindBy(xpath = ".//*/button[contains(text(),'Continue')]")
	public static WebElement continueButton;
	
	@FindBy(xpath = ".//*/button[contains(text(),'Proceed')]")
	public static WebElement proceedButton;
	
	@FindBy(id = "orderCertificates-certificateQuantity0")
	public static WebElement certificateQuantity;
	
	@FindBy(xpath = ".//*/button[contains(text(),'Checkout')]")
	public static WebElement checkoutButton;
	
	@FindBy(id = "reviewDraftRequest-declaration")
	public static WebElement acceptTermsCheckbox;
	
	@FindBy(xpath = ".//*/button[contains(text(),'Pay in person')]")
	public static WebElement payInPersonButton;	
}
