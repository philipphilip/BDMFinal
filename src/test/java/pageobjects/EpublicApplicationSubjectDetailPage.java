package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EpublicApplicationSubjectDetailPage extends BaseClass {

	public EpublicApplicationSubjectDetailPage(WebDriver driver) {
		super(driver);
	}

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

	@FindBy(id = "coo-birth-child-firstGivenName")
	public static WebElement childGivenName;

	@FindBy(id = "coo-birth-parent1-type")
	public static WebElement parentOneType;

	@FindBy(id = "coo-birth-parent1-firstGivenName")
	public static WebElement parentOneGivenName;

	@FindBy(id = "coo-birth-parent2-type")
	public static WebElement parentTwoType;

	@FindBy(id = "coo-birth-parent2-firstGivenName")
	public static WebElement parentTwoGivenName;


}
