package modules;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Helper;
import pageobjects.EpublicControls;
import pageobjects.EregistryCertificatesPage;
import pageobjects.EregistryControls;


public class FillEregistryCertificatesForm {
	
	public static String certificateNotificationNumber;
	
	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EregistryCertificatesPage.class);
		
		//Product Details
		Helper.selectDropDownList(EregistryCertificatesPage.lifeEvent, "Death");
		Thread.sleep(3000);
		Helper.selectDropDownList(EregistryCertificatesPage.keyword, "Death Standard 1");
		Helper.inputItem(EregistryCertificatesPage.quantity, "1");
		Helper.selectDropDownList(EregistryCertificatesPage.reasonCertificateRequired, "Administration");

		Helper.clickItem(EregistryControls.nextButton);
		//Subject Details-Date of Event
		Helper.selectDropDownList(EregistryCertificatesPage.dateOfDeathType, "On");
		Helper.inputItem(EregistryCertificatesPage.dateOfDeathDay, "07");
		Helper.inputItem(EregistryCertificatesPage.dateOfDeathMonth, "07");
		Helper.inputItem(EregistryCertificatesPage.dateOfDeathYear, "2017");
		//Subject Details-Place of Death
		Helper.inputItem(EregistryCertificatesPage.placeOfDeathSuburb, "Wollongong");
		//Subject Details-Deceased Details
		Helper.inputItem(EregistryCertificatesPage.deceasedFamilyName, "Automated" + FillEregistryCodForm.deceasedFamilyName);
		Helper.inputItem(EregistryCertificatesPage.deceasedGivenName, "Automated" + FillEregistryCodForm.deceasedGivenName);
		Helper.inputItem(EregistryCertificatesPage.deceasedFamilyNameAtBirth, "Automated" + FillEregistryCodForm.deceasedFamilyName);
		Helper.inputItem(EregistryCertificatesPage.dateOfBirthDay, "07");
		Helper.inputItem(EregistryCertificatesPage.dateOfBirthMonth, "07");
		Helper.inputItem(EregistryCertificatesPage.dateOfBirthYear, "1937");
		//Subject Details - Parent One
		Helper.selectDropDownList(EregistryCertificatesPage.parent1Type, "Mother");
		Helper.inputItem(EregistryCertificatesPage.parent1FamilyName, "Automated" + FillEregistryCodForm.deceasedFamilyName);
		Helper.inputItem(EregistryCertificatesPage.parent1GivenName, "Automated" + FillEregistryCodForm.motherGivenName);
		Helper.inputItem(EregistryCertificatesPage.parent1FamilyNameAtBirth, "Automated" + FillEregistryCodForm.deceasedFamilyName);
		//SubjectDetails - Parent two
		Helper.selectDropDownList(EregistryCertificatesPage.parent2Type, "Father");
		Helper.inputItem(EregistryCertificatesPage.parent2FamilyName, "Automated" + FillEregistryCodForm.deceasedFamilyName);
		Helper.inputItem(EregistryCertificatesPage.parent2GivenName, "Automated" + FillEregistryCodForm.motherGivenName);
		Helper.inputItem(EregistryCertificatesPage.parent2FamilyNameAtBirth, "Automated" + FillEregistryCodForm.deceasedFamilyName);
		//Get family name of the applicant
		String applicantFamilyName;
		Thread.sleep(3000);
		applicantFamilyName = EregistryCertificatesPage.applicantFamilyName.getText();
		Thread.sleep(3000);
		
		Helper.clickItem(EregistryControls.nextButton);
		
		//Order Details-Delivery to Passport Office
		Helper.selectDropDownList(EregistryCertificatesPage.sendToPassportOffice, "No");
		//Order Details-Order Delivery Address
		Helper.selectDropDownList(EregistryCertificatesPage.deliveryOption, "RegisteredPOST");
		//Order Details-Delivery Address
		Helper.selectDropDownList(EregistryCertificatesPage.copyFrom, applicantFamilyName);
		Helper.inputItem(EregistryCertificatesPage.contactPhoneNumber, "12345678");
		
		Helper.clickItem(EregistryControls.nextButton);

		Helper.clickItem(EregistryControls.nextButton);
		
		Helper.clickItem(EregistryControls.saveButton);
		
		String certificateSaveMessage;
		Thread.sleep(3000);
		certificateSaveMessage = EregistryCertificatesPage.saveSuccessfulMessage.getText();
		Assert.assertTrue("Error when saving the death certificate", certificateSaveMessage.contains("This Application has been successfully saved."));
		
		EregistryControls.certificatesLink.click();
		EregistryControls.draftList.click();
		
		//Draft Certificate List
		Helper.inputItem(EregistryCertificatesPage.subject1NameDrafts, "Automated" + FillEregistryCodForm.deceasedFamilyName);
		Thread.sleep(3000);
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
		
		//Submitted Certificate List
		Helper.inputItem(EregistryCertificatesPage.subject1NameSubmits, "Automated" + FillEregistryCodForm.deceasedFamilyName);
		Thread.sleep(3000);
		EregistryControls.refreshButton.click();
		
		//String certificateNotificationNumber = EregistryCertificatesPage.certificateNotificationNumber.getText();
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
