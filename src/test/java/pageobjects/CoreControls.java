package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import helpers.Helper;

public class CoreControls extends BaseClass {

	public CoreControls(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*/a[text()='New']")
	public static WebElement newTab;

	@FindBy(xpath = "//*/a[text()='Birth Registration Statement']")
	public static WebElement newBRS;

	@FindBy(xpath = "//*/a[text()='Notice of Birth']")
	public static WebElement newNOB;

	@FindBy(xpath = "//*/a[text()='Death Registration Statement']")
	public static WebElement newDRS;

	@FindBy(xpath = "//*/a[text()='Cause of Death']")
	public static WebElement newCOD;

	@FindBy(xpath = "//*/a[text()='Relationship Notification']")
	public static WebElement newRN;

	@FindBy(xpath = "//*/a[text()='Marriage Notification']")
	public static WebElement newMR;

	@FindBy(xpath = "//a[text() = 'Change of Name Notification']")
	public static WebElement ChangeOfNameNotification;

	@FindBy(xpath = "//*/a[text()='Adoption Notification']")
	public static WebElement newAdomtion;

	@FindBy(xpath = "//*/a[text()='Search']")
	public static WebElement searchTab;

	@FindBy(xpath = ".//a[text() = 'ID Search']")
	public static WebElement idSearch;

	@FindBy(xpath = ".//a[text() = 'Death Registration Statement Search']")
	public static WebElement drsSearch;

	@FindBy(xpath = ".//a[text() = 'Notice of Birth Search']")
	public static WebElement nobSearch;

	@FindBy(xpath = ".//a[text() = 'Birth Registration Search']")
	public static WebElement birthRegistrationSearch;

	@FindBy(xpath = ".//a[text() = 'Cause of Death Search']")
	public static WebElement codSearch;

	@FindBy(xpath = ".//a[text() = 'Application Quick Search']")
	public static WebElement applicationQuickSearch;

	@FindBy(xpath = ".//a[text() = 'Adoption Notification Search']")
	public static WebElement adoptionNotificationSearch;

	@FindBy(xpath = ".//a[text() = 'Adoption Quick Search']")
	public static WebElement adoptionQuickSearch;

	@FindBy(xpath = ".//a[text() = 'Surrogacy Quick Search']")
	public static WebElement surrogacyQuickSearch;

	@FindBy(xpath = ".//a[text() = 'Relationship Registration Search']")
	public static WebElement relationshipRegistrationSearch;

	@FindBy(xpath = ".//*/a[text() = 'Death Registration Search']")
	public static WebElement deathRegistrationSearch;

	@FindBy(xpath = ".//a[text() = 'Birth Registration Statement Search']")
	public static WebElement brsSearch;

	@FindBy(xpath = ".//a[text() = 'Births Quick Search']")
	public static WebElement birthsQuickSearch;

	@FindBy(xpath = "//*/a[text()='Marriage Notification Search']")
	public static WebElement merriageNotificationSearch;

	@FindBy(xpath = "//*/a[text() = 'Marriage Registration Search']")
	public static WebElement merriageRegistrationSearch;

	@FindBy(xpath = ".//button-panel/div/div/input[@value = 'Search']")
	public static WebElement searchButton;

	@FindBy(id = "actionMenu")
	public static WebElement actionList;

	// @FindBy(xpath =
	// "/html/body/app/ng-component/div[2]/main/div/brs-page/override-popup/base-popup/div/div/div/div[2]/div/form/cge-dropdown-ref/div/div[2]/select")
	// public static WebElement coreBrsReasonCodeList;
	//
	// @FindBy(xpath =
	// "/html/body/app/ng-component/div[2]/main/div/brs-page/override-popup/base-popup/div/div/div/div[2]/div/form/cge-text-area/div/div[2]/cge-wrapped-text-area/textarea")
	// public static WebElement coreBrsReasonComments;

	@FindBy(xpath = ".//*/input[@value = 'Check For Duplicates']")
	public static WebElement checkForDuplicatesButton;

	@FindBy(xpath = ".//input[contains( @value, 'Proceed')]")
	public static WebElement proceedToReviewButton;

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

//	@FindBy(xpath = ".//matching-panel/div[1]//tr[2]/td[1]/input")
	@FindBy(xpath = ".//tr[2]/td[1]/input")
	public static WebElement firstRadioButtonMatch;

	// @FindBy(xpath =
	// ".//application-wiz-match-results/div[2]//tr[2]/td[1]/input")
	// public static WebElement firstRadioButtonMatchApplication;
	//
	// @FindBy(xpath = ".//matching-panel//tr[2]/td[1]/input")
	// public static WebElement firstRadioButtonMatchCON;

	// @FindBy(xpath = ".//input[@value = 'Match with selected Notification']")
	// public static WebElement matchButtonApplicationCON;

	@FindBy(xpath = ".//input[contains(@value, 'Match with')]")
	public static WebElement matchButtonApplication;

	@FindBy(xpath = ".//input[@value = 'No matches']")
	public static WebElement noMatchButton;

	@FindBy(xpath = ".//*/input[@value='Next']")
	public static WebElement nextButton;

	// @FindBy(xpath = ".//input[@value = 'Submit Application']")
	// public static WebElement submitButton;

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

	@FindBy(xpath = ".//button[text() = 'Submit']")
	public static WebElement submitProduct;

	@FindBy(xpath = ".//input[contains(@value, 'Submit')]")
	public static WebElement submitButton;

	@FindBy(xpath = ".//input[@value = 'Back To Form']")
	public static WebElement backToFormButton;

	@FindBy(xpath = ".//search-results/div/table/tbody/tr[2]/td[1]/div/a")
	public static WebElement nobSearchResult;

	@FindBy(xpath = ".//*/div[contains (text(),'Additional')]")
	public static WebElement incaseNoDuplicates;

	@FindBy(xpath = ".//*/a[text() = 'User ']")
	public static WebElement userTab;

	@FindBy(xpath = ".//*/a[text() = 'Internal users']")
	public static WebElement internalUsersLink;

	@FindBy(xpath = ".//*/li[2]/a[text() = 'Product ']")
	public static WebElement productsTab;

	@FindBy(xpath = ".//*/li[2]/a[text() = 'New Product']")
	public static WebElement newProduct;

	@FindBy(xpath = ".//*/button[text() = 'Create New Core User']")
	public static WebElement createNewCoreUserButton;

	@FindBy(xpath = "//*/a[text()='General Admin']")
	public static WebElement oldUiGeneralAdminTab;

	@FindBy(xpath = "//*/a[text()='System Parameters']")
	public static WebElement oldUiSystemParametersTab;

	@FindBy(xpath = "//side-panel//a[text()='Tasks']")
	public static WebElement tasksTab;

	@FindBy(xpath = "//task-list-panel//tr[2]//a")
	public static WebElement task1Id;

	@FindBy(xpath = "//task-list-panel//tr[3]//a")
	public static WebElement task2Id;

	@FindBy(xpath = "//task-list-panel//tr[2]/td[4]")
	public static WebElement task1Status;

	@FindBy(xpath = "//task-list-panel//tr[3]/td[4]")
	public static WebElement task2Status;

	@FindBy(xpath = ".//*/a[text() = 'Template Management ']")
	public static WebElement templateManagementTab;

	@FindBy(xpath = ".//*/a[text() = 'Correspondence Templates']")
	public static WebElement correpondenceTemplatesLink;

	@FindBy(xpath = ".//*/button[text() = 'Create New Template']")
	public static WebElement createNewTemplateButton;

	@FindBy(xpath = "//button[text()='Select Recipients']")
	public static WebElement selectRecipientsButton;

	@FindBy(xpath = "//recipients-popup//li[1]/input")
	public static WebElement recipientFirstCheckBox;

	@FindBy(xpath = "//button[text()='Ok']")
	public static WebElement okButton;

	@FindBy(id = "Subject")
	public static WebElement correspondenceSubject;

	@FindBy(id = "Template")
	public static WebElement template;

	@FindBy(xpath = "//button[text()='Load Template']")
	public static WebElement loadTemplateButton;

	@FindBy(id = "Send SMS")
	public static WebElement sendSMSCheckbox;

	@FindBy(xpath = "//input[@value='Approve & Send']")
	public static WebElement approveAndSendButton;

	@FindBy(xpath = "//side-panel//a[text()='Correspondences']")
	public static WebElement correspondencesTab;

	@FindBy(xpath = "//correspondences-panel//tbody[2]//span[1]")
	public static WebElement expandCorrespondenceSent;

	@FindBy(xpath = "//correspondences-inner-panel//tr[2]/td[6]/div/div")
	public static WebElement emailStatus;

	@FindBy(xpath = "//correspondences-inner-panel//tr[3]/td[6]/div/div")
	public static WebElement smsStatus;

	public static void saveForm() throws Exception {
		actionList.sendKeys("Save");
		Thread.sleep(2000);
		go.click();
	}

	public static void editForm() throws Throwable {
		actionList.sendKeys("Edit");
		go.click();
	}

	public static void validateForm() throws Throwable {
		validateButton.click();
	}

	public static void matchToFirstRadioButton() throws Throwable {
		Thread.sleep(2000);
		firstRadioButtonMatch.click();
		matchButtonApplication.click();
		// firstRadioButtonMatchCON.click();
		// matchButtonApplicationCON.click();
	}

	public static void proceedDuplicates() throws Throwable {
		try {
			Boolean noDuplicates = incaseNoDuplicates.isDisplayed();
			if (noDuplicates) {
				System.out.println("There are no duplicates to this form.");
			}
		} catch (Exception e) {
			proceedToReviewButton.click();
		}
	}

	public static void overrideExceptionsOnform() throws Throwable {
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
			Thread.sleep(2000);
			proceedDuplicates();
			Thread.sleep(2000);
			try {
				Helper.clickItem(submitButton);
			} catch (Exception e) {
			}
			System.out.println("There were validation errors that got overridden");
		} else {
			checkForDuplicatesButton.click();
			Thread.sleep(2000);
			proceedDuplicates();
			Thread.sleep(2000);
			try {
				Helper.clickItem(submitButton);
			} catch (Exception e) {
			}
			System.out.println("There are no validation errors");
		}
	}

	public static void printForm() throws Throwable {
		actionList.sendKeys("Print");
		Thread.sleep(2000);
		goPrintCertificate.click();
	}

	public static void clickNewTab() throws Throwable {
		Helper.waitFor(newTab);
		newTab.click();
	}
}
