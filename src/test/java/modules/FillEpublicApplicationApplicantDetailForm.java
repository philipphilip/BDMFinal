package modules;

import helpers.DataHelper;
import helpers.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.EpublicApplicationApplicantDetailPage;
import pageobjects.EregistryDrsPage;


public class FillEpublicApplicationApplicantDetailForm {

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EpublicApplicationApplicantDetailPage.class);
		
		Helper.inputItem(EpublicApplicationApplicantDetailPage.applicantGivenName,"Tom");
		Helper.inputItem(EpublicApplicationApplicantDetailPage.streetNo,"22 station st");
		Helper.inputItem(EpublicApplicationApplicantDetailPage.suburb,"ringwood");
		Helper.inputItem(EpublicApplicationApplicantDetailPage.state,"VIC");
		Helper.inputItem(EpublicApplicationApplicantDetailPage.postcode,"3333");
		Helper.inputItem(EpublicApplicationApplicantDetailPage.telephoneNo,"99995555");

	}

}
