package modules;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;


public class FillBRSCoreSearchForm {

	public static void Execute(WebDriver driver) throws Throwable {
		
		PageFactory.initElements(driver, CoreSearchPage.class);

		Helper.inputItem(CoreSearchPage.brsChildFamilyName, "Automated" + FilltheBRSInEpublic.brsFamilyName);
		Helper.clickItem(CoreSearchPage.searchButton);
		Helper.clickItem(CoreSearchPage.firstSearchResult);
		
		String brsFamilyName;
		Thread.sleep(3000);
		brsFamilyName = CoreSearchPage.brsChildFamilyName.getText();
		Assert.assertTrue("result message not found", brsFamilyName.contains("Automated" + FilltheBRSInEpublic.brsFamilyName));
		System.out.println("Notification Id " + CoreSearchPage.notificationId.getText() + " found in Core");
		
	}

}
