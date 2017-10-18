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
		ApplicationPage.applicantFamilyName.sendKeys("Auto" + FillAdoptionForm.childsNewNameFamilyName);
		ApplicationPage.applicantGivenName.sendKeys("Auto" + FillAdoptionForm.childsNewNameFirstGivenName);
		ApplicationPage.applicantDOBDay.sendKeys("12");
		ApplicationPage.applicantDOBMonth.sendKeys("08");
		ApplicationPage.applicantDOBYear.sendKeys("1980");
		ApplicationPage.applicantAddressLine1.sendKeys("231 asf st");
		ApplicationPage.applicantAddressSuburb.sendKeys("Melbourne");
		ApplicationPage.applicantAddressPostcode.sendKeys("3000");
		ApplicationPage.applicantPhoneNumber.sendKeys("0498732478");
		CoreControls.nextButton.click();
		ApplicationPage.subjectFamilyName.sendKeys("Auto" + FillAdoptionForm.childsNewNameFamilyName);
		ApplicationPage.subjectFamilyNameAtBirth.sendKeys("Auto" + FillAdoptionForm.preAdoptionChildsNameFamilyName);
		ApplicationPage.subjectGivenName.sendKeys("Auto" + FillAdoptionForm.childsNewNameFirstGivenName);
		ApplicationPage.subjectOtherGivenName.sendKeys("Auto" + FillAdoptionForm.childsNewNameFirstGivenName);
		ApplicationPage.subjectPlaceOfBirth.sendKeys("asdf");
		ApplicationPage.subjectPlaceOfBirthState.sendKeys("NOT STATED");
		ApplicationPage.placeOfBirthCountry.sendKeys("Iraq");
		ApplicationPage.subjectDOBDay.sendKeys("12");
		ApplicationPage.subjectDOBMonth.sendKeys("08");
		ApplicationPage.subjectDOBYear.sendKeys("1980");
		ApplicationPage.parent1FamilyName.sendKeys("Auto" + FillAdoptionForm.adoptionParent1FamilyName);
		ApplicationPage.parent1GivenName.sendKeys("Auto" + FillAdoptionForm.adoptionParent1FirstGivenName);
		ApplicationPage.parent1OtherGivenName.sendKeys("Auto" + FillAdoptionForm.adoptionParent1FirstGivenName);
		ApplicationPage.parent1FamilyNameAtBirth.sendKeys("Auto" + FillAdoptionForm.adoptionParent1FamilyName);
		ApplicationPage.parent2FamilyName.sendKeys("Automated");
		ApplicationPage.parent2GivenName.sendKeys("Automated");
		ApplicationPage.parent2OtherGivenName.sendKeys("Automated");
		ApplicationPage.parent2FamilyNameAtBirth.sendKeys("Automated");
		CoreControls.nextButton.click();
		Thread.sleep(1000);
		//ApplicationPage.tabletitle.click();
		CoreControls.noMatchButton.click();
		Thread.sleep(1000);
		CoreControls.submitButton.click();

	}

}
