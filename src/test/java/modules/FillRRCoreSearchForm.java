package modules;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;


public class FillRRCoreSearchForm {

	public static void Execute(WebDriver driver) throws Throwable {
		
		PageFactory.initElements(driver, CoreSearchPage.class);
		
		Helper.inputItem(CoreSearchPage.relationshipApplicant1FamilyName, "Auto" + FillRNForm.applicant1FamilyName);
		Helper.clickItem(CoreSearchPage.searchButton);
		Helper.clickItem(CoreSearchPage.firstSearchResult);

		String registrationStatus;
		Thread.sleep(3000);
		registrationStatus = CoreSearchPage.notificationStatus.getText();
		Assert.assertTrue("result message not found", registrationStatus.contains("Registered"));

		System.out.println("Relationship Registration with the Notification Id " + CoreSearchPage.notificationId.getText() + "has been created");
		
	}

}
