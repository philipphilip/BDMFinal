package modules;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.CoreControls;
import pageobjects.CoreSearchDeathPage;

public class SearchforCreatedDeathCertificate {

	public static void Execute(WebDriver driver) throws Throwable {
		PageFactory.initElements(driver, CoreSearchDeathPage.class);

		String theDeceasedNameIs;
		Helper.waitFor(CoreControls.searchTab);
		Helper.clickItem(CoreControls.searchTab);
		Thread.sleep(2000);
		Helper.clickItem(CoreControls.deathRegistrationSearch);
		CoreSearchDeathPage.deceasedFasmiulyName.sendKeys("automate" + FillCODForm.randDeceasedFamilyName);
		Helper.clickItem(CoreControls.searchButton);
		Thread.sleep(2000);
		Boolean nameInSearchResults = CoreSearchDeathPage.deceasedFasmiulyNameInSearchResults.isDisplayed();
		Assert.assertTrue("There are no Search results matching the Death Registration", nameInSearchResults);
		theDeceasedNameIs = CoreSearchDeathPage.deceasedFasmiulyNameInSearchResults.getText();
		Assert.assertTrue("The Birth Registration could not be found in Search for BR",
				theDeceasedNameIs.contains(FillCODForm.randDeceasedFamilyName));
	}
}
