package modules;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.CoreCodPage;
import pageobjects.CoreControls;

public class FillCODForm {

	public static void Execute(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, CoreCodPage.class);
		WebDriverWait waitForTabsMenue = new WebDriverWait(driver, 10000);
		CoreCodPage.causeOfDeathType = waitForTabsMenue
				.until(ExpectedConditions.elementToBeClickable(CoreCodPage.causeOfDeathType));
		CoreCodPage.causeOfDeathType.sendKeys("MCCD");
		String randDeceasedFamilyName = RandomStringUtils.randomAlphabetic(6);
		CoreCodPage.deceasedFamilyName.sendKeys(randDeceasedFamilyName);
		CoreCodPage.deceasedfirstName.sendKeys("skjfhadsfxx");
		CoreCodPage.sex.sendKeys("Male");
		CoreCodPage.aboriginalOrTorresStraitIslanderOrigin.sendKeys("Decline to Reply");
		CoreCodPage.howDidYouConfirmTheNameOfTtheDeceased.sendKeys("Medical Records");
		CoreCodPage.dateOfBirthType.sendKeys("On");
		CoreCodPage.deceasedDOBDay.sendKeys("10");
		CoreCodPage.deceasedDOBMonth.sendKeys("10");
		CoreCodPage.deceasedDOBYear.sendKeys("1970");
		CoreCodPage.mothersFamilyName.sendKeys("asdf");
		CoreCodPage.mothersFirstName.sendKeys("asdfasdfadsf");
		CoreCodPage.mothersDOBDay.sendKeys("02");
		CoreCodPage.mothersDOBMonth.sendKeys("02");
		CoreCodPage.mothersDOBYear.sendKeys("1945");
		CoreCodPage.dateOfDeathDay.sendKeys("07");
		CoreCodPage.dateOfDeathMonth.sendKeys("05");
		CoreCodPage.dateOfDeathYear.sendKeys("2017");
		CoreCodPage.whereDidDeathOccur.sendKeys("Hospital");
		CoreCodPage.placeOfDeathHospitalName.sendKeys("Albury Base Hospital");
		CoreCodPage.placeOfDeathHhospitalSuburb.sendKeys("Melbourne");
		CoreCodPage.IsThisDeathRreportableInAccordanceWithSections10or13.sendKeys("No");
		CoreCodPage.didYouExamineTheDeceasedsBodyAfterBeath.sendKeys("NO");
		CoreCodPage.wereYouResponsibleForProvidingMedicalCareToDeceasedImmediatelyDeforeDeath.sendKeys("Yes");
		CoreCodPage.dateLastSeenAliveDay.sendKeys("03");
		CoreCodPage.dateLastSeenAliveMonth.sendKeys("04");
		CoreCodPage.dateLastSeenAliveYear.sendKeys("2017");
		CoreCodPage.iAmDoctorExaminingOnBehalfOfAnotherDr.sendKeys("Yes");
		CoreCodPage.iHaveReferencedTheCauseOfDeathWithTheDeceasedcompleteMedicalHistory.sendKeys("Yes");
		CoreCodPage.ihaveDetailedKnowledgeOfTheCircumstancesSurroundingThisDeath.sendKeys("Yes");
		CoreCodPage.abilityToAccuratelyAdviseCOBOtherAdvice.sendKeys("No");
		CoreCodPage.IsThereCardiacPacemakerOrBatteryPoweredDeviceInTheBody.sendKeys("No");
		CoreCodPage.wasPostMortemHeld.sendKeys("No");
		CoreCodPage.WhoIsOrganisingDisposalOfDeceasedRemains.sendKeys("Funeral Director");

		CoreCodPage.funeralDirectorIDNumber.sendKeys("2452345");
		CoreCodPage.funeralDirectorFamilyName.sendKeys("asdfasjs");
		CoreCodPage.funeralDirectorBusinessName.sendKeys("The xyz");
		CoreCodPage.funeralDirectorAddressLine1.sendKeys("2342 Billing St");
		CoreCodPage.funeralDirectorSuburb.sendKeys("Melbourne");
		CoreCodPage.funeralDirectorPostcode.sendKeys("3000");
		CoreCodPage.funeralDirectorEmailAddress.sendKeys("asdf@asdkf.com");

		CoreCodPage.wasTheDeceasedUnder18.sendKeys("No");
		CoreCodPage.medicalPractitionerFamilyName.sendKeys("afsdfasdfa");
		CoreCodPage.medicalPractitionerFirstName.sendKeys("jsiekdeod");
		CoreCodPage.medicalPractitionerBusinessName.sendKeys("Testing people");
		CoreCodPage.medicalPractitionerAddressLine1.sendKeys("12 rewsnsn");
		CoreCodPage.medicalPractitionerSuburb.sendKeys("Noirth Melbourne");
		CoreCodPage.medicalPractitionerPostcode.sendKeys("3000");
		CoreCodPage.medicalPractitionerEmail.sendKeys("bill@test.com");
		CoreCodPage.medicalPractitionerAHPRANumber.sendKeys("123456");
		CoreCodPage.DidYouAcquireOrAnticipateAnyBenefitByReasonOfThisDeath.sendKeys("No");

		CoreControls.selectSave();
		CoreControls.clickGo();
	}

}
