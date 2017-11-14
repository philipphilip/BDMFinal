package modules;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.ApplicationPage;
import pageobjects.CoreControls;

public class FillBCApplicationForm {

	public static void Execute(WebDriver driver) throws Throwable {

		System.out.println("Beginning to enter data in the Birth Application Form");
		PageFactory.initElements(driver, ApplicationPage.class);
		Thread.sleep(1000);
		ApplicationPage.dateReceivedAtRegistry.sendKeys("01/08/2017");
		ApplicationPage.dateReceivedAtRegistry.sendKeys(Keys.TAB);
		ApplicationPage.dateReceivedAtRegistry.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		ApplicationPage.productCode.sendKeys("BS1");
		Thread.sleep(1000);
		ApplicationPage.reasonCertificateIsRequired.sendKeys("Legal");
		Thread.sleep(1000);
		ApplicationPage.productDetailsTemplate.sendKeys("Birth-Tan-test");
		CoreControls.nextButton.click();
		ApplicationPage.relationshipToSubject.sendKeys("Child");
		ApplicationPage.applicantFamilyName.sendKeys("Automated" + FillNOBForm.randChildFamilyName);
		ApplicationPage.applicantGivenName.sendKeys("Automated" + FillNOBForm.randparent1FirstName);
		ApplicationPage.applicantDOBDay.sendKeys("25");
		ApplicationPage.applicantDOBMonth.sendKeys("12");
		ApplicationPage.applicantDOBYear.sendKeys("1989");
		ApplicationPage.applicantAddressLine1.sendKeys("654 This Road");
		ApplicationPage.applicantAddressSuburb.sendKeys("Melbourne");
		ApplicationPage.applicantAddressPostcode.sendKeys("3000");
		ApplicationPage.applicantPhoneNumber.sendKeys("0456487956");
		Helper.clickItem(CoreControls.nextButton);
		ApplicationPage.matchType.sendKeys("Detailed Criteria");
		ApplicationPage.dateOfBirthDay.sendKeys("01");
		ApplicationPage.dateOfBirthMonth.sendKeys("08");
		ApplicationPage.dateOfBirthYear.sendKeys("2017");
		ApplicationPage.placeOfBirthSuburbTownCity.sendKeys("Armidale");
		ApplicationPage.birthDetailsFamilyName.sendKeys("Automated" + FillNOBForm.randChildFamilyName);
		ApplicationPage.birthDetailsGivenName.sendKeys("Automated" + FillNOBForm.randChildFirstName);
		Helper.clickItem(CoreControls.nextButton);
		Helper.clickItem(ApplicationPage.clickOnTable);
		Helper.clickItem(CoreControls.submitButton);
		Thread.sleep(3000);
		String successMessage = ApplicationPage.successMessage.getText();
		Assert.assertTrue("Application for birth certificate Failed", successMessage.contains("successfully saved"));
	}
}
