package modules;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.CoreControls;
import pageobjects.CoreSearchPage;


public class SearchAndMakeCodCompliant {

	public static void Execute(WebDriver driver) throws Throwable {
		
		PageFactory.initElements(driver, CoreSearchPage.class);

		CoreSearchPage.deceasedFamilyNameCod.sendKeys("Automated"  + FillEregistryCodForm.deceasedFamilyName);
		Helper.clickItem(CoreSearchPage.searchButton);
		Helper.clickItem(CoreSearchPage.firstSearchResult);
		
		String codFamilyName;
		Thread.sleep(3000);
		codFamilyName = CoreSearchPage.deceasedFamilyNameCheck.getText();
		Assert.assertTrue("result message not found", codFamilyName.contains("Automated" + FillEregistryCodForm.deceasedFamilyName));

		System.out.println("COD Notification Id " + CoreSearchPage.notificationId.getText() + " found in Core");
		
		String codStatus;
		Thread.sleep(3000);
		codStatus = CoreSearchPage.notificationStatus.getText();
		
		Thread.sleep(3000);
		if (codStatus.contains("Non Compliant")) {
			CoreControls.actionList.sendKeys("Edit");
			Helper.clickItem(CoreControls.go);
			Helper.clickItem(CoreControls.validateButton);
			CoreControls.overrideExceptionsOnform();
			Thread.sleep(3000);
		}
	}

}
