package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.EpublicBrsSecondParentDetailPage;
import pageobjects.EpublicControls;


public class FillEpublicBrsSecondParentDetailForm {

	public static void Execute(WebDriver driver) throws Exception {

		PageFactory.initElements(driver, EpublicBrsSecondParentDetailPage.class);
		Thread.sleep(2000);
		EpublicBrsSecondParentDetailPage.familyName.sendKeys("Smith");
		EpublicBrsSecondParentDetailPage.givenName.sendKeys("Tom");
		Thread.sleep(1000);
		EpublicControls.nextButton.click();

	}

}
