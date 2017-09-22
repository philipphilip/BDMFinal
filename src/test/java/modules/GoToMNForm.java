package modules;

import org.openqa.selenium.WebDriver;

import pageobjects.CoreControls;

public class GoToMNForm {

	public static void Execute(WebDriver driver) throws Exception {
		CoreControls.clickNewTab();
		CoreControls.newMR.click();

	}

}
