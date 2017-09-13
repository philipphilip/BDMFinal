package modules;

import helpers.Helper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.EpublicApplicationApplicantDetailPage;
import pageobjects.EpublicApplicationSubjectDetailPage;
import pageobjects.EpublicBrsChildDetailPage;
import pageobjects.EpublicApplicationPage;


public class FillEpublicApplicationSubjectDetailForm {

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EpublicApplicationSubjectDetailPage.class);

		Helper.inputItem(EpublicApplicationPage.typeOfCertificate,"Birth");

		Helper.inputItem(EpublicApplicationPage.birthType,"On", 1, false);


		Helper.inputItem(EpublicApplicationPage.placezOfBirth,"ringwood");
		Helper.inputItem(EpublicApplicationPage.relationship,"Stakeholder");
		Helper.inputItem(EpublicApplicationPage.reason,"Citizenship");
		Helper.inputItem(EpublicApplicationPage.childGivenName,"Jane");
		Helper.inputItem(EpublicApplicationPage.parentOneType,"Mother");
		Helper.inputItem(EpublicApplicationPage.parentOneGivenName,"Mary");
		Helper.inputItem(EpublicApplicationPage.parentTwoType,"Father");
		Helper.inputItem(EpublicApplicationPage.parentTwoGivenName,"Tom");

		// input DOB at last, otherwise value will be removed
		Helper.inputItem(EpublicApplicationPage.dayOfBirth,"20/07/2017", 0, false);
		EpublicApplicationPage.dayOfBirth.sendKeys(Keys.TAB);



	}

}
