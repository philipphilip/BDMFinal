package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Helper;

public class EpublicControls extends BaseClass {

	public EpublicControls(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = ".//li[2]/a[contains(text(),'Register a life event')]")
	public static WebElement registerALifeEvent_tab;
	
	@FindBy(xpath = ".//li[4]/a[contains(text(),'Order certificates')]")
	public static WebElement orderCertificates_tab;

	@FindBy(xpath = ".//li[2]//li[1]/a[contains(text(),'Birth')]")
	public static WebElement birthLink;
	
	@FindBy(xpath = ".//li[4]//li[1]/a[contains(text(),'Birth')]")
	public static WebElement birthLinkCertificates;

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

	//CHANGING THIS TO MATCH THE XPATH FOR THE RESULT OF SELECTING THE PAYMENT OPTION AS 'Pay in person'
	//@FindBy(xpath = "/html/body/app/div/payment-completion/div/div[1]/div[5]/div[4]")
	@FindBy(xpath = "/html/body/app/div/payment-completion/div/div[1]/div[5]/div[3]")
	public static WebElement paymentResult;
	
	@FindBy(xpath = ".//button[text() = 'Proceed']")
	public static WebElement proceedButtonOnBRS;
	
	@FindBy(xpath = ".//button[contains(text(), 'Proceed without ordering a certificate')]")
	public static WebElement proceedWithoutOrderingCertificate;
	
	@FindBy(xpath = ".//button[contains(text(), 'Order a certificate')]")
	public static WebElement orderACertificate;
	
	@FindBy(xpath = ".//div[contains(text(), 'Your BDM Order no.')]")
	public static WebElement bdmOrderNo; 
	
	@FindBy(xpath = ".//broadcast-popup//h4[text()='System Broadcast Message']")
	public static WebElement broadcastMessage;
	
	@FindBy(xpath = ".//broadcast-popup//button[text() ='Ok']")
	public static WebElement broadcastOkButton;
	
	@FindBy(id = "orderCertificates-certificateQuantity0")
	public static WebElement certificateQuantity;
	
	@FindBy(id = "reviewDraftRequest-declaration")
	public static WebElement acceptTermsCheckbox;
	
	@FindBy(xpath = ".//*/button[contains(text(),'Pay in person')]")
	public static WebElement payInPersonButton;
	
	@FindBy(xpath = ".//*/button[contains(text(),'Pay now')]")
	public static WebElement payNowButton;
	
	@FindBy(id = "cardholderName")
	public static WebElement cardHolderName;
	
	@FindBy(id = "creditCardNumber")
	public static WebElement creditCardNumber;
	
	@FindBy(id = "expiryDateMonth")
	public static WebElement expiryDateMonth;
	
	@FindBy(id = "expiryDateYear")
	public static WebElement expiryDateYear;
	
	@FindBy(id = "cvn")
	public static WebElement cardVerificationNumber;
	
	@FindBy(id = "nextButton")
	public static WebElement paymentNextButton;
	
	@FindBy(xpath = "//*[@id=\"ignoreDuplicate_section\"]/label")
	public static WebElement duplicatePaymentText;
	
	@FindBy(id = "ignoreDuplicate")
	public static WebElement duplicateCheckBox;
	
	@FindBy(id = "confirmButton")
	public static WebElement paymentConfirmButton;
	
	@FindBy(xpath = ".//*/button[contains(text(),'Submit in Person')]")
	public static WebElement submitInPersonButton;
	
	@FindBy(xpath = ".//h1")
	public static WebElement brsCompletionBanner;
	
	@FindBy(xpath = ".//p[3]")
	public static WebElement brsOrderNumber;
	
	public static void duplicatePayProcess() throws Throwable {
		try {
			boolean duplicatePayment = EpublicControls.duplicateCheckBox.isDisplayed();
			if(duplicatePayment) {
				Helper.clickItem(EpublicControls.duplicateCheckBox);
				Helper.clickItem(EpublicControls.paymentConfirmButton);
				Thread.sleep(3000);
				System.out.println("Duplicate payment has been processed");
			}	
		} catch (Exception e) {
			Helper.clickItem(EpublicControls.paymentConfirmButton);
			System.out.println("Payment has been processed");
		}
	}
	
	public static void payNowProcess() throws Throwable {
		Thread.sleep(5000);
		WebDriverWait waitForPaymentPage = new WebDriverWait(driver, 10000);
		EpublicControls.cardHolderName = waitForPaymentPage
				.until(ExpectedConditions.elementToBeClickable(EpublicControls.cardHolderName));
		Helper.inputItem(EpublicControls.cardHolderName, "paymentprocess");
		Helper.inputItem(EpublicControls.creditCardNumber, "4564710000000004");
		Helper.inputItem(EpublicControls.expiryDateMonth, "02");
		Helper.inputItem(EpublicControls.expiryDateYear, "19");
		Helper.inputItem(EpublicControls.cardVerificationNumber, "847");
		Helper.clickItem(EpublicControls.paymentNextButton);
		duplicatePayProcess();
	}
}
