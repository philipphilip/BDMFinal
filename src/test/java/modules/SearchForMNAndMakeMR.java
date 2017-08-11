package modules;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.CoreControls;
import pageobjects.MNPage;

public class SearchForMNAndMakeMR {

	public static void Execute(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, MNPage.class);
		WebDriverWait waitForTabsMenue = new WebDriverWait(driver, 10000);
		CoreControls.searchTab = waitForTabsMenue
				.until(ExpectedConditions.elementToBeClickable(CoreControls.searchTab));
		CoreControls.searchTab.click();
		CoreControls.merriageNotificationSearch.click();
		Thread.sleep(1000);
		MNPage.groomsNameFamilyName.sendKeys("automatic" + FillMNForm.groomsFamilyName);
		CoreControls.searchButton.click();
		Thread.sleep(1000);
		MNPage.matchingNotifivation.click();
		Thread.sleep(2000);
		CoreControls.selectRegister();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		boolean marriageRegistrationLink = MNPage.marriageRegLink.getText().contains("Marriage Registration");
		Assert.assertTrue("The Merriage Registration is NOT created", marriageRegistrationLink);

	}
}
