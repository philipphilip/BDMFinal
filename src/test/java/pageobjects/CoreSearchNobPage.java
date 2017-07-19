package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoreSearchNobPage extends BaseClass {

	public CoreSearchNobPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "birthMothersDetails-name-firstGivenName")
	public static WebElement mothersFirstName;

	@FindBy(xpath = "/html/body/app/ng-component/div[2]/main/div/nob-page/div/div[2]/form/button-panel/div/div/input[1]")
	public static WebElement nobSearchButton;

}
