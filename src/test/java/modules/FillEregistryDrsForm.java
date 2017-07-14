package modules;

import helpers.DataHelper;
import helpers.Helper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.EpublicBrsChildDetailPage;
import pageobjects.EpublicControls;
import pageobjects.EregistryDrsPage;


public class FillEregistryDrsForm {

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EregistryDrsPage.class);
		//Thread.sleep(3000);

		String drsFamilyName = DataHelper.getRandomStringAs("DrsFamilyName",10);
		Helper.inputItem(EregistryDrsPage.familyName,drsFamilyName);
		String drsGivenName = DataHelper.getRandomStringAs("DrsGivenName",10);
		Helper.inputItem(EregistryDrsPage.givenName,drsGivenName);

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
		Helper.inputItem(EregistryDrsPage.occupation,"accountant");
		Helper.inputItem(EregistryDrsPage.aboriginal,"Neither Aboriginal or Torres Strait Islander");

		Helper.inputItem(EregistryDrsPage.relationship,"Married");
		Helper.inputItem(EregistryDrsPage.relationshipSuburb,"ringwood");
		Helper.inputItem(EregistryDrsPage.relationshipAge,"20");

		Helper.inputItem(EregistryDrsPage.spouseFamilyName,"Smith");
		Helper.inputItem(EregistryDrsPage.spouseGivenName,"Tom");

		Helper.inputItem(EregistryDrsPage.numberPreviousRelationships,"0");
		Helper.inputItem(EregistryDrsPage.numberOfChildren,"0");

		Helper.inputItem(EregistryDrsPage.parent1Type,"Mother");
		Helper.inputItem(EregistryDrsPage.parent1FamilyName,"Maria");
		Helper.inputItem(EregistryDrsPage.parent1GivenName,"Mary");
		Helper.inputItem(EregistryDrsPage.parent1Occupation,"accountant");

		Helper.inputItem(EregistryDrsPage.parent2Type,"Father");
		Helper.inputItem(EregistryDrsPage.parent2FamilyName,"Murry");
		Helper.inputItem(EregistryDrsPage.parent2GivenName,"David");
		Helper.inputItem(EregistryDrsPage.parent2Occupation,"accountant");

		Helper.inputItem(EregistryDrsPage.under18,"Yes");
		Helper.inputItem(EregistryDrsPage.numberSibling,"0");

		Helper.inputItem(EregistryDrsPage.informantRelationship,"FATHER");
		Helper.inputItem(EregistryDrsPage.informantFamilyName,"Murry");
		Helper.inputItem(EregistryDrsPage.informantGivenName,"David");
		Helper.inputItem(EregistryDrsPage.informantLine1,"22 station rd");
		Helper.inputItem(EregistryDrsPage.informantSuburb,"ringwood");
		Helper.inputItem(EregistryDrsPage.informantPostcode,"3333");
		Helper.inputItem(EregistryDrsPage.informantSameasPostalAddress,"Yes");

		Helper.inputItem(EregistryDrsPage.informantTelephone,"99998888");

		Helper.inputItem(EregistryDrsPage.methodOfDisposal,"Buried");
		Helper.inputItem(EregistryDrsPage.disposalDay,"07");
		Helper.inputItem(EregistryDrsPage.disposalMonth,"07");
		Helper.inputItem(EregistryDrsPage.disposalYear,"2017");
		Helper.inputItem(EregistryDrsPage.within30Days,"Yes");

		Helper.inputItem(EregistryDrsPage.cemeteryName,"Melbourne General Cemetery");
		Helper.inputItem(EregistryDrsPage.cemeteryLine1,"122 station rd");
		Helper.inputItem(EregistryDrsPage.cemeterySuburb,"ringwood");
		Helper.inputItem(EregistryDrsPage.cemeteryPostcode,"3333");

		Helper.inputItem(EregistryDrsPage.deathCertifiedBy,"Coroner");
		Helper.inputItem(EregistryDrsPage.coronerSuburb,"ringwood");

		Helper.clickItem(EregistryDrsPage.saveButton);


	}

}
