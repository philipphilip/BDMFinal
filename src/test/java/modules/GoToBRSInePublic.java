package modules;

import org.openqa.selenium.WebDriver;

import helpers.Helper;
import pageobjects.EpublicControls;

public class GoToBRSInePublic {

	public static void Execute(WebDriver driver) throws Throwable {
		// System.out.println("--------I am in the condition of running
		// the BRS");
		// System.out.println("--------after waiting for 'briths New' tab to
		// load------------");
		Helper.clickItem(EpublicControls.briths_tab);
		System.out.println("--------after trying to click 'briths New' tab------------");
		Helper.clickItem(EpublicControls.BRS_form);
		Helper.clickItem(EpublicControls.i_agree);
	}

}
