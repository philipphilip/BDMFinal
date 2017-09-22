package modules;

import org.openqa.selenium.WebDriver;
import pageobjects.CoreControls;

public class GoToDRSForm {

	public static void Execute(WebDriver driver, String arg1) throws Exception {
		CoreControls.clickNewTab();
		CoreControls.newDRS.click();
	}

}
