package modules;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Helper;
import org.junit.Assert;
import pageobjects.ApplicationPage;
import pageobjects.CoreControls;

public class FillRRSApplicationForm {

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, ApplicationPage.class);
		Thread.sleep(1000);
		Helper.inputItem(ApplicationPage.dateReceivedAtRegistry, "01/09/2017");
		ApplicationPage.dateReceivedAtRegistry.sendKeys(Keys.TAB);
		ApplicationPage.dateReceivedAtRegistry.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		Helper.inputItem(ApplicationPage.productCode, "RRS");
		Thread.sleep(1000);
		Helper.inputItem(ApplicationPage.reasonCertificateIsRequired, "Administration");
		Helper.inputItem(ApplicationPage.productCode, "DRS");
		Thread.sleep(1000);
		Helper.inputItem(ApplicationPage.relationshipToSubject, "Self");
		Helper.inputItem(ApplicationPage.productCode, "RRS");
		Helper.clickItem(CoreControls.nextButton);
		Helper.inputItem(ApplicationPage.applicantFamilyName, "Auto" + FillRNForm.applicant1FamilyName);
		Helper.inputItem(ApplicationPage.applicantGivenName, "Auto" + FillRNForm.applicant1GivenName);
		Helper.inputItem(ApplicationPage.applicantDOBDay, "01");
		Helper.inputItem(ApplicationPage.applicantDOBMonth, "01");
		Helper.inputItem(ApplicationPage.applicantDOBYear, "1990");
		Helper.inputItem(ApplicationPage.applicantAddressLine1, "10 some street");
		Helper.inputItem(ApplicationPage.applicantAddressSuburb, "Melbourne");
		Helper.inputItem(ApplicationPage.applicantAddressPostcode, "3000");
		Helper.inputItem(ApplicationPage.applicantPhoneNumber, "0454545450");
		Helper.clickItem(CoreControls.nextButton);
		Helper.inputItem(ApplicationPage.deliveryMethod, "RegisteredPOST");
		Helper.inputItem(ApplicationPage.deliveryAddressCopyFrom, "Auto" + FillRNForm.applicant1FamilyName);
		Helper.clickItem(CoreControls.nextButton);
		Helper.inputItem(ApplicationPage.matchType, "Detailed Criteria");
		Helper.inputItem(ApplicationPage.relationshipType, "Domestic");
		Helper.inputItem(ApplicationPage.dateOfRelRegDay, "On");
		Helper.inputItem(ApplicationPage.dateOfRelRegDay, "01");
		Helper.inputItem(ApplicationPage.dateOfRelRegMonth, "09");
		Helper.inputItem(ApplicationPage.dateOfRelRegYear, "2017");
		Helper.inputItem(ApplicationPage.relSubject1FamilyName, "Auto" + FillRNForm.applicant1FamilyName);
		Helper.inputItem(ApplicationPage.relSubject1FamilyNameAtBirth, "Auto" + FillRNForm.applicant1FamilyName);
		Helper.inputItem(ApplicationPage.relSubject1GivenName, "Auto" + FillRNForm.applicant1GivenName);
		Helper.inputItem(ApplicationPage.relSubject1BirthDay, "01");
		Helper.inputItem(ApplicationPage.relSubject1BirthMonth, "01");
		Helper.inputItem(ApplicationPage.relSubject1BirthYear, "1990");
		Helper.inputItem(ApplicationPage.relSubject2FamilyName, "Auto" + FillRNForm.applicant2FamilyName);
		Helper.inputItem(ApplicationPage.relSubject2FamilyNameAtBirth, "Auto" + FillRNForm.applicant2FamilyName);
		Helper.inputItem(ApplicationPage.relSubject2GivenName, "Auto" + FillRNForm.applicant2FirstName);
		Helper.inputItem(ApplicationPage.relSubject2BirthDay, "01");
		Helper.inputItem(ApplicationPage.relSubject2BirthMonth, "01");
		Helper.inputItem(ApplicationPage.relSubject2BirthYear, "1990");
		Helper.clickItem(CoreControls.nextButton);
		Thread.sleep(3000);
//		Helper.clickItem(ApplicationPage.noMatchButton);
//		Thread.sleep(3000);
//		ApplicationPage.validateform();
//		Thread.sleep(3000);
//		Helper.clickItem(CoreControls.nextButton);
//		Thread.sleep(3000);
		Helper.clickItem(ApplicationPage.submitApplication);
		Thread.sleep(3000);
		String successMessage = ApplicationPage.successMessage.getText();
		Assert.assertTrue("Application for Relationship Registration Failed", successMessage.contains("successfully saved"));
		Helper.clickItem(ApplicationPage.createTransactionButton);
		System.out.println("Create Transaction initiated");
		WebDriverWait waitForCheckbox = new WebDriverWait(driver, 10000);
		ApplicationPage.paidCheckbox = waitForCheckbox
				.until(ExpectedConditions.elementToBeClickable(ApplicationPage.paidCheckbox));
		ApplicationPage.paidCheckbox.sendKeys(Keys.SPACE);
		Helper.clickItem(ApplicationPage.saveTransactionButton);
	}
}
