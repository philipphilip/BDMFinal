package modules;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.DataHelper;
import helpers.Helper;
import pageobjects.EpublicBrsChildDetailPage;
import pageobjects.EpublicBrsInformant1DetailPage;
import pageobjects.EpublicBrsParentDetailPage;
import pageobjects.EpublicBrsRelationshipDetailPage;
import pageobjects.EpublicBrsSecondParentDetailPage;
import pageobjects.EpublicBrsSecondParentParticipationDetailPage;
import pageobjects.EpublicControls;
import step_definitions.BDMForm;

public class FilltheBRSInEpublic {

	public static void Execute(WebDriver driver) throws Throwable {
		PageFactory.initElements(driver, EpublicBrsParentDetailPage.class);
		PageFactory.initElements(driver, EpublicBrsChildDetailPage.class);
		PageFactory.initElements(driver, EpublicBrsRelationshipDetailPage.class);
		PageFactory.initElements(driver, EpublicBrsSecondParentParticipationDetailPage.class);
		PageFactory.initElements(driver, EpublicBrsInformant1DetailPage.class);
		PageFactory.initElements(driver, EpublicBrsSecondParentDetailPage.class);

		// FillEpublicBrsChildDetailForm.Execute(driver);
		Helper.inputItem(EpublicBrsChildDetailPage.familyName, "smith");
		Helper.inputItem(EpublicBrsChildDetailPage.firstName, "mary");
		Helper.inputItem(EpublicBrsChildDetailPage.dateOfBirth, "05/07/2017");
		EpublicBrsChildDetailPage.dateOfBirth.sendKeys(Keys.TAB);
		Helper.inputItem(EpublicBrsChildDetailPage.sex, "Female");
		// EpublicBrsChildDetailPage.multipleBirthNO.click();
		// EpublicBrsChildDetailPage.bornAliveYes.click();
		// EpublicBrsChildDetailPage.hospitalYes.click();
		System.out.println("before click hospital");
		EpublicBrsChildDetailPage.hospital.click();
		System.out.println("after click hospital, before wait");
		System.out.println("after wait, before click hospital list");
		EpublicBrsChildDetailPage.hospitallist.click();
		System.out.println("after click hospital list");
		EpublicBrsChildDetailPage.hospitalSuburb.click();
		EpublicBrsChildDetailPage.hospitalSuburblist.click();
		Helper.clickItem(EpublicControls.nextButton);

		// FillEpublicBrsParentDetailForm.Execute(driver);
		Helper.inputItem(EpublicBrsParentDetailPage.parentType, "Mother");
		String brsMotherFamilyName = DataHelper.getRandomStringAs("brsMotherFamilyName", 10);
		Helper.inputItem(EpublicBrsParentDetailPage.familyName, brsMotherFamilyName);
		String brsMotherFamilyNameAtBirth = DataHelper.getRandomStringAs("brsMotherFamilyNameAtBirth", 10);
		Helper.inputItem(EpublicBrsParentDetailPage.familyNameAtBirth, brsMotherFamilyNameAtBirth);
		String brsMotherGivenName = DataHelper.getRandomStringAs("brsMotherGivenName", 10);
		Helper.inputItem(EpublicBrsParentDetailPage.givenName, brsMotherGivenName);
		Helper.inputItem(EpublicBrsParentDetailPage.birthday, "05/07/1990");
		EpublicBrsParentDetailPage.birthday.sendKeys(Keys.TAB);
		Helper.inputItem(EpublicBrsParentDetailPage.suburb, "ringwood");
		Helper.inputItem(EpublicBrsParentDetailPage.state, "VIC");
		Helper.selectDropDownList(EpublicBrsParentDetailPage.aboriginal,
				"Neither Aboriginal or Torres Strait Islander");
		Helper.selectDropDownList(EpublicBrsParentDetailPage.occupation, "accountant");
		// EpublicBrsParentDetailPage.street.sendKeys("22 statioin st");
		// EpublicBrsParentDetailPage.addressSuburb.sendKeys("ringwood");
		// EpublicBrsParentDetailPage.addressState.sendKeys("VIC");
		// EpublicBrsParentDetailPage.postcode.sendKeys("3555");
		Helper.clickItem(EpublicControls.nextButton);

		// FillEpublicBrsSecondParentDetailForm.Execute(driver);
		Helper.inputItem(EpublicBrsSecondParentDetailPage.familyName, "Smith");
		Helper.inputItem(EpublicBrsSecondParentDetailPage.givenName, "Tom");
		Helper.clickItem(EpublicControls.nextButton);
		Helper.clickItem(EpublicControls.nextButton);
		

		// FillEpublicBrsRelationshipDetailForm.Execute(driver);
		Helper.inputItem(EpublicBrsRelationshipDetailPage.relationship, "Married");
		Helper.inputItem(EpublicBrsRelationshipDetailPage.relationshipDate, "01/01/2010");
		Helper.inputItem(EpublicBrsRelationshipDetailPage.relationshipSuburb, "Melbourne");
		Helper.clickItem(EpublicControls.nextButton);
		Helper.clickItem(EpublicControls.nextButton);
		Helper.clickItem(EpublicControls.nextButton);

		// FillEpublicBrsSecondParentParticipationDetailForm.Execute(driver);
		Thread.sleep(3000);
		EpublicBrsSecondParentParticipationDetailPage.safetyConcernsFromParent2.click();
		Helper.clickItem(EpublicControls.nextButton);

		// FillEpublicBrsInformant1DetailForm.Execute(driver);
		Helper.inputItem(EpublicBrsInformant1DetailPage.relationship, "Parent");
		Helper.inputItem(EpublicBrsInformant1DetailPage.familyName, "Smith");
		Helper.inputItem(EpublicBrsInformant1DetailPage.givenName, "Tom");
		Helper.inputItem(EpublicBrsInformant1DetailPage.dateOfBirth, "02/02/1980");
		EpublicBrsInformant1DetailPage.dateOfBirth.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		Helper.inputItem(EpublicBrsInformant1DetailPage.street, "22 station rd");
		Helper.inputItem(EpublicBrsInformant1DetailPage.suburb, "ringwood");
		Helper.inputItem(EpublicBrsInformant1DetailPage.postcode, "3333");
		Helper.clickItem(EpublicBrsInformant1DetailPage.SameAsResidentialAddress);
		Helper.inputItem(EpublicBrsInformant1DetailPage.email, "my@email.com");
		// Helper.clickItem(EpublicControls.nextButton);
		Helper.clickItem(EpublicControls.continueButton);
		Helper.clickItem(EpublicControls.closeButton);
		// Helper.clickItem(EpublicControls.submitOrderButton);
		// Helper.clickItem(EpublicControls.proceedButton);
		Helper.clickItem(EpublicControls.proceedButtonOnBRS);
		Helper.clickItem(EpublicControls.proceedWithoutOrderingCertificate);
		Helper.clickItem(EpublicControls.proceedButtonOnBRS);
		String confirmationNumber;
		Thread.sleep(3000);
		confirmationNumber = EpublicControls.bdmOrderNo.getText();
		Assert.assertTrue("The BRS confirmation number is not displayed", confirmationNumber.contains("Your BDM Order no."));
	}
}
