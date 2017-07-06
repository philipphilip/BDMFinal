package modules;

import helpers.DataHelper;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.EpublicBrsChildDetailPage;
import pageobjects.EpublicBrsParentDetailPage;
import pageobjects.EpublicControls;


public class FillEpublicBrsParentDetailForm {

	public static void Execute(WebDriver driver) throws Exception {

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
		EpublicBrsParentDetailPage.aboriginal.sendKeys("Neither Aboriginal or Torres Strait Islander");
		EpublicBrsParentDetailPage.occupation.sendKeys("accountant");
		//EpublicBrsParentDetailPage.street.sendKeys("22 statioin st");
		//EpublicBrsParentDetailPage.addressSuburb.sendKeys("ringwood");
		//EpublicBrsParentDetailPage.addressState.sendKeys("VIC");
		//EpublicBrsParentDetailPage.postcode.sendKeys("3555");

		EpublicControls.nextButton.click();

	}

}
