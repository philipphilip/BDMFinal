package modules;

import helpers.Log;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import pageobjects.AutomationHomePage;

public class SignoutAction {

	public static void Execute(WebDriver driver) throws Exception {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		AutomationHomePage.sign_out.click();
		Log.info("Sign out is performed");
		Reporter.log("Sign out is performed");
	}
}
