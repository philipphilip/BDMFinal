package modules;

import helpers.DataHelper;
import helpers.Helper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.EpublicBrsChildDetailPage;
import pageobjects.EpublicControls;
import pageobjects.EregistryCodPage;
import pageobjects.EregistryDrsPage;
import step_definitions.BDMForm;


public class FillEregistryDrsForm {

	public static void Execute(WebDriver driver) throws Exception {

		PageFactory.initElements(driver, EregistryDrsPage.class);
		Thread.sleep(3000);

		String drsFamilyName = DataHelper.getRandomStringAs("DrsFamilyName",10);
		EregistryDrsPage.familyName.sendKeys(drsFamilyName);
		String drsGivenName = DataHelper.getRandomStringAs("DrsGivenName",10);
		EregistryDrsPage.givenName.sendKeys(drsGivenName);

		Helper.selectDropDownList( EregistryDrsPage.sex,"Female");

		EregistryDrsPage.dateOfDeathType.sendKeys("On");
		EregistryDrsPage.deathDay.sendKeys("07");
		EregistryDrsPage.deathMonth.sendKeys("07");
		EregistryDrsPage.deathYear.sendKeys("2017");

		EregistryDrsPage.dateOfBirthType.sendKeys("On");
		EregistryDrsPage.birthDay.sendKeys("07");
		EregistryDrsPage.birthMonth.sendKeys("07");
		EregistryDrsPage.birthYear.sendKeys("1937");

		EregistryDrsPage.deathWhere.sendKeys("Hospital");
		Helper.selectDropDownList( EregistryDrsPage.hospitalName,"Abel Tasman Village");
		Helper.selectDropDownList( EregistryDrsPage.hospitalTownSuburbCity,"Wollongong");

		EregistryDrsPage.birthSuburb.sendKeys("ringwood");

		EregistryDrsPage.residenceLine1.sendKeys("22 station st");
		EregistryDrsPage.residenceSuburb.sendKeys("ringwood");
		EregistryDrsPage.residencePostcode.sendKeys("3333");

		Helper.selectDropDownList( EregistryDrsPage.occupation,"accountant");
		Helper.selectDropDownList( EregistryDrsPage.aboriginal,"Neither Aboriginal or Torres Strait Islander");

		EregistryDrsPage.relationship.sendKeys("Married");
		EregistryDrsPage.relationshipSuburb.sendKeys("ringwood");
		EregistryDrsPage.relationshipAge.sendKeys("20");

		EregistryDrsPage.spouseFamilyName.sendKeys("Smith");
		EregistryDrsPage.spouseGivenName.sendKeys("Tom");

		EregistryDrsPage.numberPreviousRelationships.sendKeys("0");
		EregistryDrsPage.numberOfChildren.sendKeys("0");

		EregistryDrsPage.parent1Type.sendKeys("Mother");
		EregistryDrsPage.parent1FamilyName.sendKeys("Maria");
		EregistryDrsPage.parent1GivenName.sendKeys("Mary");
		Helper.selectDropDownList( EregistryDrsPage.parent1Occupation,"accountant");

		EregistryDrsPage.parent2Type.sendKeys("Father");
		EregistryDrsPage.parent2FamilyName.sendKeys("Murry");
		EregistryDrsPage.parent2GivenName.sendKeys("David");
		Helper.selectDropDownList( EregistryDrsPage.parent2Occupation,"accountant");

		EregistryDrsPage.under18.sendKeys("Yes");
		EregistryDrsPage.numberSibling.sendKeys("0");

		EregistryDrsPage.informantRelationship.sendKeys("FATHER");
		EregistryDrsPage.informantFamilyName.sendKeys("Murry");
		EregistryDrsPage.informantGivenName.sendKeys("David");
		EregistryDrsPage.informantLine1.sendKeys("22 station rd");
		EregistryDrsPage.informantSuburb.sendKeys("ringwood");
		EregistryDrsPage.informantPostcode.sendKeys("3333");
		EregistryDrsPage.informantSameasPostalAddress.sendKeys("Yes");

		EregistryDrsPage.informantTelephone.sendKeys("99998888");

		EregistryDrsPage.methodOfDisposal.sendKeys("Buried");
		EregistryDrsPage.disposalDay.sendKeys("07");
		EregistryDrsPage.disposalMonth.sendKeys("07");
		EregistryDrsPage.disposalYear.sendKeys("2017");
		EregistryDrsPage.within30Days.sendKeys("Yes");
		Thread.sleep(1000);
		Helper.selectDropDownList( EregistryDrsPage.cemeteryName,"Melbourne General Cemetery");
		EregistryDrsPage.cemeteryLine1.sendKeys("122 station rd");
		EregistryDrsPage.cemeterySuburb.sendKeys("ringwood");
		EregistryDrsPage.cemeteryPostcode.sendKeys("3333");

		EregistryDrsPage.deathCertifiedBy.sendKeys("Coroner");
		EregistryDrsPage.coronerSuburb.sendKeys("ringwood");

		EregistryDrsPage.saveButton.click();


	}

}
