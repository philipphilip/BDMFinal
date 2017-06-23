package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TemplatesPages extends BaseClass {

	public TemplatesPages(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = ".//*/div[2]//fieldset[4]/button[contains(text(),'Create New Template')]")
	public static WebElement createNewCorroTemplate;

	@FindBy(id = "templateName")
	public static WebElement templateName;

	@FindBy(id = "templateDescription")
	public static WebElement templateDescription;

	@FindBy(id = "templateType")
	public static WebElement templateType;

	@FindBy(xpath = ".//div[2]//t-tabs//a[contains(text(),'Template Editor')]")
	public static WebElement templateEditorTab;

	@FindBy(id = "smsBody")
	public static WebElement smsBody;

	@FindBy(xpath = ".//div[2]//form//button[contains(text(),'Save Draft')]")
	public static WebElement saveDraftButton;

	@FindBy(xpath = ".//div[2]//div/div[1]/div[1]/strong")
	public static WebElement successfullySaved;

	@FindBy(id = "subsystem")
	public static WebElement emailSubSystem;

	@FindBy(id = "relatedSms")
	public static WebElement relatedSms;

	@FindBy(id = "pageSize")
	public static WebElement pageZise;

	@FindBy(id = "topMargin")
	public static WebElement topMargin;

	@FindBy(id = "rightMargin")
	public static WebElement rightMargin;

	@FindBy(id = "bottomMargin")
	public static WebElement bottomMargin;

	@FindBy(id = "leftMargin")
	public static WebElement leftMargin;

	@FindBy(xpath = "//*[@id='tinymce']")
	public static WebElement emailBody;

}
