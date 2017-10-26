package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoreProductsPage extends BaseClass {

	public CoreProductsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = ".//input[@title='The Product Code']")
	public static WebElement productCode;

	@FindBy(xpath = ".//input[@title='The Product Description']")
	public static WebElement productDescription;

	@FindBy(xpath = ".//select[@title='The Group for this product']")
	public static WebElement productGroup;

	@FindBy(xpath = ".//select[@title='The Type of this product']")
	public static WebElement productType;

	@FindBy(xpath = ".//select[@title='Select the Registration for the subject search in application']")
	public static WebElement underlyingRegistration;

	@FindBy(xpath = ".//select[@title='Select Cost Centre']")
	public static WebElement costCentre;

	@FindBy(xpath = ".//input[@title='The AC Code']")
	public static WebElement aC;

	@FindBy(xpath = ".//select[@title='Select the no trace template']")
	public static WebElement noTraceTemplate;

	@FindBy(xpath = ".//select[@title='GST rate (%)']")
	public static WebElement gstRate;

	@FindBy(xpath = ".//alert/div[@role= 'alert']")
	public static WebElement submitionAlert;

}
