package modules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.CoreBrsPage;
import pageobjects.CoreControls;

public class FillBRSForm {

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, CoreBrsPage.class);
		PageFactory.initElements(driver, CoreControls.class);
		Helper.waitFor(CoreBrsPage.whyIsntTheParentOfChildCompletingTheForm);
		CoreBrsPage.whyIsntTheParentOfChildCompletingTheForm.sendKeys("Parent whereabouts unknown");
		CoreBrsPage.childs_familyName.sendKeys("Automated" + FillNOBForm.randChildFamilyName);

		CoreBrsPage.childs_firstGivenName.sendKeys("Automated" + FillNOBForm.randChildFirstName);
		CoreBrsPage.childs_DOB_day.sendKeys("01");
		CoreBrsPage.childs_DOB_month.sendKeys("08");
		CoreBrsPage.childs_DOB_year.sendKeys("2017");
		Helper.selectDropDownList(CoreBrsPage.sexAtBirth, "Male");
		CoreBrsPage.child_born_Alive.sendKeys("Yes");
		CoreBrsPage.multipleBirth.sendKeys("Yes");
		CoreBrsPage.birthOrder.sendKeys("1");
		CoreBrsPage.birthOrderOf.sendKeys("2");
		CoreBrsPage.childs_weight.sendKeys("3000");
		Helper.selectDropDownList(CoreBrsPage.hospitalName, "Albury Wodonga Health");
		Helper.selectDropDownList(CoreBrsPage.hospitalTownSuburbCity, "WODONGA");
		Helper.selectDropDownList(CoreBrsPage.parent1_recordAs, "Mother");
		CoreBrsPage.parent1_familyName.sendKeys("Automated" + FillNOBForm.randChildFamilyName);
		CoreBrsPage.parent1_IsFamilyNameSameAtBirth.sendKeys("No");
		CoreBrsPage.parent1_familyNameAtBirth.sendKeys("Automated" + FillNOBForm.randMotherFamilyNameAtBirth);
		CoreBrsPage.parent1_firstGivenName.sendKeys("Automated" + FillNOBForm.randparent1FirstName);
		CoreBrsPage.parent1_dateOfBirth_day.sendKeys("25");
		CoreBrsPage.parent1_dateOfBirth_month.sendKeys("12");
		CoreBrsPage.parent1_dateOfBirth_year.sendKeys("1989");
		Helper.selectDropDownList(CoreBrsPage.parent1_occupation, "Accountant");
		Helper.selectDropDownList(CoreBrsPage.parent1_aboriginal, "No");
		CoreBrsPage.parent1_placeOfBirth_suburbTownCity.sendKeys("Coburg");
		CoreBrsPage.parent1_usualPlaceOfResidence_line1.sendKeys("12 CanningSt");
		CoreBrsPage.parent1_usualPlaceOfResidence_Suburb.sendKeys("NorthMelbourne");
		CoreBrsPage.parent1_usualPlaceOfResidence_postcode.sendKeys("3051");
		CoreBrsPage.parent1_emailAddress.sendKeys("info@test.com");
		CoreBrsPage.doYouparent1HaveAnySafetyConcernsFromParent2BeingContacted.sendKeys("No");
		CoreBrsPage.parent2ParticipationDetails_familyName.sendKeys("Automated" + FillNOBForm.randChildFamilyName);
		CoreBrsPage.parent2ParticipationDetails_firstGivenName.sendKeys("Automated" + FillNOBForm.randparent2FirstName);
		CoreBrsPage.parent2ParticipationDetails_emailAddress.sendKeys("billing@test.com");
		CoreBrsPage.secondParentAgreeWtihParentage.sendKeys("Yes");
//		CoreBrsPage.parentageDispute_dateOfBirth_day.sendKeys("12");
//		CoreBrsPage.parentageDispute_dateOfBirth_month.sendKeys("05");
//		CoreBrsPage.parentageDispute_dateOfBirth_year.sendKeys("1970");
		CoreBrsPage.isThereADisputeOfChildsName.sendKeys("No");
		Helper.selectDropDownList(CoreBrsPage.parent2_recordAs, "Father");
		CoreBrsPage.parent2_familyName.sendKeys("Automated" + FillNOBForm.randChildFamilyName);
		CoreBrsPage.parent2_firstGivenName.sendKeys("Automated" + FillNOBForm.randparent2FirstName);
		CoreBrsPage.isParent2FamilyNameSameToFamilyNameAtBirth.sendKeys("Yes");
		CoreBrsPage.parent2dateOfBirth_day.sendKeys("02");
		CoreBrsPage.parent2dateOfBirth_month.sendKeys("04");
		CoreBrsPage.parent2dateOfBirth_year.sendKeys("1980");
		CoreBrsPage.parent2_occupation.sendKeys("accountant");
		Helper.selectDropDownList(CoreBrsPage.parent2_aboriginal, "No");
		CoreBrsPage.parent2_suburbTownCity.sendKeys("Fawkner");
		CoreBrsPage.parent2_usualPlaceOfResidence_line1.sendKeys("16 Preston st");
		CoreBrsPage.parent2_usualPlaceOfResidence_suburb.sendKeys("Fawkner");
		CoreBrsPage.parent2_usualPlaceOfResidence_postcode.sendKeys("3060");
		CoreBrsPage.parent2_emailAddress.sendKeys("billing@test.com");
		CoreBrsPage.parentageDispute_familyName.sendKeys("Automated" + FillNOBForm.randChildFamilyName);
		Helper.selectDropDownList(CoreBrsPage.relationshipStatus, "Married");
		CoreBrsPage.dateOfRelationshipRegistrationDay.sendKeys("10");
		CoreBrsPage.dateOfRelationshipRegistrationMonth.sendKeys("10");
		CoreBrsPage.dateOfRelationshipRegistrationYear.sendKeys("1999");
		CoreBrsPage.childrenOfThisRelationship_Suburb.sendKeys("Carlton");
		CoreBrsPage.informant1_relationshipToSubject.sendKeys("Other");
		CoreBrsPage.informant1RelationshipDescription.sendKeys("asdf");
		CoreBrsPage.informant1_familyName.clear();
		CoreBrsPage.informant1_familyName.sendKeys("auto" + FillNOBForm.randTextInformnt1_fmlyN);
		CoreBrsPage.informant1_firstGivenName.clear();
		CoreBrsPage.informant1_firstGivenName.sendKeys("auto" + FillNOBForm.randTextInformant1_fstGvnN);
		CoreBrsPage.informant1_DOB_day.clear();
		CoreBrsPage.informant1_DOB_day.sendKeys("12");
		CoreBrsPage.informant1_DOB_month.clear();
		CoreBrsPage.informant1_DOB_month.sendKeys("05");
		CoreBrsPage.informant1_DOB_year.clear();
		CoreBrsPage.informant1_DOB_year.sendKeys("1970");
		CoreBrsPage.informant1_residentialAddress_line1.clear();
		CoreBrsPage.informant1_residentialAddress_line1.sendKeys("21 Canning st");
		CoreBrsPage.informant1_residentialAddress_suburb.clear();
		CoreBrsPage.informant1_residentialAddress_suburb.sendKeys("North Melbounre");
		CoreBrsPage.informant1_residentialAddress_postcode.clear();
		CoreBrsPage.informant1_residentialAddress_postcode.sendKeys("3052");
		CoreBrsPage.informant1_contactAddress_line1.clear();
		CoreBrsPage.informant1_contactAddress_line1.sendKeys("21 Canning st");
		CoreBrsPage.informant1_contactAddress_suburb.clear();
		CoreBrsPage.informant1_contactAddress_suburb.sendKeys("North Melbounre");
		CoreBrsPage.informant1_contactAddress_postcode.clear();
		CoreBrsPage.informant1_contactAddress_postcode.sendKeys("3053");
		CoreBrsPage.informant1_emailAddress.clear();
		CoreBrsPage.informant1_emailAddress.sendKeys("john.smith@info.com");
		Helper.selectDropDownList(CoreBrsPage.informant2RelationshipToSubject, "Parent");
		CoreBrsPage.informant2_familyName.clear();
		CoreBrsPage.informant2_familyName.sendKeys("auto" + FillNOBForm.randTextInformant2_fmlyN);
		CoreBrsPage.informant2_firstGivenName.clear();
		CoreBrsPage.informant2_firstGivenName.sendKeys("auto" + FillNOBForm.randTextInformant2_frstGvnN);
		CoreBrsPage.informant2_DOB_day.clear();
		CoreBrsPage.informant2_DOB_day.sendKeys("13");
		CoreBrsPage.informant2_DOB_month.clear();
		CoreBrsPage.informant2_DOB_month.sendKeys("06");
		CoreBrsPage.informant2_DOB_year.clear();
		CoreBrsPage.informant2_DOB_year.sendKeys("1971");
		CoreBrsPage.parent2_aboriginal.sendKeys("Aboriginal");
		CoreBrsPage.parent2Details_deceased.sendKeys("Yes");
		CoreBrsPage.informant2_residentialAddress_line1.clear();
		CoreBrsPage.informant2_residentialAddress_line1.sendKeys("22 Canning st");
		CoreBrsPage.informant2_residentialAddress_suburb.clear();
		CoreBrsPage.informant2_residentialAddress_suburb.sendKeys("North Melbounre");
		CoreBrsPage.informant2_residentialAddress_postcode.clear();
		CoreBrsPage.informant2_residentialAddress_postcode.sendKeys("3054");
		CoreBrsPage.informant2_contactAddress_line1.clear();
		CoreBrsPage.informant2_contactAddress_line1.sendKeys("22 Canning st");
		CoreBrsPage.informant2_contactAddress_suburb.clear();
		CoreBrsPage.informant2_contactAddress_suburb.sendKeys("North Melbounre");
		CoreBrsPage.informant2_contactAddress_postcode.clear();
		CoreBrsPage.informant2_contactAddress_postcode.sendKeys("3055");
		CoreBrsPage.informant2_emailAddress.clear();
		CoreBrsPage.informant2_emailAddress.sendKeys("adfd@ss.com");
		CoreControls.validateForm();
		CoreControls.overrideExceptionsOnform();

		// CoreControls.matchToFirstRadioButton();
	}
}
