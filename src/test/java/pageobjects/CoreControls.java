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

	@FindBy(xpath = ".//*/a[contains(text(),'New')]")
	public static WebElement new_tab;

	@FindBy(xpath = "//*//li[2]/a[contains(text(),'Birth Registration Statement')]")
	public static WebElement BRS_form;

	@FindBy(xpath = ".//*/a[contains(text(),'of Birth')]")
	public static WebElement newNOB;

	@FindBy(xpath = "//*//li[4]/a[contains(text(),'Death Registration Statement')]")
	public static WebElement newDRS;

	@FindBy(xpath = "//*//li[3]/a[contains(text(),'Cause of Death')]")
	public static WebElement newCOD;

	@FindBy(id = "actionMenu")
	public static WebElement actionList;

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
		CODPage.causeOfDeathType = waitForSuccessMessage.until(ExpectedConditions.elementToBeClickable(successMessage));
		successMessage.getText().contains("successfully saved");
	}

}
