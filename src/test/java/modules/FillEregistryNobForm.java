package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.EregistryControls;
import pageobjects.EregistryNobPage;


public class FillEregistryNobForm {

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EregistryNobPage.class);
		
		Helper.waitFor(EregistryNobPage.birthMotherFamilyName);
		EregistryNobPage.birthMotherFamilyName.sendKeys("Automated" + FillNOBForm.randChildFamilyName);
		Helper.selectDropDownList(EregistryNobPage.familyNameSameAsFamilyNameAtBirth, "No");
		EregistryNobPage.birthMotherFamilyNameAtBirth.sendKeys("Automated" + FillNOBForm.randMotherFamilyNameAtBirth);
		EregistryNobPage.birthMotherGivenNames.sendKeys("Automated" + FillNOBForm.randparent1FirstName);
		EregistryNobPage.birthMotherDateOfBirthDay.sendKeys("25");
		EregistryNobPage.birthMotherDateOfBirthMonth.sendKeys("12");
		EregistryNobPage.birthMotherDateOfBirthYear.sendKeys("1989");
		Helper.selectDropDownList(EregistryNobPage.birthMotherAboriginality, "No");
		EregistryNobPage.birthMotherResidentialAddressLine1.sendKeys("12 Canning st");
		EregistryNobPage.birthMotherResidentialAddressSuburb.sendKeys("North Melbourne");
		EregistryNobPage.birthMotherResidentialAddressPostcode.sendKeys("3051");
		EregistryNobPage.birthMotherEmailId.sendKeys("info@test.com");
		EregistryNobPage.childDateOfBirthDay.sendKeys("01");
		EregistryNobPage.childDateOfBirthMonth.sendKeys("08");
		EregistryNobPage.childDateOfBirthYear.sendKeys("2017");
		EregistryNobPage.childTimeOfBirth.sendKeys("9:59");
		Helper.selectDropDownList(EregistryNobPage.childSexAtBirth, "Male");
		Helper.selectDropDownList(EregistryNobPage.bornAlive, "Yes");
		EregistryNobPage.childWeight.sendKeys("3000");
		Helper.selectDropDownList(EregistryNobPage.multiplebirth, "Yes");
		EregistryNobPage.birthOrder.sendKeys("1");
		EregistryNobPage.birthOrderOf.sendKeys("2");
		Helper.selectDropDownList(EregistryNobPage.birthHospitalName, "Albury Wodonga Health");
		Helper.selectDropDownList(EregistryNobPage.birthHospitalSuburb, "WODONGA");
		Helper.clickItem(EregistryControls.validateButton);
		Helper.clickItem(EregistryControls.saveButton);
		
		EregistryControls.birthLink.click();
		EregistryControls.draftList.click();
		
		Helper.waitFor(EregistryControls.nobSearchFamilyName);
		EregistryControls.nobSearchFamilyName.sendKeys("Automated" + FillNOBForm.randChildFamilyName);		
		Thread.sleep(1000);
		Helper.waitFor(EregistryControls.refreshButton);
		EregistryControls.refreshButton.click();
		Helper.waitFor(EregistryControls.searchResult1);
		Helper.clickItem(EregistryControls.searchResult1);
		Helper.clickItem(EregistryControls.submitButton);		
		Helper.clickItem(EregistryControls.submitButton);
//		String codSavedMessage;
//		Thread.sleep(3000);
//		codSavedMessage = EregistryControls.codMessage.getText();
//		Assert.assertTrue("result message not found", codSavedMessage.contains("This Cause of Death has been successfully saved"));		

	}

}
