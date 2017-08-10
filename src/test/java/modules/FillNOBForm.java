package modules;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.CoreControls;
import pageobjects.CoreNobPage;

public class FillNOBForm {

	public static void Execute(WebDriver driver) throws Exception {

		PageFactory.initElements(driver, CoreNobPage.class);
		WebDriverWait waitForTabsMenue = new WebDriverWait(driver, 10000);
		CoreNobPage.notifier_email = waitForTabsMenue
				.until(ExpectedConditions.elementToBeClickable(CoreNobPage.notifier_email));
		CoreNobPage.mothersFamilyName.sendKeys("McDonald");
		String motherFirstName = RandomStringUtils.randomAlphabetic(6);
		CoreNobPage.mothersGivenName_Core.sendKeys("auto" + motherFirstName);
		CoreNobPage.mothersDOBDay.sendKeys("25");
		CoreNobPage.mothersDOBMonth.sendKeys("12");
		CoreNobPage.mothersDOBYear.sendKeys("1989");
		CoreNobPage.aboriginal_or_torres_strait_islander_origin.sendKeys("Decline to reply");
		CoreNobPage.street_and_number.sendKeys("12");
		CoreNobPage.address_line_two.sendKeys("Canning st");
		CoreNobPage.suburb.sendKeys("North Melbourne");
		CoreNobPage.postcode.sendKeys("3051");
		CoreNobPage.chiledDOBDay.sendKeys("11");
		CoreNobPage.chiledDOBMoth.sendKeys("04");
		CoreNobPage.chiledDOBYear.sendKeys("2017");
		CoreNobPage.chiled_time_of_birth.sendKeys("9:59");
		CoreNobPage.chiled_sex_at_birth.sendKeys("male");
		CoreNobPage.hospital_name.sendKeys("Auburn District Hospital");
		CoreNobPage.Hospital_town_suburb.sendKeys("Auburn");
		CoreNobPage.notifier_family_name.sendKeys("Smith");
		CoreNobPage.notifier_given_name.sendKeys("JOhn");
		CoreNobPage.notifier_email.sendKeys("john.smith@info.com");
		CoreControls.saveForm();
	}

}
