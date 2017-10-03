package modules;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.ApplicationPage;
import pageobjects.CoreControls;

public class FillMCApplicationForm {

	public static void Execute(WebDriver driver) throws Exception {

		PageFactory.initElements(driver, ApplicationPage.class);
		Thread.sleep(1000);
		ApplicationPage.dateReceivedAtRegistry.sendKeys("01/09/2017");
		ApplicationPage.dateReceivedAtRegistry.sendKeys(Keys.TAB);
		ApplicationPage.dateReceivedAtRegistry.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		ApplicationPage.productCode.sendKeys("MS1");
		Thread.sleep(1000);
		ApplicationPage.reasonCertificateIsRequired.sendKeys("Administration");
		ApplicationPage.productCode.sendKeys("MS1");
		Thread.sleep(1000);
		ApplicationPage.relationshipToSubject.sendKeys("Self");
		ApplicationPage.productCode.sendKeys("MS1");
		ApplicationPage.productDetailsTemplate.sendKeys("MR Certificate");
		CoreControls.nextButton.click();
		ApplicationPage.applicantFamilyName.sendKeys("automatic" + FillMNForm.groomsFamilyName);
		ApplicationPage.applicantGivenName.sendKeys("automatic" + FillMNForm.groomsGivenName);
		ApplicationPage.applicantDOBDay.sendKeys("12");
		ApplicationPage.applicantDOBMonth.sendKeys("05");
		ApplicationPage.applicantDOBYear.sendKeys("1980");
		ApplicationPage.applicantAddressLine1.sendKeys("18 Canning St");
		ApplicationPage.applicantAddressSuburb.sendKeys("North Melbourne");
		ApplicationPage.applicantAddressPostcode.sendKeys("3051");
		ApplicationPage.applicantPhoneNumber.sendKeys("0456487956");
		CoreControls.nextButton.click();
		ApplicationPage.deliveryAddressFamilyName.sendKeys("automatic" + FillMNForm.groomsFamilyName);
		ApplicationPage.orderDeliveryAddressLine1.sendKeys("18 Canning St");
		ApplicationPage.orderDeliveryAddressSuburb.sendKeys("North Melbourne");
		ApplicationPage.orderDeliveryAddressPostcode.sendKeys("3051");
		ApplicationPage.orderDeliveryContactPhoneNumber.sendKeys("0456487956");
		CoreControls.nextButton.click();
		ApplicationPage.groomFamilyName.sendKeys("automatic" + FillMNForm.groomsFamilyName);
		ApplicationPage.groomGivenName.sendKeys("automatic" + FillMNForm.groomsGivenName);
		ApplicationPage.groomDOBDay.sendKeys("12");
		ApplicationPage.groomDOBMonth.sendKeys("05");
		ApplicationPage.groomDOBYear.sendKeys("1980");
		ApplicationPage.brideFamilyName.sendKeys("automatic" + FillMNForm.brideFamilyName);
		ApplicationPage.brideGivenName.sendKeys("automatic" + FillMNForm.brideFirstName);
		ApplicationPage.brideDOBDay.sendKeys("25");
		ApplicationPage.brideDOBMonth.sendKeys("05");
		ApplicationPage.brideDOBYear.sendKeys("1983");
		CoreControls.nextButton.click();
		Thread.sleep(3000);
		ApplicationPage.noMatchButton.click();
		Thread.sleep(4000);
		CoreControls.nextButton.click();
		Thread.sleep(2000);
		CoreControls.submitApplicationButton.click();

	}

}
