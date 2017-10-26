package modules;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.ApplicationPage;
import pageobjects.CoreControls;

public class FillRRSApplicationForm {

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, ApplicationPage.class);
		Thread.sleep(1000);
		ApplicationPage.dateReceivedAtRegistry.sendKeys("01/09/2017");
		ApplicationPage.dateReceivedAtRegistry.sendKeys(Keys.TAB);
		ApplicationPage.dateReceivedAtRegistry.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		ApplicationPage.productCode.sendKeys("RRS");
		Thread.sleep(1000);
		ApplicationPage.reasonCertificateIsRequired.sendKeys("Administration");
		ApplicationPage.productCode.sendKeys("DRS");
		Thread.sleep(1000);
		ApplicationPage.relationshipToSubject.sendKeys("Self");
		ApplicationPage.productCode.sendKeys("RRS");
		Helper.clickItem(CoreControls.nextButton);
		ApplicationPage.applicantFamilyName.sendKeys("Auto" + FillRNForm.applicant1FamilyName);
		ApplicationPage.applicantGivenName.sendKeys("Auto" + FillRNForm.applicant1GivenName);
		ApplicationPage.applicantDOBDay.sendKeys("01");
		ApplicationPage.applicantDOBMonth.sendKeys("01");
		ApplicationPage.applicantDOBYear.sendKeys("1990");
		ApplicationPage.applicantAddressLine1.sendKeys("10 some street");
		ApplicationPage.applicantAddressSuburb.sendKeys("Melbourne");
		ApplicationPage.applicantAddressPostcode.sendKeys("3000");
		ApplicationPage.applicantPhoneNumber.sendKeys("0454545450");
		Helper.clickItem(CoreControls.nextButton);
		ApplicationPage.deliveryMethod.sendKeys("RegisteredPOST");
		ApplicationPage.deliveryAddressCopyFrom.sendKeys("Auto" + FillRNForm.applicant1FamilyName);
		Helper.clickItem(CoreControls.nextButton);
		ApplicationPage.matchType.sendKeys("Detailed Criteria");
		ApplicationPage.relationshipType.sendKeys("Domestic");
		ApplicationPage.dateOfRelRegDay.sendKeys("On");
		ApplicationPage.dateOfRelRegDay.sendKeys("01");
		ApplicationPage.dateOfRelRegMonth.sendKeys("09");
		ApplicationPage.dateOfRelRegYear.sendKeys("2017");
		ApplicationPage.relSubject1FamilyName.sendKeys("Auto" + FillRNForm.applicant1FamilyName);
		ApplicationPage.relSubject1FamilyNameAtBirth.sendKeys("Auto" + FillRNForm.applicant1FamilyName);
		ApplicationPage.relSubject1GivenName.sendKeys("Auto" + FillRNForm.applicant1GivenName);
		ApplicationPage.relSubject1BirthDay.sendKeys("01");
		ApplicationPage.relSubject1BirthMonth.sendKeys("01");
		ApplicationPage.relSubject1BirthYear.sendKeys("1990");
		ApplicationPage.relSubject2FamilyName.sendKeys("Auto" + FillRNForm.applicant2FamilyName);
		ApplicationPage.relSubject2FamilyNameAtBirth.sendKeys("Auto" + FillRNForm.applicant2FamilyName);
		ApplicationPage.relSubject2GivenName.sendKeys("Auto" + FillRNForm.applicant2FirstName);
		ApplicationPage.relSubject2BirthDay.sendKeys("01");
		ApplicationPage.relSubject2BirthMonth.sendKeys("01");
		ApplicationPage.relSubject2BirthYear.sendKeys("1990");
		Helper.clickItem(CoreControls.nextButton);
		Helper.clickItem(CoreControls.submitButton);
		Thread.sleep(3000);
		String successMessage = ApplicationPage.successMessage.getText();
		Assert.assertTrue("Application for Relationship Registration Failed",
				successMessage.contains("successfully saved"));
		Helper.clickItem(ApplicationPage.createTransactionButton);
		System.out.println("Create Transaction initiated");
		Helper.waitFor(ApplicationPage.paidCheckbox);
		ApplicationPage.paidCheckbox.sendKeys(Keys.SPACE);
		Helper.clickItem(ApplicationPage.saveTransactionButton);
	}
}
