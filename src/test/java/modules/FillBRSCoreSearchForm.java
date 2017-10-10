package modules;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.CoreSearchPage;


public class FillBRSCoreSearchForm {

	public static void Execute(WebDriver driver) throws Throwable {
		
		PageFactory.initElements(driver, CoreSearchPage.class);

		Helper.inputItem(CoreSearchPage.subjectFamilyName, "Automated" + FilltheBRSInEpublic.brsFamilyName);
		CoreSearchPage.searchButton.click();
		CoreSearchPage.firstSearchResult.click();
		
		String brsFamilyName;
		Thread.sleep(3000);
		brsFamilyName = CoreSearchPage.notificationStatus.getText();
		Assert.assertTrue("Status of BRS found in Core is incorrect", brsFamilyName.contains("Pending"));
		System.out.println("BRS notification Id " + CoreSearchPage.notificationId.getText() + " found in Core");
		
	}

}
