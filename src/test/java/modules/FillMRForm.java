package modules;

import java.awt.GraphicsDevice.WindowTranslucency;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.CoreControls;
import pageobjects.MRPage;

public class FillMRForm {

	public static void Execute(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, MRPage.class);
		Thread.sleep(3000);
		MRPage.celebrantCode.sendKeys("A Civil Ceremony");
		MRPage.celebrantRegistrationNumber.sendKeys("12341324");
		MRPage.dateOfMarriageDay.sendKeys("01");
		MRPage.dateOfMarriageMonth.sendKeys("07");
		MRPage.dateOfMarriageYear.sendKeys("2017");
		MRPage.placeOfMarriageLine1.sendKeys("120 Lygon St");
		MRPage.placeOfMarriageSuburb.sendKeys("Carlton");
		MRPage.placeOfMarriagePostcode.sendKeys("3053");
		MRPage.marriageRites.sendKeys("TBC");
		MRPage.groomsNameFamilyName.sendKeys("Smith");
		MRPage.groomsNameFirstGivenName.sendKeys("John");
		MRPage.groomsGender.sendKeys("Male");
		MRPage.groomsOccupation.sendKeys("accountant");
		MRPage.groomsResidentialAddressLine1.sendKeys("18 Canning st");
		MRPage.groomsResidentialAddressSuburb.sendKeys("North Melbourne");
		MRPage.groomsResidentialAddressPostcode.sendKeys("3051");
		MRPage.groomsConjugalStatus.sendKeys("Never Married");
		MRPage.groomPlaceOfBirthSuburbTownCity.sendKeys("Melbourne");
		MRPage.groomDOBDay.sendKeys("12");
		MRPage.groomDOBMonth.sendKeys("05");
		MRPage.groomDOBYear.sendKeys("1980");
		MRPage.groomsFathersDetailsFamilyName.sendKeys("Smith");
		MRPage.groomsFathersDetailsFirstGivenName.sendKeys("Jim");
		MRPage.groomsMothersDetailsFamilyName.sendKeys("Smith");
		MRPage.groomsMothersDetailsFamilyNameAtBirth.sendKeys("sjsncjdsks");
		MRPage.groomsMothersDetailsFirstGivenName.sendKeys("Jawan");
		MRPage.bridesNameFamilyName.sendKeys("Mcjason");
		MRPage.bridesNameFirstGivenName.sendKeys("lili");
		MRPage.bridesGender.sendKeys("Female");
		MRPage.bridesOccupation.sendKeys("accouintant");
		MRPage.bridesResidentialAddressLine1.sendKeys("40 Stockade AVE");
		MRPage.bridesResidentialAddressSuburb.sendKeys("Coburg");
		MRPage.bridesResidentialAddressPostcode.sendKeys("3058");
		MRPage.bridesConjugalStatus.sendKeys("Never Married");
		MRPage.bridesPlaceOfBirthSuburbTownCity.sendKeys("Melbourne");
		MRPage.bridesDOBday.sendKeys("29");
		MRPage.bridesDOBMonth.sendKeys("05");
		MRPage.bridesDOBYear.sendKeys("1983");
		MRPage.bridesFathersDetailsFamilyName.sendKeys("Mcjason");
		MRPage.bridesFathersDetailsFirstGivenName.sendKeys("Matt");
		MRPage.bridesMothersDetailsFamilyName.sendKeys("Mcjason");
		MRPage.bridesMothersDetailsFamilyNameAtBirth.sendKeys("jlasdfakj");
		MRPage.bridesMothersDetailsFirstGivenName.sendKeys("Janet");
		MRPage.groomsPeriodOfResidencyInAustraliaYears.sendKeys("15");
		MRPage.groomsPeriodOfResidencyInAustraliaMonths.sendKeys("00");
		MRPage.bridesPeriodOfResidencyInAustraliaYears.sendKeys("15");
		MRPage.bridesPeriodOfResidencyInAustraliaMonths.sendKeys("00");
		MRPage.noimDateReceivedDay.sendKeys("01");
		MRPage.noimDateReceivedMonth.sendKeys("06");
		MRPage.noimDateReceivedYear.sendKeys("2017");
		MRPage.groomsSignature.sendKeys("Yes");
		MRPage.groomSignatureWitnessed.sendKeys("Yes");
		MRPage.groomWitnessTitle.sendKeys("Justice of Peace");
		MRPage.bridesSignature.sendKeys("Yes");
		MRPage.brideSignatureWitnessed.sendKeys("Yes");
		MRPage.brideWitnessTitle.sendKeys("Justice of Peace");
		MRPage.celebrantsSignature.sendKeys("Yes");
		MRPage.groomsvidenceOfBirth.sendKeys("Australian Passport");
		MRPage.groomsPassportNumber.sendKeys("12341234");
		MRPage.groomsIdentityConfirmed.sendKeys("Yes");
		// MRPage.groomsIdentificationDocumentType.sendKeys("Passport");
		// MRPage.groomsIdentificationPlaceOfIssue.sendKeys("Victoria");
		// MRPage.groomsIdentificationDocumentNumber.sendKeys("123");
		MRPage.groomsSignatureDeclarationsForm14.sendKeys("Yes");
		MRPage.groomsIdentificationIssueOfDocumentsS425a.sendKeys("No");
		MRPage.bridesEvidenceOfBirth.sendKeys("Australian Passport");
		MRPage.bridesPassportNumber.sendKeys("342");
		MRPage.bridesIdentityConfirmed.sendKeys("Yes");
		// MRPage.bridesDdocumentType.sendKeys("Passport");
		// MRPage.bridesPlaceOfIssue.sendKeys("Victoria");
		// MRPage.bridesDocumentNumber.sendKeys("41234");
		MRPage.bridesIssueOfDocumentsS425a.sendKeys("No");
		MRPage.statutoryRequirementsShorteningOfTimeApprovalReceived.sendKeys("No");
		MRPage.statutoryRequirementsShorteningOfTimeSighted.sendKeys("No");
		MRPage.statutoryRequirementsShorteningOfTimeReason.sendKeys("NA");
		MRPage.statutoryRequirementsShorteningOfTimeLocation.sendKeys("Melbourne");
		MRPage.brideSignatureDeclarationsForm14.sendKeys("Yes");
		MRPage.celebrantSignedGroomsDeclaration.sendKeys("Yes");
		MRPage.brideSignatureDeclarationsForm14.sendKeys("Yes");
		MRPage.celebrantSignedBrideDeclarationn.sendKeys("Yes");
		MRPage.groomSignedSolemnisationDetails.sendKeys("Yes");
		MRPage.brideSignedSolemnisationDetails.sendKeys("Yes");
		MRPage.celebrantSignedSolemnisationDetails.sendKeys("Yes");
		MRPage.witnessOneFamilyName.sendKeys("Arther");
		MRPage.witnessOneFirstGivenName.sendKeys("Pascal");
		MRPage.witnessOneSignedForm16.sendKeys("Yes");
		MRPage.witnessTwoFamilyName.sendKeys("Mitting");
		MRPage.witnessTwoFirstGivenName.sendKeys("Sam");
		MRPage.witnessTwoSignedForm16.sendKeys("Yes");
		MRPage.celebrantOath.sendKeys("Yes");
		MRPage.originalMarriageDocumentsReceived.sendKeys("Yes");
		MRPage.validateform();
		
		CoreControls.selectSave();
		CoreControls.clickGo();

	}

}
