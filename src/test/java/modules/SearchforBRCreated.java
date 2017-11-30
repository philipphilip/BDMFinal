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
		Helper.clickItem(CoreControls.birthDropDownInSearch);
		Helper.clickItem(CoreControls.birthRegistrationSearch);
		Helper.waitFor(CoreSearchBirthsPage.childFamilyName);
		CoreSearchBirthsPage.childFamilyName.sendKeys("Automated" + FillNOBForm.randChildFamilyName);
		Helper.clickItem(CoreControls.searchButton);
		Thread.sleep(3000);
		boolean thereAreSearchResults = CoreSearchBirthsPage.childFamilyNameInSeachResults.isDisplayed();
		Assert.assertTrue("There are no Search results matching the Birth Registration", thereAreSearchResults);
		nameInSearch = CoreSearchBirthsPage.childFamilyNameInSeachResults.getText();
		Assert.assertTrue("The Birth Registration could not be found in Search for BR",
				nameInSearch.contains(FillNOBForm.randChildFamilyName));
	}
}