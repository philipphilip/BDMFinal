package modules;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.CoreControls;
import pageobjects.CoreSearchPage;


public class SearchAndMakeDrsCompliant {

	public static void Execute(WebDriver driver) throws Throwable {
		
		PageFactory.initElements(driver, CoreSearchPage.class);

		CoreSearchPage.deceasedFamilyName.sendKeys("Automated" + FillEregistryCodForm.deceasedFamilyName);
		Helper.clickItem(CoreSearchPage.searchButton);
		Helper.clickItem(CoreSearchPage.firstSearchResult);
		
		String drsFamilyName;
		Thread.sleep(3000);
		drsFamilyName = CoreSearchPage.deceasedFamilyNameCheck.getText();
		Assert.assertTrue("result message not found", drsFamilyName.contains("Automated" + FillEregistryCodForm.deceasedFamilyName));
		System.out.println("DRS Notification Id " + CoreSearchPage.notificationId.getText() + " found in Core");
		
		String drsStatus;
		Thread.sleep(3000);
		drsStatus = CoreSearchPage.notificationStatus.getText();
		
		Thread.sleep(3000);
		if (drsStatus.contains("Non Compliant")) {
			CoreControls.actionList.sendKeys("Edit");
			Helper.clickItem(CoreControls.go);
			Helper.clickItem(CoreControls.validateButton);
			CoreControls.overrideExceptionsOnform();
		}
		
	}

}
