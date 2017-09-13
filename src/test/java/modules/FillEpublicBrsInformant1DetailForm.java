package modules;

import helpers.Helper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.EpublicBrsInformant1DetailPage;
import pageobjects.EpublicBrsPage;
import pageobjects.EpublicControls;


public class FillEpublicBrsInformant1DetailForm {

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EpublicBrsInformant1DetailPage.class);
		//Thread.sleep(3000);
		Helper.inputItem(EpublicBrsPage.informantRelationship,"Parent");
		//Thread.sleep(1000);

		Helper.inputItem(EpublicBrsPage.informantFamilyName,"Smith");
		Helper.inputItem(EpublicBrsPage.informantGivenName,"Tom");
		Helper.inputItem(EpublicBrsPage.informantDateOfBirth,"02/02/1980");
		EpublicBrsPage.informantDateOfBirth.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		Helper.inputItem(EpublicBrsPage.informantAddressLine1,"22 station rd");
		Helper.inputItem(EpublicBrsPage.informantAddressSuburb,"ringwood");
		Helper.inputItem(EpublicBrsPage.informantAddressPostcode,"3333");

		Helper.clickItem(EpublicBrsPage.SameAsResidentialAddress);

		Helper.inputItem(EpublicBrsPage.informantContactEmail,"my@email.com");

		//Thread.sleep(1000);
		Helper.clickItem(EpublicControls.nextButton);

	}

}
