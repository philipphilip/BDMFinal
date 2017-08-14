package modules;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.CoreBrsPage;

import pageobjects.CoreControls;

//l.'.'

public class FillBRSForm {

	static String randChildFamilyName = RandomStringUtils.randomAlphabetic(6);
	static String randChildFirstName = RandomStringUtils.randomAlphabetic(6);
	static String randMotherFamilyNameAtBirth = RandomStringUtils.randomAlphabetic(6);
	static String randparent1FirstName = RandomStringUtils.randomAlphabetic(6);
	static String randparent2FirstName = RandomStringUtils.randomAlphabetic(6);
	static String randTextInformnt1_fmlyN = RandomStringUtils.randomAlphabetic(6);
	static String randTextInformant1_fstGvnN = RandomStringUtils.randomAlphabetic(6);
	static String randTextInformant2_fmlyN = RandomStringUtils.randomAlphabetic(6);
	static String randTextInformant2_frstGvnN = RandomStringUtils.randomAlphabetic(6);

	public static void Execute(WebDriver driver) throws Exception {

		PageFactory.initElements(driver, CoreBrsPage.class);
		PageFactory.initElements(driver, CoreControls.class);
		WebDriverWait waitForTabsMenue = new WebDriverWait(driver, 10000);
		CoreBrsPage.informant2_emailAddress = waitForTabsMenue
				.until(ExpectedConditions.elementToBeClickable(CoreBrsPage.informant2_emailAddress));
		CoreBrsPage.whyIsntTheParentOfChildCompletingTheForm.sendKeys("Parent whereabouts unknown");
		CoreBrsPage.childs_familyName.sendKeys("Automated" + randChildFamilyName);
		CoreBrsPage.childs_firstGivenName.sendKeys("Automated" + randChildFirstName);
		CoreBrsPage.childs_DOB_day.sendKeys("01");
		CoreBrsPage.childs_DOB_month.sendKeys("08");
		CoreBrsPage.childs_DOB_year.sendKeys("2017");
		CoreBrsPage.sexAtBirth.sendKeys("Femail");
		CoreBrsPage.childs_gestationPeriod.sendKeys("45");
		CoreBrsPage.childs_weight.sendKeys("3000");
		CoreBrsPage.hospitalName.sendKeys("Ballina District Hospital");
		CoreBrsPage.hospitalTownSuburbCity.sendKeys("Armidale");
		CoreBrsPage.parent1_recordAs.sendKeys("Mother");
		CoreBrsPage.parent1_familyName.sendKeys("Automated" + randChildFamilyName);
		CoreBrsPage.parent1_familyNameAtBirth.sendKeys("Automated" + randMotherFamilyNameAtBirth);
		CoreBrsPage.parent1_firstGivenName.sendKeys("Automated" + randparent1FirstName);
		CoreBrsPage.parent1_dateOfBirth_day.sendKeys("25");
		CoreBrsPage.parent1_dateOfBirth_month.sendKeys("12");
		CoreBrsPage.parent1_dateOfBirth_year.sendKeys("1989");
		CoreBrsPage.parent1_occupation.sendKeys("accountant");
		CoreBrsPage.parent1_aboriginal.sendKeys("Decline to Reply");
		CoreBrsPage.parent1_placeOfBirth_suburbTownCity.sendKeys("Coburg");
		CoreBrsPage.parent1_usualPlaceOfResidence_line1.sendKeys("12 Canning St");
		CoreBrsPage.parent1_usualPlaceOfResidence_Suburb.sendKeys("North Melbourne");
		CoreBrsPage.parent1_usualPlaceOfResidence_postcode.sendKeys("3051");
		CoreBrsPage.parent1_emailAddress.sendKeys("info@test.com");
		CoreBrsPage.doYouparent1HaveAnySafetyConcernsFromParent2BeingContacted.sendKeys("No");
		CoreBrsPage.parent2ParticipationDetails_familyName.sendKeys("Smith");
		CoreBrsPage.parent2ParticipationDetails_firstGivenName.sendKeys("John");
		CoreBrsPage.parent2ParticipationDetails_emailAddress.sendKeys("billing@test.com");
		CoreBrsPage.isThereADisputeOfChildsName.sendKeys("No");
		CoreBrsPage.parent2_recordAs.sendKeys("Father");
		CoreBrsPage.parent2_familyName.sendKeys("Automated" + randChildFamilyName);
		CoreBrsPage.parent2_firstGivenName.sendKeys("Automated" + randparent2FirstName);
		CoreBrsPage.parent2dateOfBirth_day.sendKeys("02");
		CoreBrsPage.parent2dateOfBirth_month.sendKeys("04");
		CoreBrsPage.parent2dateOfBirth_year.sendKeys("1980");
		CoreBrsPage.parent2_occupation.sendKeys("accountant");
		CoreBrsPage.parent2_aboriginal.sendKeys("Decline to Reply");
		CoreBrsPage.parent2_suburbTownCity.sendKeys("Fawkner");
		CoreBrsPage.parent2_usualPlaceOfResidence_line1.sendKeys("16 Preston st");
		CoreBrsPage.parent2_usualPlaceOfResidence_suburb.sendKeys("Fawkner");
		CoreBrsPage.parent2_usualPlaceOfResidence_postcode.sendKeys("3060");
		CoreBrsPage.parent2_emailAddress.sendKeys("billing@test.com");
		CoreBrsPage.relationshipStatus.sendKeys("Married");
		CoreBrsPage.dateOfRelationshipRegistrationDay.sendKeys("10");
		CoreBrsPage.dateOfRelationshipRegistrationMonth.sendKeys("10");
		CoreBrsPage.dateOfRelationshipRegistrationYear.sendKeys("1999");
		CoreBrsPage.childrenOfThisRelationship_Suburb.sendKeys("Carlton");
		CoreBrsPage.informant1_relationshipToSubject.sendKeys("Stakeholder");
		CoreBrsPage.informant1_familyName.sendKeys("auto" + randTextInformnt1_fmlyN);
		CoreBrsPage.informant1_firstGivenName.sendKeys("auto" + randTextInformant1_fstGvnN);
		CoreBrsPage.informant1_DOB_day.sendKeys("12");
		CoreBrsPage.informant1_DOB_month.sendKeys("05");
		CoreBrsPage.informant1_DOB_year.sendKeys("1970");
		CoreBrsPage.informant1_residentialAddress_line1.sendKeys("21 Canning st");
		CoreBrsPage.informant1_residentialAddress_suburb.sendKeys("North Melbounre");
		CoreBrsPage.informant1_residentialAddress_postcode.sendKeys("3051");
		CoreBrsPage.informant1_contactAddress_line1.sendKeys("21 Canning st");
		CoreBrsPage.informant1_contactAddress_suburb.sendKeys("North Melbounre");
		CoreBrsPage.informant1_contactAddress_postcode.sendKeys("3051");
		CoreBrsPage.informant1_emailAddress.sendKeys("john.smith@info.com");
		CoreBrsPage.informant2_relationshipToSubject.sendKeys("Parent 2");
		CoreBrsPage.informant2_familyName.sendKeys("auto" + randTextInformant2_fmlyN);
		CoreBrsPage.informant2_firstGivenName.sendKeys("auto" + randTextInformant2_frstGvnN);
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
		CoreControls.validateForm();
		CoreControls.overrideExceptionsOnform();
		CoreControls.saveForm();
	}

}
