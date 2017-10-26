package modules;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

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
		
		Helper.waitFor(EpublicApplicationPage.applicantFamilyName);
		EpublicApplicationPage.applicantFamilyName.clear();
		EpublicApplicationPage.applicantFamilyName.sendKeys("Automated" + familyName);
		EpublicApplicationPage.applicantGivenName.clear();
		EpublicApplicationPage.applicantGivenName.sendKeys("Automated" + applicantGivenName);
		EpublicApplicationPage.applicantDateOfBirth.sendKeys("01/01/1990");
		EpublicApplicationPage.applicantDateOfBirth.sendKeys(Keys.TAB);
		EpublicApplicationPage.streetNo.clear();
		EpublicApplicationPage.streetNo.sendKeys("22 station st");
		EpublicApplicationPage.suburb.clear();
		EpublicApplicationPage.suburb.sendKeys("ringwood");
		EpublicApplicationPage.postcode.clear();
		EpublicApplicationPage.postcode.sendKeys("3333");
		EpublicApplicationPage.telephoneNo.clear();
		EpublicApplicationPage.telephoneNo.sendKeys("99995555");
				
		try {
			EpublicApplicationPage.emailIdUser.clear();
			EpublicApplicationPage.emailIdUser.sendKeys("test@test.com");
		} catch (Exception e) {
			EpublicApplicationPage.emailIdGuestUser.clear();
			EpublicApplicationPage.emailIdGuestUser.sendKeys("test@test.com");
		}
		
		Helper.clickItem(EpublicApplicationPage.nextButton);
//		Helper.waitFor(EpublicApplicationPage.typeOfCertificate);
//		EpublicApplicationPage.typeOfCertificate.sendKeys("Birth");
		Helper.waitFor(EpublicApplicationPage.birthType);
		EpublicApplicationPage.birthType.sendKeys("On");
		EpublicApplicationPage.placezOfBirth.sendKeys("ringwood");
		EpublicApplicationPage.relationship.sendKeys("Parent");
		EpublicApplicationPage.reason.sendKeys("Administration");
		EpublicApplicationPage.childFamilyName.clear();
		EpublicApplicationPage.childFamilyName.sendKeys("Automated" + familyName);
		EpublicApplicationPage.childGivenName.clear();
		EpublicApplicationPage.childGivenName.sendKeys("Automated" + childGivenName);
		EpublicApplicationPage.parent1Type.sendKeys("Mother");
		EpublicApplicationPage.parent1FamilyName.sendKeys("Automated" + familyName);
		EpublicApplicationPage.parent1GivenName.sendKeys("Automated" + applicantGivenName);
		Helper.clickItem(EpublicApplicationPage.parent1FamilyNameSameAsBirth);
		EpublicApplicationPage.parent2Type.sendKeys("Father");
		EpublicApplicationPage.parent2FamilyName.sendKeys("Automated" + familyName);
		EpublicApplicationPage.parent2GivenName.sendKeys("Automated" + parentGivenName);
		Helper.clickItem(EpublicApplicationPage.parent2FamilyNameSameAsBirth);
		// input DOB at last, otherwise value will be removed
		EpublicApplicationPage.dayOfBirth.clear();
		EpublicApplicationPage.dayOfBirth.sendKeys("20/07/2017");
		EpublicApplicationPage.dayOfBirth.sendKeys(Keys.TAB);
		Helper.clickItem(EpublicApplicationPage.continueButton);
		Helper.clickItem(EpublicApplicationPage.proceedButton);
		Helper.waitFor(EpublicApplicationPage.certificateQuantity);
		EpublicApplicationPage.certificateQuantity.clear();
		EpublicApplicationPage.certificateQuantity.sendKeys("1");
		Helper.clickItem(EpublicApplicationPage.proceedButton);
		Helper.clickItem(EpublicApplicationPage.checkoutButton);
		Helper.clickItem(EpublicApplicationPage.acceptTermsCheckbox);
		Helper.clickItem(EpublicControls.payNowButton);
		EpublicControls.payNowProcess();
		Thread.sleep(1000);
		Helper.clickItem(EpublicControls.submitInPersonButton);
		String confirmationNumber;
		Thread.sleep(1000);
		Helper.waitFor(EpublicControls.brsCompletionBanner);
		confirmationNumber = EpublicControls.brsCompletionBanner.getText();
		System.out.println(confirmationNumber);
		Assert.assertTrue("Application submission with POI is not successful", confirmationNumber.contains("Completion"));
		System.out.println("The Birth Application number created along with POI/DPOI is: " + EpublicControls.brsOrderNumber.getText());
	}
}
