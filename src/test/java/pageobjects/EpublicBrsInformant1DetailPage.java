package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EpublicBrsInformant1DetailPage extends BaseClass {

	public EpublicBrsInformant1DetailPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "brs-informant1Details-informant1Details-relationshipToSubject")
	public static WebElement relationship;

	@FindBy(id = "brs-informant1Details-informant1Details-familyName")
	public static WebElement familyName;

	@FindBy(id = "brs-informant1Details-informant1Details-firstGivenName")
	public static WebElement givenName;

	@FindBy(id = "brs-informant1Details-informant1Details-dateOfBirth")
	public static WebElement dateOfBirth;

	@FindBy(id = "brs-informant1Details-residentialAddress-line1")
	public static WebElement street;

	@FindBy(id = "brs-informant1Details-residentialAddress-suburb")
	public static WebElement suburb ;

	@FindBy(id = "brs-informant1Details-residentialAddress-postcode")
	public static WebElement postcode;

	@FindBy(id = "brs-informant1Details-contactAddress-same")
	public static WebElement SameAsResidentialAddress;

	@FindBy(id = "brs-informant1Details-contactDetails-emailAddress")
	public static WebElement email;


}
