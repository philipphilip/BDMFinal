package modules;

import helpers.Helper;
import org.openqa.selenium.WebDriver;

import pageobjects.CoreLoginPage;
import pageobjects.EregistryLoginPage;

import java.util.HashMap;

public class CoreOldUISignInAction {

	public static void Execute(WebDriver driver, HashMap<String, String> map) throws Throwable {

		Helper.inputItem(CoreLoginPage.coreAdminUsername, "admin");
		Helper.inputItem(CoreLoginPage.coreAdminUpassword, "Friday17");
		Helper.clickItem(CoreLoginPage.coreOldUiLoginButton);
	}
}