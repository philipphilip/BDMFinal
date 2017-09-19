package modules;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Helper;
import pageobjects.EregistryControls;
import pageobjects.EregistrySNPage;


public class FillEregistrySNForm {
	
	static String birthCertificate = RandomStringUtils.randomNumeric(10);
	
	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EregistrySNPage.class);
		
		WebDriverWait waitForOrderNumber = new WebDriverWait(driver, 10000);
		EregistrySNPage.surrogacyOrderNumber = waitForOrderNumber
				.until(ExpectedConditions.elementToBeClickable(EregistrySNPage.surrogacyOrderNumber));
		
		Helper.inputItem(EregistrySNPage.surrogacyOrderNumber, FillEregistryANForm.orderNumber);
		Helper.inputItem(EregistrySNPage.dateOrderMadeDay, "01");
		Helper.inputItem(EregistrySNPage.dateOrderMadeMonth, "09");
		Helper.inputItem(EregistrySNPage.dateOrderMadeYear, "2017");
		Helper.inputItem(EregistrySNPage.currentFamilyName, "Automated" + FillEregistryANForm.familyName);
		Helper.inputItem(EregistrySNPage.currentFirstName, "Automated" + FillEregistryANForm.newFirstName);
		Helper.inputItem(EregistrySNPage.birthCertificate, birthCertificate);
		Helper.inputItem(EregistrySNPage.childDateOfBirthDay, "01");
		Helper.inputItem(EregistrySNPage.childDateOfBirthMonth, "08");
		Helper.inputItem(EregistrySNPage.childDateOfBirthYear, "2017");
		Helper.selectDropDownList(EregistrySNPage.sexAtBirth, "Male");
		Helper.inputItem(EregistrySNPage.birthSuburb, "Ballarat");
		Helper.selectDropDownList(EregistrySNPage.preSurrogacyParent1RecordAs, "Mother");
		Helper.inputItem(EregistrySNPage.preSurrogacyParent1FamilyName, "Automated" + FillEregistryANForm.familyName);
		Helper.inputItem(EregistrySNPage.preSurrogacyParent1FirstName, "Automated" + FillEregistryANForm.parent1FirstName);
		Helper.selectDropDownList(EregistrySNPage.preSurrogacyParent2RecordAs, "Father");
		Helper.inputItem(EregistrySNPage.preSurrogacyParent2FamilyName, "Automated" + FillEregistryANForm.familyName);
		Helper.inputItem(EregistrySNPage.preSurrogacyParent2FirstName, "Automated" + FillEregistryANForm.parent2FirstName);
		Helper.selectDropDownList(EregistrySNPage.commissioningParent1RecordAs, "Mother");
		Helper.inputItem(EregistrySNPage.commissioningParent1FamilyName, "Comparent" + FillEregistryANForm.familyName);
		Helper.inputItem(EregistrySNPage.commissioningParent1FirstName, "Comparentone" + FillEregistryANForm.parent1FirstName);
		Helper.inputItem(EregistrySNPage.commissioningParent1Email, "info@test.com");
		Helper.inputItem(EregistrySNPage.commissioningParent1Phone, "0454545450");
		Helper.selectDropDownList(EregistrySNPage.commissioningParent2RecordAs, "Father");
		Helper.inputItem(EregistrySNPage.commissioningParent2FamilyName, "Comparent" + FillEregistryANForm.familyName);
		Helper.inputItem(EregistrySNPage.commissioningParent2FirstName, "Comparenttwo" + FillEregistryANForm.parent2FirstName);
		Helper.inputItem(EregistrySNPage.commissioningParent2Email, "info1@test.com");
		Helper.inputItem(EregistrySNPage.commissioningParent2Phone, "0454545451");
		
		Helper.clickItem(EregistryControls.validateButton);
		Helper.clickItem(EregistryControls.saveButton);

		Helper.clickItem(EregistryControls.surrogacyLink);
		Helper.clickItem(EregistryControls.draftList);
		
		WebDriverWait waitForSearchName = new WebDriverWait(driver, 10000);
		EregistryControls.surrogacySearchFamilyName = waitForSearchName
				.until(ExpectedConditions.elementToBeClickable(EregistryControls.surrogacySearchFamilyName));
		Helper.inputItem(EregistryControls.surrogacySearchFamilyName, "Automated" + FillEregistryANForm.familyName);		
		Helper.clickItem(EregistryControls.refreshButton);
		Helper.clickItem(EregistryControls.searchResult1);
		Helper.clickItem(EregistryControls.submitButton);		
		Helper.clickItem(EregistryControls.submitButton);
		String surrogacySavedMessage;
		Thread.sleep(3000);
		surrogacySavedMessage = EregistryControls.surrogacySaveMessage.getText();
		Assert.assertTrue("result message not found", surrogacySavedMessage.contains("This Surrogacy Notification has been successfully saved"));
	}
}
