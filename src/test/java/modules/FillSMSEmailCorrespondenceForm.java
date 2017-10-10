package modules;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Helper;
import pageobjects.CoreAdminCorrespondenceTemplatePage;
import pageobjects.CoreControls;

public class FillSMSEmailCorrespondenceForm {

	static String tempName = RandomStringUtils.randomAlphabetic(5);

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, CoreAdminCorrespondenceTemplatePage.class);
		
		WebDriverWait waitForField1 = new WebDriverWait(driver,10000);
		CoreAdminCorrespondenceTemplatePage.templateName = waitForField1
				.until(ExpectedConditions.elementToBeClickable(CoreAdminCorrespondenceTemplatePage.templateName));
		
		CoreAdminCorrespondenceTemplatePage.templateName.sendKeys("AUTO-"+tempName+"-SMS");
		CoreAdminCorrespondenceTemplatePage.templateDescription.sendKeys("SMS template for automated test");
		CoreAdminCorrespondenceTemplatePage.templateType.sendKeys("SMS");
		Helper.clickItem(CoreAdminCorrespondenceTemplatePage.templateEditorTab);
		Thread.sleep(1000);
		CoreAdminCorrespondenceTemplatePage.smsBody.sendKeys("Automated sms message for correspondence testing, please ignore.");
		Helper.clickItem(CoreAdminCorrespondenceTemplatePage.saveButton);
		Helper.clickItem(CoreAdminCorrespondenceTemplatePage.backToListButton);
		
		CoreAdminCorrespondenceTemplatePage.templateName.sendKeys("AUTO-"+tempName+"-SMS");
		Helper.clickItem(CoreAdminCorrespondenceTemplatePage.editButton);
		Helper.clickItem(CoreAdminCorrespondenceTemplatePage.viewButton);
		Helper.clickItem(CoreAdminCorrespondenceTemplatePage.publishingDetailsTab);
		
		WebDriverWait waitForCalendar = new WebDriverWait(driver,10000);
		CoreAdminCorrespondenceTemplatePage.calenderWidget = waitForCalendar
				.until(ExpectedConditions.elementToBeClickable(CoreAdminCorrespondenceTemplatePage.calenderWidget));
		
		CoreAdminCorrespondenceTemplatePage.selectCurrentDate();
		Thread.sleep(2000);
		
		Helper.clickItem(CoreAdminCorrespondenceTemplatePage.sendForApprovalButton);
		Helper.clickItem(CoreAdminCorrespondenceTemplatePage.approveButton);
		Helper.clickItem(CoreAdminCorrespondenceTemplatePage.backToListButton);
		CoreAdminCorrespondenceTemplatePage.templateName.sendKeys("AUTO-"+tempName+"-SMS");
		Helper.clickItem(CoreAdminCorrespondenceTemplatePage.editButton);
		Helper.clickItem(CoreAdminCorrespondenceTemplatePage.templateActivityPeriodsTab);
		Helper.clickItem(CoreAdminCorrespondenceTemplatePage.newButton);
		CoreAdminCorrespondenceTemplatePage.userCurrentTimeCheckbox.sendKeys(Keys.SPACE);
		Helper.clickItem(CoreAdminCorrespondenceTemplatePage.addButton);
		Helper.clickItem(CoreAdminCorrespondenceTemplatePage.saveButton);
		Thread.sleep(2000);
		String smsTemplateStatus = CoreAdminCorrespondenceTemplatePage.templateStatus.getText();
		Assert.assertTrue("Template is not Active", smsTemplateStatus.equals("Active"));
		
		System.out.println("SMS correspondence template ID: "+"AUTO-"+tempName+"-SMS"+" ,created with the status as 'Active'.");
		
		Helper.clickItem(CoreAdminCorrespondenceTemplatePage.backToListButton);
		CoreControls.createNewTemplateButton.sendKeys(Keys.SPACE);
		
		WebDriverWait waitForField2 = new WebDriverWait(driver,10000);
		CoreAdminCorrespondenceTemplatePage.templateName = waitForField2
				.until(ExpectedConditions.elementToBeClickable(CoreAdminCorrespondenceTemplatePage.templateName));
		
		CoreAdminCorrespondenceTemplatePage.templateName.sendKeys("AUTO-"+tempName+"-EMAIL");
		CoreAdminCorrespondenceTemplatePage.templateDescription.sendKeys("Email template for automated test");
		CoreAdminCorrespondenceTemplatePage.templateType.sendKeys("Email");
		
		WebDriverWait waitForField3 = new WebDriverWait(driver,10000);
		CoreAdminCorrespondenceTemplatePage.subsystem = waitForField3
				.until(ExpectedConditions.elementToBeClickable(CoreAdminCorrespondenceTemplatePage.subsystem));
		
		CoreAdminCorrespondenceTemplatePage.subsystem.sendKeys("CBDM Core");
		CoreAdminCorrespondenceTemplatePage.lifeEvent.sendKeys("Births");
		CoreAdminCorrespondenceTemplatePage.documentType.sendKeys("BRS");
		CoreAdminCorrespondenceTemplatePage.approveBeforeSending.sendKeys("Yes");
		CoreAdminCorrespondenceTemplatePage.relatedSms.sendKeys("AUTO"+tempName+"-SMS");
		
		Helper.clickItem(CoreAdminCorrespondenceTemplatePage.templateEditorTab);
		Thread.sleep(1000);
		CoreAdminCorrespondenceTemplatePage.emailSubject.sendKeys("Automated test email, please ignore.");
//		driver.switchTo().frame(CoreAdminCorrespondenceTemplatePage.htmlFrame);
//		CoreAdminCorrespondenceTemplatePage.htmlBody.clear();
//		CoreAdminCorrespondenceTemplatePage.htmlBody.sendKeys("Automated test email, please ignore.");
//		driver.switchTo().defaultContent();
		CoreAdminCorrespondenceTemplatePage.inputHtmlTextBox(CoreAdminCorrespondenceTemplatePage.htmlFrame, CoreAdminCorrespondenceTemplatePage.htmlBody, "Automated test email, please ignore.");
		CoreAdminCorrespondenceTemplatePage.saveButton.sendKeys(Keys.SPACE);;
		Helper.clickItem(CoreAdminCorrespondenceTemplatePage.backToListButton);
		
		CoreAdminCorrespondenceTemplatePage.templateName.sendKeys("AUTO-"+tempName+"-EMAIL");
		Helper.clickItem(CoreAdminCorrespondenceTemplatePage.editButton);
		Helper.clickItem(CoreAdminCorrespondenceTemplatePage.viewButton);
		Helper.clickItem(CoreAdminCorrespondenceTemplatePage.publishingDetailsTab);
		
		WebDriverWait waitForCalendarEmail = new WebDriverWait(driver,10000);
		CoreAdminCorrespondenceTemplatePage.calenderWidget = waitForCalendarEmail
				.until(ExpectedConditions.elementToBeClickable(CoreAdminCorrespondenceTemplatePage.calenderWidget));
		
		CoreAdminCorrespondenceTemplatePage.selectCurrentDate();
		Thread.sleep(2000);
		
		Helper.clickItem(CoreAdminCorrespondenceTemplatePage.sendForApprovalButton);
		Helper.clickItem(CoreAdminCorrespondenceTemplatePage.approveButton);
		Helper.clickItem(CoreAdminCorrespondenceTemplatePage.backToListButton);
		CoreAdminCorrespondenceTemplatePage.templateName.sendKeys("AUTO-"+tempName+"-EMAIL");
		Helper.clickItem(CoreAdminCorrespondenceTemplatePage.editButton);
		Helper.clickItem(CoreAdminCorrespondenceTemplatePage.templateActivityPeriodsTab);
		Helper.clickItem(CoreAdminCorrespondenceTemplatePage.newButton);
		CoreAdminCorrespondenceTemplatePage.userCurrentTimeCheckbox.sendKeys(Keys.SPACE);
		Helper.clickItem(CoreAdminCorrespondenceTemplatePage.addButton);
		Helper.clickItem(CoreAdminCorrespondenceTemplatePage.saveButton);
		
		Thread.sleep(2000);		
		String emailTemplateStatus = CoreAdminCorrespondenceTemplatePage.templateStatus.getText();
		Assert.assertTrue("Template is not Active", emailTemplateStatus.equals("Active"));
		
		Helper.clickItem(CoreAdminCorrespondenceTemplatePage.backToListButton);
		
		System.out.println("EMail correspondence template ID: "+"AUTO-"+tempName+"-EMAIL"+" ,created with the status as 'Active'.");
	}

}
