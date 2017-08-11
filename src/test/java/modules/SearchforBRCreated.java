package modules;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.CoreControls;
import pageobjects.CoreSearchBirthsPage;

public class SearchforBRCreated {

	public static void Execute(WebDriver driver) throws Exception {
		String nameInSearch;

		WebDriverWait waitForTabsMenue = new WebDriverWait(driver, 10000);
		CoreControls.searchTab = waitForTabsMenue
				.until(ExpectedConditions.elementToBeClickable(CoreControls.searchTab));
		CoreControls.searchTab.click();
		Thread.sleep(2000);
		CoreControls.birthRegistrationSearch.click();
		CoreSearchBirthsPage.childFamilyName.sendKeys("Automated" + FillBRSForm.randChildFamilyName);
		CoreControls.searchButton.click();
		Thread.sleep(2000);
		boolean thereAreSearchResults = CoreSearchBirthsPage.childFamilyNameInSeachResults.isDisplayed();
		Assert.assertTrue("There are no Search results matching the Birth Registration", thereAreSearchResults);
		nameInSearch = CoreSearchBirthsPage.childFamilyNameInSeachResults.getText();
		Thread.sleep(2000);
		Assert.assertTrue("The Birth Registration could not be found in Search for BR",
				nameInSearch.contains(FillBRSForm.randChildFamilyName));
	}
}
