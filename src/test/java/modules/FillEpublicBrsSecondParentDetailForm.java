package modules;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.EpublicBrsChildDetailPage;
import pageobjects.EpublicBrsParentDetailPage;
import pageobjects.EpublicBrsSecondParentDetailPage;
import pageobjects.EpublicControls;


public class FillEpublicBrsSecondParentDetailForm {

	public static void Execute(WebDriver driver) throws Exception {

		PageFactory.initElements(driver, EpublicBrsSecondParentDetailPage.class);

		EpublicBrsSecondParentDetailPage.familyName.sendKeys("Smith");
		EpublicBrsSecondParentDetailPage.givenName.sendKeys("Tom");

		EpublicControls.nextButton.click();

	}

}
