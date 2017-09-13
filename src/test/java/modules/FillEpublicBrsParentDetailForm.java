package modules;

import helpers.DataHelper;
import helpers.Helper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.EpublicBrsPage;
import pageobjects.EpublicBrsParentDetailPage;
import pageobjects.EpublicControls;
import pageobjects.EregistryCodPage;
import step_definitions.BDMForm;


public class FillEpublicBrsParentDetailForm {

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EpublicBrsParentDetailPage.class);
		//Thread.sleep(3000);
		Helper.inputItem(EpublicBrsPage.parentType,"Mother");

		String brsMotherFamilyName = DataHelper.getRandomStringAs("brsMotherFamilyName",10);
		Helper.inputItem(EpublicBrsPage.familyName,brsMotherFamilyName);

		String brsMotherFamilyNameAtBirth = DataHelper.getRandomStringAs("brsMotherFamilyNameAtBirth",10);
		Helper.inputItem(EpublicBrsPage.familyNameAtBirth,brsMotherFamilyNameAtBirth);

		String brsMotherGivenName = DataHelper.getRandomStringAs("brsMotherGivenName",10);
		Helper.inputItem(EpublicBrsPage.givenName,brsMotherGivenName);

		Helper.inputItem(EpublicBrsPage.birthday,"05/07/1990");
		EpublicBrsPage.birthday.sendKeys(Keys.TAB);

		Helper.inputItem(EpublicBrsPage.suburb,"ringwood");
		Helper.inputItem(EpublicBrsPage.state,"VIC");
		Helper.selectDropDownList( EpublicBrsPage.aboriginal,"Neither Aboriginal or Torres Strait Islander");
		Helper.selectDropDownList( EpublicBrsPage.occupation,"accountant");
		//EpublicBrsParentDetailPage.street.sendKeys("22 statioin st");
		//EpublicBrsParentDetailPage.addressSuburb.sendKeys("ringwood");
		//EpublicBrsParentDetailPage.addressState.sendKeys("VIC");
		//EpublicBrsParentDetailPage.postcode.sendKeys("3555");

		Helper.clickItem(EpublicControls.nextButton);

	}

}
