package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.ApplicationPage;
import pageobjects.CoreControls;

public class GoToApplicationForm {

	public static void Execute(WebDriver driver) throws Exception {

		WebDriverWait waitForTabsMenue = new WebDriverWait(driver, 10000);
		CoreControls.newTab = waitForTabsMenue.until(ExpectedConditions.elementToBeClickable(CoreControls.newTab));
		CoreControls.newTab.click();
		CoreControls.application.click();

	}
}
