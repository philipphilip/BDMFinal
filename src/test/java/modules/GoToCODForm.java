package modules;

import org.openqa.selenium.WebDriver;

import pageobjects.CoreControls;

public class GoToCODForm {

	public static void Execute(WebDriver driver) throws Throwable {
		CoreControls.clickNewTab();
		CoreControls.selectFromDeath.click();
		CoreControls.newCOD.click();
	}

}
