package modules;

import org.openqa.selenium.WebDriver;

import helpers.Helper;
import pageobjects.CoreControls;

public class GoToSystemParameters {

	public static void Execute(WebDriver driver) throws Throwable {

		Helper.waitFor(CoreControls.oldUiGeneralAdminTab);
		CoreControls.oldUiGeneralAdminTab.click();
		CoreControls.oldUiSystemParametersTab.click();
	}
}
