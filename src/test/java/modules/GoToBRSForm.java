package modules;

import org.openqa.selenium.WebDriver;

import pageobjects.CoreControls;

public class GoToBRSForm {

	public static void Execute(WebDriver driver) throws Throwable {
		CoreControls.clickNewTab();
		CoreControls.birthDropDown.click();
		CoreControls.newBRS.click();

	}

}
