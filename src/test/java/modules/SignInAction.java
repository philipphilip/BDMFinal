package modules;

import helpers.Log;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import pageobjects.CoreLoginPage;

import java.util.HashMap;

public class SignInAction {

	public static void Execute(WebDriver driver, HashMap<String, String> map) throws Exception {

		CoreLoginPage.username.sendKeys("admin");
		CoreLoginPage.password.sendKeys("Friday17");
		// CoreLoginPage.username.sendKeys("objectadmin");
		// CoreLoginPage.password.sendKeys("EipPSZAG0SDXebOW2gd3");

		CoreLoginPage.signin_button.click();

	}
}