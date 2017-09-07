package modules;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.CoreBrsPage;
import pageobjects.CoreControls;
import pageobjects.CoreSearchDeathPage;

public class SearchforCreatedDeathCertificate {

	public static void Execute(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, CoreSearchDeathPage.class);

		String theDeceasedNameIs;
		WebDriverWait waitForTabsMenue = new WebDriverWait(driver, 10000);
		CoreControls.searchTab = waitForTabsMenue
				.until(ExpectedConditions.elementToBeClickable(CoreControls.searchTab));
		CoreControls.searchTab.click();
		Thread.sleep(2000);
		CoreControls.deathRegistrationSearch.click();
		CoreSearchDeathPage.deceasedFasmiulyName.sendKeys("automate" + FillCODForm.randDeceasedFamilyName);
		CoreControls.searchButton.click();
		Thread.sleep(2000);
		Boolean nameInSearchResults = CoreSearchDeathPage.deceasedFasmiulyNameInSearchResults.isDisplayed();
		Assert.assertTrue("There are no Search results matching the Death Registration", nameInSearchResults);
		theDeceasedNameIs = CoreSearchDeathPage.deceasedFasmiulyNameInSearchResults.getText();
		Assert.assertTrue("The Birth Registration could not be found in Search for BR",
				theDeceasedNameIs.contains(FillCODForm.randDeceasedFamilyName));
	}
}
