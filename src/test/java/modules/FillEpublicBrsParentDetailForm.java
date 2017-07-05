package modules;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.EpublicBrsChildDetailPage;
import pageobjects.EpublicBrsParentDetailPage;


public class FillEpublicBrsParentDetailForm {

	public static void Execute(WebDriver driver) throws Exception {

		PageFactory.initElements(driver, EpublicBrsParentDetailPage.class);

		EpublicBrsParentDetailPage.parentType.sendKeys("Mother");
		EpublicBrsParentDetailPage.familyName.sendKeys("Citizen");
		EpublicBrsParentDetailPage.familyNameAtBirth.sendKeys("Citizenbirth");
		EpublicBrsParentDetailPage.givenName.sendKeys("Jane");
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

		EpublicBrsChildDetailPage.nextButton.click();

	}

}
