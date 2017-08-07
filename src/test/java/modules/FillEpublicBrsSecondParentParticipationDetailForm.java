package modules;

import helpers.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.EpublicBrsSecondParentParticipationDetailPage;
import pageobjects.EpublicControls;


public class FillEpublicBrsSecondParentParticipationDetailForm {

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EpublicBrsSecondParentParticipationDetailPage.class);
		//Thread.sleep(2000);

		
//		Helper.inputItem(EpublicBrsSecondParentParticipationDetailPage.telephone,"99996666");
		Thread.sleep(3000);
		EpublicBrsSecondParentParticipationDetailPage.safetyConcernsFromParent2.click();
		Helper.clickItem(EpublicControls.nextButton);

	}

}
