package modules;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.EpublicBrsPage;
import pageobjects.EpublicControls;


public class FilltheBRSInEpublicDev {

	static String brsFamilyName = RandomStringUtils.randomAlphabetic(6);
	static String childFirstName = RandomStringUtils.randomAlphabetic(6);
	static String motherFirstName = RandomStringUtils.randomAlphabetic(6);
	
	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EpublicBrsPage.class);
		
		Helper.waitFor(EpublicBrsPage.childFamilyName);
		EpublicBrsPage.childFamilyName.sendKeys("Automated" + brsFamilyName);
		EpublicBrsPage.childFirstName.sendKeys("Automated" + childFirstName);
		EpublicBrsPage.dateOfBirth.sendKeys("05/07/2017");
		EpublicBrsPage.dateOfBirth.sendKeys(Keys.TAB);
		EpublicBrsPage.sex.sendKeys("Female");
		Helper.clickItem(EpublicBrsPage.hospital);
		Helper.clickItem(EpublicBrsPage.hospitallist);
		EpublicBrsPage.hospitalSuburb.sendKeys("UPPER FERNTREE GULLY");
		Helper.clickItem(EpublicControls.nextButton);
		Helper.waitFor(EpublicBrsPage.parentType);
		EpublicBrsPage.parentType.sendKeys("Mother");
		EpublicBrsPage.familyName.sendKeys("Automated" + brsFamilyName);
		EpublicBrsPage.parent1FamilyNameSameAsBirth.sendKeys(Keys.SPACE);
		EpublicBrsPage.givenName.sendKeys("Automated" + motherFirstName);
		EpublicBrsPage.birthday.sendKeys("05/07/1990");
		EpublicBrsPage.birthday.sendKeys(Keys.TAB);
		EpublicBrsPage.suburb.sendKeys("ringwood");
		EpublicBrsPage.state.sendKeys("VIC");
		Helper.selectDropDownList(EpublicBrsPage.aboriginal, "No");
		Helper.selectDropDownList(EpublicBrsPage.occupation, "accountant");
		Helper.clickItem(EpublicControls.nextButton);
		Helper.waitFor(EpublicBrsPage.parent2FamilyName);
		EpublicBrsPage.parent2FamilyName.sendKeys("Automated" + brsFamilyName);
		EpublicBrsPage.parent2GivenName.sendKeys("Automated" + motherFirstName);
		Helper.clickItem(EpublicControls.nextButton);
		Helper.clickItem(EpublicControls.nextButton);
		Helper.waitFor(EpublicBrsPage.relationship);
		EpublicBrsPage.relationship.sendKeys("Married");
		EpublicBrsPage.relationshipDate.sendKeys("01/01/2010");
		EpublicBrsPage.relationshipDate.sendKeys(Keys.TAB);
		EpublicBrsPage.relationshipSuburb.sendKeys("Melbourne");
		Helper.clickItem(EpublicControls.nextButton);
		Helper.clickItem(EpublicControls.nextButton);
		Helper.clickItem(EpublicControls.nextButton);
		Thread.sleep(3000);
		Helper.clickItem(EpublicBrsPage.safetyConcernsFromParent2);
		Helper.clickItem(EpublicControls.nextButton);
		Helper.waitFor(EpublicBrsPage.informantRelationship);
		EpublicBrsPage.informantRelationship.sendKeys("Parent");
		Helper.clickItem(EpublicBrsPage.SameAsResidentialAddress);
		Helper.clickItem(EpublicControls.continueButton);
		Helper.clickItem(EpublicControls.closeButton);
		Helper.clickItem(EpublicControls.proceedButtonOnBRS);
		Helper.clickItem(EpublicControls.proceedWithoutOrderingCertificate);
		Helper.clickItem(EpublicControls.proceedButtonOnBRS);
						
		String confirmationNumber;
		Thread.sleep(5000);
		confirmationNumber = EpublicControls.brsCompletionBanner.getText();
		Assert.assertTrue("BRS submission is not successful", confirmationNumber.contains("Completion"));
	}
}
