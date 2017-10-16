package modules;

import org.openqa.selenium.WebDriver;

import pageobjects.EpublicLoginPage;

public class EpublicSignInAction {

	public static void Execute(WebDriver driver) throws Throwable {

		EpublicLoginPage.username.sendKeys("a1");
		EpublicLoginPage.password.sendKeys("password");
		EpublicLoginPage.signin_button.click();

		// Thread.sleep(3000);
		// ExpectedCondition<Boolean> systemBroadcast =
		// ExpectedConditions.invisibilityOf(EpublicControls.broadcastMessage);
		// if (systemBroadcast != null) {
		// Helper.clickItem(EpublicControls.broadcastOkButton);
		// }
	}
}