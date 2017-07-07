package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.CoreControls;

public class GoToBRSForm {

	public static void Execute(WebDriver driver) throws Exception {
		System.out.println("--------Just before clicking 'New' tab------------");
		WebDriverWait waitForTabsMenue = new WebDriverWait(driver, 10000);
		CoreControls.new_tab = waitForTabsMenue.until(ExpectedConditions.elementToBeClickable(CoreControls.new_tab));
		System.out.println("--------after waiting for 'New' tab to load------------");
		CoreControls.new_tab.click();
		System.out.println("--------after trying to cliock 'New' tab------------");
		CoreControls.BRS_form.click();

	}

}
