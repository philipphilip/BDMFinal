package modules;

import helpers.DataHelper;
import helpers.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.EregistryCodPage;
import pageobjects.EregistryDrsPage;
import step_definitions.BDMForm;


public class FillEregistryCodForm {

	public static void Execute(WebDriver driver) throws Exception {

		PageFactory.initElements(driver, EregistryCodPage.class);
		Thread.sleep(3000);

		EregistryCodPage.codType.sendKeys("MCCD");

		String codFamilyName = DataHelper.getRandomStringAs("CodFamilyName",10);
		EregistryCodPage.familyName.sendKeys(codFamilyName);
		String codGivenName = DataHelper.getRandomStringAs("CodGivenName",10);
		EregistryCodPage.givenName.sendKeys(codGivenName);

		EregistryCodPage.sex.sendKeys("Female");

		Helper.selectDropDownList( EregistryCodPage.aboriginal,"Neither Aboriginal or Torres Strait Islander");

		Helper.selectDropDownList( EregistryCodPage.confirmName,"Medical Records");

		EregistryCodPage.dateOfBirthType.sendKeys("On");
		EregistryCodPage.dateOfBirthDay.sendKeys("07");
		EregistryCodPage.dateOfBirthMonth.sendKeys("07");
		EregistryCodPage.dateOfBirthYear.sendKeys("1937");

		EregistryCodPage.motherFamilyName.sendKeys("Smith");
		EregistryCodPage.motherGivenName.sendKeys("Mary");
		EregistryCodPage.motherDateOfBirthDay.sendKeys("07");
		EregistryCodPage.motherDateOfBirthMonth.sendKeys("07");
		EregistryCodPage.motherDateOfBirthYear.sendKeys("1900");

		EregistryCodPage.deathDateType.sendKeys("On");
		EregistryCodPage.deathDateDay.sendKeys("07");
		EregistryCodPage.deathDateMonth.sendKeys("07");
		EregistryCodPage.deathDateYear.sendKeys("2017");

		EregistryCodPage.deathOccur.sendKeys("Hospital");

		Helper.selectDropDownList( EregistryCodPage.hospitalName,"Abel Tasman Village");
		Helper.selectDropDownList( EregistryCodPage.hospitalTown,"Wollongong");


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
		EregistryCodPage.AHPRA.sendKeys("MED0000938719");
		EregistryCodPage.declaration.sendKeys("Yes");


		EregistryCodPage.saveButton.click();


	}

}
