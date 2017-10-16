package modules;

import org.openqa.selenium.WebDriver;

import pageobjects.CoreLoginPage;

public class CoreOldUISignInAction {

	public static void Execute(WebDriver driver) throws Throwable {

		CoreLoginPage.coreAdminUsername.sendKeys("admin");
		CoreLoginPage.coreAdminUpassword.sendKeys("Friday17");
		CoreLoginPage.coreOldUiLoginButton.click();
	}
}