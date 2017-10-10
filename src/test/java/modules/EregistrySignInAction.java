package modules;

import helpers.Helper;
import org.openqa.selenium.WebDriver;
import pageobjects.EregistryLoginPage;

public class EregistrySignInAction {

	public static void Execute(WebDriver driver) throws Throwable {

		Helper.inputItem(EregistryLoginPage.username, "eadmin");
		Helper.inputItem(EregistryLoginPage.password, "Friday17");
		EregistryLoginPage.signin_button.click();
	}
}