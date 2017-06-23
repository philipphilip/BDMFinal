package modules;

import helpers.Log;
import java.util.HashMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import pageobjects.LoginPage;

public class SignInAction {

	public static void Execute(WebDriver driver, HashMap<String, String> map) throws Exception {

		LoginPage.username.sendKeys("admin");
		LoginPage.password.sendKeys("a");
		LoginPage.signin_button.click();

		Log.info(" is entered in UserName text box");
		Log.info(" is entered in Password text box");
		Reporter.log("SignIn Action is successfully perfomred");
	}
}