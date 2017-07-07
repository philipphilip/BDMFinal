package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.EpublicBrsRelationshipDetailPage;
import pageobjects.EpublicControls;


public class FillEpublicBrsRelationshipDetailForm {

	public static void Execute(WebDriver driver) throws Exception {

		PageFactory.initElements(driver, EpublicBrsRelationshipDetailPage.class);
		Thread.sleep(3000);
		EpublicBrsRelationshipDetailPage.relationship.sendKeys("Married");
		Thread.sleep(1000);
		EpublicBrsRelationshipDetailPage.relationshipDate.sendKeys("01/01/2010");

		EpublicControls.nextButton.click();

	}

}
