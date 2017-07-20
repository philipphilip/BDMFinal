package modules;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.CODPage;
import pageobjects.CoreControls;

public class FillCODForm {

	public static void Execute(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, CODPage.class);
		WebDriverWait waitForTabsMenue = new WebDriverWait(driver, 10000);
		CODPage.causeOfDeathType = waitForTabsMenue
				.until(ExpectedConditions.elementToBeClickable(CODPage.causeOfDeathType));
		CODPage.causeOfDeathType.sendKeys("MCCD");
		String randDeceasedFamilyName = RandomStringUtils.randomAlphabetic(6);
		CODPage.deceasedFamilyName.sendKeys(randDeceasedFamilyName);
		CODPage.deceasedfirstName.sendKeys("skjfhadsfxx");
		CODPage.sex.sendKeys("Male");
		CODPage.aboriginalOrTorresStraitIslanderOrigin.sendKeys("Unknown");
		CODPage.howDidYouConfirmTheNameOfTtheDeceased.sendKeys("Medical Records");
		CODPage.dateOfBirthType.sendKeys("On");
		CODPage.deceasedDOBDay.sendKeys("10");
		CODPage.deceasedDOBMonth.sendKeys("10");
		CODPage.deceasedDOBYear.sendKeys("1970");
		CODPage.mothersFamilyName.sendKeys("asdf");
		CODPage.mothersFirstName.sendKeys("asdfasdfadsf");
		CODPage.mothersDOBDay.sendKeys("02");
		CODPage.mothersDOBMonth.sendKeys("02");
		CODPage.mothersDOBYear.sendKeys("1945");
		CODPage.dateOfDeathDay.sendKeys("07");
		CODPage.dateOfDeathMonth.sendKeys("05");
		CODPage.dateOfDeathYear.sendKeys("2017");
		CODPage.whereDidDeathOccur.sendKeys("Hospital");
		CODPage.placeOfDeathHospitalName.sendKeys("Albury Base Hospital");
		CODPage.placeOfDeathHhospitalSuburb.sendKeys("Melbourne");
		CODPage.IsThisDeathRreportableInAccordanceWithSections10or13.sendKeys("No");
		CODPage.didYouExamineTheDeceasedsBodyAfterBeath.sendKeys("NO");
		CODPage.wereYouResponsibleForProvidingMedicalCareToDeceasedImmediatelyDeforeDeath.sendKeys("Yes");
		CODPage.dateLastSeenAliveDay.sendKeys("03");
		CODPage.dateLastSeenAliveMonth.sendKeys("04");
		CODPage.dateLastSeenAliveYear.sendKeys("2017");
		CODPage.iAmDoctorExaminingOnBehalfOfAnotherDr.sendKeys("Yes");
		CODPage.iHaveReferencedTheCauseOfDeathWithTheDeceasedcompleteMedicalHistory.sendKeys("Yes");
		CODPage.ihaveDetailedKnowledgeOfTheCircumstancesSurroundingThisDeath.sendKeys("Yes");
		CODPage.abilityToAccuratelyAdviseCOBOtherAdvice.sendKeys("No");
		CODPage.IsThereCardiacPacemakerOrBatteryPoweredDeviceInTheBody.sendKeys("No");
		CODPage.wasPostMortemHeld.sendKeys("No");
		CODPage.numberOfDisease.sendKeys("0");
		CODPage.numberOfAntecedentCauses.sendKeys("0");
		CODPage.numberofOtherSignificantConditions.sendKeys("0");
		CODPage.WhoIsOrganisingDisposalOfDeceasedRemains.sendKeys("Funeral Director");
		CODPage.funeralDirectorIDNumber.sendKeys("2452345");
		CODPage.funeralDirectorFamilyName.sendKeys("asdfasjs");
		CODPage.funeralDirectorBusinessName.sendKeys("The xyz");
		CODPage.funeralDirectorAddressLine1.sendKeys("2342 Billing St");
		CODPage.funeralDirectorSuburb.sendKeys("Melbourne");
		CODPage.funeralDirectorPostcode.sendKeys("3000");
		CODPage.funeralDirectorEmailAddress.sendKeys("asdf@asdkf.com");
		CODPage.wasTheDeceasedUnder18.sendKeys("No");
		CODPage.medicalPractitionerFamilyName.sendKeys("afsdfasdfa");
		CODPage.medicalPractitionerFirstName.sendKeys("jsiekdeod");
		CODPage.medicalPractitionerBusinessName.sendKeys("Testing people");
		CODPage.medicalPractitionerAddressLine1.sendKeys("12 rewsnsn");
		CODPage.medicalPractitionerSuburb.sendKeys("Noirth Melbourne");
		CODPage.medicalPractitionerPostcode.sendKeys("3000");
		CODPage.medicalPractitionerEmail.sendKeys("bill@test.com");
		CODPage.medicalPractitionerAHPRANumber.sendKeys("123456");
		CODPage.DidYouAcquireOrAnticipateAnyBenefitByReasonOfThisDeath.sendKeys("No");

		CoreControls.selectSave();
		CoreControls.clickGo();
	}

}
