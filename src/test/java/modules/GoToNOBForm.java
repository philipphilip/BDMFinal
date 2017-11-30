package modules;

import helpers.Helper;
import org.openqa.selenium.WebDriver;

import pageobjects.CoreControls;

public class GoToNOBForm {

	public static void Execute(WebDriver driver, String arg1) throws Throwable {
		CoreControls.clickNewTab();
		Helper.clickItem(CoreControls.newBirth);
		Helper.clickItem(CoreControls.newNOB);


	}
}
