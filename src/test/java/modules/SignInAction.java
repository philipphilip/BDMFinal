package modules;

import helpers.Log;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import pageobjects.LoginPage;

import java.util.HashMap;

public class SignInAction {

	public static void Execute(WebDriver driver, HashMap<String, String> map) throws Exception {

		// LoginPage.username.sendKeys("admin");
		// LoginPage.password.sendKeys("Friday17");
		LoginPage.username.sendKeys("objectadmin");
		LoginPage.password.sendKeys("EipPSZAG0SDXebOW2gd3");
		LoginPage.signin_button.click();

		Log.info(" is entered in UserName text box");
		Log.info(" is entered in Password text box");
		Reporter.log("SignIn Action is successfully perfomred");
	}
}