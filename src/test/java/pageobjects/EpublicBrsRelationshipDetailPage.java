package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EpublicBrsRelationshipDetailPage extends BaseClass {

	public EpublicBrsRelationshipDetailPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "brs-relationshipDetails-relationshipStatus")
	public static WebElement relationship;

	@FindBy(id = "brs-relationshipDetails-dateOfRelationshipRegistration")
	public static WebElement relationshipDate;
	
	@FindBy(id = "brs-relationshipDetails-suburbTownCity")
	public static WebElement relationshipSuburb;

	
	


}
