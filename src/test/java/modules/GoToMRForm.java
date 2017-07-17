package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.CoreControls;
import pageobjects.MRPage;

public class GoToMRForm {

	public static void Execute(WebDriver driver, String arg1) throws Exception {
		WebDriverWait waitForTabsMenue = new WebDriverWait(driver, 10000);
		CoreControls.new_tab = waitForTabsMenue.until(ExpectedConditions.elementToBeClickable(CoreControls.new_tab));
		CoreControls.new_tab.click();
		CoreControls.newMR.click();

	}

}
