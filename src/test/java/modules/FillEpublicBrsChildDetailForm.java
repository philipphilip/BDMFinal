package modules;

import helpers.DataHelper;
import helpers.Helper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.EpublicBrsChildDetailPage;
import pageobjects.EpublicBrsPage;
import pageobjects.EpublicBrsParentDetailPage;
import pageobjects.EpublicBrsRelationshipDetailPage;
import pageobjects.EpublicBrsSecondParentDetailPage;
import pageobjects.EpublicBrsSecondParentParticipationDetailPage;
import pageobjects.EpublicControls;
import step_definitions.BDMForm;

public class FillEpublicBrsChildDetailForm {

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EpublicBrsChildDetailPage.class);

		Helper.inputItem(EpublicBrsPage.childFamilyName, "smith");
		Helper.inputItem(EpublicBrsPage.childFirstName, "mary");
		Helper.inputItem(EpublicBrsPage.dateOfBirth, "05/07/2017");
		EpublicBrsPage.dateOfBirth.sendKeys(Keys.TAB);
		Helper.inputItem(EpublicBrsPage.sex, "Female");
		// EpublicBrsChildDetailPage.multipleBirthNO.click();
		// EpublicBrsChildDetailPage.bornAliveYes.click();
		// EpublicBrsChildDetailPage.hospitalYes.click();
		System.out.println("before click hospital");
		EpublicBrsPage.hospital.click();
		System.out.println("after click hospital, before wait");
		System.out.println("after wait, before click hospital list");
		EpublicBrsPage.hospitallist.click();
		System.out.println("after click hospital list");
		EpublicBrsPage.hospitalSuburb.click();
		EpublicBrsPage.hospitalSuburblist.click();
		Helper.clickItem(EpublicControls.nextButton);

	}

}
