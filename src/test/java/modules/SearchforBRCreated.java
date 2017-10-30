package modules;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import helpers.Helper;
import pageobjects.CoreControls;
import pageobjects.CoreSearchBirthsPage;

public class SearchforBRCreated {

	public static void Execute(WebDriver driver) throws Throwable {
		String nameInSearch;

		Helper.waitFor(CoreControls.searchTab);
		Helper.clickItem(CoreControls.searchTab);
		Thread.sleep(2000);
		Helper.clickItem(CoreControls.birthRegistrationSearch);
		CoreSearchBirthsPage.childFamilyName.sendKeys("Automated" + FillNOBForm.randChildFamilyName);
		Helper.clickItem(CoreControls.searchButton);
		Thread.sleep(5000);
		boolean thereAreSearchResults = CoreSearchBirthsPage.childFamilyNameInSeachResults.isDisplayed();
		Assert.assertTrue("There are no Search results matching the Birth Registration", thereAreSearchResults);
		nameInSearch = CoreSearchBirthsPage.childFamilyNameInSeachResults.getText();
		Thread.sleep(2000);
		Assert.assertTrue("The Birth Registration could not be found in Search for BR",
				nameInSearch.contains(FillNOBForm.randChildFamilyName));
	}
}
