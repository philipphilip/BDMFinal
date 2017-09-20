package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.CoreCONPage;
import pageobjects.CoreControls;

public class ValidateTheCONForOverseasChild {

	public static void Execute(WebDriver driver) {

		PageFactory.initElements(driver, CoreCONPage.class);
		CoreCONPage.additionalNotificationDetails.click();
		CoreCONPage.connType.sendKeys("Overseas Born - Child");
		CoreControls.validateForm();

	}

}
