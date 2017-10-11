package modules;

import helpers.Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.EregistryControls;
import pageobjects.EregistryNobPage;


public class FillEregistryNobForm {

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EregistryNobPage.class);
		
		WebDriverWait waitForFamilyName = new WebDriverWait(driver, 10000);
		EregistryNobPage.birthMotherFamilyName = waitForFamilyName
				.until(ExpectedConditions.elementToBeClickable(EregistryNobPage.birthMotherFamilyName));
		Helper.inputItem(EregistryNobPage.birthMotherFamilyName, "Automated" + FillNOBForm.randChildFamilyName);
		Helper.selectDropDownList(EregistryNobPage.familyNameSameAsFamilyNameAtBirth, "No");
		Helper.inputItem(EregistryNobPage.birthMotherFamilyNameAtBirth, "Automated" + FillNOBForm.randMotherFamilyNameAtBirth);
		Helper.inputItem(EregistryNobPage.birthMotherGivenNames, "Automated" + FillNOBForm.randparent1FirstName);
		Helper.inputItem(EregistryNobPage.birthMotherDateOfBirthDay, "25");
		Helper.inputItem(EregistryNobPage.birthMotherDateOfBirthMonth, "12");
		Helper.inputItem(EregistryNobPage.birthMotherDateOfBirthYear, "1989");
		Helper.selectDropDownList(EregistryNobPage.birthMotherAboriginality, "Decline to reply");
		Helper.inputItem(EregistryNobPage.birthMotherResidentialAddressLine1, "12 Canning st");
		Helper.inputItem(EregistryNobPage.birthMotherResidentialAddressSuburb, "North Melbourne");
		Helper.inputItem(EregistryNobPage.birthMotherResidentialAddressPostcode, "3051");
		Helper.inputItem(EregistryNobPage.birthMotherEmailId, "info@test.com");
		Helper.inputItem(EregistryNobPage.childDateOfBirthDay, "01");
		Helper.inputItem(EregistryNobPage.childDateOfBirthMonth, "08");
		Helper.inputItem(EregistryNobPage.childDateOfBirthYear, "2017");
		Helper.inputItem(EregistryNobPage.childTimeOfBirth, "9:59");
		Helper.selectDropDownList(EregistryNobPage.childSexAtBirth, "Male");
		Helper.selectDropDownList(EregistryNobPage.bornAlive, "Yes");
		Helper.inputItem(EregistryNobPage.childWeight, "3000");
		Helper.selectDropDownList(EregistryNobPage.multiplebirth, "Yes");
		Helper.inputItem(EregistryNobPage.birthOrder, "1");
		Helper.inputItem(EregistryNobPage.birthOrderOf, "2");
		Helper.selectDropDownList(EregistryNobPage.birthHospitalName, "Ballina District Hospital");
		Helper.selectDropDownList(EregistryNobPage.birthHospitalSuburb, "Armidale");
		Helper.clickItem(EregistryControls.validateButton);
		Helper.clickItem(EregistryControls.saveButton);
		
		EregistryControls.birthLink.click();
		EregistryControls.draftList.click();
		
		WebDriverWait waitForSearchName = new WebDriverWait(driver, 10000);
		EregistryControls.nobSearchFamilyName = waitForSearchName
				.until(ExpectedConditions.elementToBeClickable(EregistryControls.nobSearchFamilyName));
		Helper.inputItem(EregistryControls.nobSearchFamilyName, "Automated" + FillNOBForm.randChildFamilyName);		
		EregistryControls.refreshButton.click();
		Helper.clickItem(EregistryControls.searchResult1);
		Helper.clickItem(EregistryControls.submitButton);		
		Helper.clickItem(EregistryControls.submitButton);
//		String codSavedMessage;
//		Thread.sleep(3000);
//		codSavedMessage = EregistryControls.codMessage.getText();
//		Assert.assertTrue("result message not found", codSavedMessage.contains("This Cause of Death has been successfully saved"));		

	}

}
