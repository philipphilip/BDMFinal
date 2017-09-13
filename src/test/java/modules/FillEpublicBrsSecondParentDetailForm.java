package modules;

import helpers.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.EpublicBrsPage;
import pageobjects.EpublicBrsSecondParentDetailPage;
import pageobjects.EpublicControls;


public class FillEpublicBrsSecondParentDetailForm {

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EpublicBrsSecondParentDetailPage.class);
		//Thread.sleep(3000);
		Helper.inputItem(EpublicBrsPage.parent2FamilyName,"Smith");
		Helper.inputItem(EpublicBrsPage.parent2GivenName,"Tom");
		//Thread.sleep(1000);
		Helper.clickItem(EpublicControls.nextButton);

	}

}
