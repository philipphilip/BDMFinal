package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

	@FindBy(xpath = ".//*/button[contains(text(),'Save')]")
	public static WebElement saveButton;

	@FindBy(xpath = ".//*[@id='certificate-order-declaration']//button[contains(text(),'Order a certificate')] ")
	public static WebElement noCertificate;

	@FindBy(xpath = ".//*/button[contains(text(),'Continue')]")
	public static WebElement continueButton;

	@FindBy(xpath = ".//*/button[contains(text(),'Close')]")
	public static WebElement closeButton;

	@FindBy(xpath = "//*[@id='ACTIVE0']")
	public static WebElement submitOrderButton;

	@FindBy(xpath = ".//*/button[contains(text(),'Checkout')]")
	public static WebElement checkoutButton;

	@FindBy(id = "reviewDraftRequest-declaration")
	public static WebElement reviewDeclaration;

	@FindBy(xpath = ".//*/button[contains(text(),'Submit')]")
	public static WebElement submitButton;

	@FindBy(xpath = "/html/body/app/div/brs-form/div/div/div[2]/form/div[1]/alerts/alert/div")
	public static WebElement message;

	@FindBy(xpath = "/html/body/app/div/registered-item-order-certificates/order-certificates/form/div/div/button[3]")
	public static WebElement proceedButton;

	@FindBy(xpath = "/html/body/app/div/payment-completion/div/div[1]/div[4]/div[3]")
	public static WebElement brsSubmitResult;

	@FindBy(xpath = "/html/body/app/div/payment-completion/div/div[1]/div[5]/div[4]")
	public static WebElement paymentResult;
	
	@FindBy(xpath = ".//button[text() = 'Proceed']")
	public static WebElement proceedButtonOnBRS;
	
	@FindBy(xpath = ".//button[contains(text(), 'Proceed without ordering a certificate')]")
	public static WebElement proceedWithoutOrderingCertificate;
	
	@FindBy(xpath = ".//div[contains(text(), 'Your BDM Order no.')]")
	public static WebElement bdmOrderNo; 
}
