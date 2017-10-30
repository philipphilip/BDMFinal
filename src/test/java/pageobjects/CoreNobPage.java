package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoreNobPage extends BaseClass {

	public CoreNobPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = ".//*/li[3]/a[contains(text(),'Birth')]")
	public static WebElement birth;

	@FindBy(xpath = ".//*/a[contains(text(),'New')]")
	public static WebElement the_new_tab;

	@FindBy(xpath = ".//*/a[contains(text(),'of Birth')]")
	public static WebElement newNOB;

	@FindBy(id = "birthMothersDetails-name-familyName")
	public static WebElement mothersFamilyName;

	@FindBy(id = "birthMothersDetails-name-familyNameSameToFamilyNameAtBirth")
	public static WebElement mothersFamilyNameSameAsBirth;

	@FindBy(id = "birthMothersDetails-name-familyNameAtBirth")
	public static WebElement mothersFamilyNameAtBirth;

	@FindBy(xpath = ".//*/a[contains(text(),'of Birth')]")
	public static WebElement Family_name_at_birth;

	@FindBy(id = "birthMothersDetails-name-firstGivenName")
	public static WebElement mothersGivenName_Core;

	@FindBy(id = "birthMothersDetails-details-dateOfBirth-day")
	public static WebElement mothersDOBDay;

	@FindBy(id = "birthMothersDetails-details-dateOfBirth-month")
	public static WebElement mothersDOBMonth;

	@FindBy(id = "birthMothersDetails-details-dateOfBirth-year")
	public static WebElement mothersDOBYear;

	@FindBy(xpath = ".//*/select[@id='birthMothersDetails-details-aboriginalOrTorresStraitIslanderOrigin']")
	public static WebElement aboriginal_or_torres_strait_islander_origin;

	@FindBy(xpath = ".//*/a[contains(text(),'of Birth')]")
	public static WebElement contry;

	@FindBy(id = "birthMothersDetails-residentialAddress-line1")
	public static WebElement street_and_number;

	@FindBy(id = "birthMothersDetails-residentialAddress-line2")
	public static WebElement address_line_two;

	@FindBy(xpath = "//*/input[@id='birthMothersDetails-residentialAddress-suburb']")
	public static WebElement suburb;

	@FindBy(id = ".//*/a[contains(text(),'of Birth')]")
	public static WebElement state_territoty;

	@FindBy(xpath = "//*/input[@id='birthMothersDetails-residentialAddress-postcode']")
	public static WebElement postcode;

	@FindBy(id = ".//*/a[contains(text(),'of Birth')]")
	public static WebElement mobile_number;

	@FindBy(id = ".//*/a[contains(text(),'of Birth')]")
	public static WebElement email_address;

	@FindBy(xpath = "//*/input[@id='birthDetails-childsDetails-dateOfBirth-day']")
	public static WebElement chiledDOBDay;

	@FindBy(xpath = "//*/input[@id='birthDetails-childsDetails-dateOfBirth-month']")
	public static WebElement chiledDOBMoth;

	@FindBy(xpath = "//*/input[@id='birthDetails-childsDetails-dateOfBirth-year']")
	public static WebElement chiledDOBYear;

	@FindBy(xpath = "//*/input[@id='birthDetails-childsDetails-timeOfBirth']")
	public static WebElement chiled_time_of_birth;

	@FindBy(xpath = "//*/select[@id='birthDetails-childsDetails-sexAtBirth']")
	public static WebElement chiled_sex_at_birth;

	@FindBy(id = "birthDetails-childsDetails-bornAlive")
	public static WebElement chiled_born_alive;

	@FindBy(id = "birthDetails-childsDetails-gestationPeriod")
	public static WebElement gestationPeriod;

	@FindBy(id = "birthDetails-childsDetails-weight")
	public static WebElement weight;

	@FindBy(id = "birthDetails-childsDetails-multipleBirth")
	public static WebElement multiple_Birth;

	@FindBy(id = "birthDetails-childsDetails-birthOrder")
	public static WebElement birthOrder;

	@FindBy(id = "birthDetails-childsDetails-birthOrderOf")
	public static WebElement birthOrderOf;

	@FindBy(id = "birthDetails-childsDetails-bornAlive")
	public static WebElement was_child_born_in_hospital;

	@FindBy(id = "birthDetails-hospitalBirth-hospitalName")
	public static WebElement hospital_name;

	@FindBy(id = "birthDetails-hospitalBirth-hospitalTownSuburbCity")
	public static WebElement Hospital_town_suburb;

	@FindBy(id = "notifierDetails-name-familyName")
	public static WebElement notifier_family_name;

	@FindBy(id = "notifierDetails-name-firstGivenName")
	public static WebElement notifier_given_name;

	@FindBy(id = "notifierDetails-contactDetails-emailAddress")
	public static WebElement notifier_email;

	@FindBy(id = ".//*/div[2]/form/input[1]")
	public static WebElement view_errors_button;

	@FindBy(xpath = ".//*/a[contains(text(),'of Birth')]")
	public static WebElement discard_button;

	@FindBy(xpath = ".//*/input[1]")
	public static WebElement back_to_form;

	public static void View_NOB_Form_Errors() {
		view_errors_button.click();
	}
}
