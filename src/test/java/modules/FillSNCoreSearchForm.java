package modules;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.CoreSearchPage;


public class FillSNCoreSearchForm {

	public static void Execute(WebDriver driver) throws Throwable {
		
		PageFactory.initElements(driver, CoreSearchPage.class);
		
		Helper.waitFor(CoreSearchPage.searchButton);
		CoreSearchPage.preSurrogacyChildFamilyName.sendKeys("Automated" + FillEregistryANForm.familyName);
		Helper.clickItem(CoreSearchPage.searchButton);
		Helper.clickItem(CoreSearchPage.firstSearchResult);

		String formerFamilyName;
		Thread.sleep(3000);
		formerFamilyName = CoreSearchPage.searchSurrogacyNotificationFamilyName.getText();
		Assert.assertTrue("result message not found", formerFamilyName.contains("Automated" + FillEregistryANForm.familyName));

		System.out.println("Surrogacy Notification Id " + CoreSearchPage.notificationId.getText() + " found in Core");
		
	}

}
