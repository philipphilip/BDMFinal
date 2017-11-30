package modules;

import helpers.Helper;
import org.openqa.selenium.WebDriver;

import pageobjects.CoreControls;

public class GoToBRSForm {

	public static void Execute(WebDriver driver) throws Throwable {
		CoreControls.clickNewTab();
		Helper.clickItem(CoreControls.newBirth);
		Helper.clickItem(CoreControls.newBRS);

	}

}
