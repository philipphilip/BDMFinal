package modules;

import helpers.Helper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.EpublicBrsChildDetailPage;
import pageobjects.EpublicControls;
import step_definitions.BDMForm;


public class FillEpublicBrsChildDetailForm {

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EpublicBrsChildDetailPage.class);
		//Thread.sleep(3000);
		Helper.inputItem(EpublicBrsChildDetailPage.familyName,"smith");
		Helper.inputItem(EpublicBrsChildDetailPage.firstName,"mary");
		Helper.inputItem(EpublicBrsChildDetailPage.dateOfBirth,"05/07/2017");
		EpublicBrsChildDetailPage.dateOfBirth.sendKeys(Keys.TAB);

		Thread.sleep(1000);
		Helper.inputItem(EpublicBrsChildDetailPage.sex,"Female");
		//EpublicBrsChildDetailPage.multipleBirthNO.click();
		//EpublicBrsChildDetailPage.bornAliveYes.click();
		//EpublicBrsChildDetailPage.hospitalYes.click();

		System.out.println("before click hospital");
		EpublicBrsChildDetailPage.hospital.click();
		System.out.println("after click hospital, before wait");
		Thread.sleep(1000);
		System.out.println("after wait, before click hospital list");
		EpublicBrsChildDetailPage.hospitallist.click();
		System.out.println("after click hospital list");

		Thread.sleep(1000);
		EpublicBrsChildDetailPage.hospitalSuburb.click();
		Thread.sleep(1000);
		EpublicBrsChildDetailPage.hospitalSuburblist.click();


		Helper.clickItem(EpublicControls.nextButton);

	}

}
