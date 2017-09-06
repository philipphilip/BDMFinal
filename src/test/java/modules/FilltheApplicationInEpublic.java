package modules;

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

	public static void Execute(WebDriver driver) throws Throwable {
		PageFactory.initElements(driver, EpublicApplicationApplicantDetailPage.class);
		PageFactory.initElements(driver, EpublicApplicationSubjectDetailPage.class);

		Helper.inputItem(EpublicApplicationApplicantDetailPage.applicantGivenName,"Tom");
		Helper.inputItem(EpublicApplicationApplicantDetailPage.streetNo,"22 station st");
		Helper.inputItem(EpublicApplicationApplicantDetailPage.suburb,"ringwood");
		Helper.inputItem(EpublicApplicationApplicantDetailPage.state,"VIC");
		Helper.inputItem(EpublicApplicationApplicantDetailPage.postcode,"3333");
		Helper.inputItem(EpublicApplicationApplicantDetailPage.telephoneNo,"99995555");
		Helper.clickItem(EpublicApplicationApplicantDetailPage.nextButton);
		
		Helper.inputItem(EpublicApplicationSubjectDetailPage.typeOfCertificate,"Birth");

		Helper.inputItem(EpublicApplicationSubjectDetailPage.birthType,"On", 1, false);


		Helper.inputItem(EpublicApplicationSubjectDetailPage.placezOfBirth,"ringwood");
		Helper.inputItem(EpublicApplicationSubjectDetailPage.relationship,"Stakeholder");
		Helper.inputItem(EpublicApplicationSubjectDetailPage.reason,"Citizenship");
		Helper.inputItem(EpublicApplicationSubjectDetailPage.childGivenName,"Jane");
		Helper.inputItem(EpublicApplicationSubjectDetailPage.parentOneType,"Mother");
		Helper.inputItem(EpublicApplicationSubjectDetailPage.parentOneGivenName,"Mary");
		Helper.inputItem(EpublicApplicationSubjectDetailPage.parentTwoType,"Father");
		Helper.inputItem(EpublicApplicationSubjectDetailPage.parentTwoGivenName,"Tom");

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
		Thread.sleep(5000);
		confirmationNumber = EpublicControls.bdmOrderNo.getText();
		Assert.assertTrue("The BRS confirmation number is not displayed", confirmationNumber.contains("Your BDM Order no."));
	}
}
