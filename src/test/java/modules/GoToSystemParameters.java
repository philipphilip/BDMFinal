package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.CoreControls;

public class GoToSystemParameters {

	public static void Execute(WebDriver driver) throws Throwable {

		WebDriverWait waitForTabsMenue = new WebDriverWait(driver, 10000);
		CoreControls.oldUiGeneralAdminTab = waitForTabsMenue.until(ExpectedConditions.elementToBeClickable(CoreControls.oldUiGeneralAdminTab));
		CoreControls.oldUiGeneralAdminTab.click();
		CoreControls.oldUiSystemParametersTab.click();
	}
}
