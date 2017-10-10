package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.CoreCONPage;
import pageobjects.CoreControls;

public class ValidateTheCONForVicAdult {

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, CoreCONPage.class);
		Helper.clickItem(CoreCONPage.additionalNotificationDetails);
		CoreCONPage.connType.sendKeys("VIC Born - Adult");
		CoreControls.validateForm();

	}

}
