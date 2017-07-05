package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EpublicLoginPage extends BaseClass {

	public EpublicLoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = ".//*[@id='login-username']")
	public static WebElement username;

	@FindBy(xpath = ".//*[@id='login-password']")
	public static WebElement password;

	@FindBy(xpath = ".//*/button[contains(text(),'Login')]")
	public static WebElement signin_button;



}
