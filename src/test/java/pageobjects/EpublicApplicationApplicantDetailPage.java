package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EpublicApplicationApplicantDetailPage extends BaseClass {

	public EpublicApplicationApplicantDetailPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "coo-applicantDetails-firstGivenName")
	public static WebElement applicantGivenName;

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
}
