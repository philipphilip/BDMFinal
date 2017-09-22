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
	
	@FindBy(id = "idcf")
	public static WebElement submitButton;
	
	@FindBy(id = "id128")
	public static WebElement saveMessage;
}
