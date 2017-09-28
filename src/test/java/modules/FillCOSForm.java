package modules;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import pageobjects.CoreCOSPage;
import pageobjects.CoreControls;

public class FillCOSForm {

	public static String randomSubjectName = RandomStringUtils.randomAlphabetic(6);

	public static void Execute(WebDriver driver) throws Exception {

		CoreCOSPage.additionaDetails.click();
		CoreCOSPage.firstGivenName.sendKeys("Auto" + randomSubjectName);
		CoreCOSPage.subjectDOBDay.sendKeys("12");
		CoreCOSPage.subjectDOBMonth.sendKeys("06");
		CoreCOSPage.subjectDOBYear.sendKeys("1968");
		CoreCOSPage.subjectSex.sendKeys("Male");
		CoreCOSPage.subjectDetailsSuburb.sendKeys("Melbourne");
		CoreCOSPage.parent1DOBDay.sendKeys("10");
		CoreCOSPage.parent1DOBMonth.sendKeys("04");
		CoreCOSPage.parent1DOBYear.sendKeys("1910");
		CoreCOSPage.parent1Suburb.sendKeys("Melbourne");
		CoreCOSPage.subjectAddressLine1.sendKeys("432 asdfka st");
		CoreCOSPage.subjectAddressSuburb.sendKeys("Melbourne");
		CoreCOSPage.subjectAddressPostcode.sendKeys("3000");
		CoreCOSPage.subjectPostalAddressLine1.sendKeys("99 saf Rd");
		CoreCOSPage.subjectPostalAddressSuburb.sendKeys("Melbourne");
		CoreCOSPage.subjectPostalAddressPostcode.sendKeys("3000");
		CoreCOSPage.subjectTelephoneNo.sendKeys("0478912432");
		CoreCOSPage.maritalStatus.sendKeys("Non");
		CoreCOSPage.sexToBeRegistered.sendKeys("Female");
		CoreCOSPage.placeOfSexAffirmationSurgery.sendKeys("Australia");
		CoreCOSPage.changeOfNameLodged.sendKeys("No");
		CoreCOSPage.medicalPractitionerFirstGivenName.sendKeys("Testing Dr");
		CoreCOSPage.medicalPractitionerAddressLine1.sendKeys("88 Viectorua st");
		CoreCOSPage.medicalPractitionerAddressSuburb.sendKeys("Abcstr");
		CoreCOSPage.medicalPractitionerAddressPostcode.sendKeys("3002");
		CoreCOSPage.medicalPractitionerTelephoneNo.sendKeys("04987565445");
		CoreCOSPage.medicalPractitioner2FirstGivenName.sendKeys("Dr Anothertest");
		CoreCOSPage.medicalPractitioner2AddressLine1.sendKeys("87 Bill St");
		CoreCOSPage.medicalPractitioner2AddressSuburb.sendKeys("Coburs");
		CoreCOSPage.medicalPractitioner2AddressPostcode.sendKeys("3050");
		CoreCOSPage.medicalPractitioner2TelephoneNo.sendKeys("0478924356");
		CoreCOSPage.declarationRelationshipToSubject.sendKeys("Self");
		CoreCOSPage.declarationFirstGivenName.sendKeys("Auto" + randomSubjectName);
		CoreCOSPage.declarationFromApplicant.sendKeys("Yes");
		CoreControls.validateForm();
		CoreControls.overrideExceptionsOnform();
		Thread.sleep(2000);
		String alerMessage = CoreCOSPage.alertMessage.getText();
		Assert.assertTrue(alerMessage.equals("The notification does not have a linked application"));
	}
}
