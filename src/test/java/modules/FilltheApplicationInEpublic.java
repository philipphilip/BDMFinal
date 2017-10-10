package modules;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Helper;
import pageobjects.EpublicApplicationPage;
import pageobjects.EpublicControls;


public class FilltheApplicationInEpublic {

	static String familyName = RandomStringUtils.randomAlphabetic(6);
	static String applicantGivenName = RandomStringUtils.randomAlphabetic(6);
	static String childGivenName = RandomStringUtils.randomAlphabetic(6);
	static String parentGivenName = RandomStringUtils.randomAlphabetic(6);
		
	public static void Execute(WebDriver driver) throws Throwable {
		PageFactory.initElements(driver, EpublicApplicationPage.class);
		
		WebDriverWait waitForApplicantFamilyName = new WebDriverWait(driver, 10000);
		EpublicApplicationPage.applicantFamilyName = waitForApplicantFamilyName
				.until(ExpectedConditions.elementToBeClickable(EpublicApplicationPage.applicantFamilyName));
		
		Helper.inputItem(EpublicApplicationPage.applicantFamilyName, "Automated" + familyName);
		Helper.inputItem(EpublicApplicationPage.applicantGivenName,"Automated" + applicantGivenName);
		Helper.inputItem(EpublicApplicationPage.applicantDateOfBirth, "01/01/1990", 0, false);
		EpublicApplicationPage.applicantDateOfBirth.sendKeys(Keys.TAB);
		Helper.inputItem(EpublicApplicationPage.streetNo,"22 station st");
		Helper.inputItem(EpublicApplicationPage.suburb,"ringwood");
		Helper.inputItem(EpublicApplicationPage.state,"VIC");
		Helper.inputItem(EpublicApplicationPage.postcode,"3333");
		Helper.inputItem(EpublicApplicationPage.telephoneNo,"99995555");
		Helper.clickItem(EpublicApplicationPage.nextButton);
		
		WebDriverWait waitForTypeOfCertificate = new WebDriverWait(driver, 10000);
		EpublicApplicationPage.typeOfCertificate = waitForTypeOfCertificate
				.until(ExpectedConditions.elementToBeClickable(EpublicApplicationPage.typeOfCertificate));
		
		Helper.inputItem(EpublicApplicationPage.typeOfCertificate,"Birth");
		
		WebDriverWait waitForBirthType = new WebDriverWait(driver, 10000);
		EpublicApplicationPage.birthType = waitForBirthType
				.until(ExpectedConditions.elementToBeClickable(EpublicApplicationPage.birthType));
		
		Helper.inputItem(EpublicApplicationPage.birthType,"On", 1, false);
		Helper.inputItem(EpublicApplicationPage.placezOfBirth,"ringwood");
		Helper.inputItem(EpublicApplicationPage.relationship,"Parent");
		Helper.inputItem(EpublicApplicationPage.reason,"Administration");
		Helper.inputItem(EpublicApplicationPage.childFamilyName, "Automated" + familyName);
		Helper.inputItem(EpublicApplicationPage.childGivenName,"Automated" + childGivenName);
		Helper.inputItem(EpublicApplicationPage.parentOneType,"Mother");
		Helper.inputItem(EpublicApplicationPage.parent1FamilyName, "Automated" + familyName);
		Helper.inputItem(EpublicApplicationPage.parentOneGivenName,"Automated" + applicantGivenName);
		Helper.inputItem(EpublicApplicationPage.parent1FamilyNametAtBirth,"Automated" + familyName);
		Helper.inputItem(EpublicApplicationPage.parentTwoType,"Father");
		Helper.inputItem(EpublicApplicationPage.parent2FamilyName, "Automated" + familyName);
		Helper.inputItem(EpublicApplicationPage.parentTwoGivenName,"Automated" + parentGivenName);
		Helper.inputItem(EpublicApplicationPage.parent2FamilyNameAtBirth, "Automated" + familyName);
		// input DOB at last, otherwise value will be removed
		Helper.inputItem(EpublicApplicationPage.dayOfBirth,"20/07/2017", 0, false);
		EpublicApplicationPage.dayOfBirth.sendKeys(Keys.TAB);
		Helper.clickItem(EpublicApplicationPage.continueButton);
		Helper.clickItem(EpublicApplicationPage.proceedButton);
		Helper.inputItem(EpublicApplicationPage.certificateQuantity,"1");
		Helper.clickItem(EpublicApplicationPage.proceedButton);
		Helper.clickItem(EpublicApplicationPage.checkoutButton);
		Helper.clickItem(EpublicApplicationPage.acceptTermsCheckbox);
//		Helper.clickItem(EpublicApplicationPage.payInPersonButton);
		Helper.clickItem(EpublicControls.payNowButton);
		
//		Wait for the Westpac bank payments page to load
		EpublicControls.payNowProcess();
		
		Thread.sleep(5000);
		Helper.clickItem(EpublicControls.submitInPersonButton);
		
		String confirmationNumber;
		Thread.sleep(5000);
		confirmationNumber = EpublicControls.brsCompletionBanner.getText();
		Assert.assertTrue("Application submission with POI is not successful", confirmationNumber.contains("Completion"));
		Thread.sleep(5000);
		System.out.println("The Birth Application number created along with POI/DPOI is: " + EpublicControls.brsOrderNumber.getText());
	}
}
