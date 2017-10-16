package modules;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.EregistryANPage;
import pageobjects.EregistryControls;


public class FillEregistryANForm {

	static String familyName = RandomStringUtils.randomAlphabetic(6);
	static String formerFirstName = RandomStringUtils.randomAlphabetic(6);
	static String newFirstName = RandomStringUtils.randomAlphabetic(6);
	static String parent1FirstName = RandomStringUtils.randomAlphabetic(6);
	static String parent2FirstName = RandomStringUtils.randomAlphabetic(6);
	static String orderNumber = RandomStringUtils.randomNumeric(5);
	
	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EregistryANPage.class);
				
		Helper.waitFor(EregistryANPage.adoptionOrderNumber);
		EregistryANPage.adoptionOrderNumber.sendKeys(orderNumber);
		EregistryANPage.dateOfOrderDay.sendKeys("01");
		EregistryANPage.dateOfOrderMonth.sendKeys("09");
		EregistryANPage.dateOfOrderYear.sendKeys("2017");
		Helper.selectDropDownList(EregistryANPage.adoptionInRespectToAboriginalChild, "No");
		EregistryANPage.formerFamilyName.sendKeys("Automated" + familyName);
		EregistryANPage.formerFirstName.sendKeys("Automated" + formerFirstName);
		EregistryANPage.childDateOfBirthDay.sendKeys("01");
		EregistryANPage.childDateOfBirthMonth.sendKeys("09");
		EregistryANPage.childDateOfBirthYear.sendKeys("2015");
		Helper.selectDropDownList(EregistryANPage.sexAtBirth, "Male");
		EregistryANPage.birthSuburb.sendKeys("North Melbourne");
		EregistryANPage.newFamilyName.sendKeys("Automated" + familyName);
		EregistryANPage.newFirstName.sendKeys("Automated" + newFirstName);
		Helper.selectDropDownList(EregistryANPage.parent1RecordAs, "Mother");
		EregistryANPage.parent1FamilyName.sendKeys("Automated" + familyName);
		EregistryANPage.parent1FamilyNameAtBirth.sendKeys("Automated" + familyName);
		EregistryANPage.parent1FirstName.sendKeys("Automated" + parent1FirstName);
		EregistryANPage.parent1DateOfBirthDay.sendKeys("01");
		EregistryANPage.parent1DateOfBirthMonth.sendKeys("01");
		EregistryANPage.parent1DateOfBirthYear.sendKeys("1989");
		Helper.selectDropDownList(EregistryANPage.parent1Occupation, "accountant");
		EregistryANPage.parent1BirthSuburb.sendKeys("North Melbourne");
		Helper.selectDropDownList(EregistryANPage.parent2RecordAs, "Father");
		EregistryANPage.parent2FamilyName.sendKeys("Automated" + familyName);
		EregistryANPage.parent2FamilyNameAtBirth.sendKeys("Automated" + familyName);
		EregistryANPage.parent2FirstName.sendKeys("Automated" + parent2FirstName);
		EregistryANPage.parent2DateOfBirthDay.sendKeys("01");
		EregistryANPage.parent2DateOfBirthMonth.sendKeys("01");
		EregistryANPage.parent2DateOfBirthYear.sendKeys("1989");
		Helper.selectDropDownList(EregistryANPage.parent2Occupation, "accountant");
		EregistryANPage.parent2BirthSuburb.sendKeys("North Melbourne");
		Helper.selectDropDownList(EregistryANPage.relationshipStatus, "Married");
		EregistryANPage.dateOfRelationshipDay.sendKeys("01");
		EregistryANPage.dateOfRelationshipMonth.sendKeys("01");
		EregistryANPage.dateOfRelationshipYear.sendKeys("2009");
		EregistryANPage.relationshipSuburb.sendKeys("North Melbourne");
		Helper.selectDropDownList(EregistryANPage.childrenOfThisRelationshipNumber, "0");
		Helper.selectDropDownList(EregistryANPage.memoValidated, "Yes");
		
		Helper.clickItem(EregistryControls.validateButton);
		Helper.clickItem(EregistryControls.saveButton);
		Helper.clickItem(EregistryControls.backToFormButton);
		
		EregistryControls.uploadAttachmentToLocal();
		
		EregistryControls.actionList.sendKeys("Add Document");
		EregistryControls.goButton.click();
		
		Helper.waitFor(EregistryControls.addDocumentType);
		EregistryControls.addDocumentType.sendKeys("Statutory Declaration");
		EregistryControls.addDocumentName.sendKeys("Adoption");

		Thread.sleep(1000);
		String userHome = System.getProperty("user.home");
		EregistryControls.chooseFileButton.sendKeys(userHome+"\\Attachment.pdf");
		Thread.sleep(2000);

		
		Helper.clickItem(EregistryControls.saveButton);
		
		Thread.sleep(2000);
		String uploadSuccess = EregistryControls.documentUploadSuccessMessage.getText();
		Assert.assertTrue("Document upload failed", uploadSuccess.contains("The document was attached successfully."));
		
		EregistryControls.adoptionLink.click();
		EregistryControls.draftList.click();
		
		Helper.waitFor(EregistryControls.adoptionSearchFamilyName);
		EregistryControls.adoptionSearchFamilyName.sendKeys("Automated" + familyName);		
		EregistryControls.refreshButton.click();
		Helper.clickItem(EregistryControls.searchResult1);
		Helper.clickItem(EregistryControls.submitButton);		
		Helper.clickItem(EregistryControls.submitButton);	

	}
}
