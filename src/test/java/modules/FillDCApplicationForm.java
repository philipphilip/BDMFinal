package modules;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import org.junit.Assert;
import pageobjects.ApplicationPage;

public class FillDCApplicationForm {

	public static void Execute(WebDriver driver) throws Exception {

		PageFactory.initElements(driver, ApplicationPage.class);
		Thread.sleep(1000);
		ApplicationPage.dateReceivedAtRegistry.sendKeys("18/07/2017");
		ApplicationPage.dateReceivedAtRegistry.sendKeys(Keys.TAB);
		ApplicationPage.dateReceivedAtRegistry.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		ApplicationPage.productCode.sendKeys("DRS");
		Thread.sleep(1000);
		ApplicationPage.reasonCertificateIsRequired.sendKeys("Administration");
		Thread.sleep(1000);
		ApplicationPage.relationshipToSubject.sendKeys("Child");
		ApplicationPage.nextButton.click();
		ApplicationPage.applicantFamilyName.sendKeys("asdfa");
		ApplicationPage.applicantGivenName.sendKeys("asdfa");
		ApplicationPage.applicantDOBDay.sendKeys("14");
		ApplicationPage.applicantDOBMonth.sendKeys("08");
		ApplicationPage.applicantDOBYear.sendKeys("1987");
		ApplicationPage.applicantAddressLine1.sendKeys("654 This Road");
		ApplicationPage.applicantAddressSuburb.sendKeys("Melbourne");
		ApplicationPage.applicantAddressPostcode.sendKeys("3000");
		ApplicationPage.applicantPhoneNumber.sendKeys("0456487956");
		ApplicationPage.nextButton.click();
		ApplicationPage.matchType.sendKeys("Detailed Criteria");
		ApplicationPage.dateOfDeathTypeDay.sendKeys("12");
		ApplicationPage.dateOfDeathTypeMonth.sendKeys("05");
		ApplicationPage.dateOfDeathTypeYear.sendKeys("2017");
		ApplicationPage.deathDetailsFamilyName.sendKeys("adsfa");
		ApplicationPage.deathDetailsFamilyNameAtBirth.sendKeys("adsfa");
		ApplicationPage.deathDetailsGivenNames.sendKeys("asdfas");
		ApplicationPage.placeOfDeathSuburbTownCity.sendKeys("Melbourne");
		ApplicationPage.nextButton.click();
		Thread.sleep(1000);
		ApplicationPage.noMatchButton.click();
		Thread.sleep(1000);
		ApplicationPage.submitApplication.click();
		Thread.sleep(2000);
		String successMessage = ApplicationPage.successMessage.getText();
		Assert.assertTrue("Application for death certificate Failed", successMessage.contains("successfully saved"));

	}

}
