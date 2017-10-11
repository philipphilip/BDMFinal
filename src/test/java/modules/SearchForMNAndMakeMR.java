package modules;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Helper;
import pageobjects.CoreControls;
import pageobjects.MNPage;

public class SearchForMNAndMakeMR {

	public static void Execute(WebDriver driver) throws Throwable {
		PageFactory.initElements(driver, MNPage.class);
		WebDriverWait waitForTabsMenue = new WebDriverWait(driver, 10000);
		CoreControls.searchTab = waitForTabsMenue
				.until(ExpectedConditions.elementToBeClickable(CoreControls.searchTab));
		Helper.clickItem(CoreControls.searchTab);
		Helper.clickItem(CoreControls.merriageRegistrationSearch);
		Thread.sleep(1000);
		MNPage.groomsNameFamilyName.sendKeys("automatic" + FillMNForm.groomsFamilyName);
		Helper.clickItem(CoreControls.searchButton);
		Thread.sleep(1000);
		boolean marriageRegistrationLink = MNPage.marriageRegStatus.getText().contains("Registered");
		Assert.assertTrue("The Merriage Registration is NOT created", marriageRegistrationLink);

	}
}
