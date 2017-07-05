package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EpublicControls extends BaseClass {

	public EpublicControls(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = ".//*/li/a[contains(text(),'Births')]")
	public static WebElement briths_tab;

	@FindBy(xpath = "/html/body/app/div/product-page/div/div/div/div/div[1]/a/img")
	public static WebElement BRS_form;

	@FindBy(xpath = ".//*/button[contains(text(),'I agree')]")
	public static WebElement i_agree;

	@FindBy(xpath = ".//*/button[contains(text(),'Next')]")
	public static WebElement nextButton;
}
