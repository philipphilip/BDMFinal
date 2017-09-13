package modules;

import helpers.DataHelper;
import helpers.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.EpublicApplicationApplicantDetailPage;
import pageobjects.EpublicApplicationPage;
import pageobjects.EregistryDrsPage;


public class FillEpublicApplicationApplicantDetailForm {

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EpublicApplicationApplicantDetailPage.class);
		
		Helper.inputItem(EpublicApplicationPage.applicantGivenName,"Tom");
		Helper.inputItem(EpublicApplicationPage.streetNo,"22 station st");
		Helper.inputItem(EpublicApplicationPage.suburb,"ringwood");
		Helper.inputItem(EpublicApplicationPage.state,"VIC");
		Helper.inputItem(EpublicApplicationPage.postcode,"3333");
		Helper.inputItem(EpublicApplicationPage.telephoneNo,"99995555");

	}

}
