package modules;

import helpers.Helper;

import org.openqa.selenium.WebDriver;
import pageobjects.EpublicLoginPage;

public class EpublicSignInAction {

	public static void Execute(WebDriver driver) throws Throwable {

		Helper.inputItem(EpublicLoginPage.username, "a1");
		Helper.inputItem(EpublicLoginPage.password, "password");
		EpublicLoginPage.signin_button.click();

		// Thread.sleep(3000);
		// ExpectedCondition<Boolean> systemBroadcast =
		// ExpectedConditions.invisibilityOf(EpublicControls.broadcastMessage);
		// if (systemBroadcast != null) {
		// Helper.clickItem(EpublicControls.broadcastOkButton);
		// }
	}
}