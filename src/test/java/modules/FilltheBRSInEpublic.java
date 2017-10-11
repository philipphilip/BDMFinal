package modules;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Helper;
import pageobjects.EpublicBrsPage;
import pageobjects.EpublicControls;


public class FilltheBRSInEpublic {

	static String brsFamilyName = RandomStringUtils.randomAlphabetic(6);
	static String childFirstName = RandomStringUtils.randomAlphabetic(6);
	static String motherFirstName = RandomStringUtils.randomAlphabetic(6);
	
	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, EpublicBrsPage.class);
		
		WebDriverWait waitForChildFamilyName = new WebDriverWait(driver, 10000);
		EpublicBrsPage.childFamilyName = waitForChildFamilyName
				.until(ExpectedConditions.elementToBeClickable(EpublicBrsPage.childFamilyName));
		
		Helper.inputItem(EpublicBrsPage.childFamilyName, "Automated" + brsFamilyName);
		Helper.inputItem(EpublicBrsPage.childFirstName, "Automated" + childFirstName);
		Helper.inputItem(EpublicBrsPage.dateOfBirth, "05/07/2017");
		EpublicBrsPage.dateOfBirth.sendKeys(Keys.TAB);
		Helper.inputItem(EpublicBrsPage.sex, "Female");
		Helper.clickItem(EpublicBrsPage.hospital);
		Helper.clickItem(EpublicBrsPage.hospitallist);
		Helper.inputItem(EpublicBrsPage.hospitalSuburb, "UPPER FERNTREE GULLY");
		Helper.clickItem(EpublicControls.nextButton);
		
		WebDriverWait waitForParentType = new WebDriverWait(driver, 10000);
		EpublicBrsPage.parentType = waitForParentType
				.until(ExpectedConditions.elementToBeClickable(EpublicBrsPage.parentType));
		
		Helper.inputItem(EpublicBrsPage.parentType, "Mother");
		Helper.inputItem(EpublicBrsPage.familyName, "Automated" + brsFamilyName);
		EpublicBrsPage.parent1FamilyNameSameAsBirth.sendKeys(Keys.SPACE);
		Helper.inputItem(EpublicBrsPage.givenName, "Automated" + motherFirstName);
		Helper.inputItem(EpublicBrsPage.birthday, "05/07/1990");
		EpublicBrsPage.birthday.sendKeys(Keys.TAB);
		Helper.inputItem(EpublicBrsPage.suburb, "ringwood");
		Helper.inputItem(EpublicBrsPage.state, "VIC");
		Helper.selectDropDownList(EpublicBrsPage.aboriginal, "No");
		Helper.selectDropDownList(EpublicBrsPage.occupation, "accountant");
		Helper.clickItem(EpublicControls.nextButton);
		
		WebDriverWait waitForParent2FamilyName = new WebDriverWait(driver, 10000);
		EpublicBrsPage.parent2FamilyName = waitForParent2FamilyName
				.until(ExpectedConditions.elementToBeClickable(EpublicBrsPage.parent2FamilyName));
		
		Helper.inputItem(EpublicBrsPage.parent2FamilyName, "Automated" + brsFamilyName);
		Helper.inputItem(EpublicBrsPage.parent2GivenName, "Automated" + motherFirstName);
		Helper.clickItem(EpublicControls.nextButton);
		Helper.clickItem(EpublicControls.nextButton);
		
		WebDriverWait waitForRelationship = new WebDriverWait(driver, 10000);
		EpublicBrsPage.relationship = waitForRelationship
				.until(ExpectedConditions.elementToBeClickable(EpublicBrsPage.relationship));
		
		Helper.inputItem(EpublicBrsPage.relationship, "Married");
		Helper.inputItem(EpublicBrsPage.relationshipDate, "01/01/2010");
		Helper.inputItem(EpublicBrsPage.relationshipSuburb, "Melbourne");
		Helper.clickItem(EpublicControls.nextButton);
		Helper.clickItem(EpublicControls.nextButton);
		Helper.clickItem(EpublicControls.nextButton);

		Thread.sleep(3000);
		Helper.clickItem(EpublicBrsPage.safetyConcernsFromParent2);
		Helper.clickItem(EpublicControls.nextButton);
		
		WebDriverWait waitForInformantRelationship = new WebDriverWait(driver, 10000);
		EpublicBrsPage.informantRelationship = waitForInformantRelationship
				.until(ExpectedConditions.elementToBeClickable(EpublicBrsPage.informantRelationship));
		
		Helper.inputItem(EpublicBrsPage.informantRelationship, "Parent");
		Helper.inputItem(EpublicBrsPage.informantFamilyName, "Automated" + brsFamilyName);
		Helper.inputItem(EpublicBrsPage.informantGivenName, "Automated" + motherFirstName);
		Helper.inputItem(EpublicBrsPage.informantDateOfBirth, "02/02/1980");
		EpublicBrsPage.informantDateOfBirth.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		Helper.inputItem(EpublicBrsPage.informantAddressLine1, "22 station rd");
		Helper.inputItem(EpublicBrsPage.informantAddressSuburb, "ringwood");
		Helper.inputItem(EpublicBrsPage.informantAddressPostcode, "3333");
		Helper.clickItem(EpublicBrsPage.SameAsResidentialAddress);
		Helper.inputItem(EpublicBrsPage.informantContactEmail, "my@email.com");
		Helper.clickItem(EpublicControls.continueButton);
		Helper.clickItem(EpublicControls.closeButton);
		Helper.clickItem(EpublicControls.proceedButtonOnBRS);
//		Helper.clickItem(EpublicControls.proceedWithoutOrderingCertificate);
		Helper.clickItem(EpublicControls.orderACertificate);
		Helper.clickItem(EpublicControls.proceedButtonOnBRS);
		Helper.inputItem(EpublicControls.certificateQuantity, "1");
		Helper.clickItem(EpublicControls.proceedButtonOnBRS);
		Helper.clickItem(EpublicControls.checkoutButton);
		Helper.clickItem(EpublicControls.acceptTermsCheckbox);
		Helper.clickItem(EpublicControls.payNowButton);
		
//		Wait for the Westpac bank payments page to load
		EpublicControls.payNowProcess();
		
		Thread.sleep(5000);
		Helper.clickItem(EpublicControls.submitInPersonButton);
				
		String confirmationNumber;
		Thread.sleep(5000);
		confirmationNumber = EpublicControls.brsCompletionBanner.getText();
		Assert.assertTrue("BRS submission with POI is not successful", confirmationNumber.contains("Completion"));
		Thread.sleep(5000);
		System.out.println("The BRS order number created along with POI/DPOI is: " + EpublicControls.brsOrderNumber.getText());
	}
}
