package modules;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.AdoptionPage;
import pageobjects.CoreControls;

public class FillAdoptionForm {

	public static String preAdoptionChildsNameFamilyName = RandomStringUtils.randomAlphabetic(6);
	public static String preAdoptionChildsNameGivenName = RandomStringUtils.randomAlphabetic(6);
	public static String childsNewNameFamilyName = RandomStringUtils.randomAlphabetic(6);
	public static String childsNewNameFirstGivenName = RandomStringUtils.randomAlphabetic(6);
	public static String adoptionParent1FamilyName = RandomStringUtils.randomAlphabetic(6);
	public static String adoptionParent1FirstGivenName = RandomStringUtils.randomAlphabetic(6);

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, AdoptionPage.class);

		Helper.waitFor(AdoptionPage.dateReceivedAtRegistry);
		AdoptionPage.dateReceivedAtRegistry.clear();
		AdoptionPage.dateReceivedAtRegistry.sendKeys("04/03/1999");
		AdoptionPage.dateReceivedAtRegistry.sendKeys(Keys.TAB);
		AdoptionPage.adoptionType.sendKeys("Overseas Born");
		AdoptionPage.adoptionOrderNumber.sendKeys("413241324");
		AdoptionPage.dateOfOrderDay.sendKeys("01");
		AdoptionPage.dateOfOrderMonth.sendKeys("10");
		AdoptionPage.dateOfOrderYear.sendKeys("1990");
		AdoptionPage.aoInRespectToAboriginalChild.sendKeys("Yes");
		AdoptionPage.singleParentAdoption.sendKeys("Yes");
		AdoptionPage.preAdoptionChildsNameFamilyName.sendKeys("Auto" + preAdoptionChildsNameFamilyName);
		AdoptionPage.preAdoptionChildsNameGivenName.sendKeys("Auto" + preAdoptionChildsNameGivenName);
		AdoptionPage.preAdoptionChildsDOBDay.sendKeys("12");
		AdoptionPage.preAdoptionChildsDOBMonth.sendKeys("08");
		AdoptionPage.preAdoptionChildsDOBYear.sendKeys("1980");
		AdoptionPage.childsSexAtBirth.sendKeys("Female");
		AdoptionPage.birthDetailsCountry.sendKeys("Iraq");
		AdoptionPage.birthDetailsSuburbTownCity.sendKeys("asdf");
		AdoptionPage.childsNewNameFamilyName.sendKeys("Auto" + childsNewNameFamilyName);
		AdoptionPage.childsNewNameFirstGivenName.sendKeys("Auto" + childsNewNameFirstGivenName);
		AdoptionPage.adoptionParent1RecordAs.sendKeys("Mother");
		AdoptionPage.adoptionParent1FamilyName.sendKeys("Auto" + adoptionParent1FamilyName);
		AdoptionPage.adoptionParent1FamilyNameAtBirth.sendKeys("Auto" + adoptionParent1FamilyName);
		AdoptionPage.adoptionParent1FirstGivenName.sendKeys("Auto" + adoptionParent1FirstGivenName);
		AdoptionPage.adoptionParent1DOBDay.sendKeys("10");
		AdoptionPage.adoptionParent1DOBMonth.sendKeys("03");
		AdoptionPage.adoptionParent1DOBYear.sendKeys("1950");
		AdoptionPage.adoptionParent1Occupation.sendKeys("Accountant");
		AdoptionPage.adoptionParent1PlaceOfBirthSuburbTownCity.sendKeys("asdf");
		AdoptionPage.adoptionParent1UsualPlaceOfResidenceLine1.sendKeys("12 faf");
		AdoptionPage.adoptionParent1UsualPlaceOfResidenceSuburb.sendKeys("uoaiudf");
		AdoptionPage.adoptionParent1usualPlaceOfResidencePostcode.sendKeys("3212");
		AdoptionPage.adoptionParent1EmailAddress.sendKeys("af@j.com");
		AdoptionPage.adoptionParent1TelephoneNo.sendKeys("0487139284");
		AdoptionPage.childrenOfThisRelationshipNumberOfIssues.sendKeys("0");
		AdoptionPage.otherChildrenOfParent1NumberOfIssues.sendKeys("0");
		AdoptionPage.adoptiveParentsRelatedToChild.sendKeys("No");
		AdoptionPage.informantDetailsRelationshipToSubject.sendKeys("Parent 1");
		AdoptionPage.informantDetailsFamilyName.sendKeys("Auto" + adoptionParent1FamilyName);
		AdoptionPage.informantDetailsFirstGivenName.sendKeys("Auto" + adoptionParent1FirstGivenName);
		AdoptionPage.informantDetailsResidentialAddressLine1.sendKeys("12 faf");
		AdoptionPage.informantDetailsResidentialAddressSuburb.sendKeys("uoaiudf");
		AdoptionPage.informantDetailsResidentialAddressPostcode.sendKeys("3212");
		AdoptionPage.memoValidated.sendKeys("Yes");
		CoreControls.validateForm();
		CoreControls.overrideExceptionsOnform();
		Thread.sleep(2000);
		String banermessage = CoreControls.successMessage.getText();
		Assert.assertTrue("Error Baner is not saying BR created",
				banermessage.equals("This Birth Registration has been successfully registered."));
	}
}
