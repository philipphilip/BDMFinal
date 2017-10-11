package modules;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.CoreSearchPage;


public class FillDRSCoreSearchForm {

	public static void Execute(WebDriver driver) throws Throwable {
		
		PageFactory.initElements(driver, CoreSearchPage.class);

		Helper.inputItem(CoreSearchPage.deceasedFamilyName, "Automated" + FillEregistryCodForm.deceasedFamilyName);
		Helper.clickItem(CoreSearchPage.searchButton);
		Helper.clickItem(CoreSearchPage.firstSearchResult);
		
		String drsFamilyName;
		Thread.sleep(3000);
		drsFamilyName = CoreSearchPage.deceasedFamilyNameCheck.getText();
		Assert.assertTrue("result message not found", drsFamilyName.contains("Automated" + FillEregistryCodForm.deceasedFamilyName));
		System.out.println("DRS notification Id " + CoreSearchPage.notificationId.getText() + " found in Core");
		
	}

}
