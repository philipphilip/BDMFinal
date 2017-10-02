package modules;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageobjects.ApplicationPage;
import pageobjects.CoreControls;

public class FillCOSRegForm {

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, ApplicationPage.class);
		Thread.sleep(1000);
		ApplicationPage.dateReceivedAtRegistry.sendKeys("01/08/2017");
		ApplicationPage.dateReceivedAtRegistry.sendKeys(Keys.TAB);
		ApplicationPage.dateReceivedAtRegistry.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		ApplicationPage.productCode.sendKeys("COSRS");
		ApplicationPage.reasonCertificateIsRequired.sendKeys("Administration");
		ApplicationPage.relationshipToSubject.sendKeys("Self");
		ApplicationPage.submittedWithNotification.sendKeys("No");
		CoreControls.nextButton.click();
		ApplicationPage.applicantFamilyName.sendKeys("Automated" + FillNOBForm.randChildFamilyName);
		ApplicationPage.applicantGivenName.sendKeys("Automated" + FillNOBForm.randChildFirstName);
		ApplicationPage.applicantDOBDay.sendKeys("01");
		ApplicationPage.applicantDOBMonth.sendKeys("08");
		ApplicationPage.applicantDOBYear.sendKeys("1979");
		ApplicationPage.applicantAddressLine1.sendKeys("231 asf st");
		ApplicationPage.applicantAddressSuburb.sendKeys("Melbourne");
		ApplicationPage.applicantAddressPostcode.sendKeys("3000");
		ApplicationPage.applicantPhoneNumber.sendKeys("0498732478");
		CoreControls.nextButton.click();
		ApplicationPage.subjectFamilyName.sendKeys("Automated" + FillNOBForm.randChildFamilyName);
		ApplicationPage.subjectFamilyNameAtBirth.sendKeys("Automated" + FillNOBForm.randChildFamilyName);
		ApplicationPage.subjectGivenName.sendKeys("Automated" + FillNOBForm.randChildFirstName);
		ApplicationPage.subjectOtherGivenName.sendKeys("Automated" + FillNOBForm.randChildFirstName);
		ApplicationPage.subjectPlaceOfBirth.sendKeys("Coburg");
		ApplicationPage.subjectDOBDay.sendKeys("01");
		ApplicationPage.subjectDOBMonth.sendKeys("08");
		ApplicationPage.subjectDOBYear.sendKeys("1978");
		ApplicationPage.parent1FamilyName.sendKeys("Automated" + FillNOBForm.randChildFamilyName);
		ApplicationPage.parent1GivenName.sendKeys("Automated" + FillNOBForm.randparent1FirstName);
		ApplicationPage.parent1OtherGivenName.sendKeys("Automated" + FillNOBForm.randparent1FirstName);
		ApplicationPage.parent1FamilyNameAtBirth.sendKeys("Automated" + FillNOBForm.randMotherFamilyNameAtBirth);
		ApplicationPage.parent2FamilyName.sendKeys("Automated" + FillNOBForm.randChildFamilyName);
		ApplicationPage.parent2GivenName.sendKeys("Automated" + FillNOBForm.randparent2FirstName);
		ApplicationPage.parent2OtherGivenName.sendKeys("Automated" + FillNOBForm.randparent2FirstName);
		ApplicationPage.parent2FamilyNameAtBirth.sendKeys("Automated" + FillNOBForm.randChildFamilyName);
		CoreControls.nextButton.click();
		
		
		

	}

}
