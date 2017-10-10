package modules;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.CoreSearchPage;


public class FillANCoreSearchForm {

	public static void Execute(WebDriver driver) throws Throwable {
		
		PageFactory.initElements(driver, CoreSearchPage.class);
		
		Helper.inputItem(CoreSearchPage.adoptedChildFormerFamilyName, "Automated" + FillEregistryANForm.familyName);
		Helper.clickItem(CoreSearchPage.searchButton);
		Helper.clickItem(CoreSearchPage.firstSearchResult);

		String formerFamilyName;
		Thread.sleep(3000);
		formerFamilyName = CoreSearchPage.searchAdoptionNotifiationFamilyName.getText();
		Assert.assertTrue("result message not found", formerFamilyName.contains("Automated" + FillEregistryANForm.familyName));

		System.out.println("Adoption Notification Id " + CoreSearchPage.notificationId.getText() + " found in Core");
		
	}

}
