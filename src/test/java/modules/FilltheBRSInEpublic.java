package modules;

import org.apache.commons.lang3.RandomStringUtils;
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

	static String brsFamilyName = RandomStringUtils.randomAlphabetic(6);
	static String childFirstName = RandomStringUtils.randomAlphabetic(6);
	static String motherFirstName = RandomStringUtils.randomAlphabetic(6);
	
	public static void Execute(WebDriver driver) throws Throwable {
		PageFactory.initElements(driver, EpublicBrsParentDetailPage.class);
		PageFactory.initElements(driver, EpublicBrsChildDetailPage.class);
		PageFactory.initElements(driver, EpublicBrsRelationshipDetailPage.class);
		PageFactory.initElements(driver, EpublicBrsSecondParentParticipationDetailPage.class);
		PageFactory.initElements(driver, EpublicBrsInformant1DetailPage.class);
		PageFactory.initElements(driver, EpublicBrsSecondParentDetailPage.class);

		Helper.inputItem(EpublicBrsChildDetailPage.familyName, "Automated" + brsFamilyName);
		Helper.inputItem(EpublicBrsChildDetailPage.firstName, "Automated" + childFirstName);
		Helper.inputItem(EpublicBrsChildDetailPage.dateOfBirth, "05/07/2017");
		EpublicBrsChildDetailPage.dateOfBirth.sendKeys(Keys.TAB);
		Helper.inputItem(EpublicBrsChildDetailPage.sex, "Female");
		System.out.println("before click hospital");
		EpublicBrsChildDetailPage.hospital.click();
		System.out.println("after click hospital, before wait");
		System.out.println("after wait, before click hospital list");
		EpublicBrsChildDetailPage.hospitallist.click();
		System.out.println("after click hospital list");
		Helper.inputItem(EpublicBrsChildDetailPage.hospitalSuburb, "UPPER FERNTREE GULLY");
		Helper.clickItem(EpublicControls.nextButton);

		Helper.inputItem(EpublicBrsParentDetailPage.parentType, "Mother");
		Helper.inputItem(EpublicBrsParentDetailPage.familyName, "Automated" + brsFamilyName);
		Helper.inputItem(EpublicBrsParentDetailPage.familyNameAtBirth, "Automated" + brsFamilyName);
		Helper.inputItem(EpublicBrsParentDetailPage.givenName, "Automated" + motherFirstName);
		Helper.inputItem(EpublicBrsParentDetailPage.birthday, "05/07/1990");
		EpublicBrsParentDetailPage.birthday.sendKeys(Keys.TAB);
		Helper.inputItem(EpublicBrsParentDetailPage.suburb, "ringwood");
		Helper.inputItem(EpublicBrsParentDetailPage.state, "VIC");
		Helper.selectDropDownList(EpublicBrsParentDetailPage.aboriginal,
				"Neither Aboriginal or Torres Strait Islander");
		Helper.selectDropDownList(EpublicBrsParentDetailPage.occupation, "accountant");
		Helper.clickItem(EpublicControls.nextButton);

		Helper.inputItem(EpublicBrsSecondParentDetailPage.familyName, "Automated" + brsFamilyName);
		Helper.inputItem(EpublicBrsSecondParentDetailPage.givenName, "Automated" + motherFirstName);
		Helper.clickItem(EpublicControls.nextButton);
		Helper.clickItem(EpublicControls.nextButton);
		
		Helper.inputItem(EpublicBrsRelationshipDetailPage.relationship, "Married");
		Helper.inputItem(EpublicBrsRelationshipDetailPage.relationshipDate, "01/01/2010");
		Helper.inputItem(EpublicBrsRelationshipDetailPage.relationshipSuburb, "Melbourne");
		Helper.clickItem(EpublicControls.nextButton);
		Helper.clickItem(EpublicControls.nextButton);
		Helper.clickItem(EpublicControls.nextButton);

		Thread.sleep(3000);
		EpublicBrsSecondParentParticipationDetailPage.safetyConcernsFromParent2.click();
		Helper.clickItem(EpublicControls.nextButton);

		Helper.inputItem(EpublicBrsInformant1DetailPage.relationship, "Parent");
		Helper.inputItem(EpublicBrsInformant1DetailPage.familyName, "Automated" + brsFamilyName);
		Helper.inputItem(EpublicBrsInformant1DetailPage.givenName, "Automated" + motherFirstName);
		Helper.inputItem(EpublicBrsInformant1DetailPage.dateOfBirth, "02/02/1980");
		EpublicBrsInformant1DetailPage.dateOfBirth.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		Helper.inputItem(EpublicBrsInformant1DetailPage.street, "22 station rd");
		Helper.inputItem(EpublicBrsInformant1DetailPage.suburb, "ringwood");
		Helper.inputItem(EpublicBrsInformant1DetailPage.postcode, "3333");
		Helper.clickItem(EpublicBrsInformant1DetailPage.SameAsResidentialAddress);
		Helper.inputItem(EpublicBrsInformant1DetailPage.email, "my@email.com");
		Helper.clickItem(EpublicControls.continueButton);
		Helper.clickItem(EpublicControls.closeButton);
		Helper.clickItem(EpublicControls.proceedButtonOnBRS);
		Helper.clickItem(EpublicControls.proceedWithoutOrderingCertificate);
		Helper.clickItem(EpublicControls.proceedButtonOnBRS);
		String confirmationNumber;
		Thread.sleep(3000);
		confirmationNumber = EpublicControls.bdmOrderNo.getText();
		Assert.assertTrue("The BRS confirmation number is not displayed", confirmationNumber.contains("Your BDM Order no."));
	}
}
