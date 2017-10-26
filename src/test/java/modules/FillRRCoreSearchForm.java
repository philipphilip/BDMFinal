package modules;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.CoreSearchPage;


public class FillRRCoreSearchForm {

	public static void Execute(WebDriver driver) throws Throwable {
		
		PageFactory.initElements(driver, CoreSearchPage.class);
		
		Thread.sleep(60000); //One minute wait for the scheduler to run for auto creation of Relationship Registration
		CoreSearchPage.relationshipApplicant1FamilyName.sendKeys("Auto" + FillRNForm.applicant1FamilyName);
		Helper.clickItem(CoreSearchPage.searchButton);
		Helper.clickItem(CoreSearchPage.firstSearchResult);

		String registrationStatus;
		Helper.waitFor(CoreSearchPage.notificationStatus);
		registrationStatus = CoreSearchPage.notificationStatus.getText();
		Assert.assertTrue("result message not found", registrationStatus.contains("Registered"));

		System.out.println("Relationship Registration with the Notification Id " + CoreSearchPage.notificationId.getText() + "has been created");
		
	}

}
