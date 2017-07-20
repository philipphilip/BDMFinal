package modules;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.CoreControls;
import pageobjects.NOBPage;

public class FillNOBForm {

	public static void Execute(WebDriver driver) throws Exception {

		PageFactory.initElements(driver, NOBPage.class);
		WebDriverWait waitForTabsMenue = new WebDriverWait(driver, 10000);
		NOBPage.notifier_email = waitForTabsMenue
				.until(ExpectedConditions.elementToBeClickable(NOBPage.notifier_email));
		NOBPage.mothersFamilyName.sendKeys("McDonald");
		String motherFirstName = RandomStringUtils.randomAlphabetic(6);
		NOBPage.mothersGivenName_Core.sendKeys("auto" + motherFirstName);
		NOBPage.mothersDOBDay.sendKeys("25");
		NOBPage.mothersDOBMonth.sendKeys("12");
		NOBPage.mothersDOBYear.sendKeys("1989");
		NOBPage.aboriginal_or_torres_strait_islander_origin.sendKeys("Unknown");
		NOBPage.street_and_number.sendKeys("12");
		NOBPage.address_line_two.sendKeys("Canning st");
		NOBPage.suburb.sendKeys("North Melbourne");
		NOBPage.postcode.sendKeys("3051");
		NOBPage.chiledDOBDay.sendKeys("11");
		NOBPage.chiledDOBMoth.sendKeys("04");
		NOBPage.chiledDOBYear.sendKeys("2017");
		NOBPage.chiled_time_of_birth.sendKeys("9:59");
		NOBPage.chiled_sex_at_birth.sendKeys("male");
		NOBPage.hospital_name.sendKeys("Auburn District Hospital");
		NOBPage.Hospital_town_suburb.sendKeys("Auburn");
		NOBPage.notifier_family_name.sendKeys("Smith");
		NOBPage.notifier_given_name.sendKeys("JOhn");
		NOBPage.notifier_email.sendKeys("john.smith@info.com");
		CoreControls.selectSave();
		CoreControls.clickGo();

	}

}
