package modules;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.EpublicBrsInformant1DetailPage;
import pageobjects.EpublicControls;


public class FillEpublicBrsInformant1DetailForm {

	public static void Execute(WebDriver driver) throws Exception {

		PageFactory.initElements(driver, EpublicBrsInformant1DetailPage.class);
		Thread.sleep(3000);
		EpublicBrsInformant1DetailPage.relationship.sendKeys("Parent");
		Thread.sleep(1000);

		EpublicBrsInformant1DetailPage.familyName.sendKeys("Smith");
		EpublicBrsInformant1DetailPage.givenName.sendKeys("Tom");
		EpublicBrsInformant1DetailPage.dateOfBirth.sendKeys("02/02/1980");
		EpublicBrsInformant1DetailPage.dateOfBirth.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		EpublicBrsInformant1DetailPage.street.sendKeys("22 station rd");
		EpublicBrsInformant1DetailPage.suburb.sendKeys("ringwood");
		EpublicBrsInformant1DetailPage.postcode.sendKeys("3333");

		EpublicBrsInformant1DetailPage.SameAsResidentialAddress.click();

		EpublicBrsInformant1DetailPage.email.sendKeys("my@email.com");

		Thread.sleep(1000);
		EpublicControls.nextButton.click();

	}

}
