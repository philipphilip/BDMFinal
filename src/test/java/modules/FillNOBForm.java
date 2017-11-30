package modules;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import helpers.Helper;
import pageobjects.CoreControls;
import pageobjects.CoreNobPage;

public class FillNOBForm {

	static String randChildFamilyName = RandomStringUtils.randomAlphabetic(6);
	static String randChildFirstName = RandomStringUtils.randomAlphabetic(6);
	static String randMotherFamilyNameAtBirth = RandomStringUtils.randomAlphabetic(6);
	static String randparent1FirstName = RandomStringUtils.randomAlphabetic(6);
	static String randparent2FirstName = RandomStringUtils.randomAlphabetic(6);
	static String randTextInformnt1_fmlyN = RandomStringUtils.randomAlphabetic(6);
	static String randTextInformant1_fstGvnN = RandomStringUtils.randomAlphabetic(6);
	static String randTextInformant2_fmlyN = RandomStringUtils.randomAlphabetic(6);
	static String randTextInformant2_frstGvnN = RandomStringUtils.randomAlphabetic(6);

	public static void Execute(WebDriver driver) throws Throwable {

		PageFactory.initElements(driver, CoreNobPage.class);

		Helper.waitFor(CoreNobPage.notifier_email);
		CoreNobPage.mothersFamilyName.sendKeys("Automated" + randChildFamilyName);
		CoreNobPage.mothersFamilyNameSameAsBirth.sendKeys("Yes");
		CoreNobPage.mothersGivenName_Core.sendKeys("Automated" + randparent1FirstName);
		CoreNobPage.mothersDOBDay.sendKeys("25");
		CoreNobPage.mothersDOBMonth.sendKeys("12");
		CoreNobPage.mothersDOBYear.sendKeys("1989");
		Helper.selectDropDownList(CoreNobPage.aboriginal_or_torres_strait_islander_origin, "No");
		CoreNobPage.street_and_number.sendKeys("12");
		CoreNobPage.address_line_two.sendKeys("Canning st");
		CoreNobPage.suburb.sendKeys("North Melbourne");
		CoreNobPage.postcode.sendKeys("3051");
		CoreNobPage.chiledDOBDay.sendKeys("01");
		CoreNobPage.chiledDOBMoth.sendKeys("08");
		CoreNobPage.chiledDOBYear.sendKeys("2017");
		CoreNobPage.chiled_time_of_birth.sendKeys("9:59");
		Helper.selectDropDownList(CoreNobPage.chiled_sex_at_birth, "male");
		CoreNobPage.chiled_born_alive.sendKeys("Yes");
		CoreNobPage.multiple_Birth.sendKeys("Yes");
		CoreNobPage.birthOrder.sendKeys("1");
		CoreNobPage.birthOrderOf.sendKeys("2");
		Helper.selectDropDownList(CoreNobPage.hospital_name, "Ballina District Hospital");
		Helper.selectDropDownList(CoreNobPage.Hospital_town_suburb, "Armidale");
		CoreNobPage.notifier_family_name.sendKeys("auto" + randTextInformant2_fmlyN);
		CoreNobPage.notifier_given_name.sendKeys("auto" + randparent2FirstName);
		CoreNobPage.notifier_email.sendKeys("john.smith@info.com");
		CoreControls.validateForm();
		CoreControls.overrideExceptionsOnform();
	}
}
