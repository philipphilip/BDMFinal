package modules;

import org.openqa.selenium.WebDriver;

import helpers.Helper;
import pageobjects.EpublicControls;

public class GoToApplicationInePublic {

	public static void Execute(WebDriver driver) throws Throwable {

		Helper.clickItem(EpublicControls.orderCertificates_tab);
		Thread.sleep(3000);
		EpublicControls.birthLinkCertificates.click();
		Thread.sleep(3000);
		Helper.clickItem(EpublicControls.i_agree);
	}
}
