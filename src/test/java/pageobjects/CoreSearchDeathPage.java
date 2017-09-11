package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoreSearchDeathPage extends BaseClass {

	public CoreSearchDeathPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(id = "deceasedDetails-name-familyName")
	public static WebElement deceasedFasmiulyName;

	@FindBy(xpath = ".//death-registration-page//tr[2]/td[3]/div")
	public static WebElement deceasedFasmiulyNameInSearchResults;

}
