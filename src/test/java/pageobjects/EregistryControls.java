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

	@FindBy(xpath = "//*/a[text()='Deaths']")
	public static WebElement deathsLink;

	@FindBy(xpath = "//*/a[text()='New Death Registration Statement']")
	public static WebElement drsLink;

	@FindBy(xpath = "//*/a[text()='Certificates']")
	public static WebElement certificatesLink;
	
	@FindBy(xpath = "//*/a[text()='New Certificate']")
	public static WebElement newCertificateLink;

	@FindBy(xpath = "//*/a[text()='Cause of Death']")
	public static WebElement codLink;

	@FindBy(xpath = "//*/a[text()='New Cause of Death']")
	public static WebElement newCodLink;

	@FindBy(xpath = "//*/a[text()='Draft List']")
	public static WebElement draftList;

	@FindBy(xpath = "/html/body/app/ng-component/div[2]/main/div/drs/div/div[2]/form/alert/div")
	public static WebElement drsMessage;

	@FindBy(xpath = "/html/body/app/ng-component/div[2]/main/div/cod/div/div[2]/form/alert/div")
	public static WebElement codMessage;
	
	@FindBy(xpath = "//error-list-display//alert/div")
	public static WebElement surrogacySaveMessage;

	@FindBy(id = "cod-draftList-deceasedFamilyName")
	public static WebElement codSearchFamilyName;
	
	@FindBy(id = "noticeOfBirth-draftList-birthMothersFamilyName")
	public static WebElement nobSearchFamilyName;

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
	
	@FindBy(xpath = "//*/a[text()='Submitted List']")
	public static WebElement submitList;
	
	@FindBy(xpath = "//*/a[text()='Birth']")
	public static WebElement birthLink;
	
	@FindBy(xpath = "//*/a[text()='New Notice of Birth']")
	public static WebElement nobLink;
	
	@FindBy(xpath = ".//input[@value = 'Validate']")
	public static WebElement validateButton;
	
	@FindBy(xpath = "//*/a[text()='Adoption']")
	public static WebElement adoptionLink;
	
	@FindBy(xpath = "//*/a[text()='New Adoption Notification']")
	public static WebElement newAdoptionNotificationLink;
	
	@FindBy(id = "an-draftList-childsFamilyName")
	public static WebElement adoptionSearchFamilyName;
	
	@FindBy(xpath = "//*/a[text()='Surrogacy']")
	public static WebElement surrogacyLink;
	
	@FindBy(xpath = "//*/a[text()='New Surrogacy Notification']")
	public static WebElement newSurrogacyNotificationLink;
	
	@FindBy(id = "sn-draftList-childsFamilyName")
	public static WebElement surrogacySearchFamilyName;
}
