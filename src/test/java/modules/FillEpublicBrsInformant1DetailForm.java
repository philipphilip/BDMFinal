package modules;

import helpers.Helper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.EpublicBrsInformant1DetailPage;
import pageobjects.EpublicControls;


public class FillEpublicBrsInformant1DetailForm {

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EpublicBrsInformant1DetailPage.class);
		//Thread.sleep(3000);
		Helper.inputItem(EpublicBrsInformant1DetailPage.relationship,"Parent");
		//Thread.sleep(1000);

		Helper.inputItem(EpublicBrsInformant1DetailPage.familyName,"Smith");
		Helper.inputItem(EpublicBrsInformant1DetailPage.givenName,"Tom");
		Helper.inputItem(EpublicBrsInformant1DetailPage.dateOfBirth,"02/02/1980");
		EpublicBrsInformant1DetailPage.dateOfBirth.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		Helper.inputItem(EpublicBrsInformant1DetailPage.street,"22 station rd");
		Helper.inputItem(EpublicBrsInformant1DetailPage.suburb,"ringwood");
		Helper.inputItem(EpublicBrsInformant1DetailPage.postcode,"3333");

		Helper.clickItem(EpublicBrsInformant1DetailPage.SameAsResidentialAddress);

		Helper.inputItem(EpublicBrsInformant1DetailPage.email,"my@email.com");

		//Thread.sleep(1000);
		Helper.clickItem(EpublicControls.nextButton);

	}

}
