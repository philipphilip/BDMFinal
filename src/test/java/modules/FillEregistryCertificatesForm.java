package modules;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.EpublicControls;
import pageobjects.EregistryCertificatesPage;
import pageobjects.EregistryControls;


public class FillEregistryCertificatesForm {
	
	public static String certificateNotificationNumber;
	
	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EregistryCertificatesPage.class);
		
		Helper.selectDropDownList(EregistryCertificatesPage.lifeEvent, "Death");
		Thread.sleep(3000);
		Helper.selectDropDownList(EregistryCertificatesPage.keyword, "Death Standard 1");
		EregistryCertificatesPage.quantity.sendKeys("1");
		Helper.clickItem(EregistryControls.nextButton);
		Helper.selectDropDownList(EregistryCertificatesPage.dateOfDeathType, "On");
		EregistryCertificatesPage.dateOfDeathDay.sendKeys("07");
		EregistryCertificatesPage.dateOfDeathMonth.sendKeys("07");
		EregistryCertificatesPage.dateOfDeathYear.sendKeys("2017");
		EregistryCertificatesPage.placeOfDeathSuburb.sendKeys("Wollongong");
		Helper.selectDropDownList(EregistryCertificatesPage.reasonCertificateRequired, "Administration");
		EregistryCertificatesPage.deceasedFamilyName.sendKeys("Automated" + FillEregistryCodForm.deceasedFamilyName);
		EregistryCertificatesPage.deceasedGivenName.sendKeys("Automated" + FillEregistryCodForm.deceasedGivenName);
		EregistryCertificatesPage.deceasedFamilyNameAtBirth.sendKeys("Automated" + FillEregistryCodForm.deceasedFamilyName);
		EregistryCertificatesPage.dateOfBirthDay.sendKeys("07");
		EregistryCertificatesPage.dateOfBirthMonth.sendKeys("07");
		EregistryCertificatesPage.dateOfBirthYear.sendKeys("1937");
		Helper.selectDropDownList(EregistryCertificatesPage.parent1Type, "Mother");
		EregistryCertificatesPage.parent1FamilyName.sendKeys("Automated" + FillEregistryCodForm.deceasedFamilyName);
		EregistryCertificatesPage.parent1GivenName.sendKeys("Automated" + FillEregistryCodForm.motherGivenName);
		EregistryCertificatesPage.parent1FamilyNameAtBirth.sendKeys("Automated" + FillEregistryCodForm.deceasedFamilyName);
		Helper.selectDropDownList(EregistryCertificatesPage.parent2Type, "Father");
		EregistryCertificatesPage.parent2FamilyName.sendKeys("Automated" + FillEregistryCodForm.deceasedFamilyName);
		EregistryCertificatesPage.parent2GivenName.sendKeys("Automated" + FillEregistryCodForm.motherGivenName);
		EregistryCertificatesPage.parent2FamilyNameAtBirth.sendKeys("Automated" + FillEregistryCodForm.deceasedFamilyName);

		String applicantFamilyName;
		Thread.sleep(1000);
		applicantFamilyName = EregistryCertificatesPage.applicantFamilyName.getText();
		Thread.sleep(1000);
		
		Helper.clickItem(EregistryControls.nextButton);
		Helper.selectDropDownList(EregistryCertificatesPage.sendToPassportOffice, "No");
		Helper.selectDropDownList(EregistryCertificatesPage.deliveryOption, "RegisteredPOST");
		Helper.selectDropDownList(EregistryCertificatesPage.copyFrom, applicantFamilyName);
		EregistryCertificatesPage.contactPhoneNumber.sendKeys("12345678");
		Helper.clickItem(EregistryControls.nextButton);
		Helper.clickItem(EregistryControls.nextButton);
		Helper.clickItem(EregistryControls.saveButton);
		
		String certificateSaveMessage;
		Thread.sleep(2000);
		certificateSaveMessage = EregistryCertificatesPage.saveSuccessfulMessage.getText();
		Assert.assertTrue("Error when saving the death certificate", certificateSaveMessage.contains("This Application has been successfully saved."));
		
		EregistryControls.certificatesLink.click();
		EregistryControls.draftList.click();
		EregistryCertificatesPage.subject1NameDrafts.sendKeys("Automated" + FillEregistryCodForm.deceasedFamilyName);
		Thread.sleep(1000);
		Helper.waitFor(EregistryControls.refreshButton);
		EregistryControls.refreshButton.click();
		Helper.clickItem(EregistryControls.searchResult1);
		Helper.clickItem(EregistryControls.submitButton);
		Helper.clickItem(EregistryControls.submitButton);
		
		String certificateSubmitMessage;
		Thread.sleep(3000);
		certificateSubmitMessage = EregistryControls.certificatesSubmitMessage.getText();
		Assert.assertTrue("Error during submission of death certificate", certificateSubmitMessage.contains("Successfully submitted applications"));
		
		EregistryControls.certificatesLink.click();
		EregistryControls.submitList.click();
		EregistryCertificatesPage.subject1NameSubmits.sendKeys("Automated" + FillEregistryCodForm.deceasedFamilyName);
		Thread.sleep(3000);
		EregistryControls.refreshButton.click();
		certificateNotificationNumber = EregistryCertificatesPage.certificateNotificationNumber.getText();
		Thread.sleep(3000);
		Helper.clickItem(EregistryControls.searchResult1);
		Helper.clickItem(EregistryControls.makePaymentButton);
		Helper.clickItem(EregistryControls.makePaymentConfirmationButton);
		Helper.clickItem(EregistryControls.startPaymentButton);
		Helper.selectDropDownList(EregistryCertificatesPage.paymentMethod, "Card");
		Helper.clickItem(EregistryControls.payNowButton);
		EpublicControls.payNowProcess();
		String paymentSuccessfulMessage;
		Thread.sleep(5000);
		paymentSuccessfulMessage = EregistryCertificatesPage.paymentSuccessMessage.getText();
		Assert.assertTrue("Error during payment of death certificate", paymentSuccessfulMessage.contains("Payment Successful"));
		System.out.println("Payment for death certificate successful with payment reference number : " + EregistryCertificatesPage.paymentReferenceNumber.getText());
		System.out.println("The notification id for the death certificate is " + certificateNotificationNumber);
	}

}
