package modules;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.EregistryCodPage;
import pageobjects.EregistryControls;

public class FillEregistryCodForm {

	static String deceasedFamilyName = RandomStringUtils.randomAlphabetic(5);
	static String deceasedGivenName = RandomStringUtils.randomAlphabetic(5);
	static String motherGivenName = RandomStringUtils.randomAlphabetic(5);

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EregistryCodPage.class);
		Helper.waitFor(EregistryCodPage.codType);

		EregistryCodPage.codType.sendKeys("MCCD");
		EregistryCodPage.familyName.clear();
		EregistryCodPage.familyName.sendKeys("Automated" + deceasedFamilyName);
		EregistryCodPage.familyNameSameAsBirth.sendKeys("Yes");
		// EregistryCodPage.familyNameAtBirth,"Automated" + deceasedFamilyName);
		EregistryCodPage.givenName.sendKeys("Automated" + deceasedGivenName);
		EregistryCodPage.sex.sendKeys("Female");
		Helper.selectDropDownList(EregistryCodPage.aboriginal, "Neither Aboriginal or Torres Strait Islander");
		Helper.selectDropDownList(EregistryCodPage.confirmName, "Medical Records");
		EregistryCodPage.dateOfBirthType.sendKeys("On");
		EregistryCodPage.dateOfBirthDay.sendKeys("07");
		EregistryCodPage.dateOfBirthMonth.sendKeys("07");
		EregistryCodPage.dateOfBirthYear.sendKeys("1937");
		EregistryCodPage.motherFamilyName.clear();
		EregistryCodPage.motherFamilyName.sendKeys("Automated" + deceasedFamilyName);
		EregistryCodPage.motherFamilyNameSameAsBirth.sendKeys("Yes");
		EregistryCodPage.motherGivenName.sendKeys("Automated" + motherGivenName);
		EregistryCodPage.motherDateOfBirthDay.sendKeys("07");
		EregistryCodPage.motherDateOfBirthMonth.sendKeys("07");
		EregistryCodPage.motherDateOfBirthYear.sendKeys("1900");
		EregistryCodPage.deathDateType.sendKeys("On");
		EregistryCodPage.deathDateDay.sendKeys("07");
		EregistryCodPage.deathDateMonth.sendKeys("07");
		EregistryCodPage.deathDateYear.sendKeys("2017");
		EregistryCodPage.deathOccur.sendKeys("Hospital");
		Helper.selectDropDownList(EregistryCodPage.hospitalName, "Acute Centre Beechworth");
		Helper.selectDropDownList(EregistryCodPage.hospitalTown, "BEECHWORTH");
		EregistryCodPage.reviewable.sendKeys("No");
		EregistryCodPage.examineDody.sendKeys("yes");
		EregistryCodPage.examineDay.sendKeys("07");
		EregistryCodPage.examineMonth.sendKeys("07");
		EregistryCodPage.examineYear.sendKeys("2017");
		EregistryCodPage.medicalCare.sendKeys("Yes");
		EregistryCodPage.seenAliveDay.sendKeys("07");
		EregistryCodPage.seenAliveMonth.sendKeys("07");
		EregistryCodPage.seenAliveYear.sendKeys("2017");
		EregistryCodPage.medicalHistory.sendKeys("Yes");
		EregistryCodPage.detailedKnowledge.sendKeys("Yes");
		EregistryCodPage.otherAdvice.sendKeys("No");
		EregistryCodPage.numberOfDisease.sendKeys("0");
		EregistryCodPage.numberOfAntecedentCauses.sendKeys("0");
		EregistryCodPage.numberOfOtherSignificantConditions.sendKeys("0");
		EregistryCodPage.deviceInBody.sendKeys("No");
		EregistryCodPage.operationWithinFourWeeks.sendKeys("No");
		EregistryCodPage.pregnantIn12months.sendKeys("No");
		EregistryCodPage.postMortemHeld.sendKeys("No");
		EregistryCodPage.organisingDisposal.sendKeys("Other");
		EregistryCodPage.otherPersonFamilyName.sendKeys("Smith");
		EregistryCodPage.otherPersonFirstName.sendKeys("David");
		EregistryCodPage.otherPersonTelephoneNo.sendKeys("99998888");
		EregistryCodPage.under18.sendKeys("No");
		EregistryCodPage.telephoneNo.clear();
		EregistryCodPage.telephoneNo.sendKeys("99998888");
		EregistryCodPage.declaration.sendKeys("Yes");
		Helper.clickItem(EregistryControls.saveButton);

		Helper.waitFor(EregistryControls.codMessage);
		String codSavedMessage;
		Thread.sleep(3000);
		codSavedMessage = EregistryControls.codMessage.getText();
		Assert.assertTrue("result message not found",
				codSavedMessage.contains("This Cause of Death has been successfully saved"));
		EregistryControls.codLink.click();
		EregistryControls.draftList.click();
		EregistryControls.codSearchFamilyName.sendKeys("Automated" + deceasedFamilyName);
		
		Helper.waitFor(EregistryControls.refreshButton);
		EregistryControls.refreshButton.click();
		Helper.clickItem(EregistryControls.searchResult1);
		Helper.clickItem(EregistryControls.submitButton);
		Helper.clickItem(EregistryControls.submitButton);
		EregistryControls.assertAll();
	}
}
