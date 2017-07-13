package modules;

import helpers.DataHelper;
import helpers.Helper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.EpublicBrsParentDetailPage;
import pageobjects.EpublicControls;
import pageobjects.EregistryCodPage;
import step_definitions.BDMForm;


public class FillEpublicBrsParentDetailForm {

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EpublicBrsParentDetailPage.class);
		//Thread.sleep(3000);
		Helper.inputItem(EpublicBrsParentDetailPage.parentType,"Mother");

		String brsMotherFamilyName = DataHelper.getRandomStringAs("brsMotherFamilyName",10);
		Helper.inputItem(EpublicBrsParentDetailPage.familyName,brsMotherFamilyName);

		String brsMotherFamilyNameAtBirth = DataHelper.getRandomStringAs("brsMotherFamilyNameAtBirth",10);
		Helper.inputItem(EpublicBrsParentDetailPage.familyNameAtBirth,brsMotherFamilyNameAtBirth);

		String brsMotherGivenName = DataHelper.getRandomStringAs("brsMotherGivenName",10);
		Helper.inputItem(EpublicBrsParentDetailPage.givenName,brsMotherGivenName);

		Helper.inputItem(EpublicBrsParentDetailPage.birthday,"05/07/1990");
		EpublicBrsParentDetailPage.birthday.sendKeys(Keys.TAB);

		Helper.inputItem(EpublicBrsParentDetailPage.suburb,"ringwood");
		Helper.inputItem(EpublicBrsParentDetailPage.state,"VIC");
		Helper.selectDropDownList( EpublicBrsParentDetailPage.aboriginal,"Neither Aboriginal or Torres Strait Islander");
		Helper.selectDropDownList( EpublicBrsParentDetailPage.occupation,"accountant");
		//EpublicBrsParentDetailPage.street.sendKeys("22 statioin st");
		//EpublicBrsParentDetailPage.addressSuburb.sendKeys("ringwood");
		//EpublicBrsParentDetailPage.addressState.sendKeys("VIC");
		//EpublicBrsParentDetailPage.postcode.sendKeys("3555");

		Helper.clickItem(EpublicControls.nextButton);

	}

}
