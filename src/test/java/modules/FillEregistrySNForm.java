package modules;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.EregistryControls;
import pageobjects.EregistrySNPage;


public class FillEregistrySNForm {
	
	static String birthCertificate = RandomStringUtils.randomNumeric(10);
	
	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EregistrySNPage.class);
		
		Helper.waitFor(EregistrySNPage.surrogacyOrderNumber);
		EregistrySNPage.surrogacyOrderNumber.sendKeys(FillEregistryANForm.orderNumber);
		EregistrySNPage.dateOrderMadeDay.sendKeys("01");
		EregistrySNPage.dateOrderMadeMonth.sendKeys("09");
		EregistrySNPage.dateOrderMadeYear.sendKeys("2017");
		EregistrySNPage.currentFamilyName.sendKeys("Automated" + FillEregistryANForm.familyName);
		EregistrySNPage.currentFirstName.sendKeys("Automated" + FillEregistryANForm.newFirstName);
		EregistrySNPage.birthCertificate.sendKeys(birthCertificate);
		EregistrySNPage.childDateOfBirthDay.sendKeys("01");
		EregistrySNPage.childDateOfBirthMonth.sendKeys("08");
		EregistrySNPage.childDateOfBirthYear.sendKeys("2017");
		Helper.selectDropDownList(EregistrySNPage.sexAtBirth, "Male");
		EregistrySNPage.birthSuburb.sendKeys("Ballarat");
		Helper.selectDropDownList(EregistrySNPage.preSurrogacyParent1RecordAs, "Mother");
		EregistrySNPage.preSurrogacyParent1FamilyName.sendKeys("Automated" + FillEregistryANForm.familyName);
		EregistrySNPage.preSurrogacyParent1FirstName.sendKeys("Automated" + FillEregistryANForm.parent1FirstName);
		Helper.selectDropDownList(EregistrySNPage.preSurrogacyParent2RecordAs, "Father");
		EregistrySNPage.preSurrogacyParent2FamilyName.sendKeys("Automated" + FillEregistryANForm.familyName);
		EregistrySNPage.preSurrogacyParent2FirstName.sendKeys("Automated" + FillEregistryANForm.parent2FirstName);
		Helper.selectDropDownList(EregistrySNPage.commissioningParent1RecordAs, "Mother");
		EregistrySNPage.commissioningParent1FamilyName.sendKeys("Comparent" + FillEregistryANForm.familyName);
		EregistrySNPage.commissioningParent1FirstName.sendKeys("Comparentone" + FillEregistryANForm.parent1FirstName);
		EregistrySNPage.commissioningParent1Email.sendKeys("info@test.com");
		EregistrySNPage.commissioningParent1Phone.sendKeys("0454545450");
		Helper.selectDropDownList(EregistrySNPage.commissioningParent2RecordAs, "Father");
		EregistrySNPage.commissioningParent2FamilyName.sendKeys("Comparent" + FillEregistryANForm.familyName);
		EregistrySNPage.commissioningParent2FirstName.sendKeys("Comparenttwo" + FillEregistryANForm.parent2FirstName);
		EregistrySNPage.commissioningParent2Email.sendKeys("info1@test.com");
		EregistrySNPage.commissioningParent2Phone.sendKeys("0454545451");
		
		Helper.clickItem(EregistryControls.validateButton);
		Helper.clickItem(EregistryControls.saveButton);
		Helper.clickItem(EregistryControls.backToFormButton);
		
		EregistryControls.uploadAttachmentToLocal();
		
		EregistryControls.actionList.sendKeys("Add Document");
		EregistryControls.goButton.click();
		
		driver.switchTo().alert().accept();
		
		Helper.waitFor(EregistryControls.addDocumentType);
		EregistryControls.addDocumentType.sendKeys("Statutory Declaration");
		EregistryControls.addDocumentName.sendKeys("Statutory Declaration");

		Thread.sleep(1000);
		String userHome = System.getProperty("user.home");
		EregistryControls.chooseFileButton.sendKeys(userHome+"\\Attachment.pdf");
		Thread.sleep(2000);

		
		Helper.clickItem(EregistryControls.saveButton);
		
		Thread.sleep(2000);
		String uploadSuccess = EregistryControls.documentUploadSuccessMessage.getText();
		Assert.assertTrue("Document upload failed", uploadSuccess.contains("The document was attached successfully."));
		
		EregistryControls.surrogacyLink.click();
		EregistryControls.draftList.click();
		
		Helper.waitFor(EregistryControls.surrogacySearchFamilyName);
		EregistryControls.surrogacySearchFamilyName.sendKeys("Automated" + FillEregistryANForm.familyName);		
		EregistryControls.refreshButton.click();
		Helper.clickItem(EregistryControls.searchResult1);
		Helper.clickItem(EregistryControls.submitButton);		
		Helper.clickItem(EregistryControls.submitButton);
//		String surrogacySavedMessage;
//		Thread.sleep(3000);
//		surrogacySavedMessage = EregistryControls.surrogacySaveMessage.getText();
//		Assert.assertTrue("result message not found", surrogacySavedMessage.contains("This Surrogacy Notification has been successfully saved"));
	}
}
