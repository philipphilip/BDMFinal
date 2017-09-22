package modules;

import org.openqa.selenium.WebDriver;

import pageobjects.CoreControls;

public class GoToCODForm {

	public static void Execute(WebDriver driver) throws Exception {
		CoreControls.clickNewTab();
		CoreControls.newCOD.click();
	}

}
