package modules;

import org.openqa.selenium.WebDriver;

import helpers.Helper;
import pageobjects.EpublicControls;

public class GoToApplicationInePublic {

	public static void Execute(WebDriver driver) throws Throwable {

		EpublicControls.orderCertificates_tab.click();
		Thread.sleep(3000);
		EpublicControls.birthLinkCertificates.click();
		Thread.sleep(3000);
		Helper.clickItem(EpublicControls.i_agree);
	}
}
