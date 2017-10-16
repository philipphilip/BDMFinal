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
		EpublicApplicationPage.applicantFamilyName.sendKeys("Automated" + familyName);
		EpublicApplicationPage.applicantGivenName.sendKeys("Automated" + applicantGivenName);
		EpublicApplicationPage.applicantDateOfBirth.sendKeys("01/01/1990");
		EpublicApplicationPage.applicantDateOfBirth.sendKeys(Keys.TAB);
		EpublicApplicationPage.streetNo.sendKeys("22 station st");
		EpublicApplicationPage.suburb.sendKeys("ringwood");
		EpublicApplicationPage.state.sendKeys("VIC");
		EpublicApplicationPage.postcode.sendKeys("3333");
		EpublicApplicationPage.telephoneNo.sendKeys("99995555");
				
		try {
			EpublicApplicationPage.emailIdUser.clear();
			EpublicApplicationPage.emailIdUser.sendKeys("test@test.com");
		} catch (Exception e) {
			EpublicApplicationPage.emailIdGuestUser.clear();
			EpublicApplicationPage.emailIdGuestUser.sendKeys("test@test.com");
		}
		
		Helper.clickItem(EpublicApplicationPage.nextButton);
		Helper.waitFor(EpublicApplicationPage.typeOfCertificate);
		EpublicApplicationPage.typeOfCertificate.sendKeys("Birth");
		Helper.waitFor(EpublicApplicationPage.birthType);
		EpublicApplicationPage.birthType.sendKeys("On");
		EpublicApplicationPage.placezOfBirth.sendKeys("ringwood");
		EpublicApplicationPage.relationship.sendKeys("Parent");
		EpublicApplicationPage.reason.sendKeys("Administration");
		EpublicApplicationPage.childFamilyName.sendKeys("Automated" + familyName);
		EpublicApplicationPage.childGivenName.sendKeys("Automated" + childGivenName);
		EpublicApplicationPage.parentOneType.sendKeys("Mother");
		EpublicApplicationPage.parent1FamilyName.sendKeys("Automated" + familyName);
		EpublicApplicationPage.parentOneGivenName.sendKeys("Automated" + applicantGivenName);
		EpublicApplicationPage.parent1FamilyNametAtBirth.sendKeys("Automated" + familyName);
		EpublicApplicationPage.parentTwoType.sendKeys("Father");
		EpublicApplicationPage.parent2FamilyName.sendKeys("Automated" + familyName);
		EpublicApplicationPage.parentTwoGivenName.sendKeys("Automated" + parentGivenName);
		EpublicApplicationPage.parent2FamilyNameAtBirth.sendKeys("Automated" + familyName);
		// input DOB at last, otherwise value will be removed
		EpublicApplicationPage.dayOfBirth.sendKeys("20/07/2017");
		EpublicApplicationPage.dayOfBirth.sendKeys(Keys.TAB);
		Helper.clickItem(EpublicApplicationPage.continueButton);
		Helper.clickItem(EpublicApplicationPage.proceedButton);
		EpublicApplicationPage.certificateQuantity.sendKeys("1");
		Helper.clickItem(EpublicApplicationPage.proceedButton);
		Helper.clickItem(EpublicApplicationPage.checkoutButton);
		Helper.clickItem(EpublicApplicationPage.acceptTermsCheckbox);
		Helper.clickItem(EpublicControls.payNowButton);
		EpublicControls.payNowProcess();
		Thread.sleep(1000);
		Helper.clickItem(EpublicControls.submitInPersonButton);
		String confirmationNumber;
		Thread.sleep(2000);
		confirmationNumber = EpublicControls.brsCompletionBanner.getText();
		Assert.assertTrue("Application submission with POI is not successful", confirmationNumber.contains("Completion"));
		System.out.println("The Birth Application number created along with POI/DPOI is: " + EpublicControls.brsOrderNumber.getText());
	}
}
