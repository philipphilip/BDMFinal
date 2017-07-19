package modules;

import helpers.DataHelper;
import helpers.Helper;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.CoreControls;
import pageobjects.CoreNobPage;

public class FillCoreNobFormForBr {

	public static void Execute(WebDriver driver) throws Exception {

		PageFactory.initElements(driver, CoreNobPage.class);
		WebDriverWait waitForTabsMenue = new WebDriverWait(driver, 10000);
		CoreNobPage.notifier_email = waitForTabsMenue
				.until(ExpectedConditions.elementToBeClickable(CoreNobPage.notifier_email));

		String coreBrMotherFamilyName = DataHelper.getRandomStringAs("coreBrMotherFamilyName",10);
		String coreBrMotherFirstName = DataHelper.getRandomStringAs("coreBrMotherFirstName",10);
		System.out.println("nob coreBrMotherFirstName=" + coreBrMotherFirstName);
		CoreNobPage.mothersFamilyName.sendKeys(coreBrMotherFamilyName);
		CoreNobPage.mothersGivenName_Core.sendKeys(coreBrMotherFirstName);


		CoreNobPage.mothersDOBDay.sendKeys("25");
		CoreNobPage.mothersDOBMonth.sendKeys("12");
		CoreNobPage.mothersDOBYear.sendKeys("1989");
		Helper.selectDropDownList(CoreNobPage.aboriginal_or_torres_strait_islander_origin,"Decline to reply");
		CoreNobPage.street_and_number.sendKeys("12");
		CoreNobPage.address_line_two.sendKeys("Canning st");
		CoreNobPage.suburb.sendKeys("North Melbourne");
		CoreNobPage.postcode.sendKeys("3051");
		CoreNobPage.chiledDOBDay.sendKeys("17");
		CoreNobPage.chiledDOBMoth.sendKeys("07");
		CoreNobPage.chiledDOBYear.sendKeys("2017");
		CoreNobPage.chiled_time_of_birth.sendKeys("9:59");
		CoreNobPage.chiled_sex_at_birth.sendKeys("male");
		Helper.selectDropDownList(CoreNobPage.hospital_name,"Auburn District Hospital");
		Helper.selectDropDownList(CoreNobPage.Hospital_town_suburb,"Auburn");

		String notifierFamilyName = DataHelper.getRandomStringAs("notifierFamilyName",10);
		String notifierGivenName = DataHelper.getRandomStringAs("notifierGivenName",10);
		CoreNobPage.notifier_family_name.sendKeys(notifierFamilyName);
		CoreNobPage.notifier_given_name.sendKeys(notifierGivenName);

		CoreNobPage.notifier_email.sendKeys("john.smith@info.com");
		CoreControls.selectSave();
		CoreControls.clickGo();

	}

}
