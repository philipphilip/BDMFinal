package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EpublicBrsSecondParentDetailPage extends BaseClass {

	public EpublicBrsSecondParentDetailPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "brs-parent2Details-name-familyName")
	public static WebElement familyName;

	@FindBy(id = "brs-parent2Details-name-firstGivenName")
	public static WebElement givenName;


}
