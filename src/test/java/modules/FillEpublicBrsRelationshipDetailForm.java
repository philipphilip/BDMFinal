package modules;

import helpers.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.EpublicBrsPage;
import pageobjects.EpublicBrsRelationshipDetailPage;
import pageobjects.EpublicControls;


public class FillEpublicBrsRelationshipDetailForm {

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EpublicBrsRelationshipDetailPage.class);
		//Thread.sleep(3000);
		Helper.inputItem(EpublicBrsPage.relationship,"Married");
		//Thread.sleep(1000);
		Helper.inputItem(EpublicBrsPage.relationshipDate,"01/01/2010");

		Helper.clickItem(EpublicControls.nextButton);

	}

}
