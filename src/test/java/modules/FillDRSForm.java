package modules;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.CoreControls;
import pageobjects.CoreDRSPage;

public class FillDRSForm {

	static String randparentTwoFamilyNameAtBirth = RandomStringUtils.randomAlphabetic(6);
	static String randparentTwoGivenName = RandomStringUtils.randomAlphabetic(6);
	static String randaddressLine1 = RandomStringUtils.randomAlphabetic(5);

	public static void Execute(WebDriver driver) throws Throwable {
		PageFactory.initElements(driver, CoreDRSPage.class);

		Helper.waitFor(CoreDRSPage.FuneralDirectorTelephone);
		CoreDRSPage.deceasedFamilyName.sendKeys("automate" + FillCODForm.randDeceasedFamilyName);
		CoreDRSPage.familyNameSameToFamilyNameAtBirth.sendKeys("Yes");
		CoreDRSPage.deceasedFirstName.sendKeys("automate" + FillCODForm.randDeceasedFirstName);

		CoreDRSPage.deceasedOtherGivenNames.sendKeys("automate" + FillCODForm.randDeceasedFirstName);
		CoreDRSPage.Sex.sendKeys("Male");

		CoreDRSPage.DateOfDeathDay.sendKeys("30");
		CoreDRSPage.DateOfDeathMoth.sendKeys("07");
		CoreDRSPage.DateOfDeathYear.sendKeys("2017");
		CoreDRSPage.deceasedDOBDay.sendKeys("12");
		CoreDRSPage.deceasedDOBMonth.sendKeys("03");
		CoreDRSPage.deceasedDOBYear.sendKeys("1980");
		Helper.selectDropDownList(CoreDRSPage.placeOfDeath, "Hospital");
		Helper.selectDropDownList(CoreDRSPage.hospitalName, "Albury Base Hospital");
		Helper.selectDropDownList(CoreDRSPage.hospitalTown, "Wollongong");
		CoreDRSPage.usualAddressLine1.sendKeys("12 " + randaddressLine1 + " st");
		CoreDRSPage.usualAddressSuburb.sendKeys("Testing");
		CoreDRSPage.usualAddressPostcode.sendKeys("3000");
		CoreDRSPage.placeOfBirthSuburb.sendKeys("Sydny");
		Helper.selectDropDownList(CoreDRSPage.occupationDuringWorkingLife, "Accountant");
		Helper.selectDropDownList(CoreDRSPage.aboriginalOrTorresStraitIslanderOrigin,
				"Neither Aboriginal or Torres Strait Islander");
		Helper.selectDropDownList(CoreDRSPage.relationshipStatusAtTimeOfDeath, "Not in a Relationship");
		Helper.selectDropDownList(CoreDRSPage.parentsOfDeceasedType, "Father");
		CoreDRSPage.parentOneFamilyName.sendKeys("automate" + FillCODForm.randDeceasedFamilyName);
		CoreDRSPage.parentOneFamilyNameSameToFamilyNameAtBirth.sendKeys("Yes");
		// CoreDRSPage.parentOneFamilyNameAtBirth.sendKeys("automate" +
		// FillCODForm.randDeceasedFamilyName);
		CoreDRSPage.parentOneFirstName.sendKeys("automate" + FillCODForm.randparentOneGivenName);
		CoreDRSPage.parentsTwoOfDeceasedType.sendKeys("Mother");
		CoreDRSPage.parentTwoFamilyName.sendKeys("automate" + FillCODForm.randDeceasedFamilyName);
		CoreDRSPage.parentTwoFamilyNameSameToFamilyNameAtBirth.sendKeys("Yes");
		// CoreDRSPage.parentTwoFamilyNameAtBirth.sendKeys("automate" +
		// randparentTwoFamilyNameAtBirth);
		CoreDRSPage.parentTwoFirstName.sendKeys("automate" + randparentTwoGivenName);
		CoreDRSPage.WasTheDeceasedUnder18.sendKeys("No");
		Helper.selectDropDownList(CoreDRSPage.informantRelationshipToSubject, "Sibling");
		CoreDRSPage.informatFamilyName.sendKeys("asdfA");
		CoreDRSPage.informatFirstName.sendKeys("fallksjgflag");
		CoreDRSPage.informantAddressLine1.sendKeys("32 asdjfs st");
		CoreDRSPage.informantAddressSuburb.sendKeys("Susdfkjs");
		CoreDRSPage.informantAddressPostcode.sendKeys("3000");
		CoreDRSPage.postalAddressSameAsResidential.sendKeys("Yes");
		CoreDRSPage.informantEmail.sendKeys("asdfsds@kadflgj.com");
		Helper.selectDropDownList(CoreDRSPage.methodOfDisposal, "Buried");
		CoreDRSPage.DateOfDisposalOrSentOverseasDay.sendKeys("07");
		CoreDRSPage.DateOfDisposalOrSentOverseasMonth.sendKeys("08");
		CoreDRSPage.DateOfDisposalOrSentOverseasYear.sendKeys("2017");
		Helper.selectDropDownList(CoreDRSPage.methodOfDisposal, "Buried");
		CoreDRSPage.remainsDisposedOffWithin30Days.sendKeys("Yes");
		Helper.selectDropDownList(CoreDRSPage.nameOfCemetery, "Melbourne General Cemetery");
		CoreDRSPage.cemeteryAddressLine1.sendKeys("1000 DonyBrock Rd");
		CoreDRSPage.cemeterySuburb.sendKeys("DonyBrock");
		CoreDRSPage.cemeteryPostcode.sendKeys("3700");
		CoreDRSPage.FuneralDirectorNumber.sendKeys("43123");
		CoreDRSPage.FuneralDirectorFamilyName.sendKeys("New name");
		CoreDRSPage.FuneralDirectorTelephone.sendKeys("039878972637");
		CoreControls.validateForm();
		CoreControls.overrideExceptionsOnform();
	}
}
