package modules;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.CoreSearchPage;


public class FillDRCoreSearchForm {

	public static void Execute(WebDriver driver) throws Throwable {
		
		PageFactory.initElements(driver, CoreSearchPage.class);
		
		Helper.waitFor(CoreSearchPage.searchButton);
		CoreSearchPage.deceasedFamilyName.sendKeys("Automated"  + FillEregistryCodForm.deceasedFamilyName);
		Helper.clickItem(CoreSearchPage.searchButton);
		Helper.clickItem(CoreSearchPage.firstSearchResult);
		
		String drStatus;
		Thread.sleep(3000);
		drStatus = CoreSearchPage.notificationStatus.getText();
		Assert.assertTrue("DR has not been created with status 'Registered'", drStatus.contains("Registered"));

		System.out.println("DR notification Id " + CoreSearchPage.notificationId.getText() + " found in Core");
		
	}

}
