package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EpublicBrsSecondParentParticipationDetailPage extends BaseClass {

	public EpublicBrsSecondParentParticipationDetailPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "brs-parent2Details-contactDetails-mobileNumber")
	public static WebElement telephone;

	@FindBy(id = "brs-parent2Details-name-firstGivenName")
	public static WebElement givenName;


}
