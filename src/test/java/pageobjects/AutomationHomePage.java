package pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AutomationHomePage extends BaseClass {

	public AutomationHomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*/a[contains(text(),'Logout')]")
	public static WebElement sign_out;

}
