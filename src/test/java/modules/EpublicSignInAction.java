package modules;

import helpers.Helper;

import org.openqa.selenium.WebDriver;
import pageobjects.EpublicLoginPage;

import java.util.HashMap;

public class EpublicSignInAction {

	public static void Execute(WebDriver driver) throws Throwable {

		Helper.inputItem(EpublicLoginPage.username, "a1");
		Helper.inputItem(EpublicLoginPage.password, "password");
		Helper.clickItem(EpublicLoginPage.signin_button);

		// Thread.sleep(3000);
		// ExpectedCondition<Boolean> systemBroadcast =
		// ExpectedConditions.invisibilityOf(EpublicControls.broadcastMessage);
		// if (systemBroadcast != null) {
		// Helper.clickItem(EpublicControls.broadcastOkButton);
		// }
	}
}