package modules;

import helpers.Helper;
import helpers.Log;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import pageobjects.AutomationHomePage;

import java.util.concurrent.TimeUnit;

public class SignoutAction {

	public static void Execute(WebDriver driver) throws Throwable {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Helper.clickItem(AutomationHomePage.sign_out);
		Log.info("Sign out is performed");
		Reporter.log("Sign out is performed");
	}
}
