package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.CoreControls;

public class GoToDRSForm {

	public static void Execute(WebDriver driver, String arg1) throws Exception {
		WebDriverWait waitForTabsMenue = new WebDriverWait(driver, 10000);
		CoreControls.newTab = waitForTabsMenue.until(ExpectedConditions.elementToBeClickable(CoreControls.newTab));
		CoreControls.newTab.click();
		CoreControls.newDRS.click();
	}

}
