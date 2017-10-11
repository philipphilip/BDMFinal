package modules;

import org.openqa.selenium.WebDriver;

import pageobjects.CoreControls;

public class GoToNOBForm {

	public static void Execute(WebDriver driver, String arg1) throws Throwable {
		CoreControls.clickNewTab();
		CoreControls.newNOB.click();

	}
}
