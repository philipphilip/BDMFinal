package modules;

import org.openqa.selenium.WebDriver;

import pageobjects.CoreControls;

public class GoToRNForm {

	public static void Execute(WebDriver driver) throws Throwable {
		CoreControls.clickNewTab();
		CoreControls.newRN.click();
	}

}
