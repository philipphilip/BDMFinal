package modules;

import org.openqa.selenium.WebDriver;

import pageobjects.CoreControls;
;

public class GoToAdoptionForm {

	public static void Execute(WebDriver driver) throws Throwable{
		CoreControls.clickNewTab();
		CoreControls.newAdomtion.click();
	}
}
