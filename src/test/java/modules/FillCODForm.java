package modules;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.CoreCodPage;
import pageobjects.CoreControls;

public class FillCODForm {

	static String randDeceasedFamilyName = RandomStringUtils.randomAlphabetic(6);
	static String randDeceasedFirstName = RandomStringUtils.randomAlphabetic(6);
	static String randparentOneGivenName = RandomStringUtils.randomAlphabetic(6);
	

	public static void Execute(WebDriver driver) throws Throwable {
		PageFactory.initElements(driver, CoreCodPage.class);
		Helper.waitFor(CoreCodPage.causeOfDeathType);
		CoreCodPage.causeOfDeathType.sendKeys("MCCD");
		CoreCodPage.deceasedFamilyName.sendKeys("automate" + randDeceasedFamilyName);
		CoreCodPage.deceasedfirstName.sendKeys("automate" + randDeceasedFirstName);
		CoreCodPage.sex.sendKeys("Male");
		CoreCodPage.aboriginalOrTorresStraitIslanderOrigin.sendKeys("Decline to Reply");
		CoreCodPage.howDidYouConfirmTheNameOfTtheDeceased.sendKeys("Medical Records");
		CoreCodPage.dateOfBirthType.sendKeys("On");
		CoreCodPage.deceasedDOBDay.sendKeys("12");
		CoreCodPage.deceasedDOBMonth.sendKeys("03");
		CoreCodPage.deceasedDOBYear.sendKeys("1980");
		CoreCodPage.mothersFamilyName.sendKeys("automate" + randDeceasedFamilyName);
		CoreCodPage.mothersFirstName.sendKeys("automate" + randparentOneGivenName);
		CoreCodPage.mothersDOBDay.sendKeys("02");
		CoreCodPage.mothersDOBMonth.sendKeys("02");
		CoreCodPage.mothersDOBYear.sendKeys("1945");
		CoreCodPage.dateOfDeathDay.sendKeys("30");
		CoreCodPage.dateOfDeathMonth.sendKeys("07");
		CoreCodPage.dateOfDeathYear.sendKeys("2017");
		CoreCodPage.whereDidDeathOccur.sendKeys("Hospital");
		CoreCodPage.placeOfDeathHospitalName.sendKeys("Albury Base Hospital");
		CoreCodPage.placeOfDeathHhospitalSuburb.sendKeys("Wollongong");
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
		CoreCodPage.numberOfConditionDirect.sendKeys("0");
		CoreCodPage.numberOfConditionsAntecedent.sendKeys("0");
		CoreCodPage.numberOfConditionsOther.sendKeys("0");
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
		Thread.sleep(2000);
		CoreControls.editForm();
		CoreControls.validateForm();
		Thread.sleep(2000);
		CoreControls.overrideExceptionsOnform();
	}

}
