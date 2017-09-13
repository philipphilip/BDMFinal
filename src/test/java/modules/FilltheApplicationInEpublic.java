package modules;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.DataHelper;
import helpers.Helper;
import pageobjects.EpublicApplicationApplicantDetailPage;
import pageobjects.EpublicApplicationSubjectDetailPage;
import pageobjects.EpublicBrsChildDetailPage;
import pageobjects.EpublicBrsInformant1DetailPage;
import pageobjects.EpublicBrsParentDetailPage;
import pageobjects.EpublicBrsRelationshipDetailPage;
import pageobjects.EpublicBrsSecondParentDetailPage;
import pageobjects.EpublicBrsSecondParentParticipationDetailPage;
import pageobjects.EpublicControls;
import step_definitions.BDMForm;

public class FilltheApplicationInEpublic {

	static String familyName = RandomStringUtils.randomAlphabetic(6);
	static String applicantGivenName = RandomStringUtils.randomAlphabetic(6);
	static String childGivenName = RandomStringUtils.randomAlphabetic(6);
	static String parentGivenName = RandomStringUtils.randomAlphabetic(6);
		
	public static void Execute(WebDriver driver) throws Throwable {
		PageFactory.initElements(driver, EpublicApplicationApplicantDetailPage.class);
		PageFactory.initElements(driver, EpublicApplicationSubjectDetailPage.class);

		Helper.inputItem(EpublicApplicationApplicantDetailPage.applicantFamilyName, "Automated" + familyName);
		Helper.inputItem(EpublicApplicationApplicantDetailPage.applicantGivenName,"Automated" + applicantGivenName);
		Helper.inputItem(EpublicApplicationApplicantDetailPage.applicantDateOfBirth, "01/01/1990", 0, false);
		EpublicApplicationApplicantDetailPage.applicantDateOfBirth.sendKeys(Keys.TAB);
		Helper.inputItem(EpublicApplicationApplicantDetailPage.streetNo,"22 station st");
		Helper.inputItem(EpublicApplicationApplicantDetailPage.suburb,"ringwood");
		Helper.inputItem(EpublicApplicationApplicantDetailPage.state,"VIC");
		Helper.inputItem(EpublicApplicationApplicantDetailPage.postcode,"3333");
		Helper.inputItem(EpublicApplicationApplicantDetailPage.telephoneNo,"99995555");
		Helper.clickItem(EpublicApplicationApplicantDetailPage.nextButton);
		
		Helper.inputItem(EpublicApplicationSubjectDetailPage.typeOfCertificate,"Birth");

		Helper.inputItem(EpublicApplicationSubjectDetailPage.birthType,"On", 1, false);


		Helper.inputItem(EpublicApplicationSubjectDetailPage.placezOfBirth,"ringwood");
		Helper.inputItem(EpublicApplicationSubjectDetailPage.relationship,"Parent");
		Helper.inputItem(EpublicApplicationSubjectDetailPage.reason,"Administration");
		Helper.inputItem(EpublicApplicationSubjectDetailPage.childFamilyName, "Automated" + familyName);
		Helper.inputItem(EpublicApplicationSubjectDetailPage.childGivenName,"Automated" + childGivenName);
		Helper.inputItem(EpublicApplicationSubjectDetailPage.parentOneType,"Mother");
		Helper.inputItem(EpublicApplicationSubjectDetailPage.parent1FamilyName, "Automated" + familyName);
		Helper.inputItem(EpublicApplicationSubjectDetailPage.parentOneGivenName,"Automated" + applicantGivenName);
		Helper.inputItem(EpublicApplicationSubjectDetailPage.parent1FamilyNametAtBirth,"Automated" + familyName);
		Helper.inputItem(EpublicApplicationSubjectDetailPage.parentTwoType,"Father");
		Helper.inputItem(EpublicApplicationSubjectDetailPage.parent2FamilyName, "Automated" + familyName);
		Helper.inputItem(EpublicApplicationSubjectDetailPage.parentTwoGivenName,"Automated" + parentGivenName);
		Helper.inputItem(EpublicApplicationSubjectDetailPage.parent2FamilyNameAtBirth, "Automated" + familyName);

		// input DOB at last, otherwise value will be removed
		Helper.inputItem(EpublicApplicationSubjectDetailPage.dayOfBirth,"20/07/2017", 0, false);
		EpublicApplicationSubjectDetailPage.dayOfBirth.sendKeys(Keys.TAB);
		Helper.clickItem(EpublicApplicationSubjectDetailPage.continueButton);
		Helper.clickItem(EpublicApplicationSubjectDetailPage.proceedButton);
		Helper.inputItem(EpublicApplicationSubjectDetailPage.certificateQuantity,"1");
		Helper.clickItem(EpublicApplicationSubjectDetailPage.proceedButton);
		Helper.clickItem(EpublicApplicationSubjectDetailPage.checkoutButton);
		Helper.clickItem(EpublicApplicationSubjectDetailPage.acceptTermsCheckbox);
		Helper.clickItem(EpublicApplicationSubjectDetailPage.payInPersonButton);
		String confirmationNumber;
		Thread.sleep(7000);
		confirmationNumber = EpublicControls.bdmOrderNo.getText();
		Assert.assertTrue("The BRS confirmation number is not displayed", confirmationNumber.contains("Your BDM Order no."));
	}
}
