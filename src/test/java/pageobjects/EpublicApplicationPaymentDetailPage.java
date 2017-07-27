package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EpublicApplicationPaymentDetailPage extends BaseClass {

	public EpublicApplicationPaymentDetailPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "cardholderName")
	public static WebElement cardholderName;

	@FindBy(id = "creditCardNumber")
	public static WebElement creditCardNumber;

	@FindBy(id = "expiryDateMonth")
	public static WebElement expiryDateMonth;

	@FindBy(id = "expiryDateYear")
	public static WebElement expiryDateYear;

	@FindBy(id = "cvn")
	public static WebElement cvn;

	@FindBy(id = "nextButton")
	public static WebElement nextButton;



}
