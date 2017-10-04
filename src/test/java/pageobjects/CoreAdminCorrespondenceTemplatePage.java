package pageobjects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import step_definitions.Hooks;

public class CoreAdminCorrespondenceTemplatePage extends BaseClass {
	
	@FindBy(id = "templateName")
	public static WebElement templateName;
	
	@FindBy(id = "templateDescription")
	public static WebElement templateDescription;
	
	@FindBy(id = "templateType")
	public static WebElement templateType;
	
	@FindBy(xpath = "//a[text()='Template Editor']")
	public static WebElement templateEditorTab;
	
	@FindBy(id = "subsystem")
	public static WebElement subsystem;
	
	@FindBy(id = "app-before-sending")
	public static WebElement approveBeforeSending;
	
	@FindBy(id = "life-event")
	public static WebElement lifeEvent;
	
	@FindBy(id = "document-type")
	public static WebElement documentType;
	
	@FindBy(id = "relatedSms")
	public static WebElement relatedSms;
	
	@FindBy(id = "signatureBlock")
	public static WebElement signatureBlock;
	
	@FindBy(id = "emailSubject")
	public static WebElement emailSubject;
	
	@FindBy(id = "tinymce")
	public static WebElement htmlBody;
	
	@FindBy(id = "smsBody")
	public static WebElement smsBody;
	
	@FindBy(xpath = "//button[text()='Save']")
	public static WebElement saveButton;
	
	@FindBy(xpath = "//input[@value='Back To List']")
	public static WebElement backToListButton;
	
	@FindBy(xpath = "//button[contains(text(),'Edit')]")
	public static WebElement editButton;
	
	@FindBy(xpath = "//button[text()='View']")
	public static WebElement viewButton;
	
	@FindBy(xpath = "//a[text()='Publishing Details']")
	public static WebElement publishingDetailsTab;
	
	@FindBy(xpath = "//input[@value='Send For Approval']")
	public static WebElement sendForApprovalButton;
	
	@FindBy(xpath = "//input[@value='Approve']")
	public static WebElement approveButton;
	
	@FindBy(xpath = "//a[text()='Template Activity Periods']")
	public static WebElement templateActivityPeriodsTab;
	
	@FindBy(xpath = "//input[@value='New']")
	public static WebElement newButton;
	
	@FindBy(id = "useCurrentTime")
	public static WebElement userCurrentTimeCheckbox;
	
	@FindBy(xpath = "//input[@value='Add']")
	public static WebElement addButton;
	
	@FindBy(xpath = "//span[2]/div")
	public static WebElement templateStatus;
	
	@FindBy(id = "publishDate")
	public static WebElement calenderWidget;
	
	@FindBy(id = "tinyMceId_ifr")
	public static WebElement htmlFrame;
	
	public CoreAdminCorrespondenceTemplatePage(WebDriver driver) {
		super(driver);
	}

	public static void selectDate() throws Exception {
	DateFormat dateFormat = new SimpleDateFormat("dd");
	Date date = new Date();
	
	String today = dateFormat.format(date);
	
	//find the calendar
	WebElement calendar = calenderWidget;
	List <WebElement> columns = calendar.findElements(By.tagName("td"));
	
	//compare the text of the cell with today's date and click it
	for (WebElement cell : columns)
	{
		if (cell.getText().equals(today))
		{
			cell.click();
			break;
		}
	}
  }
	
	public static void inputHtmlTextBox(WebElement textBoxFrame, WebElement textBoxBody, String text) throws Throwable {
		Thread.sleep(2000);
		driver.switchTo().frame(textBoxFrame);
			
		Actions action = new Actions(driver);
		action.moveToElement(textBoxBody);
		Thread.sleep(1000);
		action.click();
		Thread.sleep(1000);
		action.sendKeys(text);
		action.build().perform();
		
		driver.switchTo().defaultContent();
	}
}
