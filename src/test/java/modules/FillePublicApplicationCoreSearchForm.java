package modules;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.CoreSearchPage;


public class FillePublicApplicationCoreSearchForm {

	public static void Execute(WebDriver driver) throws Throwable {
		
		PageFactory.initElements(driver, CoreSearchPage.class);
		Helper.waitFor(CoreSearchPage.applicantFamilyName);
		CoreSearchPage.applicantFamilyName.sendKeys("Automated" + FilltheApplicationInEpublic.familyName);
		Helper.clickItem(CoreSearchPage.searchButton);
		Helper.clickItem(CoreSearchPage.firstSearchResult);
		
		String applicationStatus;
		Helper.waitFor(CoreSearchPage.notificationStatus);
		applicationStatus = CoreSearchPage.notificationStatus.getText();
		Thread.sleep(2000);
		Assert.assertTrue("Application is Non Compliant", applicationStatus.contains("Compliant"));
		System.out.println("Birth Application " + CoreSearchPage.notificationId.getText() + " found in Core");
		
	}

}
