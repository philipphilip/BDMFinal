package modules;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.CoreControls;
import pageobjects.CoreDRSPage;

public class FillDRSForm {

	static String randDeceasedFamilyName = RandomStringUtils.randomAlphabetic(6);
	static String randDeceasedFirstName = RandomStringUtils.randomAlphabetic(6);
	static String randparentOneGivenName = RandomStringUtils.randomAlphabetic(6);
	static String randparentTwoFamilyNameAtBirth = RandomStringUtils.randomAlphabetic(6);
	static String randparentTwoGivenName = RandomStringUtils.randomAlphabetic(6);
	static String randaddressLine1 = RandomStringUtils.randomAlphabetic(5);

	public static void Execute(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, CoreDRSPage.class);
		WebDriverWait waitForTabsMenue = new WebDriverWait(driver, 10000);
		CoreDRSPage.FuneralDirectorTelephone = waitForTabsMenue
				.until(ExpectedConditions.elementToBeClickable(CoreDRSPage.FuneralDirectorTelephone));
		CoreDRSPage.deceasedFamilyName.sendKeys("automate" + randDeceasedFamilyName);
		CoreDRSPage.deceasedFirstName.sendKeys("automate" + randDeceasedFirstName);
		CoreDRSPage.Sex.sendKeys("Male");
		CoreDRSPage.DateOfDeathDay.sendKeys("30");
		CoreDRSPage.DateOfDeathMoth.sendKeys("07");
		CoreDRSPage.DateOfDeathYear.sendKeys("2017");
		CoreDRSPage.deceasedDOBDay.sendKeys("12");
		CoreDRSPage.deceasedDOBMonth.sendKeys("03");
		CoreDRSPage.deceasedDOBYear.sendKeys("1980");
		CoreDRSPage.placeOfDeath.sendKeys("Hospital");
		CoreDRSPage.hospitalName.sendKeys("Albury Base Hospital");
		CoreDRSPage.hospitalTown.sendKeys("Wollongong");
		CoreDRSPage.usualAddressLine1.sendKeys("12 " + randaddressLine1 + " st");
		CoreDRSPage.usualAddressSuburb.sendKeys("Testing");
		CoreDRSPage.usualAddressPostcode.sendKeys("3000");
		CoreDRSPage.placeOfBirthSuburb.sendKeys("Sydny");
		CoreDRSPage.occupationDuringWorkingLife.sendKeys("accouintant");
		CoreDRSPage.aboriginalOrTorresStraitIslanderOrigin.sendKeys("Neither Aboriginal or Torres Strait Islander");
		CoreDRSPage.relationshipStatusAtTimeOfDeath.sendKeys("Not in a Relationship");
		CoreDRSPage.parentsOfDeceasedType.sendKeys("Father");
		CoreDRSPage.parentOneFamilyName.sendKeys("automate" + randDeceasedFamilyName);
		CoreDRSPage.parentOneFamilyNameAtBirth.sendKeys("automate" + randDeceasedFamilyName);
		CoreDRSPage.parentOneFirstName.sendKeys("automate" + randparentOneGivenName);
		CoreDRSPage.parentsTwoOfDeceasedType.sendKeys("Mother");
		CoreDRSPage.parentTwoFamilyName.sendKeys("automate" + randDeceasedFamilyName);
		CoreDRSPage.parentTwoFamilyNameAtBirth.sendKeys("automate" + randparentTwoFamilyNameAtBirth);
		CoreDRSPage.parentTwoFirstName.sendKeys("automate" + randparentTwoGivenName);
		CoreDRSPage.WasTheDeceasedUnder18.sendKeys("No");
		CoreDRSPage.informantRelationshipToSubject.sendKeys("AGENT");
		CoreDRSPage.informatFamilyName.sendKeys("asdfA");
		CoreDRSPage.informatFirstName.sendKeys("fallksjgflag");
		CoreDRSPage.informantAddressLine1.sendKeys("32 asdjfs st");
		CoreDRSPage.informantAddressSuburb.sendKeys("Susdfkjs");
		CoreDRSPage.informantAddressPostcode.sendKeys("3000");
		CoreDRSPage.postalAddressSameAsResidential.sendKeys("Yes");
		CoreDRSPage.informantEmail.sendKeys("asdfsds@kadflgj.com");
		CoreDRSPage.DateOfDisposalOrSentOverseasDay.sendKeys("07");
		CoreDRSPage.DateOfDisposalOrSentOverseasMonth.sendKeys("08");
		CoreDRSPage.DateOfDisposalOrSentOverseasYear.sendKeys("2017");
		CoreDRSPage.methodOfDisposal.sendKeys("Burial");
		CoreDRSPage.remainsDisposedOffWithin30Days.sendKeys("Yes");
		CoreDRSPage.nameOfCemetery.sendKeys("Melbourne General Cemetery");
		CoreDRSPage.cemeteryAddressLine1.sendKeys("1000 DonyBrock Rd");
		CoreDRSPage.cemeterySuburb.sendKeys("DonyBrock");
		CoreDRSPage.cemeteryPostcode.sendKeys("3700");
		CoreDRSPage.FuneralDirectorNumber.sendKeys("43123");
		CoreDRSPage.FuneralDirectorFamilyName.sendKeys("New name");
		CoreDRSPage.FuneralDirectorTelephone.sendKeys("039878972637");
		CoreControls.saveForm();
	}
}
