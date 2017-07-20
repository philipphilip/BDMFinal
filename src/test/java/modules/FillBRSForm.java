package modules;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helpers.Helper;
import pageobjects.BRSPage;
import pageobjects.CoreControls;

//l.'.'

public class FillBRSForm {

	public static void Execute(WebDriver driver) throws Exception {

		PageFactory.initElements(driver, BRSPage.class);
		WebDriverWait waitForTabsMenue = new WebDriverWait(driver, 10000);
		BRSPage.informant2_emailAddress = waitForTabsMenue
				.until(ExpectedConditions.elementToBeClickable(BRSPage.informant2_emailAddress));
		BRSPage.whyIsntTheParentOfChildCompletingTheForm.sendKeys("Parent whereabouts unknown");
		BRSPage.childs_familyName.sendKeys("smith");
		BRSPage.childs_firstGivenName.sendKeys("smith");
		BRSPage.childs_DOB_day.sendKeys("11");
		BRSPage.childs_DOB_month.sendKeys("04");
		BRSPage.childs_DOB_year.sendKeys("2017");
		BRSPage.sexAtBirth.sendKeys("male");
		BRSPage.was_childs_bornAlive.sendKeys("Yes");
		BRSPage.childs_weight.sendKeys("3500");
		BRSPage.hospitalName.sendKeys("Auburn District Hospital");
		BRSPage.hospitalTownSuburbCity.sendKeys("Auburn");
		BRSPage.parent1_recordAs.sendKeys("Mother");
		BRSPage.parent1_familyName.sendKeys("McDonald");
		BRSPage.parent1_familyNameAtBirth.sendKeys("Sonia");
		String parent1FirstName = RandomStringUtils.randomAlphabetic(6);
		BRSPage.parent1_firstGivenName.sendKeys("aut" + parent1FirstName);
		BRSPage.parent1_dateOfBirth_day.sendKeys("25");
		BRSPage.parent1_dateOfBirth_month.sendKeys("12");
		BRSPage.parent1_dateOfBirth_year.sendKeys("1989");
		BRSPage.parent1_occupation.sendKeys("accountant");
		BRSPage.parent1_aboriginal.sendKeys("Unknown");
		BRSPage.parent1_placeOfBirth_suburbTownCity.sendKeys("Coburg");
		BRSPage.parent1_usualPlaceOfResidence_line1.sendKeys("23 Stockade AEV");
		BRSPage.parent1_usualPlaceOfResidence_Suburb.sendKeys("Coburg");
		BRSPage.parent1_usualPlaceOfResidence_postcode.sendKeys("3058");
		BRSPage.parent1_emailAddress.sendKeys("info@test.com");
		BRSPage.doYouparent1HaveAnySafetyConcernsFromParent2BeingContacted.sendKeys("No");
		BRSPage.parent2ParticipationDetails_familyName.sendKeys("Smith");
		BRSPage.parent2ParticipationDetails_firstGivenName.sendKeys("John");
		BRSPage.parent2ParticipationDetails_emailAddress.sendKeys("billing@test.com");
		BRSPage.isThereADisputeOfChildsName.sendKeys("No");
		BRSPage.parent2_recordAs.sendKeys("Father");
		BRSPage.parent2_familyName.sendKeys("smith");
		BRSPage.parent2_firstGivenName.sendKeys("lolozjjsbo");
		BRSPage.parent2dateOfBirth_day.sendKeys("02");
		BRSPage.parent2dateOfBirth_month.sendKeys("04");
		BRSPage.parent2dateOfBirth_year.sendKeys("1980");
		BRSPage.parent2_occupation.sendKeys("Test");
		BRSPage.parent2_aboriginal.sendKeys("Unknown");
		BRSPage.parent2_suburbTownCity.sendKeys("Fawkner");
		BRSPage.parent2_usualPlaceOfResidence_line1.sendKeys("16 Preston st");
		BRSPage.parent2_usualPlaceOfResidence_suburb.sendKeys("Fawkner");
		BRSPage.parent2_usualPlaceOfResidence_postcode.sendKeys("3060");
		BRSPage.parent2_emailAddress.sendKeys("billing@test.com");
		BRSPage.relationshipStatus.sendKeys("Married");
		BRSPage.dateRelationshipRegistredDay.sendKeys("10");
		BRSPage.dateRelationshipRegistredMonth.sendKeys("08");
		BRSPage.dateRelationshipRegistredYear.sendKeys("1998");
		BRSPage.childrenOfThisRelationship_Suburb.sendKeys("Carlton");
		BRSPage.informant1_relationshipToSubject.sendKeys("Parent 1");
		String randTextInformnt1_fmlyN = RandomStringUtils.randomAlphabetic(6);
		BRSPage.informant1_familyName.sendKeys("auto" + randTextInformnt1_fmlyN);
		String randTextInformant1_fstGvnN = RandomStringUtils.randomAlphabetic(6);
		BRSPage.informant1_firstGivenName.sendKeys("auto" + randTextInformant1_fstGvnN);
		BRSPage.informant1_DOB_day.sendKeys("12");
		BRSPage.informant1_DOB_month.sendKeys("05");
		BRSPage.informant1_DOB_year.sendKeys("1970");
		BRSPage.informant1_residentialAddress_line1.sendKeys("21 Canning st");
		BRSPage.informant1_residentialAddress_suburb.sendKeys("North Melbounre");
		BRSPage.informant1_residentialAddress_postcode.sendKeys("3051");
		BRSPage.informant1_contactAddress_line1.sendKeys("21 Canning st");
		BRSPage.informant1_contactAddress_suburb.sendKeys("North Melbounre");
		BRSPage.informant1_contactAddress_postcode.sendKeys("3051");
		BRSPage.informant1_emailAddress.sendKeys("adf@s.com");
		BRSPage.informant2_relationshipToSubject.sendKeys("Parent 2");
		String randTextInformant2_fmlyN = RandomStringUtils.randomAlphabetic(6);
		BRSPage.informant2_familyName.sendKeys("auto" + randTextInformant2_fmlyN);
		String randTextInformant2_frstGvnN = RandomStringUtils.randomAlphabetic(6);
		BRSPage.informant2_firstGivenName.sendKeys("auto" + randTextInformant2_frstGvnN);
		BRSPage.informant2_DOB_day.sendKeys("13");
		BRSPage.informant2_DOB_month.sendKeys("06");
		BRSPage.informant2_DOB_year.sendKeys("1971");
		BRSPage.informant2_residentialAddress_line1.sendKeys("22 Canning st");
		BRSPage.informant2_residentialAddress_suburb.sendKeys("North Melbounre");
		BRSPage.informant2_residentialAddress_postcode.sendKeys("3051");
		BRSPage.informant2_contactAddress_line1.sendKeys("22 Canning st");
		BRSPage.informant2_contactAddress_suburb.sendKeys("North Melbounre");
		BRSPage.informant2_contactAddress_postcode.sendKeys("3051");
		BRSPage.informant2_emailAddress.sendKeys("adfd@ss.com");
		BRSPage.validateform();
		CoreControls.selectSave();
		Thread.sleep(3000);
		CoreControls.clickGo();

	}

}
