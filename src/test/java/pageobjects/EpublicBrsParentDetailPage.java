package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EpublicBrsParentDetailPage extends BaseClass {

	public EpublicBrsParentDetailPage(WebDriver driver) {
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



}
