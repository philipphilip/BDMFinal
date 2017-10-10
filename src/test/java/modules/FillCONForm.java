package modules;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.CoreCONPage;
import pageobjects.CoreControls;

public class FillCONForm {

	public static String randFirstName = RandomStringUtils.randomAlphabetic(6);
	public static String randFamilyName = RandomStringUtils.randomAlphabetic(6);
	public static String randNewFirstName = RandomStringUtils.randomAlphabetic(6);

	public static void Execute(WebDriver driver) throws Throwable {
		PageFactory.initElements(driver, CoreCONPage.class);

		Helper.clickItem(CoreCONPage.additionalNotificationDetails);
		CoreCONPage.connType.sendKeys("Overseas Born - Adult");
		CoreCONPage.firstGivenName.sendKeys("auto" + randFirstName);
		CoreCONPage.dateOfBirthDay.sendKeys("14");
		CoreCONPage.dateOfBirthMonth.sendKeys("05");
		CoreCONPage.dateOfBirthYear.sendKeys("1980");
		CoreCONPage.countryOfBirth.sendKeys("Austria");
		CoreCONPage.isCurrentNameDifferentFromBirthName.sendKeys("No");
		CoreCONPage.subjectSex.sendKeys("Femail");
		CoreCONPage.residentialAddressLine1.sendKeys("835 Bell St");
		CoreCONPage.residentialAddressSuburb.sendKeys("Melbourne");
		CoreCONPage.residentialAddressPostcode.sendKeys("3000");
		CoreCONPage.residingInVictoriaForPastTwelveMonths.sendKeys("Yes");
		CoreCONPage.contactDetailsTelephoneNo.sendKeys("0487892213");
		CoreCONPage.parent1ParentType.sendKeys("Father");
		CoreCONPage.parent1FirstGivenName.sendKeys("afdasd");
		CoreCONPage.newNameDetailsFirstGivenName.sendKeys("auto" + randNewFirstName);
		CoreCONPage.hasFinancialDefaults.sendKeys("No");
		CoreCONPage.hasBeenDeclaredBankrupt.sendKeys("No");
		CoreCONPage.hasBeenArrestedChargedOnBailOrConvictedOfFraud.sendKeys("No");
		CoreCONPage.isPrisonerOnParoleOrRegisteredSexOffender.sendKeys("No");
		CoreCONPage.isOriginalCertSubmitted.sendKeys("Yes");
		CoreCONPage.numOfCertsIssued.sendKeys("1341324");
		CoreCONPage.reasonForChangingTheName.sendKeys("I just want another one");
		CoreCONPage.allIdentityDocumentsAreInCurrentName.sendKeys("Yes");
		CoreCONPage.numberOfPreviousChangesOfName.sendKeys("0");
		CoreCONPage.relationshipToSubject.sendKeys("Parent 1");
		CoreCONPage.relationshipToSubject.sendKeys("jaslkfjs");
		CoreCONPage.declarationFromApplicant.sendKeys("Yes");
		CoreCONPage.rightToResideInAus.sendKeys("Australian Citizenship Certificate");
		CoreCONPage.isGuarantorNeeded.sendKeys("No");
		CoreControls.validateForm();
		CoreControls.overrideExceptionsOnform();
		CoreControls.matchToFirstRadioButton();
		Thread.sleep(2000);
		Helper.clickItem(CoreControls.submitButton);
		Thread.sleep(1000);
		String changeOfNameSuccessful = CoreCONPage.ChangeNotificationsuccessful.getText();
		Assert.assertTrue("The notification is not successful", changeOfNameSuccessful.contains("successful"));
	}
}
