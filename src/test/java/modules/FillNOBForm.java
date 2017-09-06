package modules;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

	public static void Execute(WebDriver driver) throws Exception {

		PageFactory.initElements(driver, CoreNobPage.class);
		WebDriverWait waitForTabsMenue = new WebDriverWait(driver, 10000);
		CoreNobPage.notifier_email = waitForTabsMenue
				.until(ExpectedConditions.elementToBeClickable(CoreNobPage.notifier_email));
		CoreNobPage.mothersFamilyName.sendKeys("Automated" + randChildFamilyName);
		CoreNobPage.mothersGivenName_Core.sendKeys("Automated" + randparent1FirstName);
		CoreNobPage.mothersDOBDay.sendKeys("25");
		CoreNobPage.mothersDOBMonth.sendKeys("12");
		CoreNobPage.mothersDOBYear.sendKeys("1989");
		CoreNobPage.aboriginal_or_torres_strait_islander_origin.sendKeys("Decline to reply");
		CoreNobPage.street_and_number.sendKeys("12");
		CoreNobPage.address_line_two.sendKeys("Canning st");
		CoreNobPage.suburb.sendKeys("North Melbourne");
		CoreNobPage.postcode.sendKeys("3051");
		CoreNobPage.chiledDOBDay.sendKeys("01");
		CoreNobPage.chiledDOBMoth.sendKeys("08");
		CoreNobPage.chiledDOBYear.sendKeys("2017");
		CoreNobPage.chiled_time_of_birth.sendKeys("9:59");
		CoreNobPage.chiled_sex_at_birth.sendKeys("male");
		CoreNobPage.chiled_born_alive.sendKeys("Yes");
		CoreNobPage.multiple_Birth.sendKeys("Yes");
		CoreNobPage.birthOrder.sendKeys("1");
		CoreNobPage.birthOrderOf.sendKeys("2");
		CoreNobPage.hospital_name.sendKeys("Ballina District Hospital");
		CoreNobPage.Hospital_town_suburb.sendKeys("Armidale");
		CoreNobPage.notifier_family_name.sendKeys("auto" + randTextInformant2_fmlyN);
		CoreNobPage.notifier_given_name.sendKeys("auto" + randparent2FirstName);
		CoreNobPage.notifier_email.sendKeys("john.smith@info.com");

		CoreControls.validateForm();
		CoreControls.overrideExceptionsOnform();

	}

}
