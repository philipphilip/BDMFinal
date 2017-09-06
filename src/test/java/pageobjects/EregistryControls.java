package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EregistryControls extends BaseClass {

	public EregistryControls(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "/html/body/app/stakeholder/div/div/form/div[1]/select")
	public static WebElement stakeholderList;

	@FindBy(xpath = "//*[@id=\"navbar\"]/ul/li[1]/a")
	public static WebElement deathsLink;

	@FindBy(xpath = "//*[@id=\"navbar\"]/ul/li[1]/ul/li[1]/a")
	public static WebElement drsLink;

	@FindBy(xpath = "//*[@id=\"navbar\"]/ul/li[1]/a")
	public static WebElement certificatesLink;
	
	@FindBy(xpath = "//*[@id=\"navbar\"]/ul/li[1]/ul/li[1]/a")
	public static WebElement newCertificateLink;

	@FindBy(xpath = "//*[@id=\"navbar\"]/ul/li[1]/a")
	public static WebElement codLink;

	@FindBy(xpath = "//*[@id=\"navbar\"]/ul/li[1]/ul/li[1]/a")
	public static WebElement newCodLink;

	@FindBy(xpath = "//*[@id=\"navbar\"]/ul/li[1]/ul/li[2]/a")
	public static WebElement draftList;

	@FindBy(xpath = "/html/body/app/ng-component/div[2]/main/div/drs/div/div[2]/form/alert/div")
	public static WebElement drsMessage;

	@FindBy(xpath = "/html/body/app/ng-component/div[2]/main/div/cod/div/div[2]/form/alert/div")
	public static WebElement codMessage;

	@FindBy(id = "cod-draftList-deceasedFamilyName")
	public static WebElement codSearchFamilyName;

	@FindBy(id = "drs-draftList-deceasedFamilyName")
	public static WebElement drsSearchFamilyName;

	@FindBy(xpath = "//*[@id=\"compliantCodList\"]/div/div[1]/div/div/div")
	public static WebElement submitResultMessage;
	
	@FindBy(xpath = ".//input[@value = 'Next']")
	public static WebElement nextButton;
	
	@FindBy(xpath = ".//input[@value = 'Save']")
	public static WebElement saveButton;
	
	@FindBy(xpath = ".//input[@value = 'Refresh']")
	public static WebElement refreshButton;
	
	@FindBy(xpath = "//*[contains(@id, 'checkone')]")
	public static WebElement searchResult1;
	
	@FindBy(xpath = ".//input[@value = 'Submit']")
	public static WebElement submitButton;
	
	@FindBy(xpath = "//*[@id=\"compliantCodList\"]/div/div[1]/div/div/div")
	public static WebElement certificatesSubmitMessage;
	
	@FindBy(xpath = ".//input[@value = 'Make payment']")
	public static WebElement makePaymentButton;
	
	@FindBy(xpath = ".//input[@value = 'Make Payment']")
	public static WebElement makePaymentConfirmationButton;
	
	@FindBy(xpath = ".//input[@value = 'Start Payment']")
	public static WebElement startPaymentButton;
	
	@FindBy(xpath = ".//input[@value = 'Pay Now']")
	public static WebElement payNowButton;
	
	@FindBy(xpath = "//*[@id=\"navbar\"]/ul/li[1]/ul/li[3]/a")
	public static WebElement submitList;
}
