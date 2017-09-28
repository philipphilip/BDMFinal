package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.CoreCONPage;
import pageobjects.CoreControls;

public class ValidateTheCONForVicAdult {

	public static void Execute(WebDriver driver) {

		PageFactory.initElements(driver, CoreCONPage.class);
		CoreCONPage.additionalNotificationDetails.click();
		CoreCONPage.connType.sendKeys("VIC Born - Adult");
		CoreControls.validateForm();

	}

}
