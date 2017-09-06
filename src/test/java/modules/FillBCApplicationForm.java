package modules;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Helper;
import pageobjects.ApplicationPage;
import pageobjects.CoreControls;
import pageobjects.CoreDRSPage;

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
		System.out.println("Product 'Birth Standard 1' selected");
		Thread.sleep(1000);
		ApplicationPage.reasonCertificateIsRequired.sendKeys("Administration");
		ApplicationPage.productCode.sendKeys("BRS");
		Thread.sleep(1000);
		ApplicationPage.relationshipToSubject.sendKeys("Parent 1");
		ApplicationPage.productCode.sendKeys("BS1");
		ApplicationPage.productDetailsTemplate.sendKeys("BR Certificate");
		System.out.println("Certificate Template 'BR Certificate' selected");
		ApplicationPage.nextButton.click();
		ApplicationPage.applicantFamilyName.sendKeys("Automated" + FillNOBForm.randChildFamilyName);
		ApplicationPage.applicantGivenName.sendKeys("Automated" + FillNOBForm.randparent1FirstName);
//		ApplicationPage.applicantFamilyName.sendKeys("AutomatedjEYFWh");
//		ApplicationPage.applicantGivenName.sendKeys("AutomatedoTyAeS");
		ApplicationPage.applicantDOBDay.sendKeys("25");
		ApplicationPage.applicantDOBMonth.sendKeys("12");
		ApplicationPage.applicantDOBYear.sendKeys("1989");
		ApplicationPage.applicantAddressLine1.sendKeys("654 This Road");
		ApplicationPage.applicantAddressSuburb.sendKeys("Melbourne");
		ApplicationPage.applicantAddressPostcode.sendKeys("3000");
		ApplicationPage.applicantPhoneNumber.sendKeys("0456487956");
		ApplicationPage.nextButton.click();
		ApplicationPage.deliveryMethod.sendKeys("StandardPOST");
//		ApplicationPage.deliveryAddressCopyFrom.sendKeys("AutomatedjEYFWh");
		ApplicationPage.deliveryAddressCopyFrom.sendKeys("Automated" + FillNOBForm.randChildFamilyName);
		ApplicationPage.nextButton.click();
		ApplicationPage.matchType.sendKeys("Detailed Criteria");
		ApplicationPage.dateOfBirthDay.sendKeys("01");
		ApplicationPage.dateOfBirthMonth.sendKeys("08");
		ApplicationPage.dateOfBirthYear.sendKeys("2017");
		ApplicationPage.birthDetailsFamilyName.sendKeys("Automated" + FillNOBForm.randChildFamilyName);
		ApplicationPage.birthDetailsGivenName.sendKeys("Automated" + FillNOBForm.randChildFirstName);
//		ApplicationPage.birthDetailsFamilyName.sendKeys("AutomatedjEYFWh");
//		ApplicationPage.birthDetailsGivenName.sendKeys("AutomateddMJxUd ");
		ApplicationPage.placeOfBirthSuburbTownCity.sendKeys("Armidale");
		ApplicationPage.nextButton.click();
		Thread.sleep(3000);
		CoreControls.matchBirthCertificateAndBR();
		System.out.println("Birth Registration match confirmed");
		Thread.sleep(3000);
		ApplicationPage.submitApplication.click();
		System.out.println("Application Submitted");
		Thread.sleep(3000);
		String successMessage = ApplicationPage.successMessage.getText();
		Assert.assertTrue("Application for birth certificate Failed", successMessage.contains("successfully saved"));
		ApplicationPage.createTransactionButton.click();
		System.out.println("Create Transaction initiated");
		WebDriverWait waitForCheckbox = new WebDriverWait(driver, 10000);
		ApplicationPage.paidCheckbox = waitForCheckbox
				.until(ExpectedConditions.elementToBeClickable(ApplicationPage.paidCheckbox));
		ApplicationPage.paidCheckbox.sendKeys(Keys.SPACE);
		ApplicationPage.saveTransactionButton.click();
		Thread.sleep(3000);
		CoreControls.printForm();
		Thread.sleep(3000);
		ApplicationPage.generateCertificateButton.click();
		Thread.sleep(3000);
		ApplicationPage.printCertificateButton.click();
		System.out.println("Print form has initiated successfully");
		Thread.sleep(3000);
		String pageHeader = ApplicationPage.pageHeader.getText();
		Assert.assertTrue("Printing the certificate failed" , pageHeader.contains("Application"));
	}
}
