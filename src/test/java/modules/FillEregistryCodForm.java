package modules;

import helpers.DataHelper;
import helpers.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.EregistryCodPage;
import pageobjects.EregistryDrsPage;
import step_definitions.BDMForm;


public class FillEregistryCodForm {

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EregistryCodPage.class);
		//Thread.sleep(3000);

		Helper.inputItem(EregistryCodPage.codType,"MCCD");

		String codFamilyName = DataHelper.getRandomStringAs("CodFamilyName",10);
		Helper.inputItem(EregistryCodPage.familyName,codFamilyName);
		String codGivenName = DataHelper.getRandomStringAs("CodGivenName",10);
		Helper.inputItem(EregistryCodPage.givenName,codGivenName);

		Helper.inputItem(EregistryCodPage.sex,"Female");

		Helper.selectDropDownList( EregistryCodPage.aboriginal,"Neither Aboriginal or Torres Strait Islander");

		Helper.selectDropDownList( EregistryCodPage.confirmName,"Medical Records");

		Helper.inputItem(EregistryCodPage.dateOfBirthType,"On");
		Helper.inputItem(EregistryCodPage.dateOfBirthDay,"07");
		Helper.inputItem(EregistryCodPage.dateOfBirthMonth,"07");
		Helper.inputItem(EregistryCodPage.dateOfBirthYear,"1937");

		Helper.inputItem(EregistryCodPage.motherFamilyName,"Smith");
		Helper.inputItem(EregistryCodPage.motherGivenName,"Mary");
		Helper.inputItem(EregistryCodPage.motherDateOfBirthDay,"07");
		Helper.inputItem(EregistryCodPage.motherDateOfBirthMonth,"07");
		Helper.inputItem(EregistryCodPage.motherDateOfBirthYear,"1900");

		Helper.inputItem(EregistryCodPage.deathDateType,"On");
		Helper.inputItem(EregistryCodPage.deathDateDay,"07");
		Helper.inputItem(EregistryCodPage.deathDateMonth,"07");
		Helper.inputItem(EregistryCodPage.deathDateYear,"2017");

		Helper.inputItem(EregistryCodPage.deathOccur,"Hospital");

		Helper.selectDropDownList( EregistryCodPage.hospitalName,"Abel Tasman Village");
		Helper.selectDropDownList( EregistryCodPage.hospitalTown,"Wollongong");


		Helper.inputItem(EregistryCodPage.reviewable,"No");
		Helper.inputItem(EregistryCodPage.examineDody,"yes");
		Helper.inputItem(EregistryCodPage.examineDay,"07");
		Helper.inputItem(EregistryCodPage.examineMonth,"07");
		Helper.inputItem(EregistryCodPage.examineYear,"2017");
		Helper.inputItem(EregistryCodPage.medicalCare,"Yes");
		Helper.inputItem(EregistryCodPage.seenAliveDay,"07");
		Helper.inputItem(EregistryCodPage.seenAliveMonth,"07");
		Helper.inputItem(EregistryCodPage.seenAliveYear,"2017");
		Helper.inputItem(EregistryCodPage.medicalHistory,"Yes");
		Helper.inputItem(EregistryCodPage.detailedKnowledge,"Yes");
		Helper.inputItem(EregistryCodPage.otherAdvice,"No");
		Helper.inputItem(EregistryCodPage.numberOfDisease,"0");
		Helper.inputItem(EregistryCodPage.numberOfAntecedentCauses,"0");
		Helper.inputItem(EregistryCodPage.numberOfOtherSignificantConditions,"0");
		Helper.inputItem(EregistryCodPage.deviceInBody,"No");
		Helper.inputItem(EregistryCodPage.operationWithinFourWeeks,"No");
		Helper.inputItem(EregistryCodPage.pregnantIn12months,"No");
		Helper.inputItem(EregistryCodPage.postMortemHeld,"No");
		Helper.inputItem(EregistryCodPage.organisingDisposal,"Other");
		Helper.inputItem(EregistryCodPage.otherPersonFamilyName,"Smith");
		Helper.inputItem(EregistryCodPage.otherPersonFirstName,"David");
		Helper.inputItem(EregistryCodPage.otherPersonTelephoneNo,"99998888");
		Helper.inputItem(EregistryCodPage.under18,"No");

		EregistryCodPage.telephoneNo.clear();
		Helper.inputItem(EregistryCodPage.telephoneNo,"99998888");
		//Helper.inputItem(EregistryCodPage.AHPRA,"MED0000938719");
		Helper.inputItem(EregistryCodPage.declaration,"Yes");


		Helper.clickItem(EregistryCodPage.saveButton);


	}

}
