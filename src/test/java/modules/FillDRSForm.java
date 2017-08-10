package modules;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.CoreControls;
import pageobjects.DRSPage;

public class FillDRSForm {

	static String randDeceasedFamilyName = RandomStringUtils.randomAlphabetic(6);
	static String randDeceasedFirstName = RandomStringUtils.randomAlphabetic(6);
	static String randparentOneGivenName = RandomStringUtils.randomAlphabetic(6);
	static String randparentTwoFamilyNameAtBirth = RandomStringUtils.randomAlphabetic(6);
	static String randparentTwoGivenName = RandomStringUtils.randomAlphabetic(6);
	static String randaddressLine1 = RandomStringUtils.randomAlphabetic(5);

	public static void Execute(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, DRSPage.class);
		WebDriverWait waitForTabsMenue = new WebDriverWait(driver, 10000);
		DRSPage.FuneralDirectorTelephone = waitForTabsMenue
				.until(ExpectedConditions.elementToBeClickable(DRSPage.FuneralDirectorTelephone));
		DRSPage.deceasedFamilyName.sendKeys("automate" + randDeceasedFamilyName);
		DRSPage.deceasedFirstName.sendKeys("automate" + randDeceasedFirstName);
		DRSPage.Sex.sendKeys("Male");
		DRSPage.DateOfDeathDay.sendKeys("30");
		DRSPage.DateOfDeathMoth.sendKeys("07");
		DRSPage.DateOfDeathYear.sendKeys("2017");
		DRSPage.deceasedDOBDay.sendKeys("12");
		DRSPage.deceasedDOBMonth.sendKeys("03");
		DRSPage.deceasedDOBYear.sendKeys("1980");
		DRSPage.placeOfDeath.sendKeys("Hospital");
		DRSPage.hospitalName.sendKeys("Albury Base Hospital");
		DRSPage.hospitalTown.sendKeys("Wollongong");
		DRSPage.usualAddressLine1.sendKeys("12 " + randaddressLine1 + " st");
		DRSPage.usualAddressSuburb.sendKeys("Testing");
		DRSPage.usualAddressPostcode.sendKeys("3000");
		DRSPage.placeOfBirthSuburb.sendKeys("Sydny");
		DRSPage.occupationDuringWorkingLife.sendKeys("accouintant");
		DRSPage.aboriginalOrTorresStraitIslanderOrigin.sendKeys("Neither Aboriginal or Torres Strait Islander");
		DRSPage.relationshipStatusAtTimeOfDeath.sendKeys("Not in a Relationship");
		DRSPage.parentsOfDeceasedType.sendKeys("Father");
		DRSPage.parentOneFamilyName.sendKeys("automate" + randDeceasedFamilyName);
		DRSPage.parentOneFamilyNameAtBirth.sendKeys("automate" + randDeceasedFamilyName);
		DRSPage.parentOneFirstName.sendKeys("automate" + randparentOneGivenName);
		DRSPage.parentsTwoOfDeceasedType.sendKeys("Mother");
		DRSPage.parentTwoFamilyName.sendKeys("automate" + randDeceasedFamilyName);
		DRSPage.parentTwoFamilyNameAtBirth.sendKeys("automate" + randparentTwoFamilyNameAtBirth);
		DRSPage.parentTwoFirstName.sendKeys("automate" + randparentTwoGivenName);
		DRSPage.WasTheDeceasedUnder18.sendKeys("No");
		DRSPage.informantRelationshipToSubject.sendKeys("AGENT");
		DRSPage.informatFamilyName.sendKeys("asdfA");
		DRSPage.informatFirstName.sendKeys("fallksjgflag");
		DRSPage.informantAddressLine1.sendKeys("32 asdjfs st");
		DRSPage.informantAddressSuburb.sendKeys("Susdfkjs");
		DRSPage.informantAddressPostcode.sendKeys("3000");
		DRSPage.postalAddressSameAsResidential.sendKeys("Yes");
		DRSPage.informantEmail.sendKeys("asdfsds@kadflgj.com");
		DRSPage.DateOfDisposalOrSentOverseasDay.sendKeys("07");
		DRSPage.DateOfDisposalOrSentOverseasMonth.sendKeys("08");
		DRSPage.DateOfDisposalOrSentOverseasYear.sendKeys("2017");
		DRSPage.methodOfDisposal.sendKeys("Burial");
		DRSPage.remainsDisposedOffWithin30Days.sendKeys("Yes");
		DRSPage.nameOfCemetery.sendKeys("Melbourne General Cemetery");
		DRSPage.cemeteryAddressLine1.sendKeys("1000 DonyBrock Rd");
		DRSPage.cemeterySuburb.sendKeys("DonyBrock");
		DRSPage.cemeteryPostcode.sendKeys("3700");
		DRSPage.FuneralDirectorNumber.sendKeys("43123");
		DRSPage.FuneralDirectorFamilyName.sendKeys("New name");
		DRSPage.FuneralDirectorTelephone.sendKeys("039878972637");
		CoreControls.saveForm();
	}
}
