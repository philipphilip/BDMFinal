package modules;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.CoreControls;
import pageobjects.CoreRNPage;

public class FillRNForm {

	public static String applicant1FamilyName = RandomStringUtils.randomAlphabetic(6);
	public static String applicant1GivenName = RandomStringUtils.randomAlphabetic(6);
	public static String applicant1FatherFirstName = RandomStringUtils.randomAlphabetic(6);
	public static String applicant1MotherFirstName = RandomStringUtils.randomAlphabetic(6);
	public static String applicant2FamilyName = RandomStringUtils.randomAlphabetic(6);
	public static String applicant2FirstName = RandomStringUtils.randomAlphabetic(6);
	public static String applicant2FatherFirstName = RandomStringUtils.randomAlphabetic(6);
	public static String applicant2MotherFirstName = RandomStringUtils.randomAlphabetic(6);

	public static void Execute(WebDriver driver) throws Throwable {
		PageFactory.initElements(driver, CoreRNPage.class);
		PageFactory.initElements(driver, CoreControls.class);
		Thread.sleep(3000);
		Helper.clickItem(CoreRNPage.additionalNotificationDetailsLink);
		CoreRNPage.dateReceivedAtRegistry.sendKeys("10/09/2017");
		CoreRNPage.dateReceivedAtRegistry.sendKeys(Keys.TAB);
		CoreRNPage.dateReceivedAtRegistry.sendKeys(Keys.TAB);
		CoreRNPage.applicant1DateSubmittedDay.sendKeys("01");
		CoreRNPage.applicant1DateSubmittedMonth.sendKeys("09");
		CoreRNPage.applicant1DateSubmittedYear.sendKeys("2017");
		CoreRNPage.applicant2DateSubmittedDay.sendKeys("01");
		CoreRNPage.applicant2DateSubmittedMonth.sendKeys("09");
		CoreRNPage.applicant2DateSubmittedYear.sendKeys("2017");
		CoreRNPage.typeOfRelationship.sendKeys("Domestic");
		CoreRNPage.applicant1FamilyName.sendKeys("Auto" + applicant1FamilyName);
		CoreRNPage.applicant1FamiliyNameSameAsBirth.sendKeys("Yes");
		CoreRNPage.applicant1FirstName.sendKeys("Auto" + applicant1GivenName);
		CoreRNPage.applicant1Sex.sendKeys("Male");
		CoreRNPage.applicant1BirthDay.sendKeys("01");
		CoreRNPage.applicant1BirthMonth.sendKeys("01");
		CoreRNPage.applicant1BirthYear.sendKeys("1990");
		CoreRNPage.applicant1Occupation.sendKeys("Bank Officer");
		CoreRNPage.applicant1RelationshipStatus.sendKeys("Married");
		CoreRNPage.applicant1BirthSuburb.sendKeys("Melbourne");
		CoreRNPage.applicant1AddressLine1.sendKeys("10 some street");
		CoreRNPage.applicant1AddressSuburb.sendKeys("Melbourne");
		CoreRNPage.applicant1AddressPostcode.sendKeys("3000");
		CoreRNPage.applicant1ResidingInVictoria.sendKeys("Yes");
		CoreRNPage.applicant1Phone.sendKeys("0454545450");
		CoreRNPage.applicant1Parent1Type.sendKeys("Mother");
		CoreRNPage.applicant1Parent1FamilyName.sendKeys("Auto" + applicant1FamilyName);
		CoreRNPage.applicant1Parent1FamilyNameSameAsBirth.sendKeys("Yes");
		CoreRNPage.applicant1Parent1FirstName.sendKeys("Auto" + applicant1MotherFirstName);
		CoreRNPage.applicant1Parent2Type.sendKeys("Father");
		CoreRNPage.applicant1Parent2FamilyName.sendKeys("Auto" + applicant1FamilyName);
		CoreRNPage.applicant1Parent2FamilyNameSameAsBirth.sendKeys("Yes");
		CoreRNPage.applicant1Parent2FirstName.sendKeys("Auto" + applicant1FatherFirstName);
		CoreRNPage.applicant1DateOfRelationshipDay.sendKeys("01");
		CoreRNPage.applicant1DateOfRelationshipMonth.sendKeys("01");
		CoreRNPage.applicant1DateOfRelationshipYear.sendKeys("2015");
		CoreRNPage.applicant1RelCelebrationDay.sendKeys("01");
		CoreRNPage.applicant1RelCelebrationMonth.sendKeys("01");
		CoreRNPage.applicant1RelCelebrationYear.sendKeys("2015");
		CoreRNPage.applicant2ContactFamilyName.sendKeys("Auto" + applicant2FamilyName);
		CoreRNPage.applicant2ContactFirstName.sendKeys("Auto" + applicant2FirstName);
		CoreRNPage.applicant2ContactPhone.sendKeys("0454545450");
		CoreRNPage.applicant2FamilyName.sendKeys("Auto" + applicant2FamilyName);
		CoreRNPage.applicant2FamilyNameSameAsBirth.sendKeys("Yes");
		CoreRNPage.applicant2FirstName.sendKeys("Auto" + applicant2FirstName);
		CoreRNPage.applicant2Sex.sendKeys("Female");
		CoreRNPage.applicant2BirthDay.sendKeys("01");
		CoreRNPage.applicant2BirthMonth.sendKeys("01");
		CoreRNPage.applicant2BirthYear.sendKeys("1990");
		CoreRNPage.applicant2Occupation.sendKeys("Bank Officer");
		CoreRNPage.applicant2RelationshipStatus.sendKeys("Married");
		CoreRNPage.applicant2BirthSuburb.sendKeys("Melbourne");
		CoreRNPage.applicant2AddressLine1.sendKeys("10 some street");
		CoreRNPage.applicant2AddressSuburb.sendKeys("Melbourne");
		CoreRNPage.applicant2AddressPostcode.sendKeys("3000");
		CoreRNPage.applicant2ResidingInVictoria.sendKeys("Yes");
		CoreRNPage.applicant2Phone.sendKeys("0454545450");
		CoreRNPage.applicant2Parent1Type.sendKeys("Mother");
		CoreRNPage.applicant2Parent1FamilyName.sendKeys("Auto" + applicant2FamilyName);
		CoreRNPage.applicant2Parent1FamilyNameSameAsBirth.sendKeys("Yes");
		CoreRNPage.applicant2Parent1FirstName.sendKeys("Auto" + applicant2MotherFirstName);
		CoreRNPage.applicant2Parent2Type.sendKeys("Father");
		CoreRNPage.applicant2Parent2FamilyName.sendKeys("Auto" + applicant2FamilyName);
		CoreRNPage.applicant2Parent2FamlyNameSameAsBirth.sendKeys("Yes");
		CoreRNPage.applicant2Parent2FirstName.sendKeys("Auto" + applicant2FatherFirstName);
		CoreControls.validateForm();
		CoreControls.overrideExceptionsOnform();
	}
}
