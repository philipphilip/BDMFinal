package modules;

import helpers.Helper;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.EregistryControls;
import pageobjects.EregistryDrsPage;


public class FillEregistryDrsForm {
	
	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EregistryDrsPage.class);

		Helper.inputItem(EregistryDrsPage.familyName,"Automated" + FillEregistryCodForm.deceasedFamilyName);
		Helper.inputItem(EregistryDrsPage.familyNameAtBirth,"Automated" + FillEregistryCodForm.deceasedFamilyName);
		Helper.inputItem(EregistryDrsPage.givenName,"Automated" + FillEregistryCodForm.deceasedGivenName);
		Helper.inputItem(EregistryDrsPage.sex,"Female");
		Helper.inputItem(EregistryDrsPage.dateOfDeathType,"On");
		Helper.inputItem(EregistryDrsPage.deathDay,"07");
		Helper.inputItem(EregistryDrsPage.deathMonth,"07");
		Helper.inputItem(EregistryDrsPage.deathYear,"2017");
		Helper.inputItem(EregistryDrsPage.dateOfBirthType,"On");
		Helper.inputItem(EregistryDrsPage.birthDay,"07");
		Helper.inputItem(EregistryDrsPage.birthMonth,"07");
		Helper.inputItem(EregistryDrsPage.birthYear,"1937");
		Helper.inputItem(EregistryDrsPage.deathWhere,"Hospital");
		Helper.inputItem(EregistryDrsPage.hospitalName,"Abel Tasman Village");
		Helper.inputItem(EregistryDrsPage.hospitalTownSuburbCity,"Wollongong");
		Helper.inputItem(EregistryDrsPage.birthSuburb,"ringwood");
		Helper.inputItem(EregistryDrsPage.residenceLine1,"22 station st");
		Helper.inputItem(EregistryDrsPage.residenceSuburb,"ringwood");
		Helper.inputItem(EregistryDrsPage.residencePostcode,"3333");
		Helper.inputItem(EregistryDrsPage.occupation,"Bank Officer");
		Helper.inputItem(EregistryDrsPage.aboriginal,"Neither Aboriginal or Torres Strait Islander");
		Helper.inputItem(EregistryDrsPage.relationship,"Married");
		Helper.inputItem(EregistryDrsPage.relationshipSuburb,"ringwood");
		Helper.inputItem(EregistryDrsPage.relationshipAge,"20");
		Helper.inputItem(EregistryDrsPage.spouseFamilyName,"Smith");
		Helper.inputItem(EregistryDrsPage.spouseGivenName,"Tom");
		Helper.inputItem(EregistryDrsPage.numberPreviousRelationships,"0");
		Helper.inputItem(EregistryDrsPage.numberOfChildren,"0");
		Helper.inputItem(EregistryDrsPage.parent1Type,"Mother");
		Helper.inputItem(EregistryDrsPage.parent1FamilyName,"Automated" + FillEregistryCodForm.deceasedFamilyName);
		Helper.inputItem(EregistryDrsPage.parent1FamilyNameAtBirth,"Automated" + FillEregistryCodForm.deceasedFamilyName);
		Helper.inputItem(EregistryDrsPage.parent1GivenName,"Automated" + FillEregistryCodForm.motherGivenName);
		Helper.inputItem(EregistryDrsPage.parent1Occupation,"accountant");
		Helper.inputItem(EregistryDrsPage.parent2Type,"Father");
		Helper.inputItem(EregistryDrsPage.parent2FamilyName,"Automated" + FillEregistryCodForm.deceasedFamilyName);
		Helper.inputItem(EregistryDrsPage.parent2FamilyNameAtBirth,"Automated" + FillEregistryCodForm.deceasedFamilyName);
		Helper.inputItem(EregistryDrsPage.parent2GivenName,"Automated" + FillEregistryCodForm.motherGivenName);
		Helper.inputItem(EregistryDrsPage.parent2Occupation,"accountant");
		Helper.inputItem(EregistryDrsPage.under18,"No");
		Helper.inputItem(EregistryDrsPage.numberSibling,"0");
		Helper.inputItem(EregistryDrsPage.informantRelationship,"Sibling");
				Helper.inputItem(EregistryDrsPage.informantFamilyName,"Automated" + FillEregistryCodForm.deceasedFamilyName);
		Helper.inputItem(EregistryDrsPage.informantGivenName,"David");
		Helper.inputItem(EregistryDrsPage.informantLine1,"22 station rd");
		Helper.inputItem(EregistryDrsPage.informantSuburb,"ringwood");
		Helper.inputItem(EregistryDrsPage.informantPostcode,"3333");
		Helper.inputItem(EregistryDrsPage.informantSameasPostalAddress,"Yes");
		Helper.inputItem(EregistryDrsPage.informantTelephone,"99998888");
		Thread.sleep(3000);
		Helper.inputItem(EregistryDrsPage.methodOfDisposal,"Buried");
		Thread.sleep(3000);
		Helper.inputItem(EregistryDrsPage.disposalDay,"08");
		Helper.inputItem(EregistryDrsPage.disposalMonth,"07");
		Helper.inputItem(EregistryDrsPage.disposalYear,"2017");
		Thread.sleep(3000);
		Helper.inputItem(EregistryDrsPage.methodOfDisposal, "Buried");
		Helper.inputItem(EregistryDrsPage.within30Days,"Yes");
		Helper.inputItem(EregistryDrsPage.cemeteryName,"Melbourne General Cemetery");
		Helper.inputItem(EregistryDrsPage.cemeteryLine1,"122 station rd");
		Helper.inputItem(EregistryDrsPage.cemeterySuburb,"ringwood");
		Helper.inputItem(EregistryDrsPage.cemeteryPostcode,"3333");
		Helper.inputItem(EregistryDrsPage.deathCertifiedBy,"Coroner");
		Helper.inputItem(EregistryDrsPage.coronerSuburb,"ringwood");
		Helper.clickItem(EregistryControls.saveButton);
		String drsSavedMessage;
		Thread.sleep(3000);
		drsSavedMessage = EregistryControls.drsMessage.getText();
		Assert.assertTrue("result message not found", drsSavedMessage.contains("This Death Registration Statement has been successfully saved"));
		Helper.clickItem(EregistryControls.deathsLink);
		Helper.clickItem(EregistryControls.draftList);
		Helper.inputItem(EregistryControls.drsSearchFamilyName, "Automated" + FillEregistryCodForm.deceasedFamilyName);
		Helper.clickItem(EregistryControls.refreshButton);
		Helper.clickItem(EregistryControls.searchResult1);
		Helper.clickItem(EregistryControls.submitButton);
		Helper.clickItem(EregistryControls.submitButton);
		String drsSubmissionMessage;
		Thread.sleep(3000);
		drsSubmissionMessage = EregistryControls.submitResultMessage.getText();
		Assert.assertTrue("result message not found", drsSubmissionMessage.contains("Successfully submitted notifications"));

	}

}
