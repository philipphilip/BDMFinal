package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.EpublicBrsSecondParentParticipationDetailPage;
import pageobjects.EpublicControls;


public class FillEpublicBrsSecondParentParticipationDetailForm {

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EpublicBrsSecondParentParticipationDetailPage.class);
		Thread.sleep(2000);

		EpublicBrsSecondParentParticipationDetailPage.telephone.sendKeys("99996666");

		EpublicControls.nextButton.click();

	}

}
