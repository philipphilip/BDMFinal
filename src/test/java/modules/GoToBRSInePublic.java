package modules;

import org.openqa.selenium.WebDriver;

import helpers.Helper;
import pageobjects.EpublicControls;

public class GoToBRSInePublic {

	public static void Execute(WebDriver driver) throws Throwable {

		Helper.clickItem(EpublicControls.registerALifeEvent_tab);
		Thread.sleep(3000);
		EpublicControls.birthLink.click();
		Thread.sleep(3000);
//		Helper.clickItem(EpublicControls.i_agree);
		Thread.sleep(7000);
		EpublicControls.i_agree.click();
	}
}
