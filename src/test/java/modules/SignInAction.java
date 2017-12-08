package modules;

import org.openqa.selenium.WebDriver;

import helpers.Helper;
import pageobjects.CoreLoginPage;

public class SignInAction {

	public static void Execute(WebDriver driver) throws Throwable {

		CoreLoginPage.username.sendKeys("admin");
		CoreLoginPage.password.sendKeys("Friday17");
//		 CoreLoginPage.username.sendKeys("objectadmin");
//		 CoreLoginPage.password.sendKeys("EipPSZAG0SDXebOW2gd3");

		Helper.clickItem(CoreLoginPage.signin_button);

	}
}