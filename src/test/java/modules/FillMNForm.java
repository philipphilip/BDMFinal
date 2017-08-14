package modules;

import helpers.Helper;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.deps.com.thoughtworks.xstream.mapper.Mapper.Null;
import pageobjects.CoreControls;
import pageobjects.MNPage;

public class FillMNForm {

	public static String groomsFamilyName = RandomStringUtils.randomAlphabetic(6);

	public static void Execute(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, MNPage.class);
		PageFactory.initElements(driver, CoreControls.class);
		Thread.sleep(3000);
		Helper.selectDropDownList(MNPage.celebrantCode, "A");
		MNPage.celebrantRegistrationNumber.sendKeys("12341324");
		MNPage.dateOfMarriageDay.sendKeys("01");
		MNPage.dateOfMarriageMonth.sendKeys("07");
		MNPage.dateOfMarriageYear.sendKeys("2017");
		MNPage.placeOfMarriageLine1.sendKeys("120 Lygon St");
		MNPage.placeOfMarriageSuburb.sendKeys("Carlton");
		MNPage.placeOfMarriagePostcode.sendKeys("3053");
		MNPage.marriageRites.sendKeys("TBC");
		MNPage.groomsNameFamilyName.sendKeys("automatic" + groomsFamilyName);
		String groomsGivenName = RandomStringUtils.randomAlphabetic(6);
		MNPage.groomsNameFirstGivenName.sendKeys("automatic" + groomsGivenName);
		MNPage.groomsGender.sendKeys("Male");
		MNPage.groomsOccupation.sendKeys("accountant");
		MNPage.groomsResidentialAddressLine1.sendKeys("18 Canning st");
		MNPage.groomsResidentialAddressSuburb.sendKeys("North Melbourne");
		MNPage.groomsResidentialAddressPostcode.sendKeys("3051");
		MNPage.groomsConjugalStatus.sendKeys("Never Married");
		MNPage.groomPlaceOfBirthSuburbTownCity.sendKeys("Melbourne");
		MNPage.groomDOBDay.sendKeys("12");
		MNPage.groomDOBMonth.sendKeys("05");
		MNPage.groomDOBYear.sendKeys("1980");
		MNPage.groomsFathersDetailsFamilyName.sendKeys("automatic" + groomsFamilyName);
		String groomFatherFirstName = RandomStringUtils.randomAlphabetic(6);
		MNPage.groomsFathersDetailsFirstGivenName.sendKeys("automatic" + groomFatherFirstName);
		MNPage.groomsMothersDetailsFamilyName.sendKeys("automatic" + groomsFamilyName);
		MNPage.groomsMothersDetailsFamilyNameAtBirth.sendKeys("sjsncjdsks");
		String groomMotherFirstName = RandomStringUtils.randomAlphabetic(6);
		MNPage.groomsMothersDetailsFirstGivenName.sendKeys("automatic" + groomMotherFirstName);
		String brideFamilyName = RandomStringUtils.randomAlphabetic(6);
		MNPage.bridesNameFamilyName.sendKeys("automatic" + brideFamilyName);
		String brideFirstName = RandomStringUtils.randomAlphabetic(6);
		MNPage.bridesNameFirstGivenName.sendKeys("automatic" + brideFirstName);
		MNPage.bridesGender.sendKeys("Female");
		MNPage.bridesOccupation.sendKeys("accouintant");
		MNPage.bridesResidentialAddressLine1.sendKeys("40 Stockade AVE");
		MNPage.bridesResidentialAddressSuburb.sendKeys("Coburg");
		MNPage.bridesResidentialAddressPostcode.sendKeys("3058");
		MNPage.bridesConjugalStatus.sendKeys("Never Married");
		MNPage.bridesPlaceOfBirthSuburbTownCity.sendKeys("Melbourne");
		MNPage.bridesDOBday.sendKeys("29");
		MNPage.bridesDOBMonth.sendKeys("05");
		MNPage.bridesDOBYear.sendKeys("1983");
		MNPage.bridesFathersDetailsFamilyName.sendKeys("automatic" + brideFamilyName);
		String brideFatherFirstName = RandomStringUtils.randomAlphabetic(6);
		MNPage.bridesFathersDetailsFirstGivenName.sendKeys("automatic" + brideFatherFirstName);
		MNPage.bridesMothersDetailsFamilyName.sendKeys("automatic" + brideFamilyName);
		MNPage.bridesMothersDetailsFamilyNameAtBirth.sendKeys("jlasdfakj");
		String brideMotherFirstName = RandomStringUtils.randomAlphabetic(6);
		MNPage.bridesMothersDetailsFirstGivenName.sendKeys("automatic" + brideMotherFirstName);
		MNPage.groomsPeriodOfResidencyInAustraliaYears.sendKeys("15");
		MNPage.groomsPeriodOfResidencyInAustraliaMonths.sendKeys("00");
		MNPage.bridesPeriodOfResidencyInAustraliaYears.sendKeys("15");
		MNPage.bridesPeriodOfResidencyInAustraliaMonths.sendKeys("00");
		MNPage.noimDateReceivedDay.sendKeys("01");
		MNPage.noimDateReceivedMonth.sendKeys("06");
		MNPage.noimDateReceivedYear.sendKeys("2017");
		MNPage.groomsSignature.sendKeys("Yes");
		MNPage.groomSignatureWitnessed.sendKeys("Yes");
		MNPage.groomWitnessTitle.sendKeys("Justice of Peace");
		MNPage.bridesSignature.sendKeys("Yes");
		MNPage.brideSignatureWitnessed.sendKeys("Yes");
		MNPage.brideWitnessTitle.sendKeys("Justice of Peace");
		MNPage.celebrantsSignature.sendKeys("Yes");
		MNPage.groomsvidenceOfBirth.sendKeys("Australian Passport");
		MNPage.groomsPassportNumber.sendKeys("12341234");
		MNPage.groomsIdentityConfirmed.sendKeys("Yes");
		MNPage.groomsSignatureDeclarationsForm14.sendKeys("Yes");
		MNPage.groomsIdentificationIssueOfDocumentsS425a.sendKeys("No");
		MNPage.bridesEvidenceOfBirth.sendKeys("Australian Passport");
		MNPage.bridesPassportNumber.sendKeys("342");
		MNPage.bridesIdentityConfirmed.sendKeys("Yes");
		MNPage.bridesIssueOfDocumentsS425a.sendKeys("No");
		MNPage.statutoryRequirementsShorteningOfTimeApprovalReceived.sendKeys("No");
		MNPage.statutoryRequirementsShorteningOfTimeSighted.sendKeys("No");
		MNPage.statutoryRequirementsShorteningOfTimeReason.sendKeys("NA");
		MNPage.statutoryRequirementsShorteningOfTimeLocation.sendKeys("Melbourne");
		MNPage.brideSignatureDeclarationsForm14.sendKeys("Yes");
		MNPage.celebrantSignedGroomsDeclaration.sendKeys("Yes");
		MNPage.brideSignatureDeclarationsForm14.sendKeys("Yes");
		MNPage.celebrantSignedBrideDeclarationn.sendKeys("Yes");
		MNPage.groomSignedSolemnisationDetails.sendKeys("Yes");
		MNPage.brideSignedSolemnisationDetails.sendKeys("Yes");
		MNPage.celebrantSignedSolemnisationDetails.sendKeys("Yes");
		MNPage.witnessOneFamilyName.sendKeys("Arther");
		MNPage.witnessOneFirstGivenName.sendKeys("Pascal");
		MNPage.witnessOneSignedForm16.sendKeys("Yes");
		MNPage.witnessTwoFamilyName.sendKeys("Mitting");
		MNPage.witnessTwoFirstGivenName.sendKeys("Sam");
		MNPage.witnessTwoSignedForm16.sendKeys("Yes");
		MNPage.celebrantOath.sendKeys("Yes");
		MNPage.originalMarriageDocumentsReceived.sendKeys("Yes");
		CoreControls.validateForm();
		CoreControls.overrideExceptionsOnform();
		Thread.sleep(2000);
		CoreControls.saveForm();
	}

}