package modules;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.ApplicationPage;
import pageobjects.CoreControls;

public class FillBCApplicationForm {

	
	public static void Execute(WebDriver driver) throws Exception {

		PageFactory.initElements(driver, ApplicationPage.class);
		Thread.sleep(1000);
		ApplicationPage.dateReceivedAtRegistry.sendKeys("01/08/2017");
		ApplicationPage.dateReceivedAtRegistry.sendKeys(Keys.TAB);
		ApplicationPage.dateReceivedAtRegistry.sendKeys(Keys.TAB);
		Thread.sleep(1000);	
		ApplicationPage.productCode.sendKeys("BS1");
		Thread.sleep(1000);
		ApplicationPage.reasonCertificateIsRequired.sendKeys("Administration");
		ApplicationPage.productCode.sendKeys("BRS");
		Thread.sleep(1000);
		ApplicationPage.relationshipToSubject.sendKeys("Parent 1");
		ApplicationPage.productCode.sendKeys("BS1");
		ApplicationPage.productDetailsTemplate.sendKeys("BR Certificate");
		ApplicationPage.nextButton.click();
		ApplicationPage.applicantFamilyName.sendKeys("Automated" + FillBRSForm.randChildFamilyName);
		ApplicationPage.applicantGivenName.sendKeys("Automated" + FillBRSForm.randparent1FirstName);
		ApplicationPage.applicantDOBDay.sendKeys("25");
		ApplicationPage.applicantDOBMonth.sendKeys("12");
		ApplicationPage.applicantDOBYear.sendKeys("1989");
		ApplicationPage.applicantAddressLine1.sendKeys("654 This Road");
		ApplicationPage.applicantAddressSuburb.sendKeys("Melbourne");
		ApplicationPage.applicantAddressPostcode.sendKeys("3000");
		ApplicationPage.applicantPhoneNumber.sendKeys("0456487956");
		ApplicationPage.nextButton.click();
		ApplicationPage.deliveryMethod.sendKeys("StandardPOST");
		ApplicationPage.deliveryAddressCopyFrom.sendKeys("Automated" + FillBRSForm.randChildFamilyName);
		ApplicationPage.nextButton.click();
		ApplicationPage.matchType.sendKeys("Detailed Criteria");
		ApplicationPage.dateOfBirthDay.sendKeys("01");
		ApplicationPage.dateOfBirthMonth.sendKeys("08");
		ApplicationPage.dateOfBirthYear.sendKeys("2017");
		ApplicationPage.birthDetailsFamilyName.sendKeys("Automated" + FillBRSForm.randChildFamilyName);
		ApplicationPage.birthDetailsGivenName.sendKeys("Automated" + FillBRSForm.randChildFirstName);
		ApplicationPage.placeOfBirthSuburbTownCity.sendKeys("Armidale");
		ApplicationPage.nextButton.click();
		Thread.sleep(3000);
		CoreControls.matchBirthCertificateAndBR();
		Thread.sleep(3000);
		ApplicationPage.submitApplication.click();
		Thread.sleep(3000);
		String successMessage = ApplicationPage.successMessage.getText();
		Assert.assertTrue("Application for birth certificate Failed", successMessage.contains("successfully saved"));
	}
}
