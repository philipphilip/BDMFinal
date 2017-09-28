package modules;

import helpers.Helper;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.EregistryANPage;
import pageobjects.EregistryControls;
import pageobjects.EregistryNobPage;


public class FillEregistryANForm {

	static String familyName = RandomStringUtils.randomAlphabetic(6);
	static String formerFirstName = RandomStringUtils.randomAlphabetic(6);
	static String newFirstName = RandomStringUtils.randomAlphabetic(6);
	static String parent1FirstName = RandomStringUtils.randomAlphabetic(6);
	static String parent2FirstName = RandomStringUtils.randomAlphabetic(6);
	static String orderNumber = RandomStringUtils.randomNumeric(5);
	
	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EregistryANPage.class);
		
		WebDriverWait waitForOrderNumber = new WebDriverWait(driver, 10000);
		EregistryANPage.adoptionOrderNumber = waitForOrderNumber
				.until(ExpectedConditions.elementToBeClickable(EregistryANPage.adoptionOrderNumber));
		
		Helper.inputItem(EregistryANPage.adoptionOrderNumber, orderNumber);
		Helper.inputItem(EregistryANPage.dateOfOrderDay, "01");
		Helper.inputItem(EregistryANPage.dateOfOrderMonth, "09");
		Helper.inputItem(EregistryANPage.dateOfOrderYear, "2017");
		Helper.selectDropDownList(EregistryANPage.adoptionInRespectToAboriginalChild, "No");
		Helper.inputItem(EregistryANPage.formerFamilyName, "Automated" + familyName);
		Helper.inputItem(EregistryANPage.formerFirstName, "Automated" + formerFirstName);
		Helper.inputItem(EregistryANPage.childDateOfBirthDay,"01");
		Helper.inputItem(EregistryANPage.childDateOfBirthMonth, "09");
		Helper.inputItem(EregistryANPage.childDateOfBirthYear, "2015");
		Helper.selectDropDownList(EregistryANPage.sexAtBirth, "Male");
		Helper.inputItem(EregistryANPage.birthSuburb, "North Melbourne");
		Helper.inputItem(EregistryANPage.newFamilyName, "Automated" + familyName);
		Helper.inputItem(EregistryANPage.newFirstName, "Automated" + newFirstName);
		Helper.selectDropDownList(EregistryANPage.parent1RecordAs, "Mother");
		Helper.inputItem(EregistryANPage.parent1FamilyName, "Automated" + familyName);
		Helper.inputItem(EregistryANPage.parent1FirstName, "Automated" + parent1FirstName);
		Helper.inputItem(EregistryANPage.parent1DateOfBirthDay, "01");
		Helper.inputItem(EregistryANPage.parent1DateOfBirthMonth, "01");
		Helper.inputItem(EregistryANPage.parent1DateOfBirthYear, "1989");
		Helper.selectDropDownList(EregistryANPage.parent1Occupation, "accountant");
		Helper.inputItem(EregistryANPage.parent1BirthSuburb, "North Melbourne");
		Helper.selectDropDownList(EregistryANPage.parent2RecordAs, "Father");
		Helper.inputItem(EregistryANPage.parent2FamilyName, "Automated" + familyName);
		Helper.inputItem(EregistryANPage.parent2FirstName, "Automated" + parent2FirstName);
		Helper.inputItem(EregistryANPage.parent2DateOfBirthDay, "01");
		Helper.inputItem(EregistryANPage.parent2DateOfBirthMonth, "01");
		Helper.inputItem(EregistryANPage.parent2DateOfBirthYear, "1989");
		Helper.selectDropDownList(EregistryANPage.parent2Occupation, "accountant");
		Helper.inputItem(EregistryANPage.parent2BirthSuburb, "North Melbourne");
		Helper.selectDropDownList(EregistryANPage.relationshipStatus, "Married");
		Helper.inputItem(EregistryANPage.dateOfRelationshipDay, "01");
		Helper.inputItem(EregistryANPage.dateOfRelationshipMonth, "01");
		Helper.inputItem(EregistryANPage.dateOfRelationshipYear, "2009");
		Helper.inputItem(EregistryANPage.relationshipSuburb, "North Melbourne");
		Helper.selectDropDownList(EregistryANPage.childrenOfThisRelationshipNumber, "0");
		Helper.selectDropDownList(EregistryANPage.memoValidated, "Yes");
		
		Helper.clickItem(EregistryControls.validateButton);
		Helper.clickItem(EregistryControls.saveButton);
		
		Helper.clickItem(EregistryControls.adoptionLink);
		Helper.clickItem(EregistryControls.draftList);
		
		WebDriverWait waitForSearchName = new WebDriverWait(driver, 10000);
		EregistryControls.adoptionSearchFamilyName = waitForSearchName
				.until(ExpectedConditions.elementToBeClickable(EregistryControls.adoptionSearchFamilyName));
		Helper.inputItem(EregistryControls.adoptionSearchFamilyName, "Automated" + familyName);		
		Helper.clickItem(EregistryControls.refreshButton);
		Helper.clickItem(EregistryControls.searchResult1);
		Helper.clickItem(EregistryControls.submitButton);		
		Helper.clickItem(EregistryControls.submitButton);	
//		Helper.uploadFile();
	}
}
