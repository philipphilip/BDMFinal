package modules;

import helpers.DataHelper;
import helpers.Helper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.EpublicBrsChildDetailPage;
import pageobjects.EpublicBrsParentDetailPage;
import pageobjects.EpublicBrsRelationshipDetailPage;
import pageobjects.EpublicBrsSecondParentDetailPage;
import pageobjects.EpublicBrsSecondParentParticipationDetailPage;
import pageobjects.EpublicControls;
import step_definitions.BDMForm;

public class FillEpublicBrsChildDetailForm {

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EpublicBrsChildDetailPage.class);

		Helper.inputItem(EpublicBrsChildDetailPage.familyName, "smith");
		Helper.inputItem(EpublicBrsChildDetailPage.firstName, "mary");
		Helper.inputItem(EpublicBrsChildDetailPage.dateOfBirth, "05/07/2017");
		EpublicBrsChildDetailPage.dateOfBirth.sendKeys(Keys.TAB);
		Helper.inputItem(EpublicBrsChildDetailPage.sex, "Female");
		// EpublicBrsChildDetailPage.multipleBirthNO.click();
		// EpublicBrsChildDetailPage.bornAliveYes.click();
		// EpublicBrsChildDetailPage.hospitalYes.click();
		System.out.println("before click hospital");
		EpublicBrsChildDetailPage.hospital.click();
		System.out.println("after click hospital, before wait");
		System.out.println("after wait, before click hospital list");
		EpublicBrsChildDetailPage.hospitallist.click();
		System.out.println("after click hospital list");
		EpublicBrsChildDetailPage.hospitalSuburb.click();
		EpublicBrsChildDetailPage.hospitalSuburblist.click();
		Helper.clickItem(EpublicControls.nextButton);

	}

}
