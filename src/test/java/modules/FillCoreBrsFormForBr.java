package modules;

import helpers.DataHelper;
import helpers.Helper;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.CoreBrsPage;
import pageobjects.CoreControls;

//l.'.'

public class FillCoreBrsFormForBr {

	public static void Execute(WebDriver driver) throws Exception {

		PageFactory.initElements(driver, CoreBrsPage.class);
		WebDriverWait waitForTabsMenue = new WebDriverWait(driver, 10000);
		CoreBrsPage.informant2_emailAddress = waitForTabsMenue
				.until(ExpectedConditions.elementToBeClickable(CoreBrsPage.informant2_emailAddress));
		CoreBrsPage.whyIsntTheParentOfChildCompletingTheForm.sendKeys("Parent whereabouts unknown");

		String coreBrsChildsFamilyName = DataHelper.getRandomStringAs("coreBrsChildsFamilyName", 10);
		String coreBrsChildsFirstGivenName = DataHelper.getRandomStringAs("coreBrsChildsFirstGivenName", 10);
		CoreBrsPage.childs_familyName.sendKeys(coreBrsChildsFamilyName);
		CoreBrsPage.childs_firstGivenName.sendKeys(coreBrsChildsFirstGivenName);

		CoreBrsPage.childs_DOB_day.sendKeys("17");
		CoreBrsPage.childs_DOB_month.sendKeys("07");
		CoreBrsPage.childs_DOB_year.sendKeys("2017");
		CoreBrsPage.sexAtBirth.sendKeys("male");
		CoreBrsPage.was_childs_bornAlive.sendKeys("Yes");
		CoreBrsPage.childs_weight.sendKeys("3500");
		Helper.selectDropDownList(CoreBrsPage.hospitalName, "Auburn District Hospital");
		Helper.selectDropDownList(CoreBrsPage.hospitalTownSuburbCity, "Auburn");
		CoreBrsPage.parent1_recordAs.sendKeys("Mother");

		String coreBrMotherFamilyName = DataHelper.getStoredData("coreBrMotherFamilyName");
		String coreBrMotherFirstName = DataHelper.getStoredData("coreBrMotherFirstName");
		System.out.println("brs coreBrMotherFirstName=" + coreBrMotherFirstName);
		CoreBrsPage.parent1_familyName.sendKeys(coreBrMotherFamilyName);
		String coreBrMotherFamilyNameAtBirth = DataHelper.getRandomStringAs("coreBrMotherFamilyNameAtBirth", 10);
		CoreBrsPage.parent1_familyNameAtBirth.sendKeys(coreBrMotherFamilyNameAtBirth);
		CoreBrsPage.parent1_firstGivenName.sendKeys(coreBrMotherFirstName);

		CoreBrsPage.parent1_dateOfBirth_day.sendKeys("25");
		CoreBrsPage.parent1_dateOfBirth_month.sendKeys("12");
		CoreBrsPage.parent1_dateOfBirth_year.sendKeys("1989");
		CoreBrsPage.parent1_occupation.sendKeys("accountant");
		Helper.selectDropDownList(CoreBrsPage.parent1_aboriginal, "Aboriginal");
		CoreBrsPage.parent1_placeOfBirth_suburbTownCity.sendKeys("Coburg");
		CoreBrsPage.parent1_usualPlaceOfResidence_line1.sendKeys("23 Stockade AEV");
		CoreBrsPage.parent1_usualPlaceOfResidence_Suburb.sendKeys("Coburg");
		CoreBrsPage.parent1_usualPlaceOfResidence_postcode.sendKeys("3058");
		CoreBrsPage.parent1_emailAddress.sendKeys("info@test.com");
		CoreBrsPage.doYouparent1HaveAnySafetyConcernsFromParent2BeingContacted.sendKeys("No");

		String coreBrsParent2FamilyName = DataHelper.getRandomStringAs("coreBrsParent2FamilyName", 10);
		String coreBrsParent2FirstName = DataHelper.getRandomStringAs("coreBrsParent2FirstName", 10);
		CoreBrsPage.parent2ParticipationDetails_familyName.sendKeys(coreBrsParent2FamilyName);
		CoreBrsPage.parent2ParticipationDetails_firstGivenName.sendKeys(coreBrsParent2FirstName);

		CoreBrsPage.parent2ParticipationDetails_emailAddress.sendKeys("billing@test.com");
		CoreBrsPage.isThereADisputeOfChildsName.sendKeys("No");
		CoreBrsPage.parent2_recordAs.sendKeys("Father");

		String parent2FamilyName = DataHelper.getRandomStringAs("parent2FamilyName", 10);
		String parent2FirstGivenName = DataHelper.getRandomStringAs("parent2FirstGivenName", 10);
		CoreBrsPage.parent2_familyName.sendKeys(parent2FamilyName);
		CoreBrsPage.parent2_firstGivenName.sendKeys(parent2FirstGivenName);

		CoreBrsPage.parent2dateOfBirth_day.sendKeys("02");
		CoreBrsPage.parent2dateOfBirth_month.sendKeys("04");
		CoreBrsPage.parent2dateOfBirth_year.sendKeys("1980");
		CoreBrsPage.parent2_occupation.sendKeys("Test");
		Helper.selectDropDownList(CoreBrsPage.parent2_aboriginal, "Decline to Reply");
		CoreBrsPage.parent2_suburbTownCity.sendKeys("Fawkner");
		CoreBrsPage.parent2_usualPlaceOfResidence_line1.sendKeys("16 Preston st");
		CoreBrsPage.parent2_usualPlaceOfResidence_suburb.sendKeys("Fawkner");
		CoreBrsPage.parent2_usualPlaceOfResidence_postcode.sendKeys("3060");
		CoreBrsPage.parent2_emailAddress.sendKeys("billing@test.com");
		CoreBrsPage.relationshipStatus.sendKeys("Married");
		Thread.sleep(3000);
		CoreBrsPage.dateRelationshipRegistredDay.sendKeys("01");
		CoreBrsPage.dateOfRelationshipRegistrationMonth.sendKeys("01");
		CoreBrsPage.dateOfRelationshipRegistrationYear.sendKeys("2000");

		CoreBrsPage.childrenOfThisRelationship_Suburb.sendKeys("Carlton");
		CoreBrsPage.informant1_relationshipToSubject.sendKeys("Parent 1");

		CoreBrsPage.informant1_familyName.sendKeys(coreBrMotherFamilyName);
		CoreBrsPage.informant1_firstGivenName.sendKeys(coreBrMotherFirstName);

		CoreBrsPage.informant1_DOB_day.sendKeys("12");
		CoreBrsPage.informant1_DOB_month.sendKeys("05");
		CoreBrsPage.informant1_DOB_year.sendKeys("1970");
		CoreBrsPage.informant1_residentialAddress_line1.sendKeys("21 Canning st");
		CoreBrsPage.informant1_residentialAddress_suburb.sendKeys("North Melbounre");
		CoreBrsPage.informant1_residentialAddress_postcode.sendKeys("3051");
		CoreBrsPage.informant1_contactAddress_line1.sendKeys("21 Canning st");
		CoreBrsPage.informant1_contactAddress_suburb.sendKeys("North Melbounre");
		CoreBrsPage.informant1_contactAddress_postcode.sendKeys("3051");
		CoreBrsPage.informant1_emailAddress.sendKeys("adf@s.com");
		CoreBrsPage.informant2_relationshipToSubject.sendKeys("Parent 2");

		CoreBrsPage.informant2_familyName.sendKeys(coreBrsParent2FamilyName);
		CoreBrsPage.informant2_firstGivenName.sendKeys(coreBrsParent2FirstName);

		CoreBrsPage.informant2_DOB_day.sendKeys("13");
		CoreBrsPage.informant2_DOB_month.sendKeys("06");
		CoreBrsPage.informant2_DOB_year.sendKeys("1971");
		CoreBrsPage.informant2_residentialAddress_line1.sendKeys("22 Canning st");
		CoreBrsPage.informant2_residentialAddress_suburb.sendKeys("North Melbounre");
		CoreBrsPage.informant2_residentialAddress_postcode.sendKeys("3051");
		CoreBrsPage.informant2_contactAddress_line1.sendKeys("22 Canning st");
		CoreBrsPage.informant2_contactAddress_suburb.sendKeys("North Melbounre");
		CoreBrsPage.informant2_contactAddress_postcode.sendKeys("3051");
		CoreBrsPage.informant2_emailAddress.sendKeys("adfd@ss.com");

		// CoreControls.selectSave();
		// CoreControls.clickGo();

	}

}
