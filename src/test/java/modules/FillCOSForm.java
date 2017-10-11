package modules;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.CoreCOSPage;
import pageobjects.CoreControls;

public class FillCOSForm {

	public static String randomSubjectName = RandomStringUtils.randomAlphabetic(6);

	public static void Execute(WebDriver driver) throws Exception {

		// PageFactory.initElements(driver, FillAdoptionForm.class);
		Thread.sleep(2000);
		CoreCOSPage.searchBy.sendKeys("Subject's Birth Details");
		CoreCOSPage.appSearchFamilyName.sendKeys("Auto" + FillAdoptionForm.childsNewNameFamilyName);
		CoreCOSPage.appSearchFirstGivenName.sendKeys("Auto" + FillAdoptionForm.childsNewNameFirstGivenName);
		CoreCOSPage.appSearcOtherGivenNames.sendKeys("Auto" + FillAdoptionForm.childsNewNameFirstGivenName);
		CoreCOSPage.appSearchDOBDay.sendKeys("12");
		CoreCOSPage.appSearchDOBMonth.sendKeys("08");
		CoreCOSPage.appSearchDOBYear.sendKeys("1980");
		CoreCOSPage.cosSearchButton.click();
		Thread.sleep(1000);
		CoreControls.matchToFirstRadioButton();
		
		
		
//		CoreCOSPage.additionaDetails.click();
//		//CoreCOSPage.firstGivenName.sendKeys("Auto" + FillAdoptionForm.childsNewNameFirstGivenName);
//		System.out.println(
//				"The new child name in adoption is ====== " + "Auto" + FillAdoptionForm.childsNewNameFirstGivenName);
//		CoreCOSPage.subjectDOBDay.sendKeys("12");
//		CoreCOSPage.subjectDOBMonth.sendKeys("08");
//		CoreCOSPage.subjectDOBYear.sendKeys("1980");
//		CoreCOSPage.subjectSex.sendKeys("Femail");
//		CoreCOSPage.subjectDetailsSuburb.sendKeys("Melbourne");
//		CoreCOSPage.subjectAddressLine1.sendKeys("12 faf");
//		CoreCOSPage.subjectAddressSuburb.sendKeys("uoaiudf");
//		CoreCOSPage.subjectAddressPostcode.sendKeys("3212");
//		CoreCOSPage.subjectPostalAddressLine1.sendKeys("12 faf");
//		CoreCOSPage.subjectPostalAddressSuburb.sendKeys("uoaiudf");
//		CoreCOSPage.subjectPostalAddressPostcode.sendKeys("3212");
//		CoreCOSPage.subjectTelephoneNo.sendKeys("0478912432");
//		CoreCOSPage.maritalStatus.sendKeys("Non");
//		CoreCOSPage.sexToBeRegistered.sendKeys("Mail");
//		CoreCOSPage.placeOfSexAffirmationSurgery.sendKeys("Australia");
//		CoreCOSPage.changeOfNameLodged.sendKeys("No");
//		CoreCOSPage.medicalPractitionerFirstGivenName.sendKeys("Testing Dr");
//		CoreCOSPage.medicalPractitionerAddressLine1.sendKeys("88 Viectorua st");
//		CoreCOSPage.medicalPractitionerAddressSuburb.sendKeys("Abcstr");
//		CoreCOSPage.medicalPractitionerAddressPostcode.sendKeys("3002");
//		CoreCOSPage.medicalPractitionerTelephoneNo.sendKeys("04987565445");
//		CoreCOSPage.medicalPractitioner2FirstGivenName.sendKeys("Dr Anothertest");
//		CoreCOSPage.medicalPractitioner2AddressLine1.sendKeys("87 Bill St");
//		CoreCOSPage.medicalPractitioner2AddressSuburb.sendKeys("Coburs");
//		CoreCOSPage.medicalPractitioner2AddressPostcode.sendKeys("3050");
//		CoreCOSPage.medicalPractitioner2TelephoneNo.sendKeys("0478924356");
//		CoreCOSPage.declarationRelationshipToSubject.sendKeys("Self");
//		CoreCOSPage.declarationFirstGivenName.sendKeys("Auto" + FillAdoptionForm.childsNewNameFirstGivenName);
//		CoreCOSPage.declarationFromApplicant.sendKeys("Yes");
//		CoreControls.validateForm();
//		CoreControls.overrideExceptionsOnform();
//		Thread.sleep(2000);
//		String alerMessage = CoreCOSPage.alertMessage.getText();
//		Assert.assertTrue(alerMessage.equals("The notification does not have a linked application"));
	}
}
