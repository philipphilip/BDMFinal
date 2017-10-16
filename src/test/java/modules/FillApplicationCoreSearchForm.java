package modules;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.CoreSearchPage;

public class FillApplicationCoreSearchForm {

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, CoreSearchPage.class);

		CoreSearchPage.itemNumber.sendKeys(
				FillEregistryCertificatesForm.certificateNotificationNumber.substring(0, 4));
		System.out
				.println("Item Id is: " + FillEregistryCertificatesForm.certificateNotificationNumber.substring(0, 4));
		CoreSearchPage.itemYear.sendKeys("2017");
		Helper.clickItem(CoreSearchPage.searchButton);
		Helper.clickItem(CoreSearchPage.firstIdSearchResult);

		String applicationStatus;
		Thread.sleep(3000);
		applicationStatus = CoreSearchPage.notificationStatus.getText();
		Assert.assertTrue("Application is Non Compliant", applicationStatus.equals("Compliant"));
		System.out.println("Death Application " + CoreSearchPage.notificationId.getText() + " found in Core");
	}

}
