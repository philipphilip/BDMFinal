package modules;

import org.openqa.selenium.WebDriver;

import helpers.Helper;
import pageobjects.EpublicControls;

public class GoToBRSInePublic {

	public static void Execute(WebDriver driver) throws Throwable {

		EpublicControls.registerALifeEvent_tab.click();
		Thread.sleep(2000);
		EpublicControls.birthLink.click();
		Helper.clickItem(EpublicControls.i_agree);
	}
}
