package modules;

import helpers.Helper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.EpublicApplicationApplicantDetailPage;
import pageobjects.EpublicApplicationSubjectDetailPage;
import pageobjects.EpublicBrsChildDetailPage;


public class FillEpublicApplicationSubjectDetailForm {

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EpublicApplicationSubjectDetailPage.class);

		Helper.inputItem(EpublicApplicationSubjectDetailPage.typeOfCertificate,"Birth");

		Helper.inputItem(EpublicApplicationSubjectDetailPage.birthType,"On", 1, false);


		Helper.inputItem(EpublicApplicationSubjectDetailPage.placezOfBirth,"ringwood");
		Helper.inputItem(EpublicApplicationSubjectDetailPage.relationship,"Stakeholder");
		Helper.inputItem(EpublicApplicationSubjectDetailPage.reason,"Citizenship");
		Helper.inputItem(EpublicApplicationSubjectDetailPage.childGivenName,"Jane");
		Helper.inputItem(EpublicApplicationSubjectDetailPage.parentOneType,"Mother");
		Helper.inputItem(EpublicApplicationSubjectDetailPage.parentOneGivenName,"Mary");
		Helper.inputItem(EpublicApplicationSubjectDetailPage.parentTwoType,"Father");
		Helper.inputItem(EpublicApplicationSubjectDetailPage.parentTwoGivenName,"Tom");

		// input DOB at last, otherwise value will be removed
		Helper.inputItem(EpublicApplicationSubjectDetailPage.dayOfBirth,"20/07/2017", 0, false);
		EpublicApplicationSubjectDetailPage.dayOfBirth.sendKeys(Keys.TAB);



	}

}
