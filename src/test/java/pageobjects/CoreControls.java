package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoreControls extends BaseClass {

	public CoreControls(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*/a[text()='New']")
	public static WebElement newTab;

	@FindBy(xpath = "//*/a[text()='Search']")
	public static WebElement searchTab;

	@FindBy(xpath = ".//a[text() = 'Notice of Birth Search']")
	public static WebElement nobSearch;

	@FindBy(xpath = ".//a[text() = 'Birth Registration Search']")
	public static WebElement birthRegistrationSearch;

	@FindBy(xpath = ".//a[text() = 'Death Registration Statement Search']")
	public static WebElement drsSearch;

	@FindBy(xpath = ".//a[text() = 'Cause of Death Search']")
	public static WebElement codSearch;

	@FindBy(xpath = ".//a[text() = 'ID Search']")
	public static WebElement idSearch;
	
	@FindBy(xpath = ".//a[text() = 'Birth Registration Statement Search']")
	public static WebElement brsSearch;

	@FindBy(xpath = "//*/a[text()='Marriage Notification Search']")
	public static WebElement merriageNotificationSearch;

	@FindBy(xpath = "//*/a[text() = 'Marriage Registration Search']")
	public static WebElement merriageRegistrationSearch;

	@FindBy(xpath = ".//button-panel/div/div/input[@value = 'Search']")
	public static WebElement searchButton;

	@FindBy(xpath = "//*/a[text()='Birth Registration Statement']")
	public static WebElement newBRS;

	@FindBy(xpath = "//*/a[text()='Notice of Birth']")
	public static WebElement newNOB;

	@FindBy(xpath = "//*/a[text()='Death Registration Statement']")
	public static WebElement newDRS;

	@FindBy(xpath = "//*/a[text()='Cause of Death']")
	public static WebElement newCOD;

	@FindBy(xpath = "//*/a[text()='Marriage Notification']")
	public static WebElement newMR;

	@FindBy(id = "actionMenu")
	public static WebElement actionList;

	@FindBy(xpath = "/html/body/app/ng-component/div[2]/main/div/brs-page/div/div[2]/form/button-panel/div/div/input[1]")
	public static WebElement coreBrsValidateButton;

	@FindBy(xpath = "/html/body/app/ng-component/div[2]/main/div/brs-page/div/div[2]/form/div/validation-panel/compliance-exceptions/accordion/accordion-group/div/div[2]/div/div[2]/table/tbody/tr[1]/th[1]/input")
	public static WebElement coreBrsExceptionListCheckBox;

	@FindBy(xpath = "/html/body/app/ng-component/div[2]/main/div/brs-page/override-popup/base-popup/div/div/div/div[2]/div/form/cge-dropdown-ref/div/div[2]/select")
	public static WebElement coreBrsReasonCodeList;

	@FindBy(xpath = "/html/body/app/ng-component/div[2]/main/div/brs-page/override-popup/base-popup/div/div/div/div[2]/div/form/cge-text-area/div/div[2]/cge-wrapped-text-area/textarea")
	public static WebElement coreBrsReasonComments;

	@FindBy(xpath = ".//*/input[@value = 'Check For Duplicates']")
	public static WebElement checkForDuplicatesButton;

	@FindBy(xpath = ".//input[contains( @value, 'Proceed')]")
	public static WebElement proceedToReviewButton;

	@FindBy(xpath = "/html/body/app/ng-component/div[2]/main/div/brs-page/div/div[2]/form/button-panel/div/div/input[3]")
	public static WebElement coreBrsProceedToDeathCheckButton;

	@FindBy(xpath = "/html/body/app/ng-component/div[2]/main/div/nob-page/div/div[2]/form/div/search-results/div/table/tbody/tr[2]/td[1]/div/a")
	public static WebElement coreNobFirstSearchResult;

	@FindBy(id = "error-message")
	public static WebElement coreResultMessage;

	@FindBy(xpath = ".//div[1]//a[contains(text(),'Template Management')]")
	public static WebElement templateManagement;

	@FindBy(xpath = ".//*/div[1]//li[7]/ul/li[3]/a[contains(text(),'Correspondence Templates')]")
	public static WebElement corroTemp;

	@FindBy(xpath = ".//*/div[1]//li[7]/ul/li[3]/a[contains(text(),'Certificate Templates')]")
	public static WebElement certificatesTemp;

	@FindBy(xpath = ".//*/main//action-panel//button[contains(text(),'Go')]")
	public static WebElement go;

	@FindBy(xpath = ".//*[@id='error-message']/div/div")
	public static WebElement successMessage;

	@FindBy(xpath = ".//input[@value = 'Validate']")
	public static WebElement validateButton;

	@FindBy(xpath = ".//*/a[text()='Application']")
	public static WebElement application;

	@FindBy(xpath = ".//matching-panel/div[1]//tr[2]/td[1]/input")
	public static WebElement firstRadioButtonMatch;

	@FindBy(xpath = ".//application-wiz-match-results/div[2]//tr[2]/td[1]/input")
	public static WebElement firstRadioButtonMatchApplication;

	@FindBy(xpath = ".//input[@value = 'Match with selected Notification']")
	public static WebElement matchButton;

	@FindBy(xpath = ".//input[@value = 'Match with selected']")
	public static WebElement matchButtonApplication;

	@FindBy(xpath = "//*[@id='error-message']/div/div")
	public static WebElement registrationCreatedMessage;

	@FindBy(xpath = ".//*[@id='error-message']/div/div")
	public static WebElement errorBaner;

	@FindBy(xpath = ".//th[1]/input")
	public static WebElement validateCheckBox;

	@FindBy(xpath = ".//input[@value = 'Override']")
	public static WebElement overrideButton;

	@FindBy(xpath = "//*[@id='override-reasonCode']")
	public static WebElement acceptionReason;

	@FindBy(id = "override-comment")
	public static WebElement reasonComment;

	@FindBy(xpath = ".//override-popup/base-popup//div/button[text() = 'Override']")
	public static WebElement overrideButton2;

	@FindBy(xpath = ".//simple-action-panel//button[contains(text(), 'Go' )]")
	public static WebElement goPrintCertificate;

	@FindBy(xpath = ".//input[@value = 'Check For Duplicates']")
	public static WebElement checkDuplicatesButton;

	@FindBy(xpath = ".//input[@value = 'Submit']")
	public static WebElement submitButton;

	@FindBy(xpath = ".//search-results/div/table/tbody/tr[2]/td[1]/div/a")
	public static WebElement nobSearchResult;

	public static void saveForm() throws Exception {
		actionList.sendKeys("Save");
		Thread.sleep(2000);
		go.click();
	}

	public static void editForm() {
		actionList.sendKeys("Edit");
		go.click();
	}

	public static void validateForm() {
		validateButton.click();
	}

	public static void matchNoticesToCreateRegistration() throws Exception {
		actionList.sendKeys("Match");
		go.click();
		Thread.sleep(3000);
		firstRadioButtonMatch.click();
		matchButton.click();
		Thread.sleep(3000);
		String successmessage = registrationCreatedMessage.getText();
		Assert.assertTrue("Registration did not get created",
				successmessage.contains("Registration has been successfully registered."));
	}

	public static void matchBirthCertificateAndBR() throws Exception {
		Thread.sleep(2000);
		firstRadioButtonMatchApplication.click();
		matchButtonApplication.click();
		Thread.sleep(2000);
	}

	public static void overrideExceptionsOnform() throws Exception {
		Thread.sleep(5000);
		boolean formHasErrors = errorBaner.getText().contains("are validation errors");
		if (formHasErrors) {
			validateCheckBox.click();
			overrideButton.click();
			Thread.sleep(3000);
			acceptionReason.sendKeys("Court Order");
			reasonComment.sendKeys("any reason");
			overrideButton2.click();
			Thread.sleep(2000);
			checkForDuplicatesButton.click();
			Thread.sleep(3000);
			proceedToReviewButton.click();
			Thread.sleep(2000);
			submitButton.click();
			System.out.println("There were validation errors that got overridden");
		} else {
			checkForDuplicatesButton.click();
			Thread.sleep(2000);
			proceedToReviewButton.click();
			Thread.sleep(2000);
			submitButton.click();
			System.out.println("There are no validation errors");
		}
	}

	public static void printForm() throws Exception {
		actionList.sendKeys("Print");
		Thread.sleep(2000);
		goPrintCertificate.click();
	}
}
