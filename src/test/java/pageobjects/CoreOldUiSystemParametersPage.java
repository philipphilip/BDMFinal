package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoreOldUiSystemParametersPage extends BaseClass {

	public CoreOldUiSystemParametersPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "id61")
	public static WebElement relationshipRegistrationCoolingOffPeriod;
	
	@FindBy(id = "idd7")
	public static WebElement submitButton;
	
	@FindBy(id = "id134")
	public static WebElement saveMessage;
}
