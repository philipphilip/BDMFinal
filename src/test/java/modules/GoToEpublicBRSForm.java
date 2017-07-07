package modules;

import org.openqa.selenium.WebDriver;
import pageobjects.EpublicControls;

public class GoToEpublicBRSForm {

	public static void Execute(WebDriver driver) throws Exception {
		System.out.println("--------before waiting for 'briths New' tab to load------------");
		Thread.sleep(8000);
		System.out.println("--------after waiting for 'briths New' tab to load------------");
		EpublicControls.briths_tab.click();
		System.out.println("--------after trying to click 'briths New' tab------------");
		EpublicControls.BRS_form.click();

		EpublicControls.i_agree.click();

	}

}
