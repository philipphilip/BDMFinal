package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoreSearchBirthsPage extends BaseClass {

	public CoreSearchBirthsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "birthMothersDetails-name-firstGivenName")
	public static WebElement mothersFirstName;

	@FindBy(xpath = "/html/body/app/ng-component/div[2]/main/div/nob-page/div/div[2]/form/button-panel/div/div/input[1]")
	public static WebElement nobSearchButton;

	@FindBy(id = "subjectsDetails-name-familyName")
	public static WebElement childFamilyName;

	@FindBy(xpath = ".//birth-registration-page//tr/td[2]/div")
	public static WebElement childFamilyNameInSeachResults;

}
