package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.CoreCOSPage;
import pageobjects.CoreControls;

public class GoToCOSForm {

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, CoreCOSPage.class);
		CoreControls.clickNewTab();
		CoreCOSPage.ChangeOfSexNotification.click();
	}
}
