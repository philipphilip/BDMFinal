package modules;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.EregistryControls;
import pageobjects.EregistryDrsPage;

public class FillEregistryDrsForm {

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EregistryDrsPage.class);

		Helper.waitFor(EregistryDrsPage.familyName);
		EregistryDrsPage.familyName.clear();
		EregistryDrsPage.familyName.sendKeys("Automated" + FillEregistryCodForm.deceasedFamilyName);
		Helper.selectDropDownList(EregistryDrsPage.familyNameSameAsBirth, "Yes");
		EregistryDrsPage.givenName.sendKeys("Automated" + FillEregistryCodForm.deceasedGivenName);
		EregistryDrsPage.sex.sendKeys("Female");
		EregistryDrsPage.dateOfDeathType.sendKeys("On");
		EregistryDrsPage.deathDay.sendKeys("07");
		EregistryDrsPage.deathMonth.sendKeys("07");
		EregistryDrsPage.deathYear.sendKeys("2017");
		EregistryDrsPage.dateOfBirthType.sendKeys("On");
		EregistryDrsPage.birthDay.sendKeys("07");
		EregistryDrsPage.birthMonth.sendKeys("07");
		EregistryDrsPage.birthYear.sendKeys("1937");
		EregistryDrsPage.deathWhere.sendKeys("Hospital");
		EregistryDrsPage.hospitalName.sendKeys("Acute Centre Beechworth");
		EregistryDrsPage.hospitalTownSuburbCity.sendKeys("BEECHWORTH");
		EregistryDrsPage.birthSuburb.sendKeys("ringwood");
		EregistryDrsPage.residenceLine1.sendKeys("22 station st");
		EregistryDrsPage.residenceSuburb.sendKeys("ringwood");
		EregistryDrsPage.residencePostcode.sendKeys("3333");
		EregistryDrsPage.occupation.sendKeys("Bank Officer");
		EregistryDrsPage.aboriginal.sendKeys("Neither Aboriginal or Torres Strait Islander");
		EregistryDrsPage.relationship.sendKeys("Married");
		EregistryDrsPage.relationshipSuburb.sendKeys("ringwood");
		EregistryDrsPage.relationshipAge.sendKeys("20");
		EregistryDrsPage.spouseFamilyName.clear();
		EregistryDrsPage.spouseFamilyName.sendKeys("Smith");
		EregistryDrsPage.spouseGivenName.sendKeys("Tom");
		Helper.selectDropDownList(EregistryDrsPage.relationshipPartnersSex, "Female");
		EregistryDrsPage.numberPreviousRelationships.sendKeys("0");
		EregistryDrsPage.numberOfChildren.sendKeys("0");
		EregistryDrsPage.parent1Type.sendKeys("Mother");
		EregistryDrsPage.parent1FamilyName.clear();
		EregistryDrsPage.parent1FamilyName.sendKeys("Automated" + FillEregistryCodForm.deceasedFamilyName);
		Helper.selectDropDownList(EregistryDrsPage.parent1FamilyNameSameAsBirth, "Yes");
		EregistryDrsPage.parent1GivenName.sendKeys("Automated" + FillEregistryCodForm.motherGivenName);
		EregistryDrsPage.parent1Occupation.sendKeys("accountant");
		EregistryDrsPage.parent2Type.sendKeys("Father");
		EregistryDrsPage.parent2FamilyName.clear();
		EregistryDrsPage.parent2FamilyName.sendKeys("Automated" + FillEregistryCodForm.deceasedFamilyName);
		Helper.selectDropDownList(EregistryDrsPage.parent2FamilyNameSameAsBirth, "Yes");
		EregistryDrsPage.parent2GivenName.sendKeys("Automated" + FillEregistryCodForm.motherGivenName);
		EregistryDrsPage.parent2Occupation.sendKeys("accountant");
		EregistryDrsPage.under18.sendKeys("No");
		EregistryDrsPage.numberSibling.sendKeys("0");
		EregistryDrsPage.informantRelationship.sendKeys("Sibling");
		EregistryDrsPage.informantFamilyName.clear();
		EregistryDrsPage.informantFamilyName.sendKeys("Automated" + FillEregistryCodForm.deceasedFamilyName);
		EregistryDrsPage.informantGivenName.sendKeys("David");
		EregistryDrsPage.informantLine1.sendKeys("22 station rd");
		EregistryDrsPage.informantSuburb.sendKeys("ringwood");
		EregistryDrsPage.informantPostcode.sendKeys("3333");
		EregistryDrsPage.informantSameasPostalAddress.sendKeys("Yes");
		EregistryDrsPage.informantTelephone.sendKeys("99998888");
		Thread.sleep(3000);
		EregistryDrsPage.methodOfDisposal.sendKeys("Buried");
		Thread.sleep(3000);
		EregistryDrsPage.disposalDay.sendKeys("08");
		EregistryDrsPage.disposalMonth.sendKeys("07");
		EregistryDrsPage.disposalYear.sendKeys("2017");
		Thread.sleep(3000);
		EregistryDrsPage.methodOfDisposal.sendKeys("Buried");
		EregistryDrsPage.within30Days.sendKeys("Yes");
		EregistryDrsPage.cemeteryName.sendKeys("Melbourne General Cemetery");
		EregistryDrsPage.cemeteryLine1.sendKeys("122 station rd");
		EregistryDrsPage.cemeterySuburb.sendKeys("ringwood");
		EregistryDrsPage.cemeteryPostcode.sendKeys("3333");
		EregistryDrsPage.deathCertifiedBy.sendKeys("Coroner");
		EregistryDrsPage.coronerSuburb.sendKeys("ringwood");
		Helper.clickItem(EregistryControls.saveButton);

		Helper.waitFor(EregistryControls.drsMessage);
		String drsSavedMessage;
		Thread.sleep(3000);
		drsSavedMessage = EregistryControls.drsMessage.getText();
		Assert.assertTrue("result message not found",
				drsSavedMessage.contains("This Death Registration Statement has been successfully saved"));
		EregistryControls.deathsLink.click();
		EregistryControls.draftList.click();
		EregistryControls.drsSearchFamilyName.sendKeys("Automated" + FillEregistryCodForm.deceasedFamilyName);

		EregistryControls.refreshButton.click();
		Helper.clickItem(EregistryControls.searchResult1);
		Helper.clickItem(EregistryControls.submitButton);
		Helper.clickItem(EregistryControls.submitButton);
		EregistryControls.assertAll();
	}

}
