package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CoreControls extends BaseClass {

	public CoreControls(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//*/a[text()='New']")
	public static WebElement new_tab;

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

	@FindBy(xpath = "/html/body/app/ng-component/div[2]/main/div/brs-page/div/div[2]/form/div/validation-panel/compliance-exceptions/accordion/accordion-group/div/div[2]/div/div[3]/input")
	public static WebElement coreBrsExceptionOverrideButton;

	@FindBy(xpath = "/html/body/app/ng-component/div[2]/main/div/brs-page/override-popup/base-popup/div/div/div/div[2]/div/form/cge-dropdown-ref/div/div[2]/select")
	public static WebElement coreBrsReasonCodeList;

	@FindBy(xpath = "/html/body/app/ng-component/div[2]/main/div/brs-page/override-popup/base-popup/div/div/div/div[2]/div/form/cge-text-area/div/div[2]/cge-wrapped-text-area/textarea")
	public static WebElement coreBrsReasonComments;

	@FindBy(xpath = "/html/body/app/ng-component/div[2]/main/div/brs-page/override-popup/base-popup/div/div/div/div[3]/div/button[1]")
	public static WebElement coreBrsDoOverrideButton;

	@FindBy(xpath = "/html/body/app/ng-component/div[2]/main/div/brs-page/div/div[2]/form/button-panel/div/div/input[2]")
	public static WebElement coreBrsCheckForDuplicatesButton;

	@FindBy(xpath = "/html/body/app/ng-component/div[2]/main/div/brs-page/div/div[2]/form/button-panel/div/div/input[3]")
	public static WebElement coreBrsProceedToDeathCheckButton;

	@FindBy(xpath = "/html/body/app/ng-component/div[2]/main/div/brs-page/div/div[2]/form/button-panel/div/div/input[2]")
	public static WebElement coreBrsSubmitButton;

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

	public static void selectSave() {
		actionList.sendKeys("Save");
	}

	public static void clickGo() {
		go.click();
		WebDriverWait waitForSuccessMessage = new WebDriverWait(driver, 10000);
		CoreCodPage.causeOfDeathType = waitForSuccessMessage.until(ExpectedConditions.elementToBeClickable(successMessage));
		successMessage.getText().contains("successfully saved");
	}

}
