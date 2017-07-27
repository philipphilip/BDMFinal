package modules;

import helpers.Helper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.EpublicApplicationPaymentDetailPage;
import pageobjects.EpublicApplicationSubjectDetailPage;


public class FillEpublicApplicationPaymentDetailForm {

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EpublicApplicationPaymentDetailPage.class);

		Helper.inputItem(EpublicApplicationPaymentDetailPage.cardholderName,"card holder");

		Helper.inputItem(EpublicApplicationPaymentDetailPage.creditCardNumber,"4242424242424242");

		Helper.inputItem(EpublicApplicationPaymentDetailPage.expiryDateMonth,"12");

		Helper.inputItem(EpublicApplicationPaymentDetailPage.expiryDateYear,"2020");

		Helper.inputItem(EpublicApplicationPaymentDetailPage.cvn,"111");

		Helper.clickItem(EpublicApplicationPaymentDetailPage.nextButton);



	}

}
