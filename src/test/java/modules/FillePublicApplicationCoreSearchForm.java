package modules;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.CoreSearchPage;


public class FillePublicApplicationCoreSearchForm {

	public static void Execute(WebDriver driver) throws Throwable {
		
		PageFactory.initElements(driver, CoreSearchPage.class);

		Helper.inputItem(CoreSearchPage.applicantFamilyName, "Automated" + FilltheApplicationInEpublic.familyName);
		Helper.clickItem(CoreSearchPage.searchButton);
		Helper.clickItem(CoreSearchPage.firstSearchResult);
		
		String applicationStatus;
		Thread.sleep(3000);
		applicationStatus = CoreSearchPage.notificationStatus.getText();
		Assert.assertTrue("Application is Non Compliant", applicationStatus.equals("Compliant"));
		System.out.println("Birth Application " + CoreSearchPage.notificationId.getText() + " found in Core");
		
	}

}
