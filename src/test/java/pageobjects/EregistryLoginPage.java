package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EregistryLoginPage extends BaseClass {

	public EregistryLoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = ".//*[@id='Username']")
	public static WebElement username;

	@FindBy(xpath = ".//*[@id='Password']")
	public static WebElement password;

	@FindBy(xpath = ".//*/button[contains(text(),'Login')]")
	public static WebElement signin_button;



}
