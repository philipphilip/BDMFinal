package modules;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;

import org.junit.Assert;
import pageobjects.ApplicationPage;
import pageobjects.CoreControls;

public class FillDCApplicationForm {

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, ApplicationPage.class);

		Helper.waitFor(ApplicationPage.dateReceivedAtRegistry);
		ApplicationPage.dateReceivedAtRegistry.sendKeys("01/08/2017");
		ApplicationPage.dateReceivedAtRegistry.sendKeys(Keys.TAB);
		ApplicationPage.dateReceivedAtRegistry.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		ApplicationPage.productCode.sendKeys("DAC");
		Thread.sleep(1000);
		ApplicationPage.reasonCertificateIsRequired.sendKeys("Administration");
		ApplicationPage.productCode.sendKeys("DAC");
		Thread.sleep(1000);
		ApplicationPage.productCode.sendKeys("DAC");
		ApplicationPage.submittedWithNotification.sendKeys("Yes");
		Helper.selectDropDownList(ApplicationPage.productDetailsTemplate, "DR Certificate");
//		ApplicationPage.productDetailsTemplate.sendKeys("DR Certificate");
		Helper.clickItem(CoreControls.nextButton);
		ApplicationPage.relationshipToSubject.sendKeys("Parent");
		ApplicationPage.applicantFamilyName.sendKeys("Smith");
		ApplicationPage.applicantGivenName.sendKeys("asdfa");
		ApplicationPage.applicantDOBDay.sendKeys("14");
		ApplicationPage.applicantDOBMonth.sendKeys("08");
		ApplicationPage.applicantDOBYear.sendKeys("1987");
		ApplicationPage.applicantAddressLine1.sendKeys("654 This Road");
		ApplicationPage.applicantAddressSuburb.sendKeys("Melbourne");
		ApplicationPage.applicantAddressPostcode.sendKeys("3000");
		ApplicationPage.applicantPhoneNumber.sendKeys("0456487956");
		Helper.clickItem(CoreControls.nextButton);
		ApplicationPage.deliveryMethod.sendKeys("StandardPOST");
		ApplicationPage.deliveryAddressCopyFrom.sendKeys("Smith");
		Helper.clickItem(CoreControls.nextButton);
		ApplicationPage.matchType.sendKeys("Detailed Criteria");
		ApplicationPage.dateOfDeathTypeDay.sendKeys("30");
		ApplicationPage.dateOfDeathTypeMonth.sendKeys("07");
		ApplicationPage.dateOfDeathTypeYear.sendKeys("2017");
		ApplicationPage.deathDetailsFamilyName.sendKeys("automate" + FillCODForm.randDeceasedFamilyName);
		ApplicationPage.deathDetailsOtherGivenNames.sendKeys("automate" + FillCODForm.randDeceasedFirstName);
		ApplicationPage.deathDetailsIsFamilyNameSameAtBirth.sendKeys("Yes");
		// ApplicationPage.deathDetailsFamilyNameAtBirth.sendKeys("automate" + FillCODForm.randDeceasedFamilyName);
		ApplicationPage.deathDetailsGivenNames.sendKeys("automate" + FillCODForm.randDeceasedFirstName);
		ApplicationPage.placeOfDeathSuburbTownCity.sendKeys("Wollongong");
		CoreControls.nextButton.click();
		CoreControls.overrideExceptionsOnApplication();
		CoreControls.nextButton.click();
		Helper.clickItem(CoreControls.submitButton);
		Thread.sleep(3000);
		String successMessage = ApplicationPage.successMessage.getText();
		System.out.println(successMessage);
		Assert.assertTrue("Application for death certificate Failed", successMessage.contains("successfully saved"));
	}
}
