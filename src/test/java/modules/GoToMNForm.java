package modules;

import org.openqa.selenium.WebDriver;

import helpers.Helper;
import pageobjects.CoreControls;

public class GoToMNForm {

	public static void Execute(WebDriver driver) throws Throwable {
		CoreControls.clickNewTab();
		Helper.clickItem(CoreControls.marriageDropDown);
		Helper.clickItem(CoreControls.newMR);

	}

}
