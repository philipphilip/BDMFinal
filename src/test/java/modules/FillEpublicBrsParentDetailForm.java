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
		Thread.sleep(3000);
		EpublicBrsParentDetailPage.parentType.sendKeys("Mother");

		String brsMotherFamilyName = DataHelper.getRandomStringAs("brsMotherFamilyName",10);
		EpublicBrsParentDetailPage.familyName.sendKeys(brsMotherFamilyName);

		String brsMotherFamilyNameAtBirth = DataHelper.getRandomStringAs("brsMotherFamilyNameAtBirth",10);
		EpublicBrsParentDetailPage.familyNameAtBirth.sendKeys(brsMotherFamilyNameAtBirth);

		String brsMotherGivenName = DataHelper.getRandomStringAs("brsMotherGivenName",10);
		EpublicBrsParentDetailPage.givenName.sendKeys(brsMotherGivenName);

		EpublicBrsParentDetailPage.birthday.sendKeys("05/07/1990");
		EpublicBrsParentDetailPage.birthday.sendKeys(Keys.TAB);
		EpublicBrsParentDetailPage.suburb.sendKeys("ringwood");
		EpublicBrsParentDetailPage.state.sendKeys("VIC");
		Helper.selectDropDownList( EpublicBrsParentDetailPage.aboriginal,"Neither Aboriginal or Torres Strait Islander");
		Helper.selectDropDownList( EpublicBrsParentDetailPage.occupation,"accountant");
		//EpublicBrsParentDetailPage.street.sendKeys("22 statioin st");
		//EpublicBrsParentDetailPage.addressSuburb.sendKeys("ringwood");
		//EpublicBrsParentDetailPage.addressState.sendKeys("VIC");
		//EpublicBrsParentDetailPage.postcode.sendKeys("3555");

		EpublicControls.nextButton.click();

	}

}
